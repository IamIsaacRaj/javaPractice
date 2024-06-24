package javaPractice.inheritance_polymorphism.exercise1;

public class Book {
    String id;
    String title;
    String author;
    String genre;
    int price;

    final static String LIBRARY_NAME = "Central Library";

    public static String getLibraryName() {
        return LIBRARY_NAME;
    }

     Book(){
        id = "Unknown";
        title = "Unknown";
        author = "Unknown";
        genre = "Unknown";
        price = 0;
    }

    public Book(String id, String title, String author, String genre, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    void displayBookDetails(){
        System.out.println("Book Details :");
        System.out.println("id = " + id);
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("genre = " + genre);
        System.out.println("price = " + price);
    }
}
