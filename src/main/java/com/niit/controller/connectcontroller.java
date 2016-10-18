package com.niit.controller;



import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.niit.service.Userservicedao;

import com.niit.models.Message;
import com.niit.models.OutputMessage;
import com.niit.service.Blogservicedao;
import com.niit.service.Forumservicedao;

@Controller
public class connectcontroller {
	
	@Autowired
	private Forumservicedao forumservice;
	@Autowired
	private Userservicedao userservice;
	@Autowired
	private Blogservicedao blogservice;
	

	
	@RequestMapping(value="/")
	public String Homepage()
	{
		return "main";
	}
	@RequestMapping("/LoginSuccess")
	public String LoginSuccess(HttpSession session)
	{
		userservice.getusername(session);
		
		return "main";
	}
	@RequestMapping(value="/login")
	public String login(Model model)
	{
		model.addAttribute("loginclicked", "true");
		return "main";
	}
	@RequestMapping(value="/blog")
	public String blog(Model model)
	{
		model.addAttribute("blogclicked", "true");
		return "main";
	}
	@RequestMapping(value="/forum")
	public String forum(Model model)
	{
		model.addAttribute("forumclicked", "true");
		return "main";
	}
	@RequestMapping(value="chat")
	public String chat(Model model)
	{
		model.addAttribute("chatclicked", "true");
		return "main";
	}
	
	
	@RequestMapping(value="profile")
	public String profile(Model model)
	{
		model.addAttribute("profileclicked", "true");
		return "main";
	} 
	
	
	@RequestMapping(value="/viewforum/{fid}")
	public String viewforum(Model model ,@PathVariable("fid") int fid)
	{
		model.addAttribute("forumlist",forumservice.getsingleform(fid));
		model.addAttribute("viewforumclicked", "true");
		/*return "redirect:/";*/
		return "main";
	}
	@RequestMapping(value="/viewblog/{bid}")
	public String viewblog(Model model ,@PathVariable("bid") int bid)
	{System.out.println("jhfhds");
		model.addAttribute("bloglist",blogservice.getallblogs(bid));
		model.addAttribute("viewblogclicked", "true");
		/*return "redirect:/";*/
		return "main";
	}
	
	@MessageMapping("/chat")
	@SendTo("/topic/message")
	public OutputMessage sendMessage(Message message) {
		return new OutputMessage(message, new Date());
	}
}
  