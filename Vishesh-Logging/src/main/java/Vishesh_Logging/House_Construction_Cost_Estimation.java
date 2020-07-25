package Vishesh_Logging.Vishesh_Logging;

import java.util.*;
import java.io.*;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class House_Construction_Cost_Estimation {

	Scanner s;
	public static Logger LOGGER = LogManager.getLogger(House_Construction_Cost_Estimation.class);
    int material_type;
    double area_of_house;
     
    public void costCalculation() throws IOException
    {
    	s=new Scanner(System.in);
	    
LOGGER.info("Enter your choice from available materials:\n1.Standard material\n2.Above standard material\n3.High standard material\n4. High standard materials and fully automated home\n");
        material_type=s.nextInt();
        LOGGER.info("Enter total area of the house : ");
        area_of_house=s.nextDouble();
        
        try {
        	double cost=0;
        	switch(material_type)
        	{
        	case 1:cost=1200*area_of_house;
	                break;
	        case 2:cost=1500*area_of_house;
                    break; 
	        case 3:cost=1800*area_of_house;
	                break;
	        case 4:cost=2500*area_of_house;
	        	    break;
	        default:LOGGER.info("Invalid material type");
	    	        
	    	        break;
        	}
        	LOGGER.info("Total construction cost of the house is Rs."+cost);
        	}
        catch(Exception e)
        {
        	
            LOGGER.info("Exception arised, please enter valid input");        	
        	}
        	
        
    }
    

}



