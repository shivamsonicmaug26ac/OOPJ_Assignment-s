package org.soni;

import java.util.ArrayList;

public class Allque {

	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList();
		
		obj.add("red");
		obj.add("green");
		obj.add("yellow");
		
		System.out.println(obj);
		
		System.out.println("=======================");
		
		obj.set(0, "Sanket");
		System.out.println(obj);
		
		System.out.println("=======================");
		
		System.out.println(obj.get(0));
		
		System.out.println("=======================");
		
		obj.set(1, "neon");
		System.out.println(obj);

		System.out.println("=======================");
		
		obj.remove(0);
		System.out.println(obj);
		
		System.out.println("=======================");
	}
}

//1. Write a Java program to create a new array list, add some colors (string) and print out the collection. 

//ArrayList<String> obj = new ArrayList();
//
//obj.add("red");
//obj.add("green");
//obj.add("yellow");
//
//System.out.println(obj);

//2. Modify the above Java program to insert an element into the array list at the first position. 

