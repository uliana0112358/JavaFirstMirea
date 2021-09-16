package ru.mirea.task2;

public class Book {
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String name;

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    private String author;

    public boolean isIllustration() {
        return illustration;
    }
    public void setIllustration(boolean illustration) {
        this.illustration = illustration;
    }
    private boolean illustration;

    public Book(String name, String author, boolean illustration){
        this.name = name;
        this.author = author;
        this.illustration = illustration;
    }
    public Book(String name, String author){
        this.name = name;
        this.author = author;
        illustration = false;
    }

    public String toString(){
        return "Name " + name + ", author " + author + ", " + "illustration: " + illustration;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Travel", "Tyot", true);
        Book b2 = new Book("Food", "Ufnd");
        System.out.println(b1.isIllustration());
        System.out.println(b2.getName());
        System.out.println(b1.toString());
        System.out.println(b2);

    }
}
