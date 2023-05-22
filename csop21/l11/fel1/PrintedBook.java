public class PrintedBook extends Book {
    private CoverType cover;

    public PrintedBook() {
        super();
        super.page += 6;
        this.cover = CoverType.Hardcover;
    }

    public PrintedBook(String name, String author, int page, CoverType cover) {
        super(name, author, page);
        this.cover = cover;
    }

    public int getPrice() {
        if (cover == CoverType.Softcover) {
            return page*2;
        }

        return page*3;
    }

    @Override
    public String toString() {
        return super.toString() + " " + cover;
    }

    @Override
    public String createReferenc(String article, int from, int to) {
        return toString() + " [" + from + "-" + to + "] referenced in article: " + article;
    }
}
