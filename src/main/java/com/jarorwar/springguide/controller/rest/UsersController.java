package com.jarorwar.springguide.controller.rest;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

	@GetMapping("/users")
	public ArrayList<String> allUsers() {
		return new ArrayList<String>();
	}
}
