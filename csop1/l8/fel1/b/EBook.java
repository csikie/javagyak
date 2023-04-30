public class EBook extends Book {
    private int fileSize;

    public EBook(String name, String author, int page, int fileSize) {
        super(name, author, page);
        this.fileSize = fileSize;
    }

    public int getPrice() {
        return page + fileSize;
    }
}
