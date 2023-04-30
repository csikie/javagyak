public class Main {
    public static void main(String[] args) {
        Book b = new Book();
        Book b2 = new Book("Harry Potter", "J. K. Rowling", 500);

        System.out.println(b.getShortName());
        System.out.println(b2.getShortName());

        PrintedBook pb = new PrintedBook();
        EBook eb = new EBook("Harry Potter", "J. K. Rowling", 500, 100);

        System.out.println(pb.getShortName());
        System.out.println(pb.getPrice());

        System.out.println(eb.getShortName());
        System.out.println(eb.getPrice());

        System.out.println(pb.createReference("pb", 1, 50));
        System.out.println(eb.createReference("eb", 1, 50));
        System.out.println(eb.createReference("eb", "2023"));

    }
}
