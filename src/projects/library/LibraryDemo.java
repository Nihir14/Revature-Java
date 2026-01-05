package projects.library;


public class LibraryDemo {
    public static void main(String[] args) {

        Book b1 = new Book("Java Basics", "James Gosling", "ISBN001", 2);
        Book b2 = new Book("OOP Concepts", "Bjarne", "ISBN002", 1);
        Book b3 = new Book("DSA", "CLRS", "ISBN003", 0);

        b1.checkoutBook();
        b3.checkoutBook();

        b1.display();
        b2.display();
        b3.display();
    }
}
