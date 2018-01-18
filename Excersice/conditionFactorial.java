package Excersice;

import java.util.Scanner;

public class conditionFactorial {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number= obj.nextInt();
		int fact=1;
			
		for(int i=1;i<=number;i++){
			fact=fact*i;
		}
		System.out.println("The factorial of "+number+" is: "+fact);

	}

}
