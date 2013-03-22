package com.sample;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testGetMessage() {
		HelloWorld test = new HelloWorld();
		assertThat(test.getMessage(), equalTo("Hello World!"));
	}
}
