package samplecooper;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends Service{
	public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter your Name: ");
     String customerName=sc.nextLine();
     System.out.println("Enter your ServiceId: ");
     int cusId=sc.nextInt();
     System.out.println("Enter your City ");
     String city=sc.next();
     System.out.println("Enter your Town: ");
     String town=sc.next();
     System.out.println("Enter your MobileNumber: ");
     long num=sc.nextLong();
     System.out.println("The Service You Need");
     System.out.println("1.HouseCleaning");
     System.out.println("2.Appliance Repair");
     System.out.println("3.Plumers");
     System.out.println("4.Electronics");
     System.out.println("5.Carpenters");
     ArrayList<String> list=new ArrayList<>();
     list.add("9am");
     list.add("10am");
     list.add("11am");
     list.add("12pm");
     list.add("13pm");
     list.add("14pm");
     list.add("15pm");
     list.add("16pm");
     System.out.println("Enter the number for Service: ");
     int option=sc.nextInt();
     switch(option){
     case 1:
     {
    	 System.out.print("Enter the Starting Time(Eg:9am): ");
    	 String starttime=sc.next();
    	 System.out.print("Enter the ending Time(Eg:14pm): ");
    	 String endtime=sc.next();
    	 if((list.contains(starttime))&&(list.contains(endtime))){
    	houseclean();
    	System.out.print("If You want to Update your Bookin? (Yes/No)");
    	String s=sc.next();
		if(s.equals("Yes"))
		{
			housecleanUpdation();
		}
		else
			System.out.print("Thankyou for Registration");
    	break;}
    	 else
    		 System.out.print("Your timing is not Available");
     }
     case 2:
     {
    	 System.out.print("Enter the Starting Time(Eg:9am): ");
    	 String starttime=sc.next();
    	 System.out.print("Enter the ending Time(Eg:14pm): ");
    	 String endtime=sc.next();
    	 if((list.contains(starttime))&&(list.contains(endtime))){
    	 appliancerepair();
     	System.out.println("If You want to Update your Bookin? (Yes/No)");
     	String s=sc.next();
 		if(s.equals("Yes"))
 		{
 			appliancerepairUpdation();
 		}
 		else
 			System.out.print("Thankyou for Registration");
    	 break;}
    	 else
    		 System.out.print("Your timing is not Available");
    		 
     }
     }
     
     
     
	}
     
}
