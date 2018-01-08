package myDemo;

public class stringDemo {

	public static void main(String[] args) {
	String str= "Deepika,9876543210,JAVA";
	System.out.println("Using substring-My name:"+str.substring(0,7));
    System.out.println("Using substring-My number:"+str.substring(8,18));
    
    String str1[]=str.split(",");
    System.out.println("My name:" +str1[0]);
    System.out.println("My number:" +str1[1]);
    System.out.println("My course:" +str1[2]);
    
    System.out.println("My name in Uppercase:"+str.substring(0,7).toUpperCase());
    System.out.println("My couse in lowercase:"+str.substring(19).toLowerCase());
    
    str=str.concat(",Devops");
    System.out.println("Concatinating string:"+str);
	}

}
