public class Main {
    public static void main(String[] args) {
        Book b = new Book();
        Book b2 = new Book("Harry Potter", "J. K. Rowling", 500);
        
        System.out.println(b.getShortName());
        System.out.println(b2.getShortName());
    }    
}
