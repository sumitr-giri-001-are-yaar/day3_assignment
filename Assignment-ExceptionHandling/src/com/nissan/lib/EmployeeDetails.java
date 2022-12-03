package com.nissan.lib;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import java.util.regex.Pattern;

public class EmployeeDetails {
 public static void userInput(int age){	
      try {
            
            // if Age is not satisfy to the question throw new Exception;
                if(age >= 18 && age <= 60) ;
                else throw new Exception("Please enter age between 18 to 60");
        }
        // print exception if occur
        catch(Exception e) {
            System.out.println(e);
        }
    }
    private static void showDetails(String name , int age) {
        System.out.println("*****************  Details *****************");
        System.out.println("Hi : "+ name );
        System.out.println("You are "+age+" Years old");
    }
}


