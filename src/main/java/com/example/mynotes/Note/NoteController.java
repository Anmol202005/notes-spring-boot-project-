package com.example.mynotes.Note;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/notes")
public class NoteController {
    @GetMapping
    public List<Note> getNotes(){
        return List.of(new Note("About me",
                "My name is Anmol Sharma , I am 19 year old",
                "Anmol Sharma"



        ));
    }
}
