public class Book {
    String title;
    String author;
    int pageCount;
    int publicationYear;

    public Book(String title, String author, int pageCount, int publicationYear) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.publicationYear = publicationYear;
    }

    public String getBookInfo(){
        System.out.println();
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
        System.out.println("Publication Year: " + publicationYear);
        return title;
    }

    public String upperCaseTitle(){
        return title.toUpperCase();
    }

    public String upperCaseAuthor(){
        return author.toUpperCase();
    }

    public String getTitle(){
        return title;
    }
}
