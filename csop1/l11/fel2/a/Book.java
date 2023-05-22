public class Book implements Printable {
    private String name;
    private String author;
    protected int page;

    public Book() {
        this.author = "John Steinbeck";
        this.name = "Of Mice and Men";
        this.page = 107;
    }

    public Book(String name, String author, int page) {
        if (name.length() < 2 || author.length() < 4) {
            throw new IllegalArgumentException("Incorrect params.");
        }

        this.author = author;
        this.name = name;
        this.page = page;
    }

    public void print() {
        System.out.println(author + ": " + name + " (" + page + ")");
    }
}
