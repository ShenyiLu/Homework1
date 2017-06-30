package hw1;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ConversionsHelperTest {

	private static ConversionsHelper ch;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ch = new ConversionsHelper();
	}

	@Test
	public void testCelToFarSimple() {
		assertEquals("Incorrect conversion from -5F to C.", 23, ch.celsiusToFahrenheit(-5), 0.001);
	}

	@Test
	public void testCelToFarComplex() {
		assertEquals("Incorrect conversion from -9F to C.", 48.2, ch.celsiusToFahrenheit(9), 0.001);
	}

	@Test
	public void testTspToTbspSimple() {
		assertEquals("Incorrect conversion from 6tsp to tbsp.", 2, ch.teaspoonsToTablespoons(6), 0.001);
	}

	@Test
	public void testTspToTbspComplex() {
		assertEquals("Incorrect conversion from -17tsp to tbsp.", 5.6667, ch.teaspoonsToTablespoons(17), 0.001);
	}

	@Test
	public void testBitsToKBSimple() {
		assertEquals("Incorrect conversion from 16,384bits to Bytes.", 2048, ch.bitsToBytes(16384), 0.001);
	}
 
	@Test
	public void testBitsToKBComplex() {
		assertEquals("Incorrect conversion from -9375bits to Bytes.", 1171.875, ch.bitsToBytes(9375), 0.001);
	}

	@Test
	public void testCaloriesBurnedRunningSimple() {
		assertEquals("Incorrect calculation of calories burned for 150lbs, 30 minutes.", 357.954545, ch.caloriesBurnedRunning(150, 30), 0.001);
	}
 
	@Test
	public void testCaloriesBurnedRunningComplex() {
		assertEquals("Incorrect calculation of calories burned for 172lbs, 48 minutes.", 656.72727, ch.caloriesBurnedRunning(172, 48), 0.001);
	}

	@Test
	public void testKiloattHoursUsedSimple() {
		assertEquals("Incorrect calculation of kWh used for 1,800 watts 60 minutes.", 1.8, ch.kilowattHoursUsed(1800, 60), 0.001);
	}
 
	@Test
	public void testKiloattHoursUsedComplex() {
		assertEquals("Incorrect calculation of kWh used for 175 watts 98 minutes.", 0.285733, ch.kilowattHoursUsed(175, 98), 0.001);
	}

	@Test
	public void testTimeZoneSimple1() {
		assertEquals("Incorrect time zone conversion hour 10 from EST to PST.", 7, ch.timeZone(10, "EST", "PST"));
	}

	@Test
	public void testTimeZoneSimple2() {
		assertEquals("Incorrect time zone conversion hour 10 from PST to CST.", 12, ch.timeZone(10, "PST", "CST"));
	}
	
	@Test
	public void testTimeZoneComplex1() {
		assertEquals("Incorrect time zone conversion hour 1 from EST to PST.", 22, ch.timeZone(1, "EST", "PST"));
	}

	@Test
	public void testTimeZoneComplex2() {
		assertEquals("Incorrect time zone conversion hour 23 from PST to CST.", 1, ch.timeZone(23, "PST", "CST"));
	}
	
	@Test
	public void testTimeZoneError1() {
		assertEquals("Incorrect time zone conversion hour 24 from EST to PST.", -1, ch.timeZone(24, "EST", "PST"));
	}

	@Test
	public void testTimeZoneError2() {
		assertEquals("Incorrect time zone conversion hour 23 from PST to XYZ.",-1, ch.timeZone(23, "PST", "XYZ"));
	}
	
	@Test
	public void testDayOfYearSimple1() {
		assertEquals("Incorrect day of year calculation for February 1.", 32, ch.dayOfYear(1, "February"));
	}

	@Test
	public void testDayOfYearSimple2() {
		assertEquals("Incorrect day of year calculation for Deccember 31.", 365, ch.dayOfYear(31, "December"));
	}

	@Test
	public void testDayOfYearComplex1() {
		assertEquals("Incorrect day of year calculation for August 23.", 235, ch.dayOfYear(23, "August"));
	}

	@Test
	public void testDayOfYearComplex2() {
		assertEquals("Incorrect day of year calculation for July 27.", 208, ch.dayOfYear(27, "July"));
	}
	
	@Test
	public void testDayOfYearError1() {
		assertEquals("Incorrect day of year calculation for February 30.", -1, ch.dayOfYear(30, "February"));
	}

	@Test
	public void testDayOfYearError2() {
		assertEquals("Incorrect day of year calculation for July -3.", -1, ch.dayOfYear(-3, "July"));
	}

	@Test
	public void testDayOfYearError3() {
		assertEquals("Incorrect day of year calculation for Jul 23.", -1, ch.dayOfYear(23, "Jul"));
	}

}


