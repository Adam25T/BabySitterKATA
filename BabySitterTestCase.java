import static org.junit.Assert.*;

import org.junit.Test;

public class BabySitterTestCase {

	@Test
	public void WhenBabyIsGivenAStartTimeofOneItReturnsThatOne() {
		BabySitter babySitter = new BabySitter(1);
		assertEquals("1", babySitter.getStartTime());
	}

}
