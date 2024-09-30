public class Main {
    public static void main(String[] args) {
        // Create a library instance
        Library library = new Library();

        // Create some books
        Book book1 = new Book("Sofea Jane", "Black Hanifah", "12345");
        Book book2 = new Book("Nike Ardilla", "Saari Amri", "67890");
        Book book3 = new Book("Transformers", "Michael Bay", "11223");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Create some users
        User user1 = new User("Sophia", 25);
        User user2 = new User("Nadia", 30);

        // Add users to the library system
        library.addUser(user1);
        library.addUser(user2);

        // Borrow books
        library.borrowBook(user1, "Sofea Jane");
        library.borrowBook(user2, "Nike Ardilla");

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
