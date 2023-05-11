public class Main {
    public static void main(String[] args) {
        Book b = new Book();
        Book b2 = new Book("Harry Potter", "J. K. Rowling", 500);
        
        // System.out.println(b.getShortName());
        // System.out.println(b2.getShortName());

        PrintedBook pb = new PrintedBook();
        EBook eb = new EBook("Harry Potter", "J. K. Rowling", 500, 1000);
        
        // System.out.println(pb);
        // System.out.println(pb.getPrice());
        // System.out.println(eb.getShortName());
        // System.out.println(eb.getPrice());
        // System.out.println(eb.createReferenc("a", "2023"));
        // System.out.println(eb.createReferenc("b", 100, 200));

        Article a = new Article("Title", "Body", "Conclusion");
        a.addBookToReferences(b);   // LSP
        a.addBookToReferences(b2);  // LSP
        a.addBookToReferences(pb);  // LSP
        a.addBookToReferences(eb); // LSP

        a.print("out.txt");
    }
}
