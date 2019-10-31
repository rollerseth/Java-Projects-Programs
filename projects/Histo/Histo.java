// File: Histo.java
// Date: 3/20/18
// Author: Seth Roller
// Purpose: To create a histogram to display
//          the academic results of students

import java.io.*;
import java.util.*;

public class Histo
{
    public final static int MAX = 1000;
    
    public static void main(String args[])

	throws FileNotFoundException
    {
	Scanner sc = new Scanner(System.in);
	intro();
	String filename;
	
	System.out.print("Enter the name of the scores "
			 + "file: ");

	filename = sc.nextLine();
	File input = new File(filename);
	Scanner reader = new Scanner(input);
	
	double[] num = new double[MAX];
	String[] names = new String[MAX];

	System.out.println();
	System.out.println();
	
	int i = 0;
	while (reader.hasNext())
	{
	        
	    String name = reader.next();
	    if (name.equals("done"))
		break;
	    names[i] = name;
	    double number = reader.nextDouble();
	    num[i] = number;
	    i++;
		
	}

	double avg = DoubleArrayOps.average(num, i);
	double stand = DoubleArrayOps.standardDev(num, i);

	double best = DoubleArrayOps.best(num, i);
        double worst = DoubleArrayOps.worst(num, i);
	
	System.out.printf("Worst score: %12.2f\n",worst);
	System.out.printf("Best score: %13.2f\n", best);
	System.out.printf("Average score: %10.2f\n", avg);
	System.out.printf("Standard deviation: %5.2f\n", stand);

	printNames(num, names, i);
	System.out.println();
	printHist(num, best, worst, i);
	
    }

    public static void intro()
    {
	System.out.println();
	System.out.println("Program to print a histogram "
			   + "of a list of scores.");
	System.out.println("It also produces the high,"
			   + " low, and average score");
	System.out.println("along with the standard"
			   + " deviation.");
	System.out.println("Written by Seth Roller.");
	System.out.println();
	
    }

    public static void printNames(double[] numbers, String[] names,
				  int occurences)
    {
	System.out.println();
	System.out.printf("Name %18s\n", "Score");
	System.out.printf("==== %18s\n", "=====");
	System.out.println();
	for (int i = 0; i < occurences; i++)
	{
	    System.out.printf("%-15s",names[i]);
	    System.out.printf("   %1.2f", numbers[i]);
	    System.out.println();

	}

	
    }

    public static void printHist(double[] sorted, double max, double min,
				 int occurences)
    {
	System.out.println("Histogram:");
	System.out.println("==========");
	
	for (double j = min; j <= max; j++)
	{
	    int count = 0;
	    System.out.printf("%d: ", (int) j);
	    
	    for (int k = 0; k < occurences; k++)
	    {
		if (sorted[k] == j)
		    count++;
		   
		
		    
	    }
	    for (int m = 0; m < count; m++)
		System.out.printf("*");
	    System.out.println();
	    
	    
	}

	System.out.println();
	
    }// end of printHist

 
}
