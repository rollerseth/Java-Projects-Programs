// File: SalesTable.java
// Author: Seth Roller
// Date: 3/27/18
// Purpose: Object to be used for Cars.java 

import java.io.*;
import java.util.*;

public class SalesTable
{
    private static int[][] nums = new int[10][8];
    private String fileName;

    //**************************************
    // Explicit constructor to read file and
    // store numbers into array
    //**************************************
    
    public SalesTable(String fileName)

	throws FileNotFoundException
    {
	this.fileName = fileName;
	File input = new File(fileName);
	Scanner reader = new Scanner(input);
	
	while (reader.hasNext())
	{
	    for (int i = 0; i <=  9; i++)
		for (int j = 0; j <= 7; j++)
		{
		    int num = reader.nextInt();
		    nums[i][j] = num;

		}

	} // end of while

    }

    
    //******************
    // acessor for array
    //******************
    
    public static int[][] getArray()
    {
	return nums;
    }
    
    //*************************
    // acessor for file inputed
    //*************************
    
    public String getString()
    {
	return fileName;
    }
    
}
