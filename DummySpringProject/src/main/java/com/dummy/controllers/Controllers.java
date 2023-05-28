package com.dummy.controllers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dummy.entities.Contacts;
import com.dummy.entities.User;
import com.dummy.repositories.UserRepository;

@Controller
@CrossOrigin(origins = "*")
public class Controllers {
	@Autowired
	private UserRepository repo;
	@GetMapping("/image")
	public String saveImage(@RequestParam("image") MultipartFile file)
	{
		try {
			System.out.println(File.separator);
			System.out.println(file.getOriginalFilename());
		System.out.println(file.getBytes());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "ok";
	}
	@PostMapping("/user")
	@ResponseBody
	public String Testing(@RequestParam("suraj") String text)
	{
		
		System.out.println("i am just hitted by outside ");
		System.out.println(text);
		return text;
	}
	@GetMapping("/")
	public String home()
	{
		System.out.println("i am suraj");
		return "null";
	}
	
}
