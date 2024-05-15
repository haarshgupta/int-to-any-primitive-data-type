//package tesPack;

import java.util.Scanner;

public class test1 {

		public void converrt(){
			int i=0;
			while(i<=0) {//infinite loop.
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter an integer");
				int getNum=Integer.parseInt(sc.nextLine());
				System.out.println("Enter the data type u needed to be convert in ");
				String s1=sc.nextLine();//long,short,float,char,byte,string,double
				System.out.println(s1);
			    switch(s1) {
				case("long"):{
					long l=getNum;
					System.out.println(getNum+" in long is equals to "+l);
					break;
				}
				case("short"):{
					short s=(short)getNum;
					System.out.println(getNum+" in short is equals to "+s);
					break;
				}
				case("char"):{
					char ch=(char)getNum;
					System.out.println(getNum+" in char is equals to "+ch);
					break;
				}
				case("float"):{
					float f=getNum;
					System.out.println(getNum+" in float is equals to "+f);
					break;
				}
				case("double"):{
					double d=getNum;
					System.out.println(getNum+" in double is equals to "+d);
					break;
				}
				case("byte"):{
					byte b=(byte)getNum;
					System.out.println(getNum+" in byte is equals to "+b);
					break;
				}
				case("String"):{
					String s=Integer.toString(getNum);
					System.out.println(getNum+" in String is equals to "+s);
					break;
				}
				default:{
					System.out.println("Ennter the correct data type..");
				}
				}
			}
		}
	
	    public static void main(String[] args) {
	    	test1 obj=new test1();
//	        
	    
	        }
	    	
	}

