package be.jevota.vttl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import be.jevota.vttl.helper.Pointer;

public class PointerTest {

	private Pointer pointer;
	
	@Before
	public void setup() {
		pointer = new Pointer("<testje>B</p><p>A</p><p>BB</p><p>CCC</p>");
	}
	
	@Test
	public void testPointer() {
		assertEquals("A", pointer.getNextBetween("<p>", "</p>"));
		assertEquals("BB", pointer.getNextBetween("<p>", "</p>"));
		assertEquals("CCC", pointer.getNextBetween("<p>", "</p>"));
		assertNull(pointer.getNextBetween("<p>", "</p>"));
	}
	
}
