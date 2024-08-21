package com.spring.project.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.project.entity.Entries;
import com.spring.project.entity.User;
import com.spring.project.service.EntryServiceInterface;
import com.spring.project.service.UserServiceInterface;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@Autowired
	private UserServiceInterface userServiceInterface;
	
	@Autowired
	private EntryServiceInterface entryServiceInterface;
	
	@Autowired
	private HttpSession httpSession;
	
	
	public HttpSession getHttpSession() {
		return httpSession;
	}

	public void setHttpSession(HttpSession httpSession) {
		this.httpSession = httpSession;
	}

	public UserServiceInterface getUserServiceInterface() {
		return userServiceInterface;
	}

	public void setUserServiceInterface(UserServiceInterface userServiceInterface) {
		this.userServiceInterface = userServiceInterface;
	}

    



	public EntryServiceInterface getEntryServiceInterface() {
		return entryServiceInterface;
	}

	public void setEntryServiceInterface(EntryServiceInterface entryServiceInterface) {
		this.entryServiceInterface = entryServiceInterface;
	}
	
	@GetMapping("/")
	public String userPage()
	{
		
		
		String s="user";
		return s;
	}


	@GetMapping("/register")
	public String Register()
	{
		
		
		String s="register";
		return s;
	}

	@GetMapping("/login")
	public String login()
	{
			
		
		return "login";
	}
	
	@GetMapping("/saveuser")
	public String saveUser(@ModelAttribute("user") User user)
	{
		User user1=userServiceInterface.saveUser(user);
		
		
		return "registersuccess";
	}
	 
	@GetMapping("/authendicate")
	public String authendicateUser(@ModelAttribute("user") User user,Model model)
	{
		String viewname;
		User user1=userServiceInterface.findUser(user);
		if(user1.getUsername().equals(user.getUsername()) && user1.getPassword().equals(user.getPassword()))
		{
			viewname="homepage";
			model.addAttribute(user1);
		}
		else
		{
			viewname="login";
			String str="username and password incorrect";
			model.addAttribute("str",str);
		}
		httpSession.setAttribute("user",user1);
		
		List<Entries> entries=entryServiceInterface.findAllEntries(user1.getUserid());
		
		model.addAttribute("entries",entries);	
		return viewname;
		
		
		}
	
	@GetMapping("/addentry")
	public String addEntry(Model model)
	{
		
		User user=(User) httpSession.getAttribute("user");
		model.addAttribute("user",user);
		String viewname="addentry";
		return viewname;
	}
	
	@PostMapping("/saveentry")
	public String saveEntry(@ModelAttribute("entries") Entries entries1, Model model)
	{
		entryServiceInterface.saveEntry(entries1);
		User user=(User) httpSession.getAttribute("user");
		model.addAttribute("user",user);
		
		
List<Entries> entries=entryServiceInterface.findAllEntries(user.getUserid());
		
		model.addAttribute("entries",entries);	
		String viewname="homepage";
		return viewname;
	}
	@GetMapping("/viewentry")
	public String viewEntry(@RequestParam("id") Long id,  Model model)
	{
		Entries entries=entryServiceInterface.findById(id);
		User user=(User) httpSession.getAttribute("user");
		model.addAttribute("user",user);
		model.addAttribute("entries",entries);	
		String viewname="viewpage";
		return viewname;
	}
	@GetMapping("/backtohomepage")
	public String backEntry(Model model)
	{
		
		User user=(User) httpSession.getAttribute("user");
		model.addAttribute("user",user);
		
		
List<Entries> entries=entryServiceInterface.findAllEntries(user.getUserid());
		
		model.addAttribute("entries",entries);	
		String viewname="homepage";
		return viewname;
	}
	
	@GetMapping("/updateEntry")
	public String updateEntry(@RequestParam("id") Long id,Model model)
	{
		Entries entries=entryServiceInterface.findById(id);
	
		User user=(User) httpSession.getAttribute("user");
		System.out.println(user);
		model.addAttribute("user",user);
		model.addAttribute("entries",entries);	
		String viewname="updateentrypage";
		return viewname;
	}
	
	@GetMapping("/deleteEntry")
	public String deleteEntry(@RequestParam("id") Long id,Model model)
	{
		
		
		User user=(User) httpSession.getAttribute("user");
		
		entryServiceInterface.deleteEntry(id);
		List<Entries> entries=entryServiceInterface.findAllEntries(user.getUserid());
		model.addAttribute("entries",entries);	
		
		String viewname="homepage";
		return viewname;
	}
	
	@GetMapping("/logout")
	public String logOut()
	{
			
		
		return "login";
	}
	

	

}
