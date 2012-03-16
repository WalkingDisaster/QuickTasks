package com.qsi.quicktasks.services;

public class SayHelloServiceImpl implements SayHelloService {
	@Override
	public String sayHello(String name) {
		return "Hello " + name + "!";
	}
}
