package aggregation;

public class Main {
    
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter and the Sorceror's Stone", 300);
        Book book2 = new Book("Harry Potter and the Chamber of secret", 400);
        Book book3 = new Book("Harry Potter and the Prisoner of azkaban", 500);

        Book[] books = {book1, book2, book3};
        Library library = new Library("Berlin Public library", 1940, books);
        library.displayInfo();
    }
}
