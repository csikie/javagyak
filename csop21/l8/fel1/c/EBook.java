//                 extends Object
public class EBook extends Book {
    private int fileSize;
    
    public EBook(String name, String author, int page, int fileSize) {
        super(name, author, page);
        this.fileSize = fileSize;
    }

    public int getPrice() {
        return page+fileSize;
    }

    @Override
    public String createReferenc(String article, int from, int to) {
        return toString() + "(" + fileSize + ")" + " [" + from + "-" + to + "] referenced in article: " + article;
    }

    //Compile error if write @Override!!!!!!
    public String createReferenc(String article, String date) {
        return toString() +  "(PDF size:" + fileSize + ")" + "referenced in article: " + article + ", accessing PDF date:" +  date;
    }
}
