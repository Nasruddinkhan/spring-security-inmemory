/**
 * nasru
 * DashboardController.java
 * Nov 26, 2019
 */
package com.mypractice.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nasru
 *
 */
@RestController
public class EmployeeController {
	@GetMapping("/")
	public String index() {
		return "Welcome to Spring Security !";
	}
	@GetMapping("/employees")
	public String getAllEmployees() {
		return "All employees is return";
	}
}
	