package com.web.api.service;

import java.util.List;
import java.util.Optional;

import com.web.api.model.Movie;

public interface MovieService  {
public Movie  saveMovie(Movie movie);
public List<Movie>getAllMovie();
public Optional<Movie>searchById(Integer id);
public Movie getMovie(Integer id);
public Movie updateMovie(Integer id,Movie movies);
}
