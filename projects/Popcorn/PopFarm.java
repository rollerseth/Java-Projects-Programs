// File: PopFarm
// Author: Seth Roller
// Date: 4/24/18
// Purpose: A object that stores the info for popcorn businesses

import java.io.*;
import java.util.*;

public class PopFarm
{
    public final static int MAX = 1000;
    
    private int[] pintJars = new int[MAX];
    private String[] popOwner = new String[MAX];
    private double[] acres = new double[MAX];
    private int num = 0;
    private String fileName;

    public int getNum()
    {
	return num;
    }

    public int[] getPints()
    {
	return pintJars;
    }

    public String[] getOwners()
    {
	return popOwner;
    }

    public double[] getAcres()
    {
	return acres;
    }

    public String getFileName()
    {
	return fileName;
    }
    
    public PopFarm(String fileName)
    
	throws FileNotFoundException
    {	    
	this.fileName = fileName;
	File input = new File(fileName);
	Scanner reader = new Scanner(input);
		
	while (reader.hasNext())
	{
	    String owners = "";
	    while (!reader.hasNextDouble())
		owners += reader.next() + " ";

	    owners = owners.replace(",", "");
	    popOwner[num] = owners;
	    acres[num] = reader.nextDouble();
	    pintJars[num] = reader.nextInt();
	    num++;
	    
	} // end of while


    }
    
    public String toString()
    {
	char[][] hold = new char[num][30]; 
	String send = "";
	String[] newer = new String[num];
	
	for (int k = 0; k < num; k++)
	{
	    Arrays.fill(hold[k],' ');
	    for (int i = 0; i < ((pintJars[k] / (int)acres[k]) / 250); i++)
	    {

		hold[k][i] = '*';
		
		if (i >= 19)
		    hold[k][19] = '#';
		
		else
		    hold[k][19] = '|';
				
	    }
	}

	// found how to utilize valueOf from java docs 
	for (int y = 0; y < num; y++)
	    newer[y] = String.valueOf(hold[y]);
	
	for (int j = 0; j < num; j++)
	{
	    String temp = "";
	    temp += popOwner[j];

	    if (temp.length() > 29)
		temp = temp.substring(0, 28);
	    
	    send += String.format("%-32s %s\n", temp, newer[j]);
	}
	return send;
    }
    

} // end of class
