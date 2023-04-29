package com.SpringDataJPA.SpringDataJPA.Dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class MovieDto {
    private String movieName;
    private String movieTitle;
    private long movieDate;
    private int movieRatings;



}
