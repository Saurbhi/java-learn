package org.dodu.calc;

/**
 * The Class Main.
 */
public class Main {
	public static void main(String[] args) {
		
		Person kaduPerson = new Person(22);
		Person doduPerson = new Person(24);
		System.out.println(kaduPerson);
		
		MyCalculator myCalculator = new MyCalculator();
		System.out.println(myCalculator.getSum(3, 4));
		System.out.println(myCalculator.getDiff(3.4, 4.6));
		System.out.println(myCalculator.getMul(3.41, 14.6));
		System.out.println(myCalculator.getDiv(13.1, 6.6));
		
		System.out.println(myCalculator.getDiv(kaduPerson, doduPerson));
	}
}
