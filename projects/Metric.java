// File: Metric.java
// Author: Seth Roller
// Date: 2/13/18
// Purpose: An object that is the basis for english to metric converting 


public class Metric extends Object
{


    // converts feet into meters
    public static double feetToMeters(double feet)
    {
	double meters;

    if (feet >=0)
	{
		meters = 0.3048 * feet;
		return meters;

	}
	
    throw new IllegalArgumentException("In feetToMeters, feet must be" +
				       " be >0, not " + feet);
    }


    // converts ounces to grams 
   public static double ounceToGram(double ounce)
   {

	double gram;

	if (ounce >=0)
	    {
		gram = 28.349523 * ounce;
		return gram;

	    }

	throw new IllegalArgumentException("In ounceToGram, ounce must be" +
					   " be >0, not " + ounce);

    }

    // converts pounds to kilograms
    public static double poundToKilo(double pound)
    {

	double kilo;

	if (pound >=0)
	    {

		kilo = 0.3732417 * pound;
		return kilo;
	    }
    
	throw new IllegalArgumentException("In poundToKilo, pound must be" +
					   " be >0, not " + pound);
    }


    // converts tons to kilograms
    public static double tonToKilo(double ton)
    {
	double kilos;

	if (ton >=0)
	    {

		kilos = 907.18474 * ton;
		return kilos;
	    }
	throw new IllegalArgumentException("In tonsToKilo, tons must be" +
					   " be >0, not " + ton);
    
    }


}
