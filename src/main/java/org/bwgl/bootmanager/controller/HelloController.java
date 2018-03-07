package org.bwgl.bootmanager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	/**
	 * http://localhost:8080/hello
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
}
