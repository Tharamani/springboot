/**
 * @author Thara
 * created date and time :31 Dec 2020 9:36:29 am
 * 
 */
package com.javalearning.springboot.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  Thara
 * created date and time :31 Dec 2020 9:36:29 am
 */
@RestController
public class FunRestController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello spring boot app!! time on server is " + LocalDateTime.now();
		
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		
		return "Run a gard 5k!";
	}
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		
		return "Today is your lucky day!";
	}
}
