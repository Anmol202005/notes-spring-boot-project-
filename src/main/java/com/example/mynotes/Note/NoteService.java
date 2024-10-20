package com.example.mynotes.Note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class NoteService {
    @Autowired
    private notesRepository notesRepository;
    public NoteService(notesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }

    public  void AddNote(Note note) {

        if(note.getTitle().length()==0){
            throw new IllegalArgumentException("Title cannot be empty");
        }
        else if(note.getContent().length()==0){
            throw new IllegalArgumentException("Content cannot be empty");
        }
        else{
            notesRepository.save(note);
        }

    }

    public List<Note> getNotes(){
        return notesRepository.findAll();
    }

    public void DeleteNote(Integer id) {
        Boolean exist=notesRepository.existsById(id);
        if(!exist){
            throw new IllegalArgumentException("Note does not exist");
        }
        else{
            notesRepository.deleteById(id);
        }
    }
}
