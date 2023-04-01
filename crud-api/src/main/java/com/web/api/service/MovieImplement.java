package com.web.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.api.model.Movie;
import com.web.api.repo.MovieRepositary;

@Service
public class MovieImplement implements MovieService {
	@Autowired
	private MovieRepositary movierepositary;
	@Override
	public Movie saveMovie(Movie movie) {
		return movierepositary.save(movie);
		
	}
	@Override
	public List<Movie> getAllMovie() {
		// TODO Auto-generated method stub
		return movierepositary.findAll();
	}



	

}
