package com.employee.mains;

import java.util.Scanner;

public class Test {

	static Clerk c;
	static Manager m;
	static programmer p;
	
	public static void main(String[] args) {

		
		
		int ch1=0;
		int ch2=0;
		
		Scanner scn =new Scanner(System.in);
		
		do {
		System.out.println("------------------------------------");
		System.out.println("1.create");
		System.out.println("2.display");
		System.out.println("3.raiseSalary");
		System.out.println("4.exit");
		System.out.println("-------------------------------------");
			
		System.out.println("enter your choice");
		ch1=scn.nextInt();
				
				if(ch1==1) {
					
					do {
					System.out.println("------------------------------------");
					System.out.println("1.clerk");
					System.out.println("2.manager");
					System.out.println("3.programmer");
					System.out.println("4.exit");
					System.out.println("-------------------------------------");
						
					ch2 = scn.nextInt();
					
					switch(ch2)
					{
					case 1:c= new Clerk(1,"rahul","clerk");
						break;
					case 2: m=new Manager(2,"ganesh","Manger");
					break;
					case 3:	p=new programmer(3,"amith","programmer");
					break;	
					}	
					
					}while(ch2 !=4);				
				}
				
				if(ch1==2) {
					
					do {
					System.out.println("Display Details------------------------------------");
					System.out.println("1.clerk");
					System.out.println("2.manager");
					System.out.println("3.programmer");
					System.out.println("4.exit");
					System.out.println("-------------------------------------");
						
					ch2 = scn.nextInt();
					
					switch(ch2)
					{
					case 1: System.out.println(c);
						break;
					case 2:  System.out.println(m);
					break;
					case 3:	 System.out.println(p);
					break;	
					}	
					
					}while(ch2 !=4);				
				}
				
				if(ch1==3) {
					
					do {
					System.out.println("Raise Salary--------------------------");
					System.out.println("1.clerk");
					System.out.println("2.manager");
					System.out.println("3.programmer");
					System.out.println("4.exit");
					System.out.println("-------------------------------------");
						
					ch2 = scn.nextInt();
					
					switch(ch2)
					{
					case 1: c.RaiseSalary();
						break;
					case 2: m.RaiseSalary();
					break;
					case 3:	p.RaiseSalary();
					break;	
					}	
					
					}while(ch2 !=4);				
				}
		}while(ch1 !=4);	
	}

}
