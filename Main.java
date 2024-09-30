import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Declare object
        Library library = new Library();
        User user = new User(null, 0);
        Book book = new Book(null, null, null);
        Scanner sc = new Scanner(System.in);
        

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
        System.out.println("1. View all available books"); //library.listAvailableBooks();
        System.out.println("2. Borrow book"); //user.borrowBook()
        System.out.println("3. Print borrowed books"); //printBorrowBooks()
        System.out.println("4. Print book details"); //printBookInfo()
        System.out.println("5. Add book to library");
        System.out.println("6. View book due date"); //library.searchByTitle //user.checkDueDates()
        System.out.println("7. Return book by title ");
        int userInput = sc.nextInt();
        sc.nextLine(); // flush data entry

        switch (userInput){
        case 1:// Done
            library.listAvailableBooks();
            break;
        case 2: // done
            System.out.println("Enter user name: ");
            String borrowName = sc.nextLine();
            user.setName(borrowName);
            System.out.println("Enter book title: ");
            String bookName = sc.nextLine();
            library.borrowBook(user, bookName); // this line
            break;
        case 3: // done
            library.getBorrowedBooksForAllUsers();
            break;
        case 4: //Done
            System.out.println("Enter book title: ");
            String bookInput = sc.nextLine();
            library.searchByTitle(bookInput);
            break;
        case 5: // done
            System.out.println("Enter book title: ");
            String titleInput = sc.nextLine();
            System.out.println("Enter author name: ");
            String nameInput = sc.nextLine();
            System.out.println("Enter ISBN number: ");
            String isbnInput = sc.nextLine();
            library.addBook(new Book(titleInput, nameInput, isbnInput));
            break;
        case 6: // still need to repair - View book due date
            
            break;
        case 7: //not ok
            System.out.println("Enter book title");
            String returnInput = sc.nextLine();
            user.returnBook(returnInput);
            break;
        default:
            System.out.println("You enter wrong input");
            break;
        }
    }
}
