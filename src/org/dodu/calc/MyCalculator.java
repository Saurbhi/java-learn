package org.dodu.calc;

/**
 * The Class MyCalculator.
 */
public class MyCalculator implements ICalculatable{

	@Override
	public <T extends Number> double getSum(T num1, T num2) {
		return num1.doubleValue() + num2.doubleValue();
	}


	@Override
	public <T extends Number> double getMul(T num1, T num2) {
		return num1.doubleValue() * num2.doubleValue();
	}

	@Override
	public <T extends Number> double getDiv(T num1, T num2) {
		if ((int)num2.doubleValue() == 0)
			throw new ArithmeticException("divide by zero");
		return num1.doubleValue() / num2.doubleValue();
	}


	@Override
	public <T extends Number> double getDiff(T num1, T num2) {
		return num1.doubleValue() - num2.doubleValue();
	}

}
