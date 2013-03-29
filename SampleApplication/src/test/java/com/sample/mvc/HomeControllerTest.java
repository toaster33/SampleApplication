package com.sample.mvc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;

public class HomeControllerTest {

	@Test
	public void testCompare() {
		HomeController test = new HomeController();
		assertThat(test.compare("donkey", "dog", new ExtendedModelMap()), equalTo("compareResult"));
	}

}
