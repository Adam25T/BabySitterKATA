import static org.junit.Assert.*;

import org.junit.Test;

public class BabySitterTestCase {

	@Test
	public void WhenBabySitterIsGivenAStartTimeofOneItReturnsThatOne() {
		BabySitter babySitter = new BabySitter(1, 0, 0);
		assertEquals("1", babySitter.getStartTime());
	}

	@Test
	public void WhenBabySitterIsgivenABedTimeOfTwoItReturnsThatTwo() {
		BabySitter babySitter = new BabySitter(1, 2, 0);
		assertEquals("2", babySitter.getBedTime());
	}
	
	@Test
	public void WhenBabySitterIsgivenanEndTimeofThreeItReturnsThatThree() {
		BabySitter babySitter = new BabySitter(1, 2, 3);
		assertEquals("3", babySitter.getEndTime());
	}
	

	@Test
	public void CalculatedHoursBetweenStartTimeOfFiveAndBedTimeOfTebAndGotFive() {
		BabySitter babySitter = new BabySitter(5, 10, 0);
		assertEquals("5", babySitter.calculateHoursFromStartToBedTime());
	}
	
	@Test
	public void CalculateHoursBetweenStartTimeofNineAndBedTimeOfEightShouldGetZero() {
		BabySitter babySitter = new BabySitter(9, 8, 0);
		assertEquals("0", babySitter.calculateHoursFromStartToBedTime());
	}
	
	@Test
	public void CalculateHoursBetweenBedTimeOf8AndMidnightUsningSubtraction() {
		BabySitter babySitter = new BabySitter(0, 8, 0);
		assertEquals("4", babySitter.calculateHoursFromBedTimeToMidnight());
	}
	
	@Test
	public void CalculateHoursBetweenBedTimeAndMidnightWhereStartTimeIsAfterBedTimeShouldBeZero() {
		BabySitter babySitter = new BabySitter(13, 10, 0);
		assertEquals("0", babySitter.calculateHoursFromBedTimeToMidnight());
	}
	
	@Test
	public void CalculateHoursBetweenMidnightAndEndTimeOf16ToGet4() {
		BabySitter babySitter = new BabySitter(0, 0, 16);
		assertEquals("4", babySitter.calculateHoursFromMidnighToEndTime());
	}
}
