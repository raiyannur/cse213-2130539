package com.oop.practice.libraybooks;

public class Book {
    private Integer bookId;
    private String bookTitle;
    private Float price;
    private String bookGenre;
    private static Integer totalBooks;

    public Book(Integer bookId, String bookTitle, Float price, String bookGenre) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.price = price;
        this.bookGenre = bookGenre;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", price=" + price +
                ", bookGenre='" + bookGenre + '\'' +
                '}';
    }
}

