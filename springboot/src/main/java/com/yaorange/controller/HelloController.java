package com.yaorange.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public Map<String, String> queryInfo() {
		Map<String, String> data = new HashMap<>();
		data.put("key1", "hello1");
		data.put("key2", "hello2");
		return data;
	}
}
