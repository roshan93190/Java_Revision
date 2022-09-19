package com.masai.problem4;

public class Animal {

	String name;

	Animal(){
		this.name = "Lion"; 
	}

	public Animal(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {
		Animal a = new Animal("tiger");
		System.out.println(a.name); 


		Animal b = new Animal(); 
		System.out.println(b.name); 
	}
}





