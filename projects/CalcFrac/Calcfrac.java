// File: Calcfrac.java
// Author: Seth Roller
// Date: 4/3/18
// Purpose: To prompt the user to fraction operators

import java.io.*;
import java.util.*;

public class Calcfrac
{
    static final String MENU = "\nPlease enter an operation:\n" +
	"\t1, for add;\n" +
	"\t2, for subtract;\n" +
	"\t3, for multiply;\n" +
	"\t4, for divide;\n" +
	"\t5, for less than;\n" +
	"\t6, for less than or equal to;\n" +
	"\t7, for equal to;\n" +
	"\t8, for greater than;\n" +
	"\t9, for greater than or equal to;\n" +
	"\t0, to stop;\n" +
	"--> ";

    private static Scanner theKeyboard = new Scanner(System.in);

    
    public static void main(String args[])
    {
	//Scanner theKey = new Scanner(System.in);
	String result;
	int operation;

	intro();

	while (true)
	{
	
        operation = getOp();

	if (operation == 0)
	    System.exit(1);
	
	System.out.println();
	System.out.println();

	System.out.print("Enter first fraction: ");		
	Fraction first = new Fraction();
	first.read(theKeyboard);
	System.out.println();
		

	System.out.print("Enter second fraction: ");
	Fraction second = new Fraction();
	second.read(theKeyboard);
	
	result = application(operation, first, second);

	System.out.println();
	System.out.println();
	System.out.println(result);
	
	}

    }

    public static void intro()
    {
	System.out.println();
	System.out.println("Program to calculate operations on fractions");
	System.out.println("Written by Seth Roller.");

    }

    
    public static int getOp()
    {
	while (true)
	    {
		System.out.print(" " + MENU);

		int operation = theKeyboard.nextInt();

		if (operation != 1 && operation != 2 &&
		                        operation != 3 && operation != 4
		    && operation != 5 && operation != 6 && operation != 7
		    && operation != 8 && operation != 9 && operation != 0)
		    {
			System.out.println("ERROR: invalid operation. Must "
					  + "be 0 - 9, not " + operation);

		    }
		else
		    {
			return operation;

		    }

	    } // end of while


    } // end of getOp()

    public static String application(int operation, Fraction op1,
				     Fraction op2)
    {
	String finalOne = "";

	switch (operation) {

	case 1:
	    Fraction newOne = op1.add(op2);
	    finalOne = op1 + " + " + op2 + " is " + newOne;
	    break;

	case 2:
	    Fraction newTwo = op1.subtract(op2);
	    finalOne = op1 + " - " + op2 + " is " + newTwo;
	    break;
	    
	case 3:
	    Fraction newThree = op1.times(op2);
	    finalOne = op1 + " * " + op2 + " is " + newThree;
	    break;

	case 4:
	    Fraction newFour = op1.divide(op2);
	    finalOne = op1 + " / " + op2 + " is " + newFour;
	    break;

	case 5:
	    if (op1.lessThan(op2) == true)
		finalOne = op1 + " is less than " + op2;
	    else
		finalOne = op1 + " is not less than " + op2;
	    break;
	    
	case 6:
	    if (op1.lessThanOrEqual(op2) == true)
		finalOne = op1 + " is less than or equal to " + op2;
	    else
		finalOne = op1 + " is not less than or equal to " + op2;
	    break;

	case 7:
	    if (op1.equalTo(op2) != true)
		finalOne = op1 + " is not equal to " + op2;
	    else
		finalOne = op1 + " is equal to " + op2;
	    break;

	case 8:
	    if (op1.greaterThan(op2) == true)
		finalOne = op1 + " is greater than " + op2;
	    else
		finalOne = op1 + " is not greater than " + op2;
	    break;

	case 9:
	    if (op1.greaterThanOrEqual(op2) == true)
		finalOne = op1 + " is greater than or equal to " + op2;
	    else
		finalOne = op1 + " is not greater than or equal to " + op2;
	    break;

	default:
	    System.out.println("ERROR: invalid operation. Must be "
			       + " 0-9 not " + operation);
	    System.exit(1);
	    
	}

	return finalOne;
    }



    
}


