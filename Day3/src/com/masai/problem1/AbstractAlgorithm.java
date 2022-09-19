package com.masai.problem1;

abstract class AbstractAlgorithm{
	abstract void steps();
}

class Algorithm1 extends AbstractAlgorithm{
//	System.out.println("")
}

//Since above class is abstract for extending this we need to overide the methods.


	abstract class AbstractAlgorithm1{	
	private int stepCount;
	public static void main(String[] args) {
	System.out.println("No since we cant insantiate object of the class so we will not able to get the stepCount");
	}

}

	abstract class AbstractAlgorithm2{
	private int stepCount;
    public int getStepCount(){
		return stepCount;
	}
	public static void main(String[] args) {
		System.out.println("it will throw an error at the later time since we know we cant instantiate the object");
	}
}