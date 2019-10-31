// File: DoubleArrayOps.java
// Date: 3/20/18
// Author: Seth Roller
// Purpose: Will sort, find max and min for Hist.java

import java.util.*;
import java.io.*;

public class DoubleArrayOps
{
    public static void selectionSort(double[] a)
    {

	for (int i = 0; i < a.length - 1; i++)
	{
	    int smallest = i;
	    for (int j = i + 1; j < a.length; j++)
	    {
		if (a[j] < a[smallest])
		{
		    smallest = j;
		}
	    }

	    swap (a, i, smallest);
	    
	}
    } // end of selectionSort

    public static void swap(double[] a, int i, int j)
    {
	if (i != j)
	{
	    int temp = (int)a[i];
	    a[i] = a[j];
	    a[j] = temp;
		
	}
    }
    


    public static double average(double[] scoreArr, int occurences)
    {
	double sum = 0.0;
	if (occurences <= 0)
	{
	    System.err.println("ERROR in function average.");
	    System.err.println("No data values in array.");
	    return 0.0;

	}

	for (int i = 0; i < occurences; i++)
	    sum = sum + scoreArr[i];

	return sum / occurences;
	   

    }

    
  public static double standardDev(double[] data, int occurences)
  {
	double avg;
	double sumSqrTerms = 0.0;
	double term;

	avg = average(data, occurences);

	for (int i = 0; i < occurences; i++)
	{
	    term = data[i] - avg;
	    sumSqrTerms += term * term;
	    
	}
	return Math.sqrt(sumSqrTerms / occurences);

  }

    public static double best(double[] data, int occurences)
    {
	int i = 1;
	double max = data[0];
	while (i < occurences)
	{
	    if (max > data[i])
		max = max;
	    else
		max = data[i];
	    i++;
	}

	return max;
    }

    public static double worst(double[] data, int occurences)
    {
	int i = 1;
	double min = data[0];
	while (i < occurences)
	{
	    if (min < data[i])
		min = min;
	    else
		min = data[i];
	    i++;
	}
	
	return min;
    }

}
