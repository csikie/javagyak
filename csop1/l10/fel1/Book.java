public class Book {
    private String name;
    private String author;
    protected int page;

    public Book() {
        this.author = "John Steinbeck";
        this.name = "Of Mice and Men";
        this.page = 107;
    }

    public Book(String name, String author, int page) {
        if (name.length() < 4 || author.length() < 2) {
            throw new IllegalArgumentException("Incorrect params");
        }

        this.author = author;
        this.name = name;
        this.page = page;
    }

    public String getShortName() {
        return author.substring(0, 2) + " " + name.substring(0, 4) + " (" + page + ")";
    }

    public int getPages() {
        return page;
    }

    @Override
    public String toString() {
        return author + ": " + name + " (" + page + ")";
    }

    public String createReference(String article, int from, int to) {
        return getShortName() + " [" + from + "-" + to + "] referenced in article: " + article;
    }
}