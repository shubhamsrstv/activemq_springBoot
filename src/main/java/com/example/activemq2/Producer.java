package com.example.activemq2;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer implements CommandLineRunner
{
	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;

	@Autowired
	private Queue queue;

	@Override
	public void run(String... args) throws Exception 
	{
		String text = Activemq2Application.text;
		send(text);
		System.out.println("Message was sent to the Queue");
	}

	public void send(String msg) 
	{
		this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
	}

}