package org.dodu.calc;

/**
 * The Class MyCalculator.
 */
public class MyCalculator implements ICalculatable{

	@Override
	public <T> T getSum(T num1, T num2) {
		return num1;
	}

	@Override
	public <T> T getDiff(T num1, T num2) {
		return null;
	}

	@Override
	public <T> T getMul(T num1, T num2) {
		return null;
	}

	@Override
	public <T> T getDiv(T num1, T num2) {
		return null;
	}

}
