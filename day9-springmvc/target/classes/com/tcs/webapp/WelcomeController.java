package com.tcs.webapp;

@Controller
public class WelcomeController {
@RequestMapping()
	public String method() {
		
		return "welcome";
	}
}
