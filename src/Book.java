/*
Create a Book class for a library system.
Instance variable: title, author, isbn.
Static variable: totalBooks, a counter for the total number of book Instances.
Instance methods: borrowBook(), returnBook().
Static method: getTotalBook(), to get the total number of books in the library.
*/


public class Book {
    String author;
    String title;
    String isbn;
    static int totalNoBooks;
    boolean isBorrowed;

    static {
        totalNoBooks = 0;
    }
    {
        totalNoBooks++;
    }

    Book(String isbn, String author, String title) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNoBooks(){
        return totalNoBooks;
    }

    void borrowBook(){
        if (isBorrowed){
            System.out.println("This Book is already borrowed");
        } else{
            this.isBorrowed=true;
            System.out.println("Enjoy the book");
        }

    }

    void returnBook(){
        if (isBorrowed){
            this.isBorrowed=false;
            System.out.println("Hope you enjoyed, please give a review");
        } else{
            System.out.println("This book already in library");
        }
    }

    public static void main(String[] args) {
        Book designThings = new Book("1", "Author", "Design");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoBooks());
        designThings.borrowBook();
        myBook.borrowBook();
        designThings.borrowBook();
        designThings.returnBook();
        designThings.returnBook();
    }

}

