package com.masai.problem4;

 
class Bar extends Foo{
	public void doIt(float number){
		System.out.println("C");
	}
	public static void main(String[] args) {
		Bar x = new Bar();
		x.doIt("hello");
	}
}
