// Q51. Create a Book class for a library system
//     • Instance variables: title, author, isbn.
//     • Static variable: totalBooks, a counter for the total number of book instances.
//     • Instance methods: borrowBook(), returnBook().
//     • Static method: getTotalBooks(), to get the total number of books in the library.

public class QBook51 {

    static int totalBooks;
    String title;
    String author;
    int id;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    QBook51(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    static int getTotalBooks() {
        return totalBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.print("\nBook is Already Borrowed");
        } else {
            isBorrowed = true;
            System.out.print("\nEnjoy the BOOK !");
        }
    }

    void returnBook() {
        if (!(isBorrowed)) {
            System.out.print("\nBook is not Borrowed yet");
        } else {
            isBorrowed = false;
            System.out.print("\nThanks for Returnning ;)");
        }
    }

    public static void main(String[] args) {
        QBook51 b1 = new QBook51("Atomic Habit", "James Clear", 1);
        b1.borrowBook();
        b1.returnBook();
    }
}
