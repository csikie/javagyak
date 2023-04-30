//                      extends java.lang.Object
public class PrintedBook extends Book {
    private CoverType cover;

    public PrintedBook() {
        super();  // this()
        this.cover = CoverType.Harcover;
        this.page += 6;
    }

    public PrintedBook(String name, String author, int page, CoverType cover) {
        super(name, author, page+6);  // this()
        this.cover = cover;
    }

    public int getPrice() {
        // if (cover == CoverType.Harcover) {
        //     return page * 3;
        // }

        // return page * 2;

        return CoverType.Harcover == cover ? page * 3 : page * 2;
    }
}
