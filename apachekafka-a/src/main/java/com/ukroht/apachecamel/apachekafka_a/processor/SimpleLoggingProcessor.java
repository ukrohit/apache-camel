package com.ukroht.apachecamel.apachekafka_a.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleLoggingProcessor implements Processor {
	
	Logger logger=LoggerFactory.getLogger(this.getClass());


	@Override
	public void process(Exchange exchange) throws Exception {
		logger.info("SimpleLoggingProcessor  ${}",exchange.getMessage().getBody());
	}

}
