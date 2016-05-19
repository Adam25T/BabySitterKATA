import static org.junit.Assert.*;

import org.junit.Test;

public class BabySitterTestCase {

	@Test
	public void WhenBabyIsGivenAStartTimeofOneItReturnsThatOne() {
		BabySitter babySitter = new BabySitter(1, 0, 0);
		assertEquals("1", babySitter.getStartTime());
	}

}
