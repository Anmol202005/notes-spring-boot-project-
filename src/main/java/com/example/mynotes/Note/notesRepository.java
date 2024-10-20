package com.example.mynotes.Note;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface notesRepository extends JpaRepository<Note, Integer> {
<optional>Note findByTitle(String title);
}
