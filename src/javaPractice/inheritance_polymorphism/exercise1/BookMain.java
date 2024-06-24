package javaPractice.inheritance_polymorphism.exercise1;

public class BookMain {
    public static void main(String[] args) {
        /*Book book = new Book();
        book.displayBookDetails();

        EBook book1 = new EBook();

        book1.id = "1";
        book1.title = "The Hobbit";
        book1.author = "J.R.R. Tolkien";
        book1.genre = "Fantasy";
        book1.price = 210;
        book1.fileSize = 210.50;

        book1.displayBookDetails();

        Book book2 = new PrintedBook("2", "The Land Before Time", "Alan Moore", "Fantasy", 180, 200);
        book2.displayBookDetails();*/

        Book[] books = new Book[3];

        books[0] = new Book();
        books[1] = new EBook("1","The Hobbit","J.J.R.Tolkien","Fantacy",210,225.50);
        books[2] = new PrintedBook("2","The Land Before Time","Alane Moore","Fantacy",300,420);

        for ( Book book : books){
            book.displayBookDetails();
            System.out.println("-----------------------------");
        }

//  getLibraryName(): This static method returns the constant LIBRARY_NAME.
        System.out.println("Library Name : " + Book.getLibraryName());
    }
}
