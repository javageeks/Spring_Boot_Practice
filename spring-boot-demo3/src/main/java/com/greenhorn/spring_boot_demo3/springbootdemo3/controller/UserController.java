/**
 * 
 */
package com.greenhorn.spring_boot_demo3.springbootdemo3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenhorn.spring_boot_demo3.springbootdemo3.model.User;

/**
 * @author Hussain
 *
 */
@RestController
@RequestMapping("/user")
public class UserController{


	@RequestMapping("/getUser")
	public User getUserById(int id) {
		return getData(id);
	}
	
	private User getData(int id) {
		User user = new User();
		user.setUsierId(12345);
		user.setFirstName("Hussain");
		user.setLastName("Shaik");
		return user;
	}

}
