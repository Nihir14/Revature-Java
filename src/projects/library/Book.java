package projects.library;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private int availableCopies;

    public Book(String title, String author, String isbn, int availableCopies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availableCopies = availableCopies;
    }

    public void checkoutBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println(title + " checked out successfully.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void display() {
        System.out.println(title + " | " + author + " | Copies: " + availableCopies);
    }
}
