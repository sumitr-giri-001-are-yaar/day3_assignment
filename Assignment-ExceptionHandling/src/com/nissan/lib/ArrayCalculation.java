package com.nissan.lib;

import java.util.Scanner;

public class ArrayCalculation {
	public static void aray(){
		Scanner scanner =new Scanner(System.in);
		int [] array=new  int[10];
		System.out.println("enter the array element");
		for(int i=0;i<array.length;i++)
		{
			array[i]=scanner.nextInt();
		}
		try{System.out.println(array[11]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array limit is 10,11th element can be collected");
		}
		}
		
	}


