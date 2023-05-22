public class ReverseablePoint implements Reverseable {
    int x, y, prev_x, prev_y;
    
    public ReverseablePoint(int x, int y) {
        this.x = prev_x =  x;
        this.y = prev_y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) {
        prev_x = this.x;
        this.x = x;
    }

    public void setY(int y) {
        prev_y = this.y;
        this.y = y;
    }

    public void reverse() {
        x = prev_x;
        y = prev_y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
