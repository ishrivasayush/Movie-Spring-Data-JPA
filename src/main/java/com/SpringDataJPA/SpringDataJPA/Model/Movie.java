package com.SpringDataJPA.SpringDataJPA.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
//JPA Dependency is responsible for @Entity annotation
@Entity
@Table(name = "Films") //ByDefault Name is Movie Change table name.
public class Movie {


    @Id //For PrimaryKey
    //Increemented by 1
    //id is being Control by hibernate
    @GeneratedValue(strategy = GenerationType.AUTO)
    //id is being control by Mysql
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="mName") //Name of column is change.
    private String movieName;  //movie_name Hibernate Naming Convention.
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

    public Movie(String movieName, String movieTitle, long movieDate, int movieRatings) {
        this.movieName = movieName;
        this.movieTitle = movieTitle;
        this.movieDate = movieDate;
        this.movieRatings = movieRatings;
    }


}

