package com.lucca.os.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lucca.os.services.DBServices;

@Configuration
@Profile("teste")
public class TesteConfig {
	
	@Autowired
	private DBServices dbService;

    
    public void InstanciaDb() {
		this.dbService.InstanciaDb();
	}
}
