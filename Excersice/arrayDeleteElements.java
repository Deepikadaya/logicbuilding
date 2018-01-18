package Excersice;

import java.util.ArrayList;

public class arrayDeleteElements {

	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		list.add("Apple");
		list.add("Ball");
		list.add("Cat");
		list.add("Dog");
		list.add("Egg");
		list.add("Fish");
		list.add("Gold");
		
		System.out.println("The existing elemnts: "+list);
		list.remove(5);
		list.remove(4);
		
		System.out.println("updated list: "+list );

	}

}
