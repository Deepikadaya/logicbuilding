package Excersice;

import java.util.Scanner;

public class ArrayOccurance {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the charater to be checked:");
		char letter=scanner.next().charAt(0);
		
		String str= "Learning java";
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==letter){
				count++;
			}
		}
        
		System.out.println(count);
	}

}
