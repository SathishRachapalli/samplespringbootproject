package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controllerClass {
	
	@GetMapping("/sample")
	@ResponseBody
	public String sample()
	{
		return "Hello Sathish!";
	}

}
