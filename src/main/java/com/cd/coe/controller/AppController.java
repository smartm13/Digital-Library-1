package com.cd.coe.controller;



import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cd.coe.model.User;
import com.cd.coe.service.UserService;


@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	UserService service;
	
	@Autowired
	MessageSource messageSource;

	/*
	 * This method will list all existing employees.
	 */
	@RequestMapping(value = { "/","/login" }, method = RequestMethod.GET)
	public String loginUser(ModelMap model) {
		User user = new User();
		model.addAttribute("user", user);
//		model.addAttribute("message",message)
		return "login";
	}
	
		@RequestMapping(value = { "/" ,"/login"}, method = RequestMethod.POST)
	public String entryUser(HttpServletRequest request, @Valid User user, BindingResult result,
			ModelMap model) {
		System.out.println(user);
		
		
		
		boolean userExists = service.checkLogin(user.getUsername(),
                user.getUserPwd());
		if(userExists){
			model.put("user", user);
			System.out.println("Success!!!!");
			return "homepage";
		}else{
			System.out.println("Failure!!!!");
			String msg = "Incorrect User!";
			request.setAttribute("error-msg", msg);
			request.setAttribute("error", Boolean.TRUE);
			//model.put("error", msg);
			return "login";
		}
		}
		
	
		
		
	/*
	 * This method will provide the medium to add a new employee.
	 */
	@RequestMapping(value = { "/register" }, method = RequestMethod.GET)
	public String newUser(ModelMap model) {
		User user = new User();
		model.addAttribute("user", user);
		return "register";
	}

	/*
	 * This method will be called on form submission, handling POST request for
	 * saving user in database. It also validates the user input
	 */
	@RequestMapping(value = { "/register" }, method = RequestMethod.POST)
	public String saveUser(@Valid User user, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "loginWrong";
		}

		
		service.saveUser(user);

		model.addAttribute("success", "user" +user.getUserFirstName() + " registered successfully");
		return "redirect:/login";
	}


	

}
