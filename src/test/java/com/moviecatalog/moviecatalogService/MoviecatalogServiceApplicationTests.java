package com.moviecatalog.moviecatalogService;

import static org.junit.Assert.assertEquals;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.moviecatalog.moviecatalogService.Controller.MovieCatalogResource;

@RunWith(SpringRunner.class)
@SpringBootTest
class MoviecatalogServiceApplicationTests {

	public static Logger LOGGER = LogManager.getLogger(MoviecatalogServiceApplicationTests.class);
	
	@Test
	void contextLoads() {
		
		LOGGER.info("Entred into Test cases .....");
		assertEquals(true,true);
	}
	@Test
	void testingSecond() {
		
		LOGGER.info("This is second method in Test case...................");
		assertEquals("hello","hello");
		LOGGER.info("This is after  method in Test case...................");
	}
	
}
