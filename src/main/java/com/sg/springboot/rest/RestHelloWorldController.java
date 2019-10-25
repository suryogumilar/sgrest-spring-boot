package com.sg.springboot.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sg.springboot.rest.model.HelloRequestMessage;
import com.sg.springboot.rest.model.HelloResponseMessage;

@RestController
public class RestHelloWorldController {
	@Value("${hello.msg}")
	private String hello;
	
	@RequestMapping(name = "hello", path = "/hello", method = RequestMethod.GET)
	public HelloResponseMessage helloGet() {
		HelloResponseMessage msg = new HelloResponseMessage();
		msg.setHello("Hello, "+hello);
		return msg;
	}

	@RequestMapping(name = "hello", path = "/hello", method = RequestMethod.POST, consumes = {
			MediaType.TEXT_PLAIN_VALUE, MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_JSON_UTF8_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public HelloResponseMessage helloPost(@RequestBody HelloRequestMessage requestMsg) {
		HelloResponseMessage msg = new HelloResponseMessage();
		msg.setHello("Hello, " + requestMsg.getHelloMessage());
		return msg;
	}
}
