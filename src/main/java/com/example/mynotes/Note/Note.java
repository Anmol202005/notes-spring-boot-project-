package com.example.mynotes.Note;

public class Note {
    private String title;
    private String content;

    private String author;
    public Note(String title, String content,  String author) {
        this.title = title;
        this.content = content;

        this.author = author;

    }
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
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
}
