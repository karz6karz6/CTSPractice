package com.cts.practice;

/*Create a base class with an abstract print( ) method that is
overridden in a derived class. The overridden version of the method prints the value
of an int variable defined in the derived class. At the point of definition of this
variable, give it a nonzero value. In the base-class constructor, call this method. In
main( ), create an object of the derived type, and then call its print( ) method.
Explain the results.*/

public class Practice4 {

	public static void main(String[] args) {
		derivedClass obj = new derivedClass();
	}
}


 abstract class baseClass {
	baseClass() {
	this.print();
	}

	abstract void print();
}

 class derivedClass extends baseClass {
	int var = 6;

	void print() {
		System.out.println(var);
	}

}

