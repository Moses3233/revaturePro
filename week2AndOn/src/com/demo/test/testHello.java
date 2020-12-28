package com.demo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.demo.sayHello;

class testHello {

	@Test
	void test() {
		String output="Hello Vinay";
		assertEquals(output, sayHello.sayHi("Vinay"));
	}

	@Test
	public void testSayHelloForNull() {
		
		assertNull(sayHello.sayHi(null));
	}
	
}
