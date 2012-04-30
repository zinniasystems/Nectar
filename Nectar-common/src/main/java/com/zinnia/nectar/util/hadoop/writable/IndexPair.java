package com.zinnia.nectar.util.hadoop.writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;

public class IndexPair implements WritableComparable<IndexPair> {
	
	private long rowIndex;
	private long colIndex;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		IndexPair indexPair=(IndexPair)obj;
		if(this.rowIndex==indexPair.rowIndex && this.colIndex==indexPair.colIndex)
			return true;
		else
			return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new String("Row="+this.rowIndex+"Column="+this.colIndex);
	}

	public IndexPair(long rowIndex, long colIndex) {
		super();
		this.rowIndex = rowIndex;
		this.colIndex = colIndex;
	}

	public IndexPair() {
		// TODO Auto-generated constructor stub
		this.colIndex = 0;
		this.rowIndex = 0;
	}

	/**
	 * @return the rowIndex
	 */
	public long getRowIndex() {
		return rowIndex;
	}

	/**
	 * @param rowIndex the rowIndex to set
	 */
	public void setRowIndex(long rowIndex) {
		this.rowIndex = rowIndex;
	}

	/**
	 * @return the colIndex
	 */
	public long getColIndex() {
		return colIndex;
	}

	/**
	 * @param colIndex the colIndex to set
	 */
	public void setColIndex(long colIndex) {
		this.colIndex = colIndex;
	}

	@Override
	public void readFields(DataInput in) throws IOException {
		// TODO Auto-generated method stub
		rowIndex=in.readLong();
		colIndex=in.readLong();
	}

	@Override
	public void write(DataOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeLong(rowIndex);
		out.writeLong(colIndex);
	}

	@Override
	public int compareTo(IndexPair ip) {
		// TODO Auto-generated method stub
		if(this.getRowIndex()==ip.getRowIndex())
			return 0;
		else if(this.getRowIndex()<ip.getRowIndex())
			return -1;
		else
			return 1;
	}

}
