package com.sorushi.javadsaboard;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JavaDsaBoardApplicationTests {

	@Test
	void dummyTest() {
		int expected = 2;
		int actual = 1 + 1;
		assertEquals(expected, actual, "Dummy test should pass");
	}
}
