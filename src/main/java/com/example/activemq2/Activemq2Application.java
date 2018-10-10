package com.example.activemq2;

import java.util.Scanner;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;


@SpringBootApplication
@EnableJms
public class Activemq2Application
{

	public static String text;
	@Bean
	public Queue queue()
	{
		return new ActiveMQQueue("test");
	}
	
	public static void main(String[] args) throws Exception
	{		
		System.out.println("Enter text to send : ");
		Scanner sc = new Scanner(System.in);
		text = sc.nextLine();
		sc.close();
		SpringApplication.run(Activemq2Application.class, args);
	}

}