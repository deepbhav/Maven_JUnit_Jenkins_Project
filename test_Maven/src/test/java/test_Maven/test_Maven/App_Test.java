package test_Maven.test_Maven;

import org.junit.Test;

import junit.framework.TestCase;

public class App_Test extends TestCase {

	@Test
	public void testAdd() {
		assertEquals(3,App.addMethod(1, 2));
	}
	
	@Test
	public void testMult() {
		assertEquals(2,App.multMethod(1, 2));
	}
	
	@Test
	public void testDiv() {
		assertEquals(1,App.divMethod(1, 2));
	}
}
