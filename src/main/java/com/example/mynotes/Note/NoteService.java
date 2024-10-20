package com.example.mynotes.Note;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class NoteService {
    private notesRepository notesRepository;
    public NoteService(notesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }
    public List<Note> getNotes(){
        return notesRepository.findAll();
    }

}
