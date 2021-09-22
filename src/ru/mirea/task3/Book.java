package ru.mirea.task3;

public class Book {
    private String name;
    private String author;
    private int yearOfWriting;

    Book(String name, String author, int yearOfWriting){
        this.name = name;
        this.author = author;
        this.yearOfWriting = yearOfWriting;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfWriting() {
        return yearOfWriting;
    }
    public void setYearOfWriting(int yearOfWriting) {
        this.yearOfWriting = yearOfWriting;
    }

    public String toString(){
        return "Book's name is " + name + ", its author is " + author + ", it was written in " + yearOfWriting;
    }

    public static void main(String[] args) {
        Book book = new Book("Hello Would", "Tred", 1999);
        book.setYearOfWriting(2010);
        book.setAuthor("Fred");
        System.out.println(book);
    }
}
