interface PrintableAndReverseable extends Printable, Reverseable {

}

public class PrintableAndReverseablePoint extends ReverseablePoint implements Printable {
    public PrintableAndReverseablePoint(int x, int y) {
        super(x, y);
    }

    public void print() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
