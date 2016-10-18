package com.niit.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.niit.dao.Userdao;
import com.niit.models.Userdetails;
import com.niit.service.Userservicedao;
@RestController
public class Usercontroller {
	@Autowired
	private Userservicedao userservice;
	@Autowired
	private Userdao userdao;
	@PostMapping("/userdetails")
	public void savedetails(@RequestBody Userdetails user){
		System.out.println("user");
		userservice.save(user);
		
		
	}
	
	@PostMapping("/imageUpload")
	public void ImageUpload(@RequestBody MultipartFile file,HttpSession session) throws IOException {
		
		String username = SecurityContextHolder.getContext().getAuthentication().getName(); 
		Userdetails user=userdao.getusername(username);											
		System.out.println(file.getContentType()+'\n'+file.getName()+'\n'+file.getSize()+'\n'+file.getOriginalFilename());
		user.setImage(file.getBytes());
		userservice.save(user);
	}
	
	@GetMapping("/profileimage")
	public ResponseEntity<Userdetails> profileimage(HttpSession session){
		
		Userdetails user=userservice.viewuser(session);
		return new ResponseEntity<Userdetails>(user,HttpStatus.OK);
	}
	
	

}
