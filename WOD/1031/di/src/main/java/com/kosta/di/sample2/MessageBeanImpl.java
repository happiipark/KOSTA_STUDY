package com.kosta.di.sample2;

import java.io.IOException;

public class MessageBeanImpl implements MessageBean {
	
	private String name;
	private String greeting;
	private Outputter outputter;

	public Outputter getOutputter() {
		return outputter;
	}

	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		String message = greeting+", " +name+"!";
		System.out.println(greeting+ ", " +name+"!");
		try {
			outputter.output(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
