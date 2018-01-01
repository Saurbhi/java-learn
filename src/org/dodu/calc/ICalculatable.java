package org.dodu.calc;


/**
 * The Interface ICalculatable.
 */
public interface ICalculatable {
	public<T> T getSum(T num1, T num2);
	public<T> T getDiff(T num1, T num2);
	public<T> T getMul(T num1, T num2);
	public<T> T getDiv(T num1, T num2);	
}
