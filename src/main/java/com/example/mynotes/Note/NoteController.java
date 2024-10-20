package com.example.mynotes.Note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/notes")

public class NoteController {
    private final NoteService noteService;
    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }
    @GetMapping("/")
    public List<Note> getNotes(){
        return noteService.getNotes();
    }
    @PostMapping("/post")
    public void AddNote(@RequestBody Note note){
        noteService.AddNote(note);
    }
    @DeleteMapping("/{noteId}")
    public void DeleteNote(@PathVariable("noteId") Integer id){noteService.DeleteNote(id);}
}
