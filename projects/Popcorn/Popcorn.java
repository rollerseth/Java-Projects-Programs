// File: Popcorn.java
// Author: Seth Roller
// Date: 4/24/18
// Purpose: To display the results of popcorn businesses through
// the pints per by acre owned

import java.util.*;
import java.io.*;

public class Popcorn
{

    public static void main(String args[])
	throws FileNotFoundException
    {
	String table;
	
	if (args.length != 1)
	{
	    System.out.println();
	    System.out.printf("ERROR: No text file has been given");
	    System.out.printf(", please enter one on the command line next time.\n");
	    System.out.println();
	    System.exit(1);
	}
	
	intro();
	PopFarm read = new PopFarm(args[0]);
	table = read.toString();

	System.out.printf("%s", table);
	System.out.println();

    }

    public static void intro()
    {
	System.out.println();
	System.out.println("Program to produce a bar chart of "
			   + "popcorn production.");
	System.out.println("Written by Seth Roller.");
	System.out.println();
	System.out.printf("%30s", "Pop CoOp");
	System.out.println();

	System.out.printf("Farm name");
	System.out.printf("%37s", "Production in");
	System.out.println();
	System.out.printf("%45s", "Thousands of");
	System.out.println();
	System.out.printf("%51s", "Pint Jars per Acre");
	System.out.println();

	System.out.printf("%37d %3d %3d %3d %3d %3d"
			  , 1, 2, 3, 4, 5, 6);
	System.out.println();

	String a = "---";
	String b = "---|";
	System.out.printf("%37s%s%s%s%s%s%s", b, b, b, b, b,
			  b, a);
	System.out.println();
	
    }
    


}
