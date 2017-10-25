import static org.junit.Assert.*;

import org.junit.Test;

public class excersise3Test {

	@Test
	public void triTest1() {
		assertEquals(excersise3.tri(5),15);
	}
	@Test
	public void triTest2() {
		assertEquals(excersise3.tri(0),0);
	}
	@Test
	public void triTest3() {
		assertEquals(excersise3.tri(3),6);
	}
	
	@Test
	public void lazyTest1() {
		assertEquals(excersise3.layz(5),16);
	}
	@Test
	public void lazyTest2() {
		assertEquals(excersise3.layz(0),1);
	}
	@Test
	public void lazyTest3() {
		assertEquals(excersise3.layz(6),22);
	}

}
