package com.jasinski.springbackend.model.book;

public class Book {
    private String title;
    private String author;
    private ReadingStatus status;
    private int rating; // <1,10>
    private String notes; // optional field. can be empty
}
