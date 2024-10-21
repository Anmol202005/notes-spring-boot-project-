package com.example.mynotes.repository;

import com.example.mynotes.Entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface notesRepository extends JpaRepository<Note, Integer> {

}
