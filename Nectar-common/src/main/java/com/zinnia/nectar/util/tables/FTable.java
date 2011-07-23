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

package com.zinnia.nectar.util.tables;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * Statistical F table
 */

public class FTable {

	final int noOfRows=51;
	final int noOfColumns=27;

	HashMap<Integer,Double> h1 = new HashMap<Integer,Double>(){{
		put(1,4052.19);
		put(2,98.50);
		put(3,34.1162);
		put(4,21.1977);
		put(5,56.2582);
		put(6,63.7450);
		put(7,72.2464);
		put(8,81.2586);
		put(9,90.5614);
		put(10,100.0443);
		put(11,9.6460);
		put(12,9.3302);
		put(13,9.0738);
		put(14,8.8616);
		put(15,8.6831);
		put(16,8.5310);
		put(17,8.3997);
		put(18,8.2854);
		put(19,8.1849);
		put(20,8.0960);
		put(21,8.0166);
		put(22,7.9454);
		put(23,7.8811);
		put(24,7.8229);
		put(25,7.7698);
		put(26,7.7213);
		put(27,7.6767);
		put(28,7.6356);
		put(29,7.5977);
		put(30,7.5625);
		put(40,7.3141);
		put(60,7.0771);
		put(120,6.8509);
		put(999,6.6349);
	}
	};
	HashMap<Integer,Double> h2 = new HashMap<Integer,Double>(){{
		put(1,4999.51);
		put(2,99.00);
		put(3,30.8165);
		put(4,18.0000);
		put(5,13.2739);
		put(6,10.9248);
		put(7,9.5466);
		put(8,8.6491);
		put(9,8.0215);
		put(10,7.5594);
		put(11,7.2057);
		put(12,6.9266);
		put(13,6.7010);
		put(14,6.5149);
		put(15,6.3589);
		put(16,6.2262);
		put(17,6.1121);
		put(18,6.0129);
		put(19,5.9259);
		put(20,5.8489);
		put(21,5.7804);
		put(22,5.7190);
		put(23, 5.6637);
		put(24,5.6136);
		put(25,5.5680);
		put(26,5.5263);
		put(27,5.4881);
		put(28,5.4529);
		put(29,5.4204);
		put(30,5.3903);
		put(40,5.1785);
		put(60,4.9774);
		put(120,4.7865);
		put(999,4.6052);
	}
	};
	HashMap<Integer,Double> h3 = new HashMap<Integer,Double>(){{
		put(1,5403.36);
		put(2,99.17);
		put(3,29.4567);
		put(4,16.6944);
		put(5,12.0600);
		put(6,9.7795);
		put(7,8.4513);
		put(8,7.5910);
		put(9,6.9919);
		put(10,6.5523);
		put(11,6.2167);
		put(12,5.9525);
		put(13,5.7394);
		put(14,5.5639);
		put(15,5.4170);
		put(16,5.2922);
		put(17,5.1850);
		put(18,5.0919);
		put(19,5.0103);
		put(20,4.9382);
		put(21,4.8740);
		put(22,4.8166);
		put(23,4.7649);
		put(24,4.7181);
		put(25,4.6755);
		put(26,4.6366);
		put(27,4.6009);
		put(28,4.5681);
		put(29,4.5378);
		put(30,4.5097);
		put(40,4.3126);
		put(60,4.1259);
		put(120,3.9491);
		put(999,3.7816);
	}

	};
	HashMap<Integer,Double> h4 = new HashMap<Integer,Double>(){{
		put(1,5624.59);
		put(2,99.25);
		put(3,28.7099);
		put(4,15.9770);
		put(5,11.3919);
		put(6,9.1483);
		put(7,7.8466);
		put(8,7.0061);
		put(9,6.4221);
		put(10,5.9943);
		put(11,5.6683);
		put(12,5.4120);
		put(13,5.2053);
		put(14,5.0354);
		put(15,4.8932);
		put(16,4.7726);
		put(17,4.6690);
		put(18,4.5790);
		put(19,4.5003);
		put(20,4.4307);
		put(21,4.3688);
		put(22,4.3134);
		put(23,4.2636);
		put(24,4.2184);
		put(25,4.1774);
		put(26,4.1400);
		put(27,4.1056);
		put(28,4.0740);
		put(29,4.0449);
		put(30,4.0179);
		put(40,3.8283);
		put(60,3.6490);
		put(120,3.4795);
		put(999,3.3192);

	}
	};
	HashMap<Integer,Double> h5 = new HashMap<Integer,Double>(){{
		put(1,5763.66);
		put(2,99.30);
		put(3,28.2371);
		put(4,15.5219);
		put(5,10.9670);
		put(6,8.7459);
		put(7,7.4604);
		put(8,6.6318);
		put(9,6.0569);
		put(10,5.6363);
		put(11,5.3160);
		put(12,5.0643);
		put(13,4.8616);
		put(14,4.6950);
		put(15,4.5556);
		put(16,4.4374);
		put(17,4.3359);
		put(18,4.2479);
		put(19,4.1708);
		put(20,4.1027);
		put(21,4.0421);
		put(22,3.9880);
		put(23,3.9392);
		put(24,3.8951);
		put(25,3.8550);
		put(26,3.8183);
		put(27,3.7848);
		put(28,3.7539);
		put(29,3.7254);
		put(30,3.6990);
		put(40,3.5138);
		put(60,3.3389);
		put(120,3.1735);
		put(999,3.0173);

	}
	};
	HashMap<Integer,Double> h6 = new HashMap<Integer,Double>(){{
		put(1,5859.00);
		put(2,99.33);
		put(3,27.9107);
		put(4,15.2069);
		put(5,10.6723);
		put(6,8.4661);
		put(7,7.1914);
		put(8,6.3707);
		put(9,5.8018);
		put(10,5.3858);
		put(11,5.0692);
		put(12,4.8206);
		put(13,4.6204);
		put(14,4.4558);
		put(15,4.3183);
		put(16,4.2016);
		put(17,4.1015);
		put(18,4.0146);
		put(19,3.9386);
		put(20,3.8714);
		put(21,3.8117);
		put(22,3.7583);
		put(23,3.7102);
		put(24,3.6667);
		put(25,3.6272);
		put(26,3.5911);
		put(27,3.5580);
		put(28,3.5276);
		put(29,3.4995);
		put(30,3.4735);
		put(40,3.2910);
		put(60,3.1187);
		put(120,2.9559);
		put(999,2.8020);
	}
	};
	HashMap<Integer,Double> h7 = new HashMap<Integer,Double>(){{
		put(1,5928.37);
		put(2,99.36);
		put(3,27.6717);
		put(4,14.9758);
		put(5,10.4555);
		put(6,8.2600);
		put(7,6.9928);
		put(8,6.1776);
		put(9,5.6129);
		put(10,5.2001);
		put(11,4.8861);
		put(12,4.6395);
		put(13,4.4410);
		put(14,4.2779);
		put(15,4.1415);
		put(16,4.0259);
		put(17,3.9267);
		put(18,3.8406);
		put(19,3.7653);
		put(20,3.6987);
		put(21,3.6396);
		put(22,3.5867);
		put(23,3.5390);
		put(24,3.4959);
		put(25,3.4568);
		put(26,3.4210);
		put(27,3.3882);
		put(28,3.3581);
		put(29,3.3303);
		put(30,3.3045);
		put(40,3.1238);
		put(60,2.9530);
		put(120,2.7918);
		put(999,2.6393);
	}

	};
	HashMap<Integer,Double> h8 = new HashMap<Integer,Double>(){{
		put(1,5981.08);
		put(2,99.37);
		put(3,27.4892);
		put(4,14.7989);
		put(5,10.2893);
		put(6,8.1017);
		put(7,6.8401);
		put(8,6.0289);
		put(9,5.4671);
		put(10,5.0567);
		put(11,4.7445);
		put(12,4.4994);
		put(13,4.3021);
		put(14,4.1399);
		put(15,4.0045);
		put(16,3.8896);
		put(17,3.7910);
		put(18,3.7054);
		put(19,3.6305);
		put(20,3.5644);
		put(21,3.5056);
		put(22,3.4530);
		put(23,3.4057);
		put(24,3.3629);
		put(25,3.3239);
		put(26,3.2884);
		put(27,3.2558);
		put(28,3.2259);
		put(29,3.1982);
		put(30,3.1726);
		put(40,2.9930);
		put(60,2.8233);
		put(120,2.6629);
		put(999,2.5113);
	}
	};
	HashMap<Integer,Double> h9 = new HashMap<Integer,Double>(){{
		put(1,6022.48);
		put(2,99.39);
		put(3,27.3452);
		put(4,14.6591);
		put(5,10.1578);
		put(6,7.9761);
		put(7,6.7188);
		put(8,5.9106);
		put(9,5.3511);
		put(10,4.9424);
		put(11,4.6315);
		put(12,4.3875);
		put(13,4.1911);
		put(14,4.0297);
		put(15,3.8948);
		put(16,3.7804);
		put(17,3.6822);
		put(18,3.5971);
		put(19,3.5225);
		put(20,3.4567);
		put(21,3.3981);
		put(22,3.3458);
		put(23,3.2986);
		put(24,3.2560);
		put(25,3.2172);
		put(26,3.1818);
		put(27,3.1494);
		put(28,3.1195);
		put(29,3.0920);
		put(30,3.0665);
		put(40,2.8876);
		put(60,2.7185);
		put(120,2.5586);
		put(999,2.4074);
	}

	};
	HashMap<Integer,Double> h10 = new HashMap<Integer,Double>(){{
		put(1,6055.86);
		put(2,99.40);
		put(3,27.2288);
		put(4,14.5459);
		put(5,10.0510);
		put(6,7.8741);
		put(7,6.6201);
		put(8,5.8143);
		put(9,5.2565);
		put(10,4.8491);
		put(11,4.5393);
		put(12,4.2961);
		put(13,4.1003);
		put(14,3.9394);
		put(15,3.8049);
		put(16,3.6909);
		put(17,3.5931);
		put(18,3.5082);
		put(19,3.4338);
		put(20,3.3682);
		put(21,3.3098);
		put(22,3.2576);
		put(23,3.2106);
		put(24,3.1681);
		put(25,3.1294);
		put(26,3.0941);
		put(27,3.0618);
		put(28,3.0320);
		put(29,3.0045);
		put(30,2.9791);
		put(40,2.8005);
		put(60,2.6318);
		put(120,2.4721);
		put(999,2.3209);

	}
	};
	HashMap<Integer,Double> h12 = new HashMap<Integer,Double>(){{
		put(1,6106.33);
		put(2,99.42);
		put(3,27.0518);
		put(4,14.3736);
		put(5,9.8883);
		put(6,7.7183);
		put(7,6.4691);
		put(8,5.6667);
		put(9,5.1114);
		put(10,4.7059);
		put(11,4.3974);
		put(12,4.1553);
		put(13,3.9603);
		put(14,3.8001);
		put(15,3.6662);
		put(16,3.5527);
		put(17,3.4552);
		put(18,3.3706);
		put(19,3.2965);
		put(20,3.2311);
		put(21,3.1730);
		put(22,3.1209);
		put(23,3.0740);
		put(24,3.0316);
		put(25,2.9931);
		put(26,2.9578);
		put(27,2.9256);
		put(28,2.8959);
		put(29,2.8685);
		put(30,2.8431);
		put(40,2.6648);
		put(60,2.4961);
		put(120,2.3363);
		put(999,2.1848);
	}
	};
	HashMap<Integer,Double> h15 = new HashMap<Integer,Double>(){{
		put(1,6157.30);
		put(2,99.43);
		put(3,26.8722);
		put(4,14.1982);
		put(5,9.7222);
		put(6,7.5590);
		put(7,6.3143);
		put(8,5.5151);
		put(9,4.9621);
		put(10,4.5581);
		put(11,4.2509);
		put(12,4.0096);
		put(13,3.8154);
		put(14,3.6557);
		put(15,3.5222);
		put(16,3.4089);
		put(17,3.3117);
		put(18,3.2273);
		put(19,3.1533);
		put(20,3.0880);
		put(21,3.0300);
		put(22,2.9779);
		put(23,2.9311);
		put(24,2.8887);
		put(25,2.8502);
		put(26,2.8150);
		put(27,2.7827);
		put(28,2.7530);
		put(29,2.7256);
		put(30,2.7002);
		put(40,2.5216);
		put(60,2.3523);
		put(120, 2.1915);
		put(999,2.0385);
	}
	};
	HashMap<Integer,Double> h20 = new HashMap<Integer,Double>(){{
		put(1,6208.74);
		put(2,99.45);
		put(3,26.6898);
		put(4,14.0196);
		put(5,9.5527);
		put(6,7.3958);
		put(7,6.1554);
		put(8,5.3591);
		put(9,4.8080);
		put(10,4.4054);
		put(11,4.0990);
		put(12,3.8584);
		put(13,3.6646);
		put(14,3.5052);
		put(15,3.3719);
		put(16,3.2587);
		put(17,3.1615);
		put(18,3.0771);
		put(19,3.0031);
		put(20,2.9377);
		put(21,2.8796);
		put(22,2.8274);
		put(23,2.7805);
		put(24,2.7380);
		put(25,2.6993);
		put(26,2.6640);
		put(27,2.6316);
		put(28,2.6017);
		put(29,2.5742);
		put(30,2.5487);
		put(40,2.3689);
		put(60,2.1978 );
		put(120,2.0346 );
		put(999,1.8783);
	}
	};
	HashMap<Integer,Double> h24 = new HashMap<Integer,Double>(){{
		put(1,6234.64);
		put(2,99.46);
		put(3,26.5975);
		put(4,13.9291);
		put(5,9.4665);
		put(6,7.3127);
		put(7,6.0743);
		put(8,5.2793);
		put(9,4.7290);
		put(10,4.3269);
		put(11,4.0209);
		put(12,3.7805);
		put(13,3.5868);
		put(14,3.4274);
		put(15,3.2940);
		put(16,3.1808);
		put(17,3.0835);
		put(18,2.9990);
		put(19,2.9249);
		put(20,2.8594);
		put(21,2.8011);
		put(22,2.7488);
		put(23,2.7017);
		put(24,2.6591);
		put(25,2.6203);
		put(26,2.5848);
		put(27, 2.5522);
		put(28,2.5223);
		put(29,2.494);
		put(30,2.4689);
		put(40,2.2880);
		put(60,2.1154);
		put(120,1.9500);
		put(999,1.7908);
	}

	};
	HashMap<Integer,Double> h30 = new HashMap<Integer,Double>(){{
		put(1,6260.66);
		put(2,99.47);
		put(3,26.5046);
		put(4,13.8377);
		put(5,9.3793);
		put(6,7.2285);
		put(7,5.9920);
		put(8,5.1981);
		put(9,4.6486);
		put(10,4.2469);
		put(11,3.9411);
		put(12,3.7008);
		put(13,3.5070);
		put(14,3.3476);
		put(15,3.2141);
		put(16,3.1007);
		put(17,3.0032);
		put(18,2.9185);
		put(19,2.8442);
		put(20,2.7785);
		put(21,2.7200);
		put(22,2.6675);
		put(23,2.6202);
		put(24,2.5773);
		put(25,2.5383);
		put( 26,2.5026);
		put(27,2.4699);
		put(28,2.4397);
		put(29,2.4118);
		put(30,2.3860);
		put(40,2.2034);
		put(60,2.0285);
		put(120,1.8600);
		put(999,1.6964);

	}
	};
	HashMap<Integer,Double> h40 = new HashMap<Integer,Double>(){{
		put(1,6286.79);
		put(2,99.47);
		put(3,26.4108);
		put(4, 13.7454);
		put(5,9.2912);
		put(6,7.1432);
		put(7,5.9085);
		put(8,5.1156);
		put(9,4.5666);
		put(10,4.1653);
		put(11,3.8596);
		put(12,3.6192);
		put(13,3.4253);
		put(14,3.2656);
		put(15,3.1319);
		put(16,3.0182);
		put(17,2.9205);
		put(18,2.8354);
		put(19,2.7608);
		put(20,2.6947);
		put(21,2.6359);
		put(22,2.5831);
		put(23,2.5355);
		put(24,2.4923);
		put(25,2.4530);
		put(26,2.4170);
		put(27,2.3840);
		put(28,2.3535);
		put(29,2.3253);
		put(30, 2.2992);
		put(40,2.1142);
		put(60,1.9360);
		put(120,1.7628);
		put(999,1.5923);
	}

	};
	HashMap<Integer,Double> h60 = new HashMap<Integer,Double>(){{
		put(1,6313.04);
		put(2,99.48);
		put(3,26.3164);
		put(4,13.6522);
		put(5,9.2020);
		put(6,7.0567);
		put(7,5.8236);
		put(8,5.0316);
		put(9,4.4831);
		put(10,4.0819);
		put(11,3.7761);
		put(12,3.5355);
		put(13,3.3413);
		put(14,3.1813);
		put(15,3.0471);
		put(16,2.9330);
		put(17,2.8348);
		put(18,2.7493);
		put(19,2.6742);
		put(20,2.6077);
		put(21,2.5484);
		put(22,2.4951);
		put(23,2.4471);
		put(24,2.4035);
		put(25,2.3637);
		put(26,2.3273);
		put(27,2.2938);
		put(28,2.2629);
		put(29,2.2344);
		put(30, 2.2079);
		put(40,2.0194);
		put(60,1.8363);
		put(120,1.6557);
		put(999,1.4730);
	}
	};
	HashMap<Integer,Double> h120 = new HashMap<Integer,Double>(){{
		put(1,6339.40);
		put(2,99.49);
		put(3,26.2212);
		put(4,13.5581);
		put(5,9.1118);
		put(6,6.9690);
		put(7,5.7373);
		put(8,4.9461);
		put(9,4.3978);
		put(10,3.9965);
		put(11,3.6904);
		put(12,3.4494);
		put(13,3.2548);
		put(14,3.0942);
		put(15,2.9595);
		put(16,2.8447);
		put(17,2.7459);
		put(18,2.6597);
		put(19,2.5839);
		put(20,2.5168);
		put(21,2.4568);
		put(22,2.4029);
		put(23,2.3542);
		put(24,2.3100);
		put(25,2.2696);
		put(26,2.2325);
		put(27,2.1985);
		put(28, 2.1670);
		put(29,2.1379);
		put(30,2.1108);
		put(40,1.9172);
		put(60,1.7263);
		put(120,1.5330);
		put(999,1.3246);
	}
	};
	HashMap<Integer,Double> h999 = new HashMap<Integer,Double>(){{
		put(1,6365.87);
		put(2,99.50);
		put(3,26.1252);
		put(4,13.4631);
		put(5,9.0204);
		put(6,6.8800);
		put(7,5.6495);
		put(8,4.8588);
		put(9,4.3106);
		put(10,3.9090);
		put(1,3.6025);
		put(12,3.3608);
		put(13,3.1654);
		put(14,3.0040);
		put(15,2.8684);
		put(16,2.7528);
		put(17,2.6530);
		put(18,2.5660);
		put(19,2.4893);
		put(20,2.4212);
		put(21,2.3603);
		put(22,2.3055);
		put(23,2.2559);
		put(24,2.2107);
		put(25,2.1694);
		put(26,2.1315);
		put(26,2.0965);
		put(28,2.0642);
		put(29,2.0342);
		put(30,2.0062);
		put(40,1.8047);
		put(6, 1.6007);
		put(120,1.3805);
		put(999,1.0047);



	}


	};

	HashMap<Integer,HashMap<Integer,Double>> fMap = new HashMap<Integer,HashMap<Integer,Double>>(){{
		put(1,h1);
		put(2,h2);
		put(3,h3);
		put(4,h4);
		put(5,h5);
		put(6,h6);
		put(7,h7);
		put(8,h8);
		put(9,h9);
		put(10,h10);
		put(12,h12);
		put(15,h15);
		put(20,h20);
		put(24,h24);
		put(30,h30);
		put(40,h40);
		put(60,h60);
		put(120,h120);
		put(999,h999);


	}
	};

	private double getFValue(HashMap<Integer,Double> valueMap,int n)
	{
		Set<Integer> nSet = valueMap.keySet();
		if(nSet.contains(n))
		{
			
			return valueMap.get(n);
		}
		else if(n>120)
		{
			return valueMap.get(999);
		}
		else
		{
			
			return getInterpolatedValue(valueMap,n);
		}


	}

	private double getInterpolatedValue(HashMap<Integer, Double> valueMap, int n) {
		// TODO Auto-generated method stub
		double value;

		TreeMap<Integer,Double> treeMap=new TreeMap<Integer,Double>(valueMap);
		Set<Integer> nKeySet = treeMap.keySet();
		int lower = 0;
		int higher=0;
		Iterator<Integer> setIterator = nKeySet.iterator();
		while(setIterator.hasNext())
		{
			int key = setIterator.next();
			
			if(key<n)
			{
				lower=key;
			}
			else
			{
				higher=key;
				break;
			}
		}
		double lowerValue=  valueMap.get(lower);
		double higherValue =  valueMap.get(higher);

		value = lowerValue+((higherValue-lowerValue)*((n-lower)/(higher-lower)));

		return value;

	}

	public double getFCriticalValue(int n,int k)
	{

		Set<Integer> kSet = fMap.keySet();
		if(kSet.contains(k))
		{
			return getFValue(fMap.get(k),n);
		}
		else if(k>120)
		{

			return getFValue(fMap.get(999),n);
		}
		else
		{

			HashMap<Integer,Double> interPolatedMap = getInterpolatedMap(k) ;
			return getFValue(interPolatedMap, n);
		}





	}

	private HashMap<Integer, Double> getInterpolatedMap(int k) {
		// TODO Auto-generated method stub
		HashMap<Integer,Double> interpolatedMap = new HashMap<Integer,Double>();
		TreeMap<Integer,HashMap<Integer,Double>> treeMap = new TreeMap<Integer,HashMap<Integer,Double>>(fMap);
		Set<Integer> keySet = treeMap.keySet();
		int lower = 0;
		int higher = 0 ;

		while(keySet.iterator().hasNext())
		{
			int key = keySet.iterator().next();
			if(key<k)
			{
				lower=key;
			}
			else
			{
				higher=key;
				break;
			}
		}

		TreeMap<Integer,Double> treeLowerHashMap = new TreeMap<Integer,Double>(fMap.get(lower));
		TreeMap<Integer,Double> treeHigherHashMap = new TreeMap<Integer,Double>(fMap.get(higher));


		Collection<Double> lowerHashValues = treeLowerHashMap.values();
		Collection<Double> higherHashValues = treeHigherHashMap.values();
		Set<Integer> mapKeySet = treeLowerHashMap.keySet();

		while(lowerHashValues.iterator().hasNext())
		{
			double lowerValue = lowerHashValues.iterator().next();
			double higherValue = higherHashValues.iterator().next();

			double value = (higherValue-lowerValue)/(higher-lower);
			interpolatedMap.put(mapKeySet.iterator().next(), value);
		}

		
		return interpolatedMap;
	}


}





