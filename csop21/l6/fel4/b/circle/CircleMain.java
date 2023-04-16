

package circle;

import java.io.FileNotFoundException;
import java.io.IOException;

import circle.utils.Point;


public class CircleMain
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(2, 3, 10);
        System.out.println(c1);

        c1.enlarge(3);
        System.out.println(c1);
        c1.enlarge(2);
        System.out.println("c1's radius is " + c1.getRadius());

        try
        {
            c1.saveToFile("copy1.txt");
        }
        catch (FileNotFoundException e)
        {
            System.err.println("Error: Unable to write file, " + e);
        }

        Circle c2 = Circle.readFromFile("in.txt");
        System.out.println(c2);

        Circle c3 = Circle.readFromFile("in.txt.nonexist");
        System.out.println(c3);
    }
}

