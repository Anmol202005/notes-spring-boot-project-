package com.example.mynotes.Note;

import jakarta.persistence.*;

@Entity
@Table(name="note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
    @SequenceGenerator(name ="seq",sequenceName = "seq",allocationSize = 1)
    private int id;
    private String title;
    private String content;

    private String author;
    public Note(){}
    public Note(String title, String content,  String author) {
        this.title = title;
        this.content = content;

        this.author = author;

    }
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Note(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
