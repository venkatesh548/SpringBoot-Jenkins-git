package com.moviecatalog.moviecatalogService.Controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviecatalog.moviecatalogService.model.MovieCatalogModel;

@RequestMapping("/moviecatalog")
@RestController
public class MovieCatalogResource {

	
	@GetMapping("/{userid}")
	public List<MovieCatalogModel> getCatalog(@PathVariable("userid") String userid) {
							
		return Collections.singletonList(new MovieCatalogModel("good movie","venky","5")); 
	}
}
