package javaPractice.constructors;

public class LibraryMain {
    public static void main(String[] args) {

        Library book = new Library();
        book.displayBookDetails();

        Library book1 = new Library();

        book1.id = "1";
        book1.title = "The Hobbit";
        book1.author = "J.R.R. Tolkien";
        book1.genre = "Fantasy";
        book1.price = 210;

        book1.displayBookDetails();

        Library book2;
        book2 = new Library("2","The Land Before Time","Alan Moore","Fantasy",180);
        book2.displayBookDetails();

//  getLibraryName(): This static method returns the constant LIBRARY_NAME.
        System.out.println("Library Name : " + Library.getLibraryName());
    }
}
