package Excersice;

import java.util.ArrayList;

public class arrayAddElements {

	public static void main(String[] args) {
		
		ArrayList list= new ArrayList();
		list.add("Ball");
		list.add("Dog");
		list.add("Egg");
		list.add("Fish");
		list.add("Gold");
		
		System.out.println("The existing elements: "+list);
		list.add(0, "Apple");
		list.add(2,"Cat");
		System.out.println("The added list: "+list);

	}

}
