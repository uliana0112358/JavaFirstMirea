package ru.mirea.task4;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author (String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }
    public String toString(){
        return "This is " + name + ", gender: " + gender + " and his email: " + email;
    }
}

class TestAuthor{
    public static void main(String[] args) {
        Author author = new Author("Victor", "victorrr@gmail.com", 'm');
        System.out.println(author.getEmail());
        author.setEmail("nnnnnnnnn@n.com");
        System.out.println(author.getEmail());
        System.out.println(author);
    }
}
