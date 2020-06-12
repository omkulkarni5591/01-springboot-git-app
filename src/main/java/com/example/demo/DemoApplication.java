package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    HashMap<String,Integer> hashMap=new HashMap();
    private static final String restUrl="www./sbibank.com"

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(DemoApplication.class, args);
		//changes for 134
		ctx.close();
	}
    public void storeCache(){
		//Feature 301 chages
		//logic goes here
	}
}
