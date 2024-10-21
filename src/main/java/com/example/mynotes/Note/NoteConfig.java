package com.example.mynotes.Note;

import com.example.mynotes.Entity.Note;
import com.example.mynotes.repository.notesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class NoteConfig {
    @Bean
    CommandLineRunner commandLineRunner(notesRepository repository) {
        return args -> {
             Note task1 = new Note("task1","Create portfolio");
             Note task2 = new Note("task2","Create Animation ");
             Note task3 = new Note("task3","Create Game");
             repository.saveAll(List.of(task1,task2,task3));
        };
    }
}
