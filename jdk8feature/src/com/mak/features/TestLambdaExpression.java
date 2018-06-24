package com.mak.features;

/**
 * @author Mak
 *
 *         Lambda expression
 *         <h1>either (parameters) -> expression or (parameters) -> {
 *         statements; } or () -> expression</h1>
 * 
 *         In programming, a Lambda expression (or function) is just an
 *         anonymous function, i.e., a function with no name and without being
 *         bounded to an identifier. They are written exactly in the place where
 *         it’s needed, typically as a parameter to some other function.
 */
public class TestLambdaExpression {

	public static void main(String[] args) {
		// single parameter
		FirstFunctionalInterface s = name1 -> {
			return name1 + " Testing labda expression!!";
		};
		System.out.println(s.workTodo("Mahesh"));

		// two parameters
		SecondInterface secondInterface = (c, d) -> (c + d);
		System.out.println(secondInterface.getSum(24, 98));

		FirstFunctionalInterface sAnonymous = new FirstFunctionalInterface() {

			@Override
			public String workTodo(String name) {
				return name + " Anonymous testing!!!";
			}
		};
		System.out.println(sAnonymous.workTodo("Bamman"));
	}
}
