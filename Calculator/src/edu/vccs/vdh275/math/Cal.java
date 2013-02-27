package edu.vccs.vdh275.math;
/**
 * Use this class to calculate different operations for two numbers
 * <br>Example:
 * <br>Cal.add(2,1);
 * <br>This will return 3.0 as the sum between these two numbers.
 * 
 * @author Vanessa Harris
 * 
 */
public class Cal {
	
	private double x;
	private double y;
	
	public Cal(double num1, double num2){
		num1 = x;
		num2 = y;
	}
	/**
	 * add method for addition
	 * @param num1  first number
	 * @param num2  second number
	 * @return sum-the sum of the first and second numbers
	 */
	public static double add(double num1, double num2){
		double sum=0;
		sum= num1 + num2;
		return sum;
	}
	/**
	 * subtract method for subtraction
	 * @param num1  first number
	 * @param num2  second number
	 * @return difference-the difference between the first and second numbers
	 */
	public static double subtract(double num1, double num2){
		double difference=0;
		difference= num1 - num2;
		return difference;
	}
	/**
	 * multiply method for multiplication
	 * @param num1  first number
	 * @param num2  second number
	 * @return product-the product of the first and second numbers
	 */
	public static double multiply(double num1, double num2){
		double product=0;
		product= num1*num2;
		return product;
	}
	/**
	 * divide method for division
	 * @param dividend  number being divided
	 * @param divisor  the number dividing the first number
	 * @return quotient-returns the quotient of the first number divided by the second number
	 */
	public static double divide(double dividend, double divisor){
		double quotient=0;
		quotient= dividend/divisor;
		return quotient;
	}
	/**
	 * modulus method for modulation
	 * @param num1  first number
	 * @param num2  second number
	 * @return remainder-the remainder of the first and second numbers
	 */
	public static double modulus(double num1, double num2){
		double remainder=0;
		remainder= num1%num2;
		return remainder;
	}
	/**
	 * power method to exponentiate
	 * @param base  first number
	 * @param exponent  second number
	 * @return exponential-the first number raised to the second number
	 */
	public double power(double base, double exponent){
		double exponential=0;
		exponential= Math.pow(base,exponent);
		return exponential;
	}
	/**
	 * squareRoot method for finding the square root
	 * @param num1  first number
	 * @param num2  second number
	 * @return sqroots-a string of the square roots of both numbers
	 */
	public String squareRoot(double num1, double num2){
		
		double root1=0;
		double root2=0;
		root1= Math.sqrt(num1);
		root2= Math.sqrt(num2);
		String sqroots = String.valueOf(root1)+"\n" + String.valueOf(root2) ;
		return sqroots;
		
	
	}
	
	


		
	}


