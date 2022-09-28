//////////////////////////////////////////////////////////////////////////////
//
// AP CS A
// Unit Programming Project
//
// Fraction Calculator
//
// written by {$LYLE DENG}
//

import java.util.Scanner;

public class FracCalc {

    ////////////////////////////////////////////////////////
    // 
    // the main method is where you will interact with the
    // user by prompting for input and displaying results
    //
    public static void main(String[] args) {
        // TODO: (Checkpoint 1)
    	Scanner console = new Scanner(System.in);
    	String userInput;
    	
    	do {
        //  * prompt the user for an equation
    	System.out.print("What is your equation? ");
    	
        //  * capture the input
    	userInput = console.nextLine();

        //  * call the produceAnswer() method
    	String output = produceAnswer(userInput);
        //  * display the result
    	System.out.println(output);
    	
    	} while (userInput != "quit");
    	

        // TODO: (Checkpoint 2)
        //  * do all of the above inside a sentinel loop
    }
    
    ////////////////////////////////////////////////////////
    //
    // do not modify this method other than to activate the
    // checkpoint method that you are currently working on.
    //
    // after you finish Checkpoint #1, then comment out the
    // Checkpoint1 call and uncomment the Checkpoint2 call.
    // work on Checkpoint2 until all Checkpoint2 tests pass.
    //
    // after you finish Checkpoint #2, then comment out the
    // Checkpoint2 call and uncomment the Checkpoint3 call.
    // work on Checkpoint3 until all Checkpoint2 tests pass.
    //
    // And so forth.
    //
    ////////////////////////////////////////////////////////
    public static String produceAnswer(String input) { 
        
        // Checkpoint #1
        //return produceAnswerCheckpoint1(input);

        // Checkpoint #2
        //return produceAnswerCheckpoint2(input);

        // Checkpoint #3
        //return produceAnswerCheckpoint3(input);

        // Final Checkpoint
        return produceAnswerFinal(input);
        
        // Extra Credit (optional)
        //return produceAnswerExtraCredit(input);
    }

    public static String produceAnswerCheckpoint1(String input) { 
        // TODO (Checkpoint 1):
        // break up the input parameter into three Strings: the 
        // first operand (fraction), the operator (+ - * /), and 
        // the second operand (fraction). return second operand.
    	int i = input.indexOf(" ");
    	String operand1 = input.substring(0, i);
    	char operator = input.charAt(i + 1);
    	String operand2 = input.substring(i + 3, input.length());
        
        return operand2;
    }

    public static String produceAnswerCheckpoint2(String input) { 
        // TODO (Checkpoint 2):
        // break up the input parameter into three Strings: the 
        // first operand (fraction), the operator (+ - * /), and 
        // the second operand (fraction).  parse each operand
        // into 3 integer values, one each for the numerator,
        // denominator, and whole portion (for mixed fractions 
        // or integers).  return a string that describes each 
        // component of the second operand.  
        //    
        // The return format is as follows:
        //
        //     "whole:[w] numerator:[n] denominator:[d]"
        //
        // where [w], [n], and [d] represent the whole number,
        // numerator, and denominator components of the second 
        // operand.
        //
        // Example #1
        // if input is "5_3/4 - 6_5/8", the method would return
        // "whole:6 numerator:5 denominator:8"
        // 
        // Example #2
        // if input is "-3/7 - 20", the method would return
        // "whole:20 numerator:0 denominator:1"
        // 
        // Example #3
        // if input is "-32 - 27/21", the method would return
        // "whole:0 numerator:27 denominator:21"
    	
    	
    	int i = input.indexOf(" ");
    	
  // Operand 1 Evaluations
    	String operand1 = input.substring(0, i);
    // get whole number
    	//check if '_' exists in the operand
    	int underscore1 = 0;
    	while (underscore1 < operand1.length() - 1 && operand1.charAt(underscore1) != '_') {
    		underscore1++;    	
    	}
    	
    	//check if '/' exists in the operand
    	int divide1 = 0;
    	while (divide1 < operand1.length() - 1 && operand1.charAt(divide1) != '/') {
    		divide1++;    	
    	}
    	
    	
    	// if there is a '_', assign in a variable the String from index 0 to the _.
    	// if there isn't, check if there is a fraction ('/')
    	// if there is, assign the whole1 variable 0
    	// if there isn't, assign the whole 1 variable the entire operand
    	int whole1;
    	
    	if (operand1.charAt(underscore1) == '_') {
        	whole1 = Integer.parseInt(operand1.substring(0, underscore1));
    	} else if (operand1.charAt(divide1) == '/'){
    		whole1 = 0;
    	} else {
    		whole1 = Integer.parseInt(operand1);
    	}
    	

    // get numerator and denominator
    	//check if there is a '/'
    	// if there is, run through with numerator and denominator checks
    	// if there isn't, assign the numerator 0 and denominator 1
    	
    	int numerator1;
    	int denominator1;
    	if (operand1.charAt(divide1) == '/') {
    		
    		// if there's an underscore, start from there to the '/'
        	// if not, start from 0
	    	if (operand1.charAt(underscore1) == '_') {
	    		numerator1 = Integer.parseInt(operand1.substring(underscore1 + 1, divide1));
	    	} else {
	    		numerator1 = Integer.parseInt(operand1.substring(0, divide1)); 
	    	}
	    	
	    // get denominator
	    	denominator1 = Integer.parseInt(operand1.substring(divide1 + 1));
    	} else {
    		numerator1 = 0;
    		denominator1 = 1;    		
    	}
    	
    	
    	
    	
    	
   // Evaluations for operand 2
    	String operand2 = input.substring(i + 3, input.length());  
    	// get whole number
    	//check if '_' exists in the operand
    	int underscore2 = 0;
    	while (underscore2 < operand2.length() - 1 && operand2.charAt(underscore2) != '_') {
    		underscore2++;    	
    	}
    	
    	//check if '/' exists in the operand
    	int divide2 = 0;
    	while (divide2 < operand2.length() - 1 && operand2.charAt(divide2) != '/') {
    		divide2++;    	
    	}
    	
    	
    	// if there is a '_', assign in a variable the String from index 0 to the _.
    	// if there isn't, check if there is a fraction ('/')
    	// if there is, assign the whole1 variable 0
    	// if there isn't, assign the whole 1 variable the entire operand
    	int whole2;
    	
    	if (operand2.charAt(underscore2) == '_') {
        	whole2 = Integer.parseInt(operand2.substring(0, underscore2));
    	} else if (operand2.charAt(divide2) == '/'){
    		whole2 = 0;
    	} else {
    		whole2 = Integer.parseInt(operand2);
    	}
    	

    // get numerator and denominator
    	//check if there is a '/'
    	// if there is, run through with numerator and denominator checks
    	// if there isn't, assign the numerator and denominator 0
    	
    	int numerator2;
    	int denominator2;
    	if (operand2.charAt(divide2) == '/') {
    		
    		// if there's an underscore, start from there to the '/'
        	// if not, start from 0
	    	if (operand2.charAt(underscore2) == '_') {
	    		numerator2 = Integer.parseInt(operand2.substring(underscore2 + 1, divide2));
	    	} else {
	    		numerator2 = Integer.parseInt(operand2.substring(0, divide2)); 
	    	}
	    	
	    // get denominator
	    	denominator2 = Integer.parseInt(operand2.substring(divide2 + 1));
    	} else {
    		numerator2 = 0;
    		denominator2 = 1;    		
    	}

        return "whole:" + whole2 + " numerator:" + numerator2 + " denominator:" + denominator2;
    }
    
    

    public static String produceAnswerCheckpoint3(String input) { 
        // TODO (Checkpoint 3):
        // evaluate the input as two fractional operands and an
        // arithmetic operator, and return the actual answer of
        // that calculation.  The answer need not be in reduced 
        // form and need not be a mixed fraction, but it must 
        // be correct.
        //
        // HINT: 
        // use the Integer.parseInt(string) method to convert a 
        // string to its numeric equivalent.
    	
    	
    	
    	
//COPIED FROM CHECKPOINT 2 START (get the numbers of each operand)
    	int i = input.indexOf(" ");
    	
    	  // Operand 1 Evaluations
    	    	String operand1 = input.substring(0, i);
    	    // get whole number
    	    	//check if '_' exists in the operand
    	    	int underscore1 = 0;
    	    	while (underscore1 < operand1.length() - 1 && operand1.charAt(underscore1) != '_') {
    	    		underscore1++;    	
    	    	}
    	    	
    	    	//check if '/' exists in the operand
    	    	int divide1 = 0;
    	    	while (divide1 < operand1.length() - 1 && operand1.charAt(divide1) != '/') {
    	    		divide1++;    	
    	    	}
    	    	
    	    	
    	    	// if there is a '_', assign in a variable the String from index 0 to the _.
    	    	// if there isn't, check if there is a fraction ('/')
    	    	// if there is, assign the whole1 variable 0
    	    	// if there isn't, assign the whole 1 variable the entire operand
    	    	int whole1;
    	    	
    	    	if (operand1.charAt(underscore1) == '_') {
    	        	whole1 = Integer.parseInt(operand1.substring(0, underscore1));
    	    	} else if (operand1.charAt(divide1) == '/'){
    	    		whole1 = 0;
    	    	} else {
    	    		whole1 = Integer.parseInt(operand1);
    	    	}
    	    	

    	    // get numerator and denominator
    	    	//check if there is a '/'
    	    	// if there is, run through with numerator and denominator checks
    	    	// if there isn't, assign the numerator 0 and denominator 1
    	    	
    	    	int numerator1;
    	    	int denominator1;
    	    	if (operand1.charAt(divide1) == '/') {
    	    		
    	    		// if there's an underscore, start from there to the '/'
    	        	// if not, start from 0
    		    	if (operand1.charAt(underscore1) == '_') {
    		    		numerator1 = Integer.parseInt(operand1.substring(underscore1 + 1, divide1));
    		    	} else {
    		    		numerator1 = Integer.parseInt(operand1.substring(0, divide1)); 
    		    	}
    		    	
    		    // get denominator
    		    	denominator1 = Integer.parseInt(operand1.substring(divide1 + 1));
    	    	} else {
    	    		numerator1 = 0;
    	    		denominator1 = 1;    		
    	    	}
    	    	
    	    	
    	    	
    	    	
    	    	
    	   // Evaluations for operand 2
    	    	String operand2 = input.substring(i + 3, input.length());  
    	    	// get whole number
    	    	//check if '_' exists in the operand
    	    	int underscore2 = 0;
    	    	while (underscore2 < operand2.length() - 1 && operand2.charAt(underscore2) != '_') {
    	    		underscore2++;    	
    	    	}
    	    	
    	    	//check if '/' exists in the operand
    	    	int divide2 = 0;
    	    	while (divide2 < operand2.length() - 1 && operand2.charAt(divide2) != '/') {
    	    		divide2++;    	
    	    	}
    	    	
    	    	
    	    	// if there is a '_', assign in a variable the String from index 0 to the _.
    	    	// if there isn't, check if there is a fraction ('/')
    	    	// if there is, assign the whole1 variable 0
    	    	// if there isn't, assign the whole 1 variable the entire operand
    	    	int whole2;
    	    	
    	    	if (operand2.charAt(underscore2) == '_') {
    	        	whole2 = Integer.parseInt(operand2.substring(0, underscore2));
    	    	} else if (operand2.charAt(divide2) == '/'){
    	    		whole2 = 0;
    	    	} else {
    	    		whole2 = Integer.parseInt(operand2);
    	    	}
    	    	

    	    // get numerator and denominator
    	    	//check if there is a '/'
    	    	// if there is, run through with numerator and denominator checks
    	    	// if there isn't, assign the numerator and denominator 0
    	    	
    	    	int numerator2;
    	    	int denominator2;
    	    	if (operand2.charAt(divide2) == '/') {
    	    		
    	    		// if there's an underscore, start from there to the '/'
    	        	// if not, start from 0
    		    	if (operand2.charAt(underscore2) == '_') {
    		    		numerator2 = Integer.parseInt(operand2.substring(underscore2 + 1, divide2));
    		    	} else {
    		    		numerator2 = Integer.parseInt(operand2.substring(0, divide2)); 
    		    	}
    		    	
    		    // get denominator
    		    	denominator2 = Integer.parseInt(operand2.substring(divide2 + 1));
    	    	} else {
    	    		numerator2 = 0;
    	    		denominator2 = 1;    		
    	    	}
    	    	char operator = input.charAt(i + 1);

// COPIED FROM CHECKPOINT 2 END
    	    	
    	// create new variables to store the result of the operations
    	int numerator3 = 0;
    	int denominator3 = 0;
    	    	
    	// convert operands to improper fractions
    	if (whole1 >= 0) {
    		numerator1 = whole1 * denominator1 + numerator1;
    	} else {
    		numerator1 = whole1 * denominator1 - numerator1;
    	}
    	
    	if (whole2 >= 0) {
    		numerator2 = whole2 * denominator2 + numerator2;
    	} else {
    		numerator2 = whole2 * denominator2 - numerator2;
    	}
    	
    	    	
    // check operator and evaluate accordingly
    	
    	// addition and subtraction
    	if (operator == '+' || operator == '-') {
    		// get common denominator    	
        	if (denominator1 != denominator2) {
        		
        		numerator1 *= denominator2;
        		
        		numerator2 *= denominator1;
        		
        		denominator3 = denominator1 * denominator2;
        		//System.out.println(numerator1);
        		//System.out.println(denominator1);
        		//System.out.println(numerator2);
        		//System.out.println(denominator2);
        	} else {
        		denominator3 = denominator1;
        	}
        	
        	if (operator == '+') {
        		numerator3 = numerator1 + numerator2;
        	} else if (operator == '-'){
        		numerator3 = numerator1 - numerator2;
        	}
    	}
    	
    	// multiplication
    	if (operator == '*') {
    		numerator3 = numerator1 * numerator2;
    		denominator3 = denominator1 * denominator2;
    	}
    	
    	// division
    	if (operator == '/') {
    		numerator3 = numerator1 * denominator2;
    		denominator3 = numerator2 * denominator1;
    		
    		// if both numerator and denominator are negative, simplify fraction to positive
    		// if the denominator is negative and the numerator is not, switch the negative sign to the numerator
    		if ((numerator3 < 0 && denominator3 < 0) || (numerator3 > 0 && denominator3 < 0)) {
    			numerator3 *= -1;
    			denominator3 *= -1;
    		}
    		
    	}
    	
    	
        return numerator3 + "/" + denominator3;
    }
    
    

    public static String produceAnswerFinal(String input) { 
        // TODO (Final Checkpoint): 
        // in addition to the requirements for Checkpoint #3, 
        // all answers must be reduced.
    	
 //COPIED FROM CHECKPOINT 3 START (evaluate expression to unsimplified form)

    	int i = input.indexOf(" ");
    	
  	  // Operand 1 Evaluations
  	    	String operand1 = input.substring(0, i);
  	    // get whole number
  	    	//check if '_' exists in the operand
  	    	int underscore1 = 0;
  	    	while (underscore1 < operand1.length() - 1 && operand1.charAt(underscore1) != '_') {
  	    		underscore1++;    	
  	    	}
  	    	
  	    	//check if '/' exists in the operand
  	    	int divide1 = 0;
  	    	while (divide1 < operand1.length() - 1 && operand1.charAt(divide1) != '/') {
  	    		divide1++;    	
  	    	}
  	    	
  	    	
  	    	// if there is a '_', assign in a variable the String from index 0 to the _.
  	    	// if there isn't, check if there is a fraction ('/')
  	    	// if there is, assign the whole1 variable 0
  	    	// if there isn't, assign the whole 1 variable the entire operand
  	    	int whole1;
  	    	
  	    	if (operand1.charAt(underscore1) == '_') {
  	        	whole1 = Integer.parseInt(operand1.substring(0, underscore1));
  	    	} else if (operand1.charAt(divide1) == '/'){
  	    		whole1 = 0;
  	    	} else {
  	    		whole1 = Integer.parseInt(operand1);
  	    	}
  	    	

  	    // get numerator and denominator
  	    	//check if there is a '/'
  	    	// if there is, run through with numerator and denominator checks
  	    	// if there isn't, assign the numerator 0 and denominator 1
  	    	
  	    	int numerator1;
  	    	int denominator1;
  	    	if (operand1.charAt(divide1) == '/') {
  	    		
  	    		// if there's an underscore, start from there to the '/'
  	        	// if not, start from 0
  		    	if (operand1.charAt(underscore1) == '_') {
  		    		numerator1 = Integer.parseInt(operand1.substring(underscore1 + 1, divide1));
  		    	} else {
  		    		numerator1 = Integer.parseInt(operand1.substring(0, divide1)); 
  		    	}
  		    	
  		    // get denominator
  		    	denominator1 = Integer.parseInt(operand1.substring(divide1 + 1));
  	    	} else {
  	    		numerator1 = 0;
  	    		denominator1 = 1;    		
  	    	}
  	    	
  	    	
  	    	
  	    	
  	    	
  	   // Evaluations for operand 2
  	    	String operand2 = input.substring(i + 3, input.length());  
  	    	// get whole number
  	    	//check if '_' exists in the operand
  	    	int underscore2 = 0;
  	    	while (underscore2 < operand2.length() - 1 && operand2.charAt(underscore2) != '_') {
  	    		underscore2++;    	
  	    	}
  	    	
  	    	//check if '/' exists in the operand
  	    	int divide2 = 0;
  	    	while (divide2 < operand2.length() - 1 && operand2.charAt(divide2) != '/') {
  	    		divide2++;    	
  	    	}
  	    	
  	    	
  	    	// if there is a '_', assign in a variable the String from index 0 to the _.
  	    	// if there isn't, check if there is a fraction ('/')
  	    	// if there is, assign the whole1 variable 0
  	    	// if there isn't, assign the whole 1 variable the entire operand
  	    	int whole2;
  	    	
  	    	if (operand2.charAt(underscore2) == '_') {
  	        	whole2 = Integer.parseInt(operand2.substring(0, underscore2));
  	    	} else if (operand2.charAt(divide2) == '/'){
  	    		whole2 = 0;
  	    	} else {
  	    		whole2 = Integer.parseInt(operand2);
  	    	}
  	    	

  	    // get numerator and denominator
  	    	//check if there is a '/'
  	    	// if there is, run through with numerator and denominator checks
  	    	// if there isn't, assign the numerator and denominator 0
  	    	
  	    	int numerator2;
  	    	int denominator2;
  	    	if (operand2.charAt(divide2) == '/') {
  	    		
  	    		// if there's an underscore, start from there to the '/'
  	        	// if not, start from 0
  		    	if (operand2.charAt(underscore2) == '_') {
  		    		numerator2 = Integer.parseInt(operand2.substring(underscore2 + 1, divide2));
  		    	} else {
  		    		numerator2 = Integer.parseInt(operand2.substring(0, divide2)); 
  		    	}
  		    	
  		    // get denominator
  		    	denominator2 = Integer.parseInt(operand2.substring(divide2 + 1));
  	    	} else {
  	    		numerator2 = 0;
  	    		denominator2 = 1;    		
  	    	}
  	    	
  	    	char operator = input.charAt(i + 1);

  	    	
	  	// create new variables to store the result of the operations
	  	int numerator3 = 0;
	  	int denominator3 = 0;
	  	int whole3 = 0;
	  	    	
	  	// convert operands to improper fractions
	  	if (whole1 >= 0) {
	  		numerator1 = whole1 * denominator1 + numerator1;
	  	} else {
	  		numerator1 = whole1 * denominator1 - numerator1;
	  	}
	  	
	  	if (whole2 >= 0) {
	  		numerator2 = whole2 * denominator2 + numerator2;
	  	} else {
	  		numerator2 = whole2 * denominator2 - numerator2;
	  	}
	  	
	  	    	
	  // check operator and evaluate accordingly
	  	
	  	// addition and subtraction
	  	if (operator == '+' || operator == '-') {
	  		// get common denominator    	
	      	if (denominator1 != denominator2) {
	      		
	      		numerator1 *= denominator2;
	      		
	      		numerator2 *= denominator1;
	      		
	      		denominator3 = denominator1 * denominator2;
	      		//System.out.println(numerator1);
	      		//System.out.println(denominator1);
	      		//System.out.println(numerator2);
	      		//System.out.println(denominator2);
	      	} else {
	      		denominator3 = denominator1;
	      	}
	      	
	      	if (operator == '+') {
	      		numerator3 = numerator1 + numerator2;
	      	} else if (operator == '-'){
	      		numerator3 = numerator1 - numerator2;
	      	}
	  	}
	  	
	  	// multiplication
	  	if (operator == '*') {
	  		numerator3 = numerator1 * numerator2;
	  		denominator3 = denominator1 * denominator2;
	  	}
	  	
	  	// division
	  	if (operator == '/') {
	  		numerator3 = numerator1 * denominator2;
	  		denominator3 = numerator2 * denominator1;
	  		
	  		// if both numerator and denominator are negative, simplify fraction to positive
	  		// if the denominator is negative and the numerator is not, switch the negative sign to the numerator
	  		if ((numerator3 < 0 && denominator3 < 0) || (numerator3 > 0 && denominator3 < 0)) {
	  			numerator3 *= -1;
	  			denominator3 *= -1;
	  		}
	  		
	  	}
	  	
// COPIED FROM CHECKPOINT 3 END
	  	
	  	
	  	// create new variables to hold the simplified numerals
	  	int whole4 = whole3;
	  	int numerator4 = numerator3;
	  	int denominator4 = denominator3;
	  	
	 // convert from improper form to standard form
	  	if (Math.abs(numerator3) >= denominator3) {
	  		whole4 = numerator3 / denominator3;
	  		numerator4 = numerator3 % denominator3;
	  		if (whole4 < 0) {
	  			numerator4 = Math.abs(numerator4);
	  		}
	  	}
	  	
	  	
	 // if numerator is 0 and whole is 0, return 0
	  	if (numerator4 == 0 && whole4 == 0) {
	  		return "0";
	  	}
	  	
	 // if numerator is 0 (and whole isn't), return whole
	  	else if (numerator4 == 0) {
	  		return whole4 + "";
	  	}
	  	
	  
	  	// simplify the fraction
	  	
	  	int GCF = 1;
	  	for (int j = 1; j < denominator4; j++) {
	  		if (numerator4 % j == 0 && denominator4 % j == 0) {
	  			GCF = j;
	  		}
	  	}
	  	
	  	numerator4 /= GCF;
	  	denominator4 /= GCF;
	  	
	  	/* 
	  	int multiple = 2;
	  	while (numerator4 % multiple == 0 && denominator4 % multiple == 0) {
	  		numerator4 /= multiple;
	  		denominator4 /= multiple;
	  	}
	  	
	  	multiple = 3;
	  	while (numerator4 % multiple == 0 && denominator4 % multiple == 0) {
	  		numerator4 /= multiple;
	  		denominator4 /= multiple;
	  	}
	  	
	  	*/
	  	
	
	  	
	  // return results
	  	
	  	// if whole is 0, just return the fraction
	  	if (whole4 == 0) {
	  		return numerator4 + "/" + denominator4;
	  	}
	  	else {
	  		return whole4 + "_" + numerator4 + "/" + denominator4;
	  	}
        
    }

    public static String produceAnswerExtraCredit(String input) { 
        // TODO (Extra Credit, optional): 
        // can evaluate an arbitrarily amount of operands and 
        // operators.  Equations are evaluated according to 
        // rules of precedence.

        /** not yet implemented **/
        return null;
    }

}
