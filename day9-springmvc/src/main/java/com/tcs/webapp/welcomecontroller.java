package com.tcs.webapp;

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.mapping
import org.springframework.web.bind.annotation

@Controller
public class WelcomeController {
@RequestMapping(method=RequestMethod.GET.path="/go")
	public String method() {
		
		return "welcome";
	}
}

