// File: Lending.java
// Author: Seth Roller
// Date: 4/17/18
// Purpose: For a librarian to see the checked out books

import java.io.*;
import java.util.*;

public class Lending
{
    static Scanner sc = new Scanner(System.in);
    static int patron;
    static String bookName;
    static String fileName;

    public static void main(String args[])
	
	throws FileNotFoundException
    {
	int n;
	intro();
	
	System.out.print("Enter name of input file: ");
	fileName = sc.nextLine();
	File input = new File(fileName);
	Scanner reader = new Scanner(input);
	System.out.println();
	System.out.println();
	
	while (reader.hasNextLine())
	{
	    CheckOut.checking(reader.nextInt(),
			      reader.next(),
			      reader.nextLong());
	    reader.nextLine();
	}
		
	while (true)
	{
	    
	    System.out.println("Please enter a number:");
	    System.out.println("\t1, for checking a book"
			       + " out;");
	    System.out.println("\t2, for returning a book;");
	    System.out.println("\t0, to exit and print"
			       + " list;");
	    System.out.print("--> ");
	    n = sc.nextInt();
	    System.out.println();
	    entering(n);
	}

    }

    public static void intro()
    {
	System.out.println();
	System.out.println("Program to keep track of "
			   + "library books.");
	System.out.println("You will enter the name of a "
			   + " file.");
	System.out.println("The program will read this file"
			   + " as the list");
	System.out.println("of books already checked out. "
			   + "You will then enter");
	System.out.println("a lender code followed by a "
			   + "book description to");
	System.out.println("check out or return a book.");
	System.out.println("When the program is done, "
			   + "it will write out the ");
	System.out.println("current list of checked out "
			   + "books to the original file");
	System.out.println("and print a list of the checked"
			   + " out books.");
	System.out.println("Written by Seth Roller.");
	System.out.println();
	
    }

    public static void entering(int number)
    {
	int lender;
	String book;

	switch (number) {

	case 0:
	    CheckOut.printBooks();
	    CheckOut.writeToFile(fileName);
	    System.exit(1);

	case 1:
	    System.out.println();
	    System.out.print("Enter 3 digit "
			     + "patron code: ");
	    lender = sc.nextInt();
	    System.out.println();
	    System.out.print("Enter 10 digit book "
			     + "description: ");
	    book = sc.next();
	    System.out.println();
	    CheckOut.checkitOut(lender, book);
	    System.out.println();
	    break;
		
	case 2:
	    System.out.println();
	    System.out.print("Enter 3 digit "
			     + "patron code: ");
	    lender = sc.nextInt();
	    System.out.println();
	    System.out.print("Enter 10 digit book "
			     + "description: ");
	    book = sc.next();
	    System.out.println();
	    CheckOut.returning(lender, book);
	    System.out.println();
	    break;

	default:
	    System.out.println("Incorrect number. Please "
			       + "enter a number between "
			       + "0 and 2.");


	} // end of switch
	
       
    } // end of entering

} // end of class
