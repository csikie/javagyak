

package circle;

import java.io.FileNotFoundException;
import java.io.IOException;

import circle.utils.Point;


public class CircleMain2
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        Circle c1 = new Circle(2, 3, 10);
        System.out.println(c1);

        c1.enlarge(3);
        System.out.println(c1);
        c1.enlarge(2);
        System.out.println("c1's radius is " + c1.getRadius());

        Circle c2 = null;

        //c1.saveToFile("");
        c1.saveToFile("copy1.txt");
        //c1.saveToFile("copy2.txt");
        //c1.saveToFile("copy3.txt");

        c2 = Circle.readFromFile("in.txt");
        //c2 = Circle.readFromFile("in.txt.nonexist");

        System.out.println(c2);
    }
}

