public class PrintedBook extends Book {
    private CoverType cover;

    public PrintedBook() {
        super();
        super.page += 6;
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
}
