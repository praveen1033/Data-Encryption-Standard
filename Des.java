import java.util.Scanner;
public class Des {
	String erpt="";
	Scanner scan=new Scanner(System.in);
	int [][] sb1={{14,  4, 13,  1,  2, 15, 11,  8,  3, 10,  6, 12,  5,  9,  0,  7},{0, 15,  7,  4, 14,  2, 13,  1, 10,  6, 12, 11,  9,  5,  3,  8},{4,  1, 14,  8, 13,  6,  2, 11, 15, 12,  9,  7,  3, 10,  5,  0},{15, 12,  8,  2,  4,  9,  1,  7,  5, 11,  3, 14, 10,  0,  6, 13}};
	int [][] sb2={{15,  1,  8, 14,  6, 11,  3,  4,  9,  7,  2, 13, 12,  0,  5, 10},{3, 13,  4,  7, 15,  2,  8, 14, 12,  0,  1, 10,  6,  9, 11,  5},{0, 14,  7, 11, 10,  4, 13,  1,  5,  8, 12,  6,  9,  3,  2, 15},{13,  8, 10,  1,  3, 15,  4,  2, 11,  6,  7, 12,  0,  5, 14,  9}};
	int [][] sb3={{10,  0,  9, 14,  6,  3, 15,  5,  1, 13, 12,  7, 11,  4,  2,  8},{13,  7,  0,  9,  3,  4,  6, 10,  2,  8,  5, 14, 12, 11, 15,  1},{13,  6,  4,  9,  8, 15,  3,  0, 11,  1,  2, 12,  5, 10, 14,  7},{1, 10, 13,  0,  6,  9,  8,  7,  4, 15, 14,  3, 11,  5,  2, 12}};
	int [][] sb4={{7, 13, 14,  3,  0,  6,  9, 10,  1,  2,  8,  5, 11, 12,  4, 15},{13,  8, 11,  5,  6, 15,  0,  3,  4,  7,  2, 12,  1, 10, 14,  9},{10,  6,  9,  0, 12, 11,  7, 13, 15,  1,  3, 14,  5,  2,  8,  4},{3, 15,  0,  6, 10,  1, 13,  8,  9,  4,  5, 11, 12,  7,  2, 14}};
	int [][] sb5={{2, 12,  4,  1,  7, 10, 11,  6,  8,  5,  3, 15, 13,  0, 14,  9},{14, 11,  2, 12,  4,  7, 13,  1,  5,  0, 15, 10,  3,  9,  8,  6},{4,  2,  1, 11, 10, 13,  7,  8, 15,  9, 12,  5,  6,  3,  0, 14},{11,  8, 12,  7,  1, 14,  2, 13,  6, 15,  0,  9, 10,  4,  5,  3}};
	int [][] sb6={{12,  1, 10, 15,  9,  2,  6,  8,  0, 13,  3,  4, 14,  7,  5, 11},{10, 15,  4,  2,  7, 12,  9,  5,  6,  1, 13, 14,  0, 11,  3,  8},{9, 14, 15,  5,  2,  8, 12,  3,  7,  0,  4, 10,  1, 13, 11,  6},{4,  3,  2, 12,  9,  5, 15, 10, 11, 14,  1,  7,  6,  0,  8, 13}};
	int [][] sb7={{4, 11,  2, 14, 15,  0,  8, 13,  3, 12,  9,  7,  5, 10,  6,  1},{13,  0, 11,  7,  4,  9,  1, 10, 14,  3,  5, 12,  2, 15,  8,  6},{1,  4, 11, 13, 12,  3,  7, 14, 10, 15,  6,  8,  0,  5,  9,  2},{ 6, 11, 13,  8,  1,  4, 10,  7,  9,  5,  0, 15, 14,  2,  3, 12}};
	int [][] sb8={{13,  2,  8,  4,  6, 15, 11,  1, 10,  9,  3, 14,  5,  0, 12,  7},{1, 15, 13,  8, 10,  3,  7,  4, 12,  5,  6, 11,  0, 14,  9,  2},{7, 11,  4,  1,  9, 12, 14,  2,  0,  6, 10, 13, 15,  3,  5,  8},{2,  1, 14,  7,  4, 10,  8, 13, 15, 12,  9,  0,  3,  5,  6, 11}};
	String cipherbinary="";
	String cipher="";
	//String lpt="00000001001000110100010101100111";
	//String rpt="10001001101010111100110111101111";
	public void encryption()
	{
		String original="0123456789abcdef";
		System.out.println("Please enter the plain text :");
		String fullpt=scan.nextLine();
		System.out.println("Please enter the key");
		String plainkey=scan.nextLine();
		String key="";
		String ch="";
		for(int i=0;i<plainkey.length();i++)    //changing hex key to binary
		{
			String binaryk="";
			String rem="0";
			String cp=plainkey.substring(i, i+1);
			for(int j=0;j<original.length();j++)
			{
				if(cp.equals(original.substring(j , j+1)))
				{
					ch=""+j;
				}
			}
			int ascii= Integer.parseInt(ch);
			if (ascii == 0) 
			{
				binaryk="0000000";
		    }
			else 
			{
				binaryk=Integer.toBinaryString(ascii);
				while(binaryk.length()!=7)
				{
					binaryk=rem+binaryk;
				}
		    }
			key+=binaryk.substring(3, 7);
		}
		String ptbinary="";
		String binary;
		String fullptbinary="";
		String rem="0";
		for(int i=0;i<fullpt.length();i++)   				 //changing plain text to binary
		{
			char cp = fullpt.charAt(i);
			int  y = (int) cp;
			//System.out.println(y);
			if(y>=48 || y<=57)
			{
				y-=48;
				binary=Integer.toBinaryString(y);
				while(binary.length()!=8)
				{
					binary=rem+binary;
				}
			}
			else
			{
				char c = cp;
				int ascii=(int)c;
				
				binary=Integer.toBinaryString(ascii);
				while(binary.length()!=8)
				{
					binary=rem+binary;
				}
			}
			fullptbinary+=binary;
		}
		while(fullptbinary.length()%64!=0)
		{
			fullptbinary=fullptbinary+rem;
		}
		System.out.println("Plain text : "+fullptbinary);
		for(int ptb=0;ptb<fullptbinary.length();ptb=ptb+64)
		{
			ptbinary=fullptbinary.substring(ptb, ptb+64);
			//System.out.println("Plain text : "+ptbinary);
			int[][] initialpermutation = {{58,50,42,24,26,18,10,2,60,52,44,36,28,20,12,4},{62,54,46,38,30,22,14,6,64,56,48,40,32,24,16,8},{57,49,41,33,25,17,9,1,59,51,43,35,27,19,11,3},{61,53,45,37,29,21,13,5,63,55,47,39,31,23,15,7}};
			String p="";
			for(int j=0;j<4;j++)     				//plain text initial permutation
			for(int i=0;i<16;i++)
			{
				p+=ptbinary.substring(initialpermutation[j][i]-1, initialpermutation[j][i]);
			}
			//System.out.println(p);
			String lpt = p.substring(0, 32);        //dividing text to lpt and rpt
			String rpt = p.substring(32, 64);
			
			for(int r=1;r<17;r++)						//Rounds begin
			{
				//System.out.println("round begins lpt "+lpt);
				//System.out.println("round begins rpt "+rpt);
				StringBuilder sb=new StringBuilder(key);
				for(int g=64;g>0;g--)			//deleting 8th element of key
				{
					if(g%8==0)
						sb.deleteCharAt(g-1);
				}
				String skey=sb.toString();
				String lkey=skey.substring(0, 28);
				String rkey=skey.substring(28, 56);
				String lskey="";
				String rskey="";
				if(r==1||r==2||r==9||r==16)			//circular shift depending on round number
				{
					int q=0;
					do{
						lskey+=lkey.substring(q+1,q+2);
						q++;
					}while(q<lkey.length()-1);
					lskey+=lkey.substring(0, 1);
					int z=0;
					do{
						rskey+=rkey.substring(z+1,z+2);
						z++;
					}while(z<rkey.length()-1);
					rskey+=rkey.substring(0, 1);
				}
				else
				{
					int q=0;
					do{
						lskey+=lkey.substring(q+2,q+4);
						q=q+2;
					}while(q<lkey.length()-3);
					lskey+=lkey.substring(0, 2);
					int z=0;
					do{
						rskey+=rkey.substring(z+2,z+4);
						z=z+2;
					}while(z<rkey.length()-3);
					rskey+=rkey.substring(0, 2);
				}
				int[] compressionpermutation={
					      14, 17, 11, 24,  1,  5,
					       3, 28, 15,  6, 21, 10,
					      23, 19, 12,  4, 26,  8,
					      16,  7, 27, 20, 13,  2,
					      41, 52, 31, 37, 47, 55,
					      30, 40, 51, 45, 33, 48,
					      44, 49, 39, 56, 34, 53,
					      46, 42, 50, 36, 29, 32
					   };
				String totalkey=lskey+rskey;
				//System.out.println(totalkey);
				String compresskey="";
				for(int l=0;l<48;l++)     //for making the 56 bit key to 48 bit
				{
					compresskey+=totalkey.substring(compressionpermutation[l]-1, compressionpermutation[l]);
				}
				String erpt=rounds(rpt);         //right plain text expansion method to 48 bits
				String output="";
				//System.out.println(erpt);
				//System.out.println(compresskey);
				for(int m=0;m<48;m++)				//XOR between key and rpt
					for(int n=0;n<48;n++)
					{
						if(m==n)
						{
							if(erpt.charAt(m)== compresskey.charAt(n))
								output+="0";
							else
								output+="1";
						}
					}
				//System.out.println("i : "+output);
				String sboxrpt="";
				String ascii1="";
				for(int q=0;q<output.length();q=q+6)     						 //S-Box Permutation
				{
					String middle=output.substring(q+1, q+5);
					String ends=output.substring(q, q+1)+output.substring(q+5, q+6);
					int decimalValuemiddle = Integer.parseInt(middle, 2);
					int decimalValueends = Integer.parseInt(ends, 2);
					if(q==0)
					{
						ascii1=""+sb1[decimalValueends][decimalValuemiddle];
						//System.out.println(ascii1);
					}
					if(q==6)
					{
						ascii1=""+sb2[decimalValueends][decimalValuemiddle];
						//System.out.println(ascii1);
					}
					if(q==12)
					{
						ascii1=""+sb3[decimalValueends][decimalValuemiddle];
						//System.out.println(ascii1);
					}
					if(q==18)
					{
						ascii1=""+sb4[decimalValueends][decimalValuemiddle];
						//System.out.println(ascii1);
					}
					if(q==24)
					{
						ascii1=""+sb5[decimalValueends][decimalValuemiddle];
						//System.out.println(ascii1);
					}
					if(q==30)
					{
						ascii1=""+sb6[decimalValueends][decimalValuemiddle];
						//System.out.println(ascii1);
					}
					if(q==36)
					{
						ascii1=""+sb7[decimalValueends][decimalValuemiddle];
						//System.out.println(ascii1);
					}
					if(q==42)
					{
						ascii1=""+sb8[decimalValueends][decimalValuemiddle];
						//System.out.println(ascii1);
					}
					int ascii2=Integer.parseInt(ascii1);
					String some=Integer.toBinaryString(ascii2);
					while(some.length()<4)
					{
						some=rem+some;
					}
					sboxrpt+=some;
					
				}
				//System.out.println("sbox : "+sboxrpt);
				int[] pbox={16,  7, 20, 21,
					      29, 12, 28, 17,
					       1, 15, 23, 26,
					       5, 18, 31, 10,
					       2,  8, 24, 14,
					      32, 27,  3,  9,
					      19, 13, 30,  6,
					      22, 11,  4, 25};
				String rp="";
				for(int w=0;w<32;w++)   							 // P-Box Permutation
				{
					rp+=sboxrpt.substring(pbox[w]-1, pbox[w]);
				}
				//System.out.println("P box rpt :"+rp);
				String newrpt="";
				for(int m=0;m<32;m++)				//XOR between key and rpt
					for(int n=0;n<32;n++)
					{
						if(m==n)
						{
							if(lpt.charAt(m)== rp.charAt(n))
								newrpt+="0";
							else
								newrpt+="1";
						}
					}
				//System.out.println("LPT end : "+lpt);
				//System.out.println("newRPT: end "+newrpt);
				lpt=""+rpt;
				rpt=""+newrpt;
				
			} //for loop round ends
			cipherbinary+=lpt+rpt;
		}
		System.out.println("Cipher text: "+cipherbinary);
		/*String bintodec="";
		int decvalue;
		String asciitovalue="abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<cipherbinary.length();i=i+8)
		{
			bintodec=cipherbinary.substring(i, i+8);
			decvalue=Integer.parseInt(bintodec,2);
			System.out.println(decvalue);
			if(decvalue<10)
			cipher+=decvalue;
			else
			{
				for(int e=97;e<123;e++)
				{
					if(decvalue==e)
						cipher+=asciitovalue.substring(e-97, e-96);
				}
			}
		}
		System.out.println(cipher);*/
	}
	public String rounds(String rpt)    //right plain text expansion method
	{
		int[] expansionpermutation={
				  32,  1,  2,  3,  4,  5,
				   4,  5,  6,  7,  8,  9,
			       8,  9, 10, 11, 12, 13,
			      12, 13, 14, 15, 16, 17,
			      16, 17, 18, 19, 20, 21,
			      20, 21, 22, 23, 24, 25,
			      24, 25, 26, 27, 28, 29,
			      28, 29, 30, 31, 32,  1
			   };
		
		for(int i=0;i<48;i++)
		{
			erpt+=rpt.substring(expansionpermutation[i]-1, expansionpermutation[i]);
		}
		return erpt;
	}
	public void decryption()
	{
		String original="0123456789abcdef";
		System.out.println("Please enter the cipher text :");
		String fullptbinary=scan.nextLine();
		System.out.println("Please enter the key");
		String plainkey=scan.nextLine();
		String key="";
		String ch="";
		for(int i=0;i<plainkey.length();i++)    //changing hex key to binary
		{
			String binaryk="";
			String rem="0";
			String cp=plainkey.substring(i, i+1);
			for(int j=0;j<original.length();j++)
			{
				if(cp.equals(original.substring(j , j+1)))
				{
					ch=""+j;
				}
			}
			int ascii= Integer.parseInt(ch);
			if (ascii == 0) 
			{
				binaryk="0000000";
		    }
			else 
			{
				binaryk=Integer.toBinaryString(ascii);
				while(binaryk.length()!=7)
				{
					binaryk=rem+binaryk;
				}
		    }
			key+=binaryk.substring(3, 7);
		}
		String ptbinary="";
		String binary;
		//String fullptbinary="";
		String rem="0";
		/*for(int i=0;i<fullpt.length();i++)   				 //changing plain text to binary
		{
			char c = fullpt.charAt(i);
			int ascii=(int)c;
			if (ascii == 0) 
			{
				binary="00000000";
		    }
			else 
			{
				binary=Integer.toBinaryString(ascii);
				while(binary.length()!=8)
				{
					binary=rem+binary;
				}
		    }
			fullptbinary+=binary;
		}
		while(fullptbinary.length()%64!=0)
		{
			fullptbinary=fullptbinary+rem;
		}*/
		System.out.println("Cipher text : "+fullptbinary);
		for(int ptb=0;ptb<fullptbinary.length();ptb=ptb+64)
		{
			ptbinary=fullptbinary.substring(ptb, ptb+64);
			//System.out.println("Plain text : "+ptbinary);
			int[][] initialpermutation = {{58,50,42,24,26,18,10,2,60,52,44,36,28,20,12,4},{62,54,46,38,30,22,14,6,64,56,48,40,32,24,16,8},{57,49,41,33,25,17,9,1,59,51,43,35,27,19,11,3},{61,53,45,37,29,21,13,5,63,55,47,39,31,23,15,7}};
			String p="";
			for(int j=0;j<4;j++)     				//plain text initial permutation
			for(int i=0;i<16;i++)
			{
				p+=ptbinary.substring(initialpermutation[j][i]-1, initialpermutation[j][i]);
			}
			String lpt = p.substring(0, 32);        //dividing text to lpt and rpt
			String rpt = p.substring(32, 64);
			
			for(int r=16;r>0;r--)						//Rounds begin
			{
				//System.out.println("round begins lpt "+lpt);
				//System.out.println("round begins rpt "+rpt);
				StringBuilder sb=new StringBuilder(key);
				for(int g=65;g>0;g--)			//deleting 8th element of key
				{
					if(g%8==0)
						sb.deleteCharAt(g-1);
				}
				String skey=sb.toString();
				String lkey=skey.substring(0, 28);
				String rkey=skey.substring(28, 56);
				String lskey="";
				String rskey="";
				if(r==1||r==2||r==9||r==16)			//circular shift depending on round number
				{
					int q=0;
					do{
						lskey+=lkey.substring(q+1,q+2);
						q++;
					}while(q<lkey.length()-1);
					lskey+=lkey.substring(0, 1);
					int z=0;
					do{
						rskey+=rkey.substring(z+1,z+2);
						z++;
					}while(z<rkey.length()-1);
					rskey+=rkey.substring(0, 1);
				}
				else
				{
					int q=0;
					do{
						lskey+=lkey.substring(q+2,q+4);
						q=q+2;
					}while(q<lkey.length()-3);
					lskey+=lkey.substring(0, 2);
					int z=0;
					do{
						rskey+=rkey.substring(z+2,z+4);
						z=z+2;
					}while(z<rkey.length()-3);
					rskey+=rkey.substring(0, 2);
				}
				int[] compressionpermutation={
					      14, 17, 11, 24,  1,  5,
					       3, 28, 15,  6, 21, 10,
					      23, 19, 12,  4, 26,  8,
					      16,  7, 27, 20, 13,  2,
					      41, 52, 31, 37, 47, 55,
					      30, 40, 51, 45, 33, 48,
					      44, 49, 39, 56, 34, 53,
					      46, 42, 50, 36, 29, 32
					   };
				String totalkey=lskey+rskey;
				String compresskey="";
				for(int l=0;l<48;l++)     //for making the 56 bit key to 48 bit
				{
					compresskey+=totalkey.substring(compressionpermutation[l]-1, compressionpermutation[l]);
				}
				String erpt=rounds(rpt);         //right plain text expansion method to 48 bits
				String output="";
				//System.out.println(erpt);
				//System.out.println(compresskey);
				for(int m=0;m<48;m++)				//XOR between key and rpt
					for(int n=0;n<48;n++)
					{
						if(m==n)
						{
							if(erpt.charAt(m)== compresskey.charAt(n))
								output+="0";
							else
								output+="1";
						}
					}
				//System.out.println(output);
				String sboxrpt="";
				String ascii1="";
				for(int q=0;q<output.length();q=q+6)     						 //S-Box Permutation
				{
					String middle=output.substring(q+1, q+5);
					String ends=output.substring(q, q+1)+output.substring(q+5, q+6);
					int decimalValuemiddle = Integer.parseInt(middle, 2);
					int decimalValueends = Integer.parseInt(ends, 2);
					if(q==0)
					{
						ascii1=""+sb1[decimalValueends][decimalValuemiddle];
						//System.out.println(ascii1);
					}
					if(q==6)
					{
						ascii1=""+sb2[decimalValueends][decimalValuemiddle];
						//System.out.println(ascii1);
					}
					if(q==12)
					{
						ascii1=""+sb3[decimalValueends][decimalValuemiddle];
						//System.out.println(ascii1);
					}
					if(q==18)
					{
						ascii1=""+sb4[decimalValueends][decimalValuemiddle];
						//System.out.println(ascii1);
					}
					if(q==24)
					{
						ascii1=""+sb5[decimalValueends][decimalValuemiddle];
						//System.out.println(ascii1);
					}
					if(q==30)
					{
						ascii1=""+sb6[decimalValueends][decimalValuemiddle];
						//System.out.println(ascii1);
					}
					if(q==36)
					{
						ascii1=""+sb7[decimalValueends][decimalValuemiddle];
						//System.out.println(ascii1);
					}
					if(q==42)
					{
						ascii1=""+sb8[decimalValueends][decimalValuemiddle];
						//System.out.println(ascii1);
					}
					int ascii2=Integer.parseInt(ascii1);
					String some=Integer.toBinaryString(ascii2);
					while(some.length()<4)
					{
						some=rem+some;
					}
					sboxrpt+=some;
					
				}
				//System.out.println("sbox : "+sboxrpt);
				int[] pbox={16,  7, 20, 21,
					      29, 12, 28, 17,
					       1, 15, 23, 26,
					       5, 18, 31, 10,
					       2,  8, 24, 14,
					      32, 27,  3,  9,
					      19, 13, 30,  6,
					      22, 11,  4, 25};
				String rp="";
				for(int w=0;w<32;w++)   							 // P-Box Permutation
				{
					rp+=sboxrpt.substring(pbox[w]-1, pbox[w]);
				}
				//System.out.println("P box rpt :"+rp);
				String newrpt="";
				for(int m=0;m<32;m++)				//XOR between key and rpt
					for(int n=0;n<32;n++)
					{
						if(m==n)
						{
							if(lpt.charAt(m)== rp.charAt(n))
								newrpt+="0";
							else
								newrpt+="1";
						}
					}
				//System.out.println("LPT end : "+lpt);
				//System.out.println("newRPT: end "+newrpt);
				lpt=""+rpt;
				rpt=""+newrpt;
				
			} //for loop round ends
			cipherbinary+=lpt+rpt;
		}
		System.out.println("Plain text: "+cipherbinary);
		/*String bintodec="";
		int decvalue;
		String asciitovalue="abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<cipherbinary.length();i=i+8)
		{
			bintodec=cipherbinary.substring(i, i+8);
			decvalue=Integer.parseInt(bintodec,2);
			System.out.println(decvalue);
			if(decvalue<10)
			cipher+=decvalue;
			else
			{
				for(int e=97;e<123;e++)
				{
					if(decvalue==e)
						cipher+=asciitovalue.substring(e-97, e-96);
				}
			}
		}
		System.out.println(cipher);*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Des d=new Des();
		Scanner scan1=new Scanner(System.in);
		System.out.println("Encryption : e OR Decryption : d");
		String option= scan1.nextLine();
		if(option.equals("e"))
			d.encryption();
		else if(option.equals("d"))
			d.decryption();
	}

}
