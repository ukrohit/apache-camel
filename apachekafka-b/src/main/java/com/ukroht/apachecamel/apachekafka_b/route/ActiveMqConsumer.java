package com.ukroht.apachecamel.apachekafka_b.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqConsumer extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("activemq:my-activemq-queue")
		.log("${body}")
		.to("log:consumer-log");
	}

}
