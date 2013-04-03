package com.sample.mvc;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	static final Logger LOG = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/compare")
	public String compare(@RequestParam(value = "input1", required = true) String first,
			@RequestParam(value ="input2", required = true) String second, Model model) {
		LOG.debug("compare.html, parameters: {}, {}", first, second);

		int result = StringUtils.length(first) - StringUtils.length(second);
		String inEnglish = (result < 0) ? "less than"
				: (result > 0 ? "greater than" : "equal to");
		String output = "According to our Comparator, '" + first + "' is "
				+ inEnglish + "'" + second + "'";

		model.addAttribute("output", output);
		return "compareResult";
	}

}
