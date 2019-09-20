package com.uaf.uafhelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @filename HelloWorldAction
 * @description HelloWorld
 * @author 巫威
 * @date 2019/9/20 9:00
 */
@RestController
public class HelloWorldAction {

	@GetMapping("sayHi")
	public String sayHi(String msg){
		System.out.println("msg = " + msg);
		return "Hello " + msg;
	}
}
