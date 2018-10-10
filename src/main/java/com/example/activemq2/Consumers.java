package com.example.activemq2;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumers 
{
	@JmsListener(destination = "test")
	public void receiveQueue(String text)
	{
		System.out.println("The text is : "+text);
	}
}