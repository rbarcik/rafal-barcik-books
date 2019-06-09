package com.kodilla.books;

public enum BookType {
    IT("IT"), THRILLER("Thriller"), CLASSIC("Classic"), POETRY("Poetry");

    private String type;

    public String getType() {
        return type;
    }

    BookType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
