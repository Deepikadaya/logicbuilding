package Excersice;

import java.util.Scanner;

public class conditional3Comapre {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter the value of A");
		int a=userInput.nextInt();
		System.out.println("Enter the value of B");
		int b=userInput.nextInt();
		System.out.println("Enter the value of C");
		int c=userInput.nextInt();
		
        if((a>b)&&(a>c)){
        	System.out.println("A is bigger");
        }
        	else if((b>c)&&(b>c)){
        		System.out.println("B is bigger");
        	}
        	else{
        		System.out.println("C is bigger");
        	}
        }
	}


