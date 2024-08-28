package com.ukroht.apachecamel.apachekafka_a.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggingComponenet {
	
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	public void process(String msg)
	{
		logger.info("logger Componenet ${}",msg);
	}
	

}
