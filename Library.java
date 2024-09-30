import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    // Method to search for books by title
    public void searchByTitle(String title) {
        System.out.println("--- Search Results ---");
        for (Book book : books) {
            if (book.getTitle().contains(title)) {
                book.printBookInfo();
            }
        }
    }

    // Method to add a user to the library
    public void addUser(User user) { //Declare object User kat sini
        users.add(user);
        System.out.println("User added: " + user.getName());
    }

    // List available books
    public void listAvailableBooks() {
        System.out.println("--- Available Books ---");
        for (Book book : books) {
            if (book.isAvailable()) {
                book.printBookInfo();
            }
        }
    }

    // Borrow a book for a user
    public void borrowBook(User user, String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                book.setAvailable(false);
                user.borrowBook(title);
                System.out.println(user.getName() + " borrowed " + title);
                return;
            }
        }
        System.out.println("The book \"" + title + "\" is not available or does not exist.");
    }

    // Display all borrowed books for each user
    public void getBorrowedBooksForAllUsers() {
        System.out.println("--- Borrowed Books for All Users ---");
        for (User user : users) {
            user.printBorrowedBooks();
        }
    }
}
