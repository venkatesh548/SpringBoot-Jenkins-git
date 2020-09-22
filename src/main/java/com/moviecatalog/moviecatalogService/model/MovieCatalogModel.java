package com.moviecatalog.moviecatalogService.model;

public class MovieCatalogModel {


	String rating;
	String name;
	String desc;	

	public MovieCatalogModel(String rating, String name, String desc) {
		super();
		this.rating = rating;
		this.name = name;
		this.desc = desc;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
