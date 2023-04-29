package com.SpringDataJPA.SpringDataJPA.Controller;

import com.SpringDataJPA.SpringDataJPA.Dto.MovieDto;
import com.SpringDataJPA.SpringDataJPA.Dto.MovieResponseDto;
import com.SpringDataJPA.SpringDataJPA.Dto.ResponseDto;
import com.SpringDataJPA.SpringDataJPA.Model.Movie;
import com.SpringDataJPA.SpringDataJPA.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("/insertMovie")
    public ResponseDto<String> insertMovie(@RequestBody MovieDto movieDto)
    {
        String s=movieService.insertMovie(movieDto);
        return new ResponseDto<String>(s, HttpStatus.OK);
    }
    @GetMapping("/getAllMovies")
    public ResponseDto<List<MovieResponseDto>> getAllMovies(){
        List<Movie> list=movieService.getAllMovies();
        return new ResponseDto<>((List<MovieResponseDto>) new MovieResponseDto(list),HttpStatus.OK);
    }

    @GetMapping("/getMovieById/{id}")
    public ResponseDto<Optional<Movie>> getMovieById(@PathVariable Integer id){
        return new ResponseDto<>(movieService.getMovieById(id),HttpStatus.OK);
    }

    @GetMapping("/getMovieByName/{name}")
    public ResponseDto<Optional<Movie>> getMovieByName(@PathVariable String name)
    {
        return new ResponseDto<>(movieService.getMovieByName(name),HttpStatus.OK);
    }

    @DeleteMapping("/deleteMovieById/{id}")
    public ResponseDto<String> deleteMovieById(@PathVariable int id)
    {
        String s=movieService.deleteMovieById(id);
        return new ResponseDto<>(s,HttpStatus.OK);
    }
    @DeleteMapping("/deleteAllMovies")
    public ResponseDto<String> deleteAllMovies()
    {
        String s=movieService.deleteAllMovies();
        return new ResponseDto<>(s,HttpStatus.OK);
    }
}
