package com.ukroht.apachecamel.apachekafka_a.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaTopicPublisherRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		 from("kafka:my-topic?brokers=localhost:9092")
         .log("Received message: ${body}")
         .to("log:received-message");
     
     from("direct:start")
         .log("Sending message: ${body}")
         .to("kafka:my-topic?brokers=localhost:9092");
	}

}
