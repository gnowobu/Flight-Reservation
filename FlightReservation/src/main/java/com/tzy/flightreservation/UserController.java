package com.tzy.flightreservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tzy.flightreservation.entities.User;
import com.tzy.flightreservation.repositories.UserRepository;


@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/showreg")
	public String showRegister() {
		return"registerUser";
	}
	
	@RequestMapping(value="/registerUser", method = RequestMethod.POST)
	public String register(@ModelAttribute("user") User user) {
		
		userRepository.save(user);
		return"login";
	}
	
	@RequestMapping("/loginpage")
	public String loginPage() {
		return"login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("username")String email, @RequestParam("password")String password, ModelMap modelMap) {
		
		User user = userRepository.findByemail(email);
		
		if(user.getPassword().equals(password)){
			return"findFlights";
		}
		else {
			modelMap.addAttribute("msg", "invalid username or password");
		}
		return"login";
	}

}
