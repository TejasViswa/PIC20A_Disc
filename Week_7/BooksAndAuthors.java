abstract class Book {
    protected String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract void display();
}

class Fiction extends Book {
    private String genre;

    public Fiction(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void display() {
        System.out.println(title + " - " + author + " - " + genre);
    }
}

class NonFiction extends Book {
    private String topic;

    public NonFiction(String title, String author, String topic) {
        super(title, author);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void display() {
        System.out.println(title + " - " + author + " - " + topic);
    }
}

class Author {
    private String name;
    private Book[] books;
    private int numBooks;

    public Author(String name) {
        this.name = name;
        this.books = new Book[10];
        this.numBooks = 0;
    }

    public void addBook(Book book) {
        books[numBooks] = book;
        numBooks++;
    }

    public void displayBooks() {
        System.out.println("Books by " + name + ":");
        for (int i = 0; i < numBooks; i++) {
            books[i].display();
        }
    }
}

public class BooksAndAuthors {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling");

        Fiction fiction1 = new Fiction("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Fantasy");
        NonFiction nonFiction1 = new NonFiction("The Casual Vacancy", "J.K. Rowling", "Politics");

        author.addBook(fiction1);
        author.addBook(nonFiction1);

        author.displayBooks();
    }
}
