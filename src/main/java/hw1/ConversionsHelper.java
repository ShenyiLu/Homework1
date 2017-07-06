package hw1;

/**
 * A class to help with several common conversions.
 * @author srollins
 *
 */
public class ConversionsHelper {

	/**
	 * Converts a temperature in celsius to a temperature in fahrenheit.
	 * Tfar = Tcel * 9/5 + 32
	 * @param tempInCel
	 * @return
	 */
	public double celsiusToFahrenheit(int tempInCel) {
		//TODO: Replace with your code.
		return 0;
	}

	/**
	 * Converts teaspoons to tablespoons.
	 * One tablespoon is three teaspoons.
	 * @param tsp
	 * @return
	 */
	public double teaspoonsToTablespoons(int tsp) {
		//TODO: Replace with your code.
		return 0;
	}

	/**
	 * Converts bits bytes.
	 * 1 byte  = 8 Bit
	 * @param bits
	 * @return
	 */
	public double bitsToBytes(int bits) {
		//TODO: Replace with your code.
		return 0;
	}

	/**
	 * Calculates total calories burned running given weight in pounds in and duration 
	 * of exercise in minutes. 
	 * 
	 * Use the following formulas:
	 * Calories per minute = (.0175) X (MET) X (weight in Kilograms)
	 * MET (Metabolic equivalent of task) = 10 for running (at 6mph) - use this value
	 * Weight in Kg = Weight in pounds / 2.2
	 * 
	 * @param weightInPounds
	 * @param durationInMinutes
	 * @return
	 */
	public double caloriesBurnedRunning(int weightInPounds, int durationInMinutes) {		
		//TODO: Replace with your code.
		return 0;
	}

	/**
	 * Calculates kilowatt hours (kWh) used given the power draw in watts and the 
	 * duration of use in minutes.
	 * 
	 * Watt-hour =(power draw in watts) X (hours used)
	 * kWh = watt-hour/1,000 
	 * 
	 * @param powerDrawInWatts
	 * @param durationInMinutes
	 * @return
	 */
	public double kilowattHoursUsed(int powerDrawInWatts, int durationInMinutes) {
		//TODO: Replace with your code.
		return 0;
	}

	/**
	 * Converts the given hour from the fromTZ (timezone) to the toTZ (timezone).
	 * 
	 * Valid time zones are PST, MST, CST, and EST.
	 * MST is PST + 1
	 * CST is MST + 1
	 * EST is CST + 1
	 *
	 * If fromTZ or toTZ is not a valid time zone the method will return -1.
	 * 
	 * Uses 24 hour clock and accounts for new day.
	 * Hour 22 in PST is hour in EST 
	 * 
	 * Hour may be a valid integer from 0 to 23. If hour is outside of that range 
	 * the method will return -1;
	 *
	 * 
	 * @param hour
	 * @param fromTZ
	 * @param toTZ
	 * @return
	 */
	public int timeZone(int hour, String fromTZ, String toTZ) {
		//TODO: Replace with your code.
		return 0;
	}

	/**
	 * Converts the given date to the day number of the year.
	 * Assume the year is 2017 (not a leap year).
	 * 
	 * January 1 is day number 1.
	 * Febrary 1 is day number 32.
	 * December 31 is day number 365.
	 * 
	 * Return -1 if the day is invalid for the specified month
	 * or if the month is not a valid month.
	 * The parameter month must be the complete month spelled out
	 * beginning with a capital letter. 
	 *
	 * @param day
	 * @param month
	 * @return
	 */
	public int dayOfYear(int day, String month) {
		//TODO: Replace with your code.
		return 0;
	}


}

