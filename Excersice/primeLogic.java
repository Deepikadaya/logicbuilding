package Excersice;

import java.util.Scanner;

public class primeLogic {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number");
		int num= scanner.nextInt();
		int count=0;
		int temp;
		
		for(int i=2;i<=num/2;i++){
			temp= num%i;
			if(temp==0){
				count++;
			}
		}
		if(count==0){
			System.out.println("prime number");
		}
		else{
			System.out.println("not a prime number");
		}

	}

}
