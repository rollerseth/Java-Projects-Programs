//File: Rainbow.java
//Author: Seth Roller
//Date: 2/6/18
//Purpose: To calculate the height of a rainbow

import java.util.*;

public class Rainbow
{
   
    public static void main(String args[])
    {
	Scanner theKeyboard = new Scanner(System.in);
	System.out.println();
	System.out.println("Program to calculate the height of a rainbow.");
	System.out.println("Program checks that the distance is greater");
	System.out.println("than zero.");
	System.out.println("Written by Seth Roller.");
	System.out.print("You will be asked to enter the ");
	System.out.println("distance to the rainbow.");
	System.out.println();

	double dist;

	System.out.print("Enter distance: ");

	dist = theKeyboard.nextDouble();

	if (dist > 0)
	{

	    System.out.println();
	    System.out.println();

	    System.out.print("Given that the distance to ");
	    System.out.println("the rainbow is " + dist + ":");
	    System.out.println();

	    double magicDegree = 42.3333333;

	    double radians = magicDegree * (Math.PI / 180);

	    double x = Math.tan(radians);

	    double height = x * dist;

	    System.out.println("The height of the rainbow is:  " + height);

	    System.out.println();

	}
	else if (dist == 0)
	{

	    System.out.println();
	    System.out.println();
	    System.out.print("You entered a distance of 0. ");
	    System.out.println("Enter a number greater than zero.");
	    System.out.println();
	}
	else
	{
	    System.out.println();
	    System.out.println();
	    System.out.print("Your distance of " + dist + " is not correct. ");
	    System.out.println("Input a distance that is greater than zero.");
	    System.out.println();

	    
	}

    }


}
