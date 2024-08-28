package com.ukroht.apachecamel.apachekafka_a.route;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private ProducerTemplate producerTemplate;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("");
		producerTemplate.sendBody("direct:start", "Hello Kafka from Camel!");
	}

}
