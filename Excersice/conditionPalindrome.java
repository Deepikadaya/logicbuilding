package Excersice;

public class conditionPalindrome {

	public static void main(String[] args) {
		int arr=111;
		int rev,sum=0;
		
		int temp=arr;
		while(temp>0){
			
		    rev= temp%10;
		    sum=(sum*10)+rev;
		    temp= temp/10;
		}
		
		if(temp==sum){
			System.out.println("palindrom");
		}
		else{
			System.out.println("not palindrome");
		}
		
		

	}

}
