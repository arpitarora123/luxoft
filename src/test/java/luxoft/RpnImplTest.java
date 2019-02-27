package luxoft;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RpnImplTest {

	RpnImpl rpnImpl = new RpnImpl();

	@Test
	public void rpnStringWith1Char() {
		assertEquals(3, rpnImpl.calculate("3"));
	}

	@Test
	public void rpnStringWith1Operator() {
		assertEquals(7, rpnImpl.calculate("3 4 +"));
	}

	@Test
	public void rpnStringWith2perators() {
		assertEquals(2, rpnImpl.calculate("12 4 / 1 -"));
	}

	@Test
	public void rpnStringOutputWith2perators() {
		assertEquals("2", rpnImpl.calculateStringOutput("12 4 / 1 -"));
	}

	@Test
	public void rpnStringWithMultipleOperators() {
		assertEquals(5, rpnImpl.calculate("15 7 1 1 + - / 3 * 2 1 1 + + -"));
	}
}
