// File: Sketch.java
// Date: 2/27/18
// Author: Seth Roller
// Purpose: To create a sketch of a criminal 

import java.util.*;

public class Sketch
{
    public final static Scanner sc = new Scanner(System.in);

    public static int hair = 0;
    public static int nose = 0;
    public static int mouth = 0;
    public static int eye = 0;

    // Implemented a global array since
    // these choices never change
    public static int[] choices = {hair, nose, eye, mouth};

    
    public static void main(String args[])
    {
	intro();

	menu();

	System.out.println();
	hairChoice(choices[0]);
	eyeChoice(choices[1]);
	noseChoice(choices[2]);
	mouthChoice(choices[3]);
	System.out.println();
	
	
	
    }

    public static void intro()
    {
	System.out.println();
	System.out.println("Program to sketch a suspect.");
	System.out.println("You will be asked to choose"
			 + " a hairstyle, nose type,");
	
        System.out.println("eye type and mouth type.  Then"
			 + " your sketch will be made.");
	System.out.println("Written by Seth Roller.");

	
    }

    public static void hairChoice(int hair)
    {
	switch (hair)
	{
	    
	case 1: 
	    System.out.println("   -----");
	    System.out.println("  |     |");
	    System.out.println("   -----");
	    break; 
	    
	case 2:
	    System.out.println("  *******");
	    System.out.println("  *     *");
	    break;
	    
	case 3:
	    System.out.println("  ???????");
	    System.out.println("  |     |");
	    break;
	    
        case 4:
	    System.out.println("   -----");
	    System.out.println("  |     |");
	    System.out.println(" ---------");
	    break;
	    
	}
	
       

    }

    public static void eyeChoice(int eye)
    {
	switch (eye)
	{
	    
	case 1:
	    System.out.println(" (| . . |)");
	    break;

	case 2:
	    System.out.println(" (| O O |)");
	    break;
	    
	case 3:
	    System.out.println(" (|-O-O-|)");
	    break;
	    
	case 4:
	    System.out.println(" (| - - |)");
	    break;
	    
	}
    }
    
    public static void noseChoice(int nose)
    {

	switch (nose)
	{
	    
	case 1:
	    System.out.println("  |  ^  |");
	    break;
	    
	case 2:
	    System.out.println("  |  >  |");
	    break;
	    
	case 3:
	    System.out.println("  |  _\\ |");
	    break;
	    
	case 4:
	    System.out.println("  | /_\\ |");		 
	    break;
	    
	}
    }

    public static void mouthChoice(int mouth)
    {
	switch (mouth)
	{

	case 1:
	    System.out.println("  | --- |");
	    System.out.println("   ----- ");
	    break;
	    
	case 2:
	    System.out.println("  |\\___/|");
	    System.out.println("   ----- ");
	    break;
		
	case 3:
	    System.out.println("  |||-|||");
	    System.out.println("   ||||| ");
	    System.out.println("    |||  ");
	    break;

	case 4:
	    System.out.println("  | ___ |");
	    System.out.println("  |/   \\|");
	    System.out.println("   -----  ");
	    break;

	}
       

    }


    public static int[] menu()
    {
	// I created two arrays and a loop for the menu
	
	String[] styles = {"hairstyle","eye type",
			   "nose type","mouth type"};

	String[] options = {"bald","crew-cut","curly",
			    "wearing a hat","beady",
			    "bug-eyed","glasses","closed",
			    "pug","small","medium","large",
			    "puzzled","smiling","bearded",
			    "frowning"};
	
	for (int i = 0; i <= 3; i++)
	    {
		int j;
		j = i + 3 * i;

		while (true)
		    {

		System.out.println();
		System.out.println("Please enter a(n) "
				   + styles[i] + ":");
		
		System.out.println("        1, for "
				   + options[j] + ";");
		
		System.out.println("        2, for "
				   + options[j + 1] + ";");
		
		System.out.println("        3, for "
				   + options[j + 2] + ";");
		
		System.out.println("        4, for "
				   + options[j + 3] + ";");
		
		System.out.print("--> ");
		System.out.println();
		
		choices[i] = sc.nextInt();

		if ((choices[i] <= 4) && (choices[i] >= 1))
		    {
			break;
		    }

		else
		    {
		    System.out.println();
		    System.out.println("You have entered "
				       + choices[i]
				       + ", please enter");
		    
		    System.out.println("a number between "
				       + "1 and 4.");
		    
		    }
		
		    }
	    }

	return choices;
	
    }
    

}
