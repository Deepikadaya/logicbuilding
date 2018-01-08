package myDemo;

public class constructorDemo {
	String name;
	int id;
	String location;
	
	//constructor
	
	constructorDemo(String name,int id, String location){
		this.name=name;
		this.id=id;
		this.location=location;
		}
     
	 void display()
	 {
		 System.out.println("My name is " +name+" my id is " +id +" my location " +location);
     }
	constructorDemo(int id)
	{
		System.out.println("My int value:" +id);
	}
	constructorDemo(String name)
	{
		System.out.println("My String value is:"+name);
	}
	
	
}
