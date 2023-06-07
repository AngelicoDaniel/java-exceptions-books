package org.lessons.java;

class Book {
    private String title;
    private int numPages;
    private String author;
    private String publisher;

    public Book(String title, int numPages, String author, String publisher) {
        this.title = title;
        this.numPages = numPages;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return numPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    
}
