//1.5.1
public class Book {
    String title;
    String author;
    String genre;
    int pageCount;
    int ISBN;

    Book(String title, String author, String genre, int pageCount, int ISBN) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pageCount = pageCount;
        this.ISBN = ISBN;
    }

    String Read(String name) {
        String greeting  = "Greetings " + name + "!";
        String content = this.title + " by " + this.author + " is an amazing " + this.genre + "book.";
        return greeting + content;
    }

}
