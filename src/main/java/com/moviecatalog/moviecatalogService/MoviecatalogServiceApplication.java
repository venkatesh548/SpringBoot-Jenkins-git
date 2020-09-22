package com.moviecatalog.moviecatalogService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.moviecatalog.moviecatalogService.Controller.MovieCatalogResource;

@SpringBootApplication
public class MoviecatalogServiceApplication {

	public static Logger LOGGER = LogManager.getLogger(MovieCatalogResource.class); 
	public static void main(String[] args) {
		LOGGER.info("Application stated........");
		SpringApplication.run(MoviecatalogServiceApplication.class, args);
	}

}
