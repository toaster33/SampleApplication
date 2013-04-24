package com.sample.mvc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;

public class HomeControllerTest {

	/** Verify method returns the name of the next view. */
	@Test
	public void testCompare() {
		HomeController test = new HomeController();
		assertThat(test.compare("donkey", "dog", new ExtendedModelMap()), equalTo("compareResult"));
	}

}
