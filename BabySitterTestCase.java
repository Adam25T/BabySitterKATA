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
	public void CalculatedHoursBetweenStartTimeOf5AndBedTimeOf10AndGot5() {
		BabySitter babySitter = new BabySitter(5, 10, 0);
		assertEquals("5", babySitter.calculateHoursFromStartToBedTime());
	}
	
}
