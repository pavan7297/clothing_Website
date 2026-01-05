package in.festeve.clothing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@Slf4j
@RequestMapping("/api/v1")
public class HandShackController {
	
	@GetMapping("/wish")
	public String handShack() {
		return new String("<h1>Hello Web Services Are Updated </h1>");
	}
	

}
