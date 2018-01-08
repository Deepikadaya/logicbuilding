package myDemo;

import java.util.Scanner;

public class interMain {
	public static void main(String[] args) {
		
		Scanner userInput= new Scanner(System.in);
		
        int id=0;
		String name = null;
		InterClass obj=new InterClass();
		
	        System.out.println("Enter employee name:");
			name=userInput.next();
	        
			System.out.println("Enter employee Id:");
		    id= userInput.nextInt();
		    
	

		System.out.println("The employe name is: "+obj.empName(name));
		System.out.println("The employe id is: "+obj.empId(id));
       
		
	}

}
