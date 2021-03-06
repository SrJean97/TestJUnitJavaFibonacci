import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTestJUnit {

	@Test
	public void test0() {
		int result = FibonacciTest.SerieFibonacci(0);
		assertEquals(0, result);
	}
	
	@Test
	public void test1() {
		int result = FibonacciTest.SerieFibonacci(1);
		assertEquals(1, result);
	}
	
	@Test
	public void test2() {
		int result = FibonacciTest.SerieFibonacci(2);
		assertEquals(1, result);
	}
	
	@Test
	public void test3() {
		int result = FibonacciTest.SerieFibonacci(3);
		assertEquals(2, result);
	}
	
	@Test
	public void test4() {
		int result = FibonacciTest.SerieFibonacci(35);
		assertEquals("Hola", result);
	}

}
