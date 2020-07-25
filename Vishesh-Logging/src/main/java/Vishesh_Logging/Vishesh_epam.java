package Vishesh_Logging.Vishesh_Logging;

import java.io.*;
import java.io.IOException;


public class Lekhya_epam {
	public static void main(String[] args) throws IOException
	{
		Simple_and_Compound_Interest interest_obj = new Simple_and_Compound_Interest();
		interest_obj.calculateInterest();
		House_Construction_Cost_Estimation house_obj= new House_Construction_Cost_Estimation();
		house_obj.costCalculation();
	}


}
