package com.masai.problem4;

class Test {
    int a, b;

  

	Test(){
		this(2,4);
	}

	Test(int a, int b){
		this();
	}
    public static void main(String[] args) {
       Test a = new Test();
//       System.out.println(a);
    }
}

// here we are getting the compile timer error of recursive constructor invocation which means we are calling a constructors.