

import javax.swing.JOptionPane;
import edu.vccs.vdh275.math.*;
/**
 * Programmer: Vanessa Harris
 * Date: 02/25/2013
 * Purpose: Simple Calculator Application
 */
public class CalTest {
	public static void main(String[] args) {
		/**
		 * Main method for calculator
		 * @param args - taking input arguments for command prompt
		 */
		Cal testing;
		int operations;
		String firstNumber = JOptionPane.showInputDialog("Enter the first number");
		if (firstNumber==null || firstNumber==""){
			System.exit(0);
		}
		String firstNumber2 = firstNumber.replaceAll(",", ""); //just in case user adds a comma
		String secondNumber = JOptionPane.showInputDialog("Enter the second number");
		if (secondNumber==null || secondNumber==""){
			System.exit(0);
		}
		String secondNumber2 = secondNumber.replaceAll(",", ""); 
		try {
		double num1 = Double.parseDouble(firstNumber2);
		double num2 = Double.parseDouble(secondNumber2);
		testing = new Cal(num1, num2);
		
		Object[] options = {"+",
                "-",
                "*", "/", "%", "x^n", "sqrt()"};
		operations = JOptionPane.showOptionDialog(null,
    		"What would you like to calculate? ",
    		"Operations ", 
    		JOptionPane.DEFAULT_OPTION,
    		JOptionPane.QUESTION_MESSAGE,
    		null,
    		options,
    		options[0]);
		switch (operations){
		case 0:
			JOptionPane.showMessageDialog(null, 
					"The sum is " +
					 Cal.add(num1, num2));
			break;
		case 1:
			JOptionPane.showMessageDialog(null,
					"The difference is " + 
					Cal.subtract(num1, num2));
			break;
		case 2:
			JOptionPane.showMessageDialog(null, 
					"The product is " +
					Cal.multiply(num1, num2));
			break;
		case 3:
			JOptionPane.showMessageDialog(null,
					"The quotient is " + 
					Cal.divide(num1, num2));
			break;
		case 4:
			JOptionPane.showMessageDialog(null, 
					"The remainder is " + 
					Cal.modulus(num1, num2));
			break;
		case 5:
			JOptionPane.showMessageDialog(null, 
					"The exponential is " +testing.power(num1,num2));
			break;
		case 6:
			JOptionPane.showMessageDialog(null, 
					"The square roots are\n " + 
					testing.squareRoot(num1, num2));
			break;
		case -1:
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null, "This is impossible");
			System.exit(0);
			break;
    	
	}


		}catch(NumberFormatException nfe){
			JOptionPane.showMessageDialog(null, "Please try again with numeric input for each number.");
			System.exit(0);
		}
System.exit(0);		
}
}