package com.example.mynotes;

import com.example.mynotes.Note.Note;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.List;


@SpringBootApplication

public class MynotesApplication {

    public static void main(String[] args) {
        SpringApplication.run(MynotesApplication.class, args);
    }

}
