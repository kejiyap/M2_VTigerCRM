package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * This is a utility class that has componts from java library
 * @author Soundarya
 * @version 25.03..7
 * 
 */
public class JavaUtility {

	/**
	 * This is a generic method to generate random numbers
	 * @param bound
	 * @return
	 */
	public int generateRandomNumber(int bound)
	{
		Random r=new Random();
		int value=r.nextInt(bound);
		return value;
	}

	/**
	 * This is a generic method to fetch calendar details
	 * @param pattern
	 * @return
	 */
	public String getCaldenderDetails(String pattern)
	{
		Calendar cal=Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String value=sdf.format(d);
		return value;

	}
}



