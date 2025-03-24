import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            book.getBookInfo();
            book.getTitle();
        }
        else{
            System.out.println("Book already exists");
        }

    }

    public void listBooks() {
        if(books.isEmpty()) {
            System.out.println("No books found");
        }
        else{
            for (Book book : books) {
                System.out.println(book.upperCaseTitle() +" " + book.upperCaseAuthor());
            }
        }
    }
}
