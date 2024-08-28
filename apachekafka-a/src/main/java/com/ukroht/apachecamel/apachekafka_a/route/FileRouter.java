package com.ukroht.apachecamel.apachekafka_a.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

// @Component
public class FileRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("file:files/input")
		.log("${body}")
		.to("file:files/output");
		
	}

}
