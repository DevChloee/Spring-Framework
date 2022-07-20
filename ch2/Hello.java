package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. Annatation
@Controller
public class Hello {
	int iv = 10; //instance variable
	static int cv = 20; // static variable
	
	// 2.Connect "hello" URL with main() METHOD
	// RequestMapping can call method regardless of modifier
	// Even tho Its modifier is private, RequestMapping can approach
	@RequestMapping("/hello")
	private void main() { 		// we can use both of them, iv and cv  
		System.out.println("Hello");
		System.out.println(cv);
	}
	
	public static void main2() {
		System.out.println(cv);
	}

}
