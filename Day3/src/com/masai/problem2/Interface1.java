package com.masai.problem2;

interface Interface1{
	void method1();
}

interface Interface2 extends Interface1{
	void method2();
// it will work here we need to implement the method in another class.
}

//interface Interface2 extends Interface1{
//	void method2();
//}
//
//interface Implementation implements Interface2{
//	void method2();
//	
////	Since we are implmenting the another inteface for this it should be a class
//}

abstract class ImplementationAbstract implements Interface1{
	public void method1() { };
}

