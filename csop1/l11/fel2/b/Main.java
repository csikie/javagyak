public class Main {
    public static void foo(Printable p) {
        p.print();
    }

    public static void main(String[] args) {
        ReverseablePoint p = new ReverseablePoint(2, 3);
        System.out.println(p);
        p.setX(3);
        p.setY(4);
        System.out.println(p);
        p.reverse();
        System.out.println(p);
        
        Book b = new Book();
        PrintablePoint p2 = new PrintablePoint(0, 0);
        foo(b);
        foo(p2);
    }
}
