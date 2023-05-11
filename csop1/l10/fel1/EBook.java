public class EBook extends Book {
    private int fileSize;

    public EBook(String name, String author, int page, int fileSize) {
        super(name, author, page);
        this.fileSize = fileSize;
    }

    public int getPrice() {
        return page + fileSize;
    }

    @Override
    public String createReference(String article, int from, int to) {
        return super.toString() + "(PDFSize: " + fileSize + ") [" + from + "-" + to + "] referenced in article: " + article;
    }

    //@Override -> compile errort
    public String createReference(String article, String date) {
        return super.toString() + "(PDFSize: " + fileSize + ") referenced in article: " + article+ ", accessing PDF date: " + date;
    }
}
