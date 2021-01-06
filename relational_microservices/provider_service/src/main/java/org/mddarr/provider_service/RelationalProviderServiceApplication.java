package org.mddarr.provider_service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class RelationalProviderServiceApplication implements CommandLineRunner {


	@Autowired
	DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(RelationalProviderServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("THE DATA SOURCE LOOKS LIKE " + dataSource);
	}
}
