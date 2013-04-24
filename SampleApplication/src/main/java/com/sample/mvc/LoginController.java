package com.sample.mvc;

import java.security.Principal;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

/**
 *	Handles login authentication, redirection, and fail.
 */
@Controller
public class LoginController extends AbstractController {

	private static final Logger LOG = LoggerFactory
			.getLogger(LoginController.class);

	/**
	 * Default page after login has been authenticated.  Set user login name in model to display on page.
	 * @param model - Model
	 * @param principal - Principal properties (i.e. user name)
	 * @return Location of view
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model, Principal principal) {
		String name = principal.getName();
		LOG.debug("Successful login for '{}' at {}", name, new Date());

		model.addAttribute("username", name);
		return "home";
	}

	/**
	 * Redirect user to login page if login failed.  Set query string parameter to display login fail message.
	 * @param model - Model
	 * @return Redirect to login page
	 */
	@RequestMapping(value = "/loginFailed", method = RequestMethod.GET)
	public View loginFailed(Model model) {
		RedirectView redirect = new RedirectView("index.jsp");
		redirect.getAttributesMap().put("error", "true");
		return redirect;
	}

	/**
	 * Redirect user to default index.jsp page on logout.
	 * @param model - Model
	 * @return Redirect to index.jsp
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public View logout(Model model) {
		return new RedirectView("index.jsp");
	}
}
