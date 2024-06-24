package javaPractice.inheritance_polymorphism.exercise1;

public class PrintedBook extends Book {

    int numPages ;

    public PrintedBook() {
        super();// This line is optional because Java calls the superclass's no-argument constructor by default.
    }

    public PrintedBook(String id, String title, String author, String genre, int price, int numPages) {
        super(id, title, author, genre, price);
        this.numPages = numPages;
    }


    @Override
    void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("numPages = " + numPages);
    }
}
