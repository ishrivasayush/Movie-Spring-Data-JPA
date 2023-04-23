package com.SpringDataJPA.SpringDataJPA.Controller;

import com.SpringDataJPA.SpringDataJPA.Dto.MovieDto;
import com.SpringDataJPA.SpringDataJPA.Dto.MovieResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired

    @PostMapping("/insertMovie")
    public String insertMovie(@RequestBody MovieDto movieDto)
    {
        return null;
    }
}
