package com.SpringDataJPA.SpringDataJPA.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//JPA Dependancies is responsible for @Entity anotation
@Entity
public class Movie {


    @Id //For PrimaryKey
    private int id;
    private String movieName;
    private String movieTitle;
    private long movieDate;
    private int movieRatings;

    public Movie(int id, String movieName, String movieTitle, long movieDate, int movieRatings) {
        this.id = id;
        this.movieName = movieName;
        this.movieTitle = movieTitle;
        this.movieDate = movieDate;
        this.movieRatings = movieRatings;
    }
 }

