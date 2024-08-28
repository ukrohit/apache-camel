package com.ukroht.apachecamel.apachekafka_a.route;

import java.time.LocalTime;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ukroht.apachecamel.apachekafka_a.beans.CurrentTimeBean;
import com.ukroht.apachecamel.apachekafka_a.beans.LoggingComponenet;
import com.ukroht.apachecamel.apachekafka_a.processor.SimpleLoggingProcessor;

// @Component
public class FirstDemoRoute extends RouteBuilder{
	
	@Autowired
	private CurrentTimeBean currentTimeBean;
	
	@Autowired
	private LoggingComponenet loggingComponenet;

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("timer:camel-timer")
		.log("${body}")
		//.transform(constant("Demo Transform"))
		//.transform(constant("Transferm time "+LocalTime.now()))
		//.bean("currentTimeBean")
		.transform().constant("demo transform message")
		.bean(currentTimeBean)
		.log("${body}")
		.bean(loggingComponenet)
		.log("${body}")
		.process(new SimpleLoggingProcessor())
		.to("log:camel-timer");
		
	}

}



