package com.employee.mains;
import java.util.Scanner;
public class  CEO
{
public static Ceo ;
private Ceo()
{
}
public static getobject()
{
if(Ceo==null)
Ceo=new Ceo();
return new Ceo;
}
}
class CEO 
{

        public static String name;
        public static  int id;
        public static  int salary;
	public static Clerk c;
	public static Manager m;
        public static programmer p;
	
	public static void main(String[] args)

{
             Ceo.name="Suresh";
             Ceo a1=Ceo.getobject();
             return new Ceo();
{
System.out.println(a1);
}
public String display()
{
return "ceo id is:"+id+" salary is:"+salary+" name is"+name;
}
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
                                     case 4: Ceo=new Ceo(4,"suresh",CEO)
                                      break;

					
					}while(ch2 !=4);				
				}
				
				if(ch1==2) {
 Iterator<Employee>itr=ite
					
					do {
					System.out.println("Display                                          Details------------------------------------");
					System.out.println("1.clerk");
					System.out.println("2.manager");
					System.out.println("3.programmer");
					System.out.println("4.exit");
					System.out.println                                         ("-------------------------------------");
						
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
					System.out.println("Raise                                         Salary--------------------------");
					System.out.println("1.clerk");
					System.out.println("2.manager");
					System.out.println("3.programmer");
					System.out.println("4.exit");
					System.out.println                                         ("-------------------------------------");
						
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
