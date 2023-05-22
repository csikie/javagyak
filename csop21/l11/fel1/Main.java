public class Main {
    public static void main(String[] args) {
        PrintedBook pb = new PrintedBook();
        EBook eb = new EBook("Harry Potter", "J. K. Rowling", 500, 1000);
        
        System.out.println(pb);
        System.out.println(pb.getPrice());
        System.out.println(eb.getShortName());
        System.out.println(eb.getPrice());
        System.out.println(eb.createReferenc("a", "2023"));
        System.out.println(eb.createReferenc("b", 100, 200));
    }    
}
