public class bookMain {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Brave New World", "Aldous Huxley", 260, 1932);
        Book book2 = new Book("War and Peace", "Lev Tolstoy", 1400, 1869);
        library.addBook(book1);
        library.addBook(book2);
        System.out.println();
        System.out.println("Books In This Library");
        library.listBooks();
        System.out.println();
        System.out.println("Trying to add "+ book2.title);
        library.addBook(book2);

    }
}
