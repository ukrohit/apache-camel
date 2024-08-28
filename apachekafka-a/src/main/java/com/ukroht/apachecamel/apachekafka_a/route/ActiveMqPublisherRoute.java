package com.ukroht.apachecamel.apachekafka_a.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class ActiveMqPublisherRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("timer:activemq-timer?period=1000")
		.transform().constant("actionMq Message")
		.log("${body}")
		.to("activemq:my-activemq-queue");
	}

}
