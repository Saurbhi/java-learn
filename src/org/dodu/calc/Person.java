package org.dodu.calc;

/**
 * The Class Person.
 */
class Person{
	
	private int age;
	
	public Person(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Person is of [age=" + age + " many years]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}