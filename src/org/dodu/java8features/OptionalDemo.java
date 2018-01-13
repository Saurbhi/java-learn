package org.dodu.java8features;

import java.util.Optional;

/**
 * The Class OptionalDemo.
 */
public class OptionalDemo {
	
	public static void main(String[] args) {
		
		Integer a = null;
		Integer b = 12;
		Optional<Integer> aOpt = Optional.ofNullable(a);
		Optional<Integer> bOpt = Optional.ofNullable(b);
		bOpt.ifPresent(value -> System.out.println(value + 1));
		
		if (aOpt.isPresent()) {
			System.out.println(aOpt.get() * 2);
		}
		if (bOpt.isPresent()) {
			System.out.println(bOpt.get() * 2);
		}
		System.out.println(aOpt);
		System.out.println(bOpt);
	}
}
