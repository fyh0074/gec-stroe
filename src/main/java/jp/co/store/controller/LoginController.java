package jp.co.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.net.SyslogOutputStream;
import jp.co.store.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping("/") 
	public String index() {
		loginService.findUser(null, null);
		System.out.println("login");
		return "login";
	}
	
	@GetMapping("/register") 
	public String register() {
		
		System.out.println("register");
		return "register";
		
	}
	
}
