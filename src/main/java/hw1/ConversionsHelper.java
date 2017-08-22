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
		double tempInFar = (double) tempInCel * 9 / 5 + 32;
		System.out.println("celsiusToFahrenheit " + tempInFar);
		//Done
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
		double tablesp = (double) tsp / 3;
		System.out.println("teaspoonsToTablespoons " + tablesp);
		//Done
		return 0;
	}

	/**
	 * Converts bits bytes.
	 * 1 byte = 8 Bit
	 * @param bits
	 * @return
	 */
	public double bitsToBytes(int bits) {
		//TODO: Replace with your code.
		double bytes = (double) bits / 8;
		System.out.println("bitsToBytes " + bytes);
		//Done
		return 0;
	}

	/**
	 * Calculates total calories burned running given weight in pounds and duration 
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
		double weightInKg = (double) weightInPounds / 2.2;
		double totalCal = 0.0175 * 10 * weightInKg * (double) durationInMinutes;
		System.out.println("caloriesBurnedRunning " + totalCal);
		//Done
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
		double kWh = ((double) powerDrawInWatts * ((double) durationInMinutes / 60)) / 1000;
		System.out.println("kilowattHoursUsed " + kWh);
		//Done
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
	 * Hour 22 in PST is hour 1 in EST 
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
		int pst; // convert all fromTZ to pst
		int newHour; // then convert pst to toTZ;
		if (hour < 0 || hour > 23) {
			return -1;
		} else {
			switch (fromTZ) {
			case "PST":
				pst = hour;
				break;
			case "MST":
				pst = hour - 1;
				break;
			case "CST":
				pst = hour - 2;
				break;
			case "EST":
				pst = hour - 3;
				break;
			default:
				return -1;
			}
			switch (toTZ) {
			case "PST":
				newHour = pst;
				break;
			case "MST":
				newHour = pst + 1;
				break;
			case "CST":
				newHour = pst + 2;
				break;
			case "EST":
				newHour = pst + 3;
				break;
			default:
				return -1;
			}
			if (newHour < 0) {
				newHour += 24;
			} else if (newHour > 23) {
				newHour -= 24;
			} // Ensure hour is a valid integer from 0 to 23
			System.out.println("timeZone " + newHour);
		}
		//Done
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
		int dayOfYear;
		switch (month) {
		case "January":
			if (0 < day && day < 32) {
				dayOfYear = 0 + day;
				break;
			} else {
				return -1;
			}			
		case "February":
			if (0 < day && day < 29) {
				dayOfYear = 31 + day;
				break;
			} else {
				return -1;
			}	
		case "March":
			if (0 < day && day < 32) {
				dayOfYear = 59 + day;
				break;
			} else {
				return -1;
			}	
		case "April":
			if (0 < day && day < 31) {
				dayOfYear = 90 + day;
				break;
			} else {
				return -1;
			}	
		case "May":
			if (0 < day && day < 32) {
				dayOfYear = 120 + day;
				break;
			} else {
				return -1;
			}	
		case "June":
			if (0 < day && day < 31) {
				dayOfYear = 151 + day;
				break;
			} else {
				return -1;
			}	
		case "July":
			if (0 < day && day < 32) {
				dayOfYear = 181 + day;
				break;
			} else {
				return -1;
			}	
		case "August":
			if (0 < day && day < 32) {
				dayOfYear = 212 + day;
				break;
			} else {
				return -1;
			}	
		case "September":
			if (0 < day && day < 31) {
				dayOfYear = 243 + day;
				break;
			} else {
				return -1;
			}	
		case "October":
			if (0 < day && day < 32) {
				dayOfYear = 273 + day;
				break;
			} else {
				return -1;
			}	
		case "November":
			if (0 < day && day < 31) {
				dayOfYear = 304 + day;
				break;
			} else {
				return -1;
			}	
		case "December":	
			if (0 < day && day < 32) {
				dayOfYear = 334 + day;
				break;
			} else {
				return -1;
			}	
		default:
			return -1;
		}
		System.out.println("dayOfYear " + dayOfYear);
		return 0;
	}


}

