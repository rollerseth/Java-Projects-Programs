//File: Sphere.java
//Author: Seth Roller
//Date: 1/30/18
//Purpose: To find the volume and area of a sphere


import java.util.*;

public class Sphere
{
    
    public static void main(String args[])
    {
	Scanner theKeyboard = new Scanner(System.in);
	
	System.out.println();
	System.out.println("Program to calculate the surface area");
	System.out.println("and the volume of a sphere.");
	System.out.println("Written by Seth Roller.");
	System.out.print("You will be asked to enter the");
	System.out.println("radius of the sphere.");

	System.out.println();

	double rad;
	
	System.out.print("Enter Radius: ");

	rad = theKeyboard.nextDouble();

	System.out.println();
	System.out.println();

	System.out.println("A sphere with a radius of " + rad + " has:");

	System.out.println();

	double surf = 4 * Math.PI * rad * rad;
	double vol = (4.0 / 3.0) * Math.PI * Math.pow(rad, 3.0);
	
	System.out.printf("Surface Area: %.15f", surf);
	System.out.println();
	System.out.print("      ");
	System.out.printf("Volume: %.16f", vol);

	System.out.println();
	System.out.println();

	
	

    }


}
