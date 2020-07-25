package Vishesh_Logging.Vishesh_Logging;

import java.util.*;
import java.io.*;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Simple_and_Compound_Interest {

	double principal_amount;
    double rate_of_interest;
    double time_in_years;
    BufferedWriter out;
    Scanner s;
public static Logger LOGGER = LogManager.getLogger(Simple_and_Compound_Interest.class);
    public void calculateInterest() throws IOException
	{
		try
		{
    	s=new Scanner(System.in);
			 LOGGER.info("Enter principal amount : ");
			principal_amount=s.nextDouble();
			 LOGGER.info("Enter rate of interest per annum : ");
			rate_of_interest=s.nextDouble();
			 LOGGER.info("Enter time in years : ");
			time_in_years=s.nextDouble();
			
			 double simple_interest=(principal_amount*time_in_years*rate_of_interest)/100;
			  LOGGER.info("Simple interest = "+simple_interest+"\n");
		
 LOGGER.info("===========================================================\n");
		
			 
			  LOGGER.info("To calculate compound interest enter number of times interest applied per time period : ");
		     
		     int no_interest_applied=s.nextInt();
			 double final_amount=principal_amount*(Math.pow(1+rate_of_interest/(no_interest_applied*100),no_interest_applied*time_in_years));
			  LOGGER.info("Compound interest = "+(final_amount-principal_amount)+"\n");
			  LOGGER.info("===========================================================\n");   
			 
	}
		catch(Exception e)
		{
			 LOGGER.info("Exception arised,please give valid input");
		}
	}

}
