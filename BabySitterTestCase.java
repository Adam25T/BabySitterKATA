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

}
