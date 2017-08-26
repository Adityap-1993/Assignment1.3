package assignment;

import java.util.Scanner;      //importing scanner 

public class Assignment1_3 {  //Class definition

	public static void main(String[] args) {  //main starts here
		
	
		
		Scanner sc=new Scanner(System.in);     //creating scanner object 
		
		System.out.println("Enter the two numbers.");
		
		byte x=(byte)sc.nextInt();  //taking first input casting to byte
		 
		byte y=(byte)sc.nextInt();  //taking second input casting to byte
		
		//for bitwise result
		
		System.out.println("The Bitwise AND opeation between x and y is " +(x & y) + ".");  //performing bitwise AND operation and printing
		
		
		//for logical result
		
	//Taking test conditions according to  input and storing into boolean variables
		
		boolean a= (x==0)&&(y==0);            
		
		boolean b= (x==1)&&(y==0);
		
		boolean c=(x==0)&&(y==1);
		
		boolean d=(x==1)&&(y==1);
		
		//from the results of boolean variable performing Logical AND operations accordingly and printing
		
		if(a)
			System.out.println("The logical AND opreation between x and y is " + (false && false) +".");
		
		if(b)
			System.out.println("The logical AND opertaion between x and y is  " +(true && false) +".");
		
		if(c)
			
			System.out.println("The logical AND opertaion between x and y is  " +(false && true) +".");
		
		if(d)
			System.out.println("The logical AND opertaion between x and y is  " +(true && true) +".");
			
		
		
		
				
		
		sc.close(); //object  closes
		
		
		

	}

}// class closes
