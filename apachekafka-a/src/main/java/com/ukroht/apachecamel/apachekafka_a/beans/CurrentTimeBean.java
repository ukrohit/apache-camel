package com.ukroht.apachecamel.apachekafka_a.beans;

import java.time.LocalTime;

import org.springframework.stereotype.Component;

@Component
public class CurrentTimeBean {
	
	public String getCurrentTime()
	{
		return "Current TIme is "+LocalTime.now();
	}

}
