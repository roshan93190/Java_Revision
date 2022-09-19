package com.masai.problem1;

//*Can super class reference variable can hold an object of sub class? Give Examples*
 
public class Main extends Demo {
	
	public static void main(String[] args) {
		
		Demo demo=new Main();
		demo.helloPerson("Roshan");
		

	/*
	 * Yes it is possible  that super class reference can hold an object of sub class.
	 *  But, here we need to understand a condition that we cant access the methods and variables of the sub-class;  
	 * 
	 * */	
		
	}

}
