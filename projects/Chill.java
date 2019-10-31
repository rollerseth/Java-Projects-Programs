// File: Chill.java
// Date: 2/20/18
// Author: Seth Roller
// Purpose: To calculate the condition from a wind chill

import java.util.*;

public class Chill
{
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	int num;
	intro();

	System.out.print("Enter the number of wind chills: ");
	num = sc.nextInt();
	if (num <= 0)
	    {
		System.out.println();
	        throw new IllegalArgumentException("You entered " + num
						   + ", please enter "
						   + "a number greater "
						   + "than 0.");
		
	    }

	System.out.println();
	System.out.println();
	
	double sum = 0.0;
	for (int i = 1; i < (num + 1); i++)
	    {
		System.out.print("Enter the value of wind chill "
				 + i + ": ");
		int chillVal = sc.nextInt();
		System.out.println();
	  
		determining(chillVal);
		
		System.out.println();

		sum = sum + chillVal; 
	    }

	System.out.print("The average of the " + num + " wind"); 
        System.out.printf("chills is %1.3f", sum / num);
	System.out.println();
	System.out.println();

    }

    public static void intro()
    {
	System.out.println();
	System.out.print("Program to calculate the condition "); 
        System.out.println("of a group of wind chills.");
	System.out.println("Written by Seth Roller.");
	System.out.print("You will be asked to enter ");
	System.out.println("the number of wind chills,");
	System.out.println("followed by the value of each wind chill.");    
	System.out.println();
	
    }

    public static void determining(int value)
    {
	if (value >= 10)
	    {
		System.out.println("A wind chill of " + value + " is "
				+ "not considered dangerous or unpleasant");

	    }
	else if ((value >= -10) && (value < 10))
	    {
	        System.out.print("A wind chill of " + value + " is "); 
		System.out.println("considered unpleasant");
		
	    }

	else if ((value >= -30) && (value < -10))
	    {
		System.out.print("A wind chill of " + value + " means ");
		System.out.println("frostbite is possible");
		
     	    }

	else if ((value >= -70) && (value < -30))
	    {
		System.out.println("A wind chill of " + value + " means ");
				 
		System.out.println("frostbite is likely and outdoor "
				   + "activities becomes dangerous");
       	    }

	else if (value < -70)
	    {
		System.out.println("A wind chill of " + value + " means ");
		System.out.println("exposed flesh will usually "
				   + "freeze within half a minute");
		
       	    }
	
    }


}
