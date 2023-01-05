public class Book {

    @Fielder(params = "Book - name annotation")
    private String name;
    @Fielder(params = "Book - author annotation")
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String name() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public String author() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public int year() {
        return year;
    }

    public Book setYear(int year) {
        this.year = year;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
