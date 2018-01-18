package Excersice;

import java.util.Scanner;

public class conditionalMultiple {

	public static void main(String[] args) {
		Scanner userInput= new Scanner(System.in);
        System.out.println("Enter the Multiple:");
        int number= userInput.nextInt();
        
        for(int i=0;i<=10;i++){
        	System.out.print(i*number+" ");
        }
        

	}

}
