public class Main {
    public static void main(String[] args) {
        // Create a library instance
        Library library = new Library();

        // Create some books
        Book book1 = new Book("Harry Potter", "J.K. Rowling", "12345");
        Book book2 = new Book("Lord of the Rings", "J.R.R. Tolkien", "67890");
        Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger", "11223");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Create some users
        User user1 = new User("Alice", 25);
        User user2 = new User("Bob", 30);

        // Add users to the library system
        library.addUser(user1);
        library.addUser(user2);

        // Borrow books
        library.borrowBook(user1, "Harry Potter");
        library.borrowBook(user2, "Lord of the Rings");

        System.out.println("Welcome to Laman Norsham Library");
        System.out.println("Please choose desired menu :");
        System.out.println("1. View all available books");
        System.out.println("2. Borrow book"); //user.borrowBook()
        System.out.println("3. Print borrowed books"); //printBorrowBooks()
        System.out.println("4. Print book details"); //printBookInfo()
        System.out.println("5. Add book to library");
        System.out.println("6. Search book title"); //library.searchByTitle
        System.out.println("7. View book due date"); //user.checkDueDates()


        // List available books
        library.listAvailableBooks();

        // Print borrowed books
        library.getBorrowedBooksForAllUsers();

        // Check due dates and overdue books
        user1.checkDueDates();
        user1.checkOverdueBooks();
    }
}
