package com.masai.problem2;

public interface ExampleInterface1 {
	int value1 = 10; // Line 1
	public int value2 = 15; // Line 2
	public static int value3 = 20; // Line 3
	public static final int value4 = 25; // Line 4
//	private int value5 = 5; // Line 5
	
	
//	a) Which of the line will give error and Why ?
	
	/*Here the line  number 5 will give a compile time error because in an interface we can't give any value as private.
	 * */
}


  interface ExampleInterface2 {
	void method1();

	default void method5() {
			System.out.println("Method5");
	}
	
// No it will not show any error because after java-8 we can have default methods in java interface.	
}
