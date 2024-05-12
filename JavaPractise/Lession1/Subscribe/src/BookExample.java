
public class BookExample {
    String title;
    String author;
    String isbn;
    static int totalBooks;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    {
        //Whenever a new object of BookExample is created
        totalBooks++;
    }
    BookExample(String isbn, String author, String title){
             this.title = title;
             this.author = author;
             this.isbn = isbn;
    }

    //Minimum one param is required for a constructor
    BookExample(String isbn){
        this(isbn,"Unknown","Unknown");
    }

    public static int getTotalBooks(){
        return totalBooks;
    }

    public void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed " + this.title);
        }else {
            this.isBorrowed= true;
            System.out.println("Enjoy the book :" + this.title);
        }
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Thank you for returning " + this.title);
        }else{
            System.out.println("Already available! " + this.title);
        }
    }

    public static void main(String[] args) {
        BookExample myBook = new BookExample("1","Pablo","Wings of Fire");
        BookExample bookDiff = new BookExample("2");
        System.out.println(BookExample.getTotalBooks());
        myBook.borrowBook();
        bookDiff.borrowBook();
        myBook.borrowBook();
        myBook.returnBook();
        myBook.returnBook();
        bookDiff.borrowBook();
    }
}
