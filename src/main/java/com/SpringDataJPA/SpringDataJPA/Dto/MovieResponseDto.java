package com.SpringDataJPA.SpringDataJPA.Dto;

import com.SpringDataJPA.SpringDataJPA.Model.Movie;

import java.util.List;

public class MovieResponseDto {
    List<Movie> movieList;

    public MovieResponseDto(List<Movie> movieList) {
        this.movieList = movieList;
    }
}
