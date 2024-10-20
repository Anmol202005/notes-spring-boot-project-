package com.example.mynotes.Service;

import com.example.mynotes.Entity.Note;
import com.example.mynotes.repository.notesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {
    @Autowired
    private com.example.mynotes.repository.notesRepository notesRepository;
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

    public void updateNote(Integer id, Note note) {
        Optional<Note> existingnote=notesRepository.findById(id);
        if(!existingnote.isPresent()){
            throw new IllegalArgumentException("Note does not exist");
        }
        else{
            existingnote.get().setTitle(note.getTitle());
            existingnote.get().setContent(note.getContent());
            notesRepository.save(existingnote.get());
        }


    }

    public List<Note> getNotesbyid(Integer id) {
        Optional<Note> existingnote=notesRepository.findById(id);
        if(!existingnote.isPresent()){
            throw new IllegalArgumentException("Note does not exist");
        }
        else{
           notesRepository.findById(id);
        }
        return List.of();
    }
}

