/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zinnia.nectar.util.hadoop.inputformat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.JobContext;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;
import org.apache.hadoop.mapreduce.lib.input.LineRecordReader;
import org.apache.hadoop.util.LineReader;

/*
 * Its a utility class inspired by the NLineInputFormat of Hadoop. This input format create a InputSpilt of first N line of input file.
 */
public class FirstNLineInputFormat extends FileInputFormat<LongWritable, Text> {

	public static final String LINES_PER_MAP = 
		"mapreduce.input.lineinputformat.linespermap";
	@Override
	public RecordReader<LongWritable, Text> createRecordReader(InputSplit inputSplit,
			TaskAttemptContext context) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		context.setStatus(inputSplit.toString());
		return new LineRecordReader();
	}

	@Override
	public List<InputSplit> getSplits(JobContext job) throws IOException {
		// TODO Auto-generated method stub
		List<InputSplit> inputSplits = new ArrayList<InputSplit>();
		for (FileStatus status : listStatus(job)) {
			inputSplits.addAll(getSplitsForFile(status,
					job.getConfiguration(),getNumLinesPerSplit(job)));
		}

		return inputSplits;

	}

	public static List<FileSplit> getSplitsForFile(FileStatus status,
			Configuration conf, int numLinesPerSplit) throws IOException {
		List<FileSplit> splits = new ArrayList<FileSplit> ();
		Path fileName = status.getPath();
		FileSystem  fs = fileName.getFileSystem(conf);
		LineReader lr = null;
		FSDataInputStream in  = fs.open(fileName);
		lr = new LineReader(in, conf);
		Text line = new Text();
		int numLines = 0;
		long begin = 0;
		long length = 0;
		int num = -1;
		while ((num = lr.readLine(line)) > 0) {
			numLines++;
			length += num;
			if (numLines == numLinesPerSplit) {
				// NLineInputFormat uses LineRecordReader, which always reads
				// (and consumes) at least one character out of its upper split
				// boundary. So to make sure that each mapper gets N lines, we
				// move back the upper split limits of each split 
				// by one character here.
				if (begin == 0) {
					splits.add(new FileSplit(fileName, begin, length - 1,
							new String[] {}));
				} else {
					lr.close();
				}
			}
		}
		return splits; 
	}
	public static void setNumLinesPerSplit(Job job, int numLines) {
		job.getConfiguration().setInt(LINES_PER_MAP, numLines);
	}

	/**
	 * Get the number of lines per split
	 * @param job the job
	 * @return the number of lines per split
	 */
	public static int getNumLinesPerSplit(JobContext job) {
		return job.getConfiguration().getInt(LINES_PER_MAP, 1);
	}
}


