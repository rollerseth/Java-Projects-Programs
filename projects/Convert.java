// File: Convert.java
// Author: Seth Roller
// Date: 2/13/18
// Purpose: English to Metric conversion displayed

import java.util.*;

public class Convert
{
    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	System.out.println();
	System.out.println("Program to convert units.");
	System.out.println("Written by Seth Roller.");
	System.out.println("You will be asked to enter a number.");

	System.out.println();
	
	System.out.print("Enter a number: ");

	double num = sc.nextDouble();
	double grams = Metric.ounceToGram(num);
	double kilo = Metric.poundToKilo(num);
	double meters = Metric.feetToMeters(num);
	//the one below represents tons to kilos
	double kilos = Metric.tonToKilo(num);
	
	
	System.out.println();
	System.out.println();

	System.out.println(num + " feet = " + meters + " meters");
	System.out.println(num + " ounces = " + grams + " grams");
	System.out.println(num + " pounds = " + kilo + " kilograms");
	System.out.println(num + " tons = " + kilos + " kilograms");

	System.out.println();





    }




}
