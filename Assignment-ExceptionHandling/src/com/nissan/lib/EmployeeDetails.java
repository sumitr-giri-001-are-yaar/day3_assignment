package com.nissan.lib;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import java.util.regex.Pattern;

public class EmployeeDetails {
 public static void userInput(){	
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("enter customer name");
     String name=scanner.nextLine();
	 System.out.println("enter customer Age");
   int age=scanner.nextInt();
         while(age<=18 && age>=60)
         {
    	System.out.println("wrong input");
               break;
               }
    while(!(age>=18 && age<=60)) 
    	 {System.out.println("name:" + name +  "  age :"+ age );
    	 break;
    	 }
    	 
     
     

}
}

