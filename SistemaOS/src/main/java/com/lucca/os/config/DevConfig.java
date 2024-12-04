package com.lucca.os.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lucca.os.services.DBServices;

@Configuration
@Profile("dev")
public class DevConfig {
	
	@Autowired
	private DBServices dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String ddl;
	

	
	public boolean InstanciaDb() {
		
		if(ddl.equals("creat")) {
			this.dbService.InstanciaDb();
		}
		
		return false;
		
	}
}
