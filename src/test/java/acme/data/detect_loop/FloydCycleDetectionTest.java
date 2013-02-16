package acme.data.detect_loop;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FloydCycleDetectionTest {

	FloydCycleDetection cycleDetection = new FloydCycleDetection();

	Node n1;
	Node n2;
	Node n3;
	Node n4;
	Node n5;

	@Before
	public void setup() {
		n1 = new Node("1");
		n2 = new Node("2");
		n3 = new Node("3");
		n4 = new Node("4");
		n5 = new Node("5");
	}

	@Test
	public void nullNode() {
		assertFalse(cycleDetection.hasLoop(null));
	}

	@Test
	public void singleNode() {
		assertFalse(cycleDetection.hasLoop(n1));
	}

	@Test
	public void twoNodesNoCycle() {
		n1.next = n2;
		assertFalse(cycleDetection.hasLoop(n1));
	}

	@Test
	public void twoNodesAsCycle() {
		n1.next = n2;
		n2.next = n1;
		assertTrue(cycleDetection.hasLoop(n1));
	}

	@Test
	public void withCycleOddNodeCount() {
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		// loop
		n5.next = n3;

		assertTrue(cycleDetection.hasLoop(n1));
	}

	@Test
	public void withCycleOddEvenCount() {
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		// loop
		n4.next = n2;

		assertTrue(cycleDetection.hasLoop(n1));
	}

	@Test
	public void noCycleOddNodeCount() {
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		assertFalse(cycleDetection.hasLoop(n1));
	}

	@Test
	public void noCycleEvenNodeCount() {
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		assertFalse(cycleDetection.hasLoop(n1));
	}

}
