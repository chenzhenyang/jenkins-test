package com.fengxin58.taobao.union;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsTestApplication {

	
	@RequestMapping("/ok")
	public String ok(){
		return "ok!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsTestApplication.class, args);
	}
}
