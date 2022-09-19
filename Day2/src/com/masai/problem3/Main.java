package com.masai.problem3;

public class Main {

    //*Is a super class constructor called even when there is no explicit call from a* ?
//	Yes.

	//	*sub class constructor? What will be the output of below program ?*
	
	
	@Override
	public String toString() {
		return "Main []";
	}

	public static void main(String[] args) {

			Labrador labrador = new Labrador();
			System.out.println(labrador);
	      
		
	}
	
	
}
