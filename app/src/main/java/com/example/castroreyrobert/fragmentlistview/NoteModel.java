package com.example.castroreyrobert.fragmentlistview;



public class NoteModel {
    private String title, note;
    private long id, dateCreatedMilli;


    //Setting the title of Category


    public NoteModel(String title, String note) {
        this.title = title;
        this.note = note;
        this.id = 0;
        this.dateCreatedMilli = 0;

    }

    public NoteModel(String title, String note,  Long id, Long dateCreatedMilli) {
        this.title = title;
        this.note = note;
        this.id = id;
        this.dateCreatedMilli = dateCreatedMilli;

    }


    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


    public String getNote() {
        return note;
    }





    public String toString(){
        return "ID: " + id + " Title: " + title + " Note: " + note + " IconID: ";
    }

    //Getting the category and return the specific image


}
