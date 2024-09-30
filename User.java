import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;

public class User {
    private String name;
    private int age;
    private ArrayList<String> borrowedBooks;
    private Map<String, LocalDate> borrowedBooksDueDates;

    // Constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
        this.borrowedBooksDueDates = new HashMap<>();
    }

    // Getter and setter methods for name and age
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to borrow a book and set a due date
    public void borrowBook(String bookTitle) {
        if (!borrowedBooks.contains(bookTitle)) {
            borrowedBooks.add(bookTitle);
            LocalDate dueDate = LocalDate.now().plusDays(14);
            borrowedBooksDueDates.put(bookTitle, dueDate);
            System.out.println(name + " borrowed " + bookTitle + ". Due date: " + dueDate);
        } else {
            System.out.println(bookTitle + " is already borrowed by " + name);
        }
    }

    // Method to return a book
    public void returnBook(String bookTitle) {
        if (borrowedBooks.contains(bookTitle)) {
            borrowedBooks.remove(bookTitle);
            borrowedBooksDueDates.remove(bookTitle);
            System.out.println(name + " returned " + bookTitle);
        } else {
            System.out.println(name + " did not borrow " + bookTitle);
        }
    }

    // Method to print all borrowed books
    public void printBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " has not borrowed any books.");
        } else {
            System.out.println(name + "'s borrowed Books: " + borrowedBooks);
        }
    }

    // Check due dates for borrowed books
    public void checkDueDates() {
        System.out.println(name + "'s Due Dates:");
        for (String book : borrowedBooks) {
            System.out.println("Book: " + book + ", Due Date: " + borrowedBooksDueDates.get(book));
        }
    }

    // Check for overdue books
    public void checkOverdueBooks() {
        System.out.println(name + "'s Overdue Books:");
        LocalDate currentDate = LocalDate.now();
        for (String book : borrowedBooks) {
            LocalDate dueDate = borrowedBooksDueDates.get(book);
            if (currentDate.isAfter(dueDate)) {
                long daysOverdue = java.time.temporal.ChronoUnit.DAYS.between(dueDate, currentDate);
                System.out.println("Book: " + book + " is overdue by " + daysOverdue + " days.");
            }
        }
    }
}
