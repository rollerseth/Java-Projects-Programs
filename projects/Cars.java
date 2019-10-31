// File: Cars.java
// Author: Seth Roller
// Date: 3/27/18
// Purpose: To print out a table of car sales per model

import java.io.*;
import java.util.*;

public class Cars
{

    public static void main(String args[])
	
	throws FileNotFoundException
    {
	int[][] numbers = new int[10][8];
	String fileName = args[0];	
	intro();
	System.out.println();

	SalesTable table = new SalesTable(fileName);

	numbers = SalesTable.getArray();

	printTable(numbers);
	
    }


    public static void intro()
    {
	System.out.println();
	System.out.println("Program to output a "
			   + "monthly report "
			   + "of car sales.");
	
	System.out.println("Written by Seth Roller.");

    }
    

    public static void printTable(int[][] numbers)
    {
	System.out.printf("%31s", "Salesperson");
	System.out.println();
	System.out.println("  Model  :   1   2   3   4   5"
			   + "   6   7   8  :  Totals   Maximums");
	
	for (int i = 0; i < 64; i++)
	    System.out.printf("-");
	System.out.println();

	int counter = 1;

	// this loop prints the table including row sums & row maxes
	for (int j = 0; j < 10; j++)
	{
	    int rowMax = 0;
	    int rowSum = 0;
	    System.out.printf("%5d    :", counter);
	    for (int k = 0; k < 8; k++)
	    {
		System.out.printf("   %d", numbers[j][k]);
		rowSum += numbers[j][k];
		if (rowMax < numbers[j][k])
		    rowMax = numbers[j][k];
	    }
	    
	    System.out.printf("  :%6d", rowSum);
	    System.out.printf("   %6d", rowMax);
	    // prints row totals
	    System.out.println();
	    counter++;
	}

	
	for (int i = 0; i < 64; i++)
	    System.out.printf("-");
	System.out.println();

	System.out.printf(" Totals  :");

	// prints column totals
	for (int h = 0; h < 8; h++)
	{
	    int colSum = 0;
	    for (int y = 0; y < 10; y++)
	    {
		colSum += numbers[y][h];
        
	    }
	    System.out.printf("%4d", colSum);
	}

	System.out.println();
	System.out.printf("Maximums :");

	// finds the maximums of the columns
	for (int h = 0; h < 8; h++)
	{
	    int colMax = 0;
	    for (int y = 0; y < 10; y++)
		if (colMax < numbers[y][h])
		    colMax = numbers[y][h];
	    
	    System.out.printf("%4d", colMax);
	}
	
	System.out.println();
	
	System.out.println();
	
    } // end of printTable func

    
}// end of Cars
