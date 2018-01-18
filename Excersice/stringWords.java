package Excersice;

public class stringWords {

	public static void main(String[] args) {
		String str= "Number of words in the given string demo";
		int count=1;
		
		for(int i=0;i<str.length();i++){
			if((str.charAt(i)==' ')){
			  count++;
			}
		}
		System.out.println("Total number of words in the given string is: "+count);
		
	}

}
