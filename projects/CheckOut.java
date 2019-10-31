// File: CheckOut.java
// Author: Seth Roller
// Date: 4/17/18
// Purpose: To create an arraylist of checked out books

import java.io.*;
import java.util.*;

public class CheckOut
{
    private static int patronCode;
    private static String bookName;
    private static long timeChecked;
    
    private static ArrayList<Object[]> theList =
	new ArrayList<Object[]>();
    
    public static void checking(int patron, String theBook,
				long theTime)
    {
	Object[] books = new Object[3];
	patronCode = patron;
	bookName = theBook;
	timeChecked = theTime;
	books[0] = patronCode;
	books[1] = bookName;
	books[2] = timeChecked;
	adding(books);
	
    }

    public static ArrayList<Object[]> getArray()
    {
	return theList;
    }

    public static int getPatron()
    {
	return patronCode;
    }

    public static String getName()
    {
	return bookName;
    }

    public static long getTime()
    {
	return timeChecked;
    }
    
    public static void adding(Object[] newBooks)
    {
	theList.add(newBooks);
    }

    public static void checkitOut(int pat, String theName)
    {
	if (canICheckOut(pat, theName) == true)
	{
	    Object[] books = new Object[3];
	    books[0] = pat;
	    books[1] = theName;
	    books[2] = System.currentTimeMillis();
	    adding(books);
	}
	else
	    System.out.println("You cannot check out this "
			       + "book.");
	
    }

    public static void returning(int pat, String theName)
    {
	for (int i = 0; i < theList.size(); i++)
	{
	    if (pat == (int) theList.get(i)[0] &&
		theName.equals(theList.get(i)[1]))
		removing(theList.get(i));

	}
    }
    
    public static void removing(Object[] newBooks)
    {
	theList.remove(newBooks);
    }

    public static boolean canICheckOut(int lenderCode,
				       String theName)
    {
	int booksCheckedOut = 0;
	for (int i = 0; i < theList.size(); i++)
	{
	    if (lenderCode == (int) theList.get(i)[0])
		booksCheckedOut++;

	    if (booksCheckedOut >= 3)
		return false;
	    
	    if (theName.equals(theList.get(i)[1]))
		return false;

	} // end of loop
	
	return true;

	
	
    } // end of canICheckOut

    public static void printBooks()
    {
	System.out.println();
	System.out.println("Here is the current list"
			   + " of checked out books:");
	System.out.println();
	System.out.println("Lender  Book Desc.  Time");
	System.out.println("======  ==========  ====");
	for (int i = 0; i < theList.size(); i++)
	{
	    System.out.printf("%4d %13s  %d\n",
			      theList.get(i)[0],
			      theList.get(i)[1],
			      (long)theList.get(i)[2]);
	}
	System.out.println();
    }

    public static void writeToFile(String fileName)
    {
	// found how to do this on the java docs forums
	try {
	
	FileWriter writer = new FileWriter(fileName);
	for (int i = 0; i < theList.size(); i++)
	{
	    writer.write(String.format("%d %s %d\n",
				       theList.get(i)[0],
				       theList.get(i)[1],
				       theList.get(i)[2]));
	}

	writer.close();

	}

	catch (IOException ex) {
	    System.out.println("There was an error writing "
			       + "to the file.");
	}
    }

} // end of class

