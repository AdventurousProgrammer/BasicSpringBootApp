package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello(Model model) {
		model.addAttribute("message", "Hello World");
		return "helloworld";
	}
	
	@GetMapping("/style")
	public String sayHelloStyle(Model model) {
		model.addAttribute("message", "Stylish Hello World");
		return "add-css-js-demo";
	}
	
	@GetMapping("/bootstrap")
	public String sayHelloBootstrap(Model model) {
		model.addAttribute("message", "Bootstrap Hello World");
		return "add-bootstrap";
	}
	
	@GetMapping("/switch")
	public String sayHelloConditional(Model model) {
		User user = new User("Nikhil", "GUEST", "tepigiscool.com");
		model.addAttribute("user", user);
		/*
		users.add(new User("Nikhil", "ADMIN", "tepigiscool.com"));
		users.add(new User("Tom", "GUEST", "tomska.com"));
		users.add(new User("Tepig", "MANAGER", "tomska.com"));
		model.addAttribute(users);
		*/
		return "add-switch";
	}
	
	@GetMapping("/if")
	public String sayHelloIf(Model model) {
		User user = new User("Nikhil", "ADMIN", "tepigiscool.com");
		model.addAttribute("user", user);
		return "add-if";
	}
	
	@GetMapping("/loop")
	public String sayHelloLoop(Model model) {
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("Nikhil", "ADMIN", "tepigiscool.com"));
		users.add(new User("Tom", "GUEST", "tomska.com"));
		users.add(new User("Tepig", "MANAGER", "tepigcutie.com"));
		model.addAttribute("users",users);
		return "add-loop";
	}
	
	
}
