package com.niit.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.models.Blog;
import com.niit.service.Blogservicedao;

@RestController
public class Blogcontroller {
	
	@Autowired
	private Blogservicedao blogservice;

	@PostMapping("/Blog")
	public void CreateBlog(@RequestBody Blog blog,HttpSession session) 
	{
		blogservice.create(blog,session);
	}
	@GetMapping("/getalldetails")
	public String getdetails(){
		return blogservice.allblogs();
	}
	@DeleteMapping("/deleteblog/{bid}")
	public void deleteblog(@PathVariable("bid") int bid){
		blogservice.delete(bid);
		
	}
	@GetMapping("/editblog/{bid}")
	public ResponseEntity<Blog> editblog(@PathVariable("bid") int bid){
		Blog blog=blogservice.editblog(bid);
		
		return new ResponseEntity<Blog>(blog,HttpStatus.OK);
		
	}
}
