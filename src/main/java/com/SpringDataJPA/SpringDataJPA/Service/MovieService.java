package com.SpringDataJPA.SpringDataJPA.Service;

import com.SpringDataJPA.SpringDataJPA.Dto.MovieDto;
import com.SpringDataJPA.SpringDataJPA.Model.Movie;
import com.SpringDataJPA.SpringDataJPA.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;
    public String insertMovie(MovieDto movieDto) {
        Movie movie=new Movie(movieDto.getMovieName(),movieDto.getMovieTitle(),movieDto.getMovieDate(),movieDto.getMovieRatings());
        movieRepository.save(movie);
        return "Saved";
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(int id) {
        return movieRepository.findById(id);
    }

    public Optional<Movie> getMovieByName(String name) {
        return movieRepository.findByName(name);
    }

    public String deleteMovieById(int id) {
        movieRepository.deleteById(id);
        return "Deleted";
    }

    public String deleteAllMovies() {
        movieRepository.deleteAll();
        return "All Movies Deleted.";
    }
}
