package javaPractice.inheritance_polymorphism.exercise1;

public class EBook extends Book {

    double fileSize ;

    public EBook() {
        super();// This line is optional because Java calls the superclass's no-argument constructor by default.
    }

    public EBook(String id, String title, String author, String genre, int price, double fileSize) {
        super(id, title, author, genre, price);
        this.fileSize = fileSize;
    }

    @Override
    void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("fileSize = " + fileSize);
    }
}
