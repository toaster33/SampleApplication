package com.sample.mvc;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/compare")
	public String compare(@RequestParam("input1") String first, @RequestParam("input2") String second, Model model) {
		int result = StringUtils.length(first) - StringUtils.length(second);
        String inEnglish = (result < 0) ? "less than" : (result > 0 ? "greater than" : "equal to");
        String output = "According to our Comparator, '" + first + "' is " + inEnglish + "'" + second+ "'";

        model.addAttribute("output", output);
        return "compareResult";
	}

}