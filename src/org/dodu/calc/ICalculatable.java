package org.dodu.calc;


/**
 * The Interface ICalculatable.
 */
public interface ICalculatable {
	public<T extends Number> double getSum(T num1, T num2);
	public<T extends Number> double getDiff(T num1, T num2);
	public<T extends Number> double getMul(T num1, T num2);
	public<T extends Number> double getDiv(T num1, T num2);	
}
