package com.web.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.api.exception.MovieNotFoundException;
import com.web.api.exception.UserNotFoundException;
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
	@Override
	public Optional<Movie> searchById(Integer id) {
		// TODO Auto-generated method stub
		
		return movierepositary.findById(id);
		
	}
	@Override
	public Movie getMovie(Integer id) {
		// TODO Auto-generated method stub
		return movierepositary.findById(id).orElseThrow(()->new MovieNotFoundException());
	}
	
	public Movie updateMovie(Integer id,Movie movies) {
		return movierepositary.findById(id).map(
				
				movie->{
					
					movie.setMoviename(movies.getMoviename());
					movie.setMovieDescription(movies.getMovieDescription());
					return movierepositary.save(movie);
					
				}
				
				).orElseThrow(()->new UserNotFoundException(id));
		
		
		
	}
	
	



	

}
