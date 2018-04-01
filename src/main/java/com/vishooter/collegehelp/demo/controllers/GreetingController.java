package com.vishooter.collegehelp.demo.controllers;
import com.vishooter.collegehelp.demo.models.Greeting;
import com.vishooter.collegehelp.demo.repositories.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/greetings")
public class GreetingController {
	@Autowired
	private GreetingRepository greetingRepository;

	@GetMapping(path = "")
	public @ResponseBody Iterable<Greeting> getGreetings() {
		return greetingRepository.findAll();
	}
}
