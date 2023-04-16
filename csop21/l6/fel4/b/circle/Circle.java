

package circle;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

import circle.utils.Point;


public class Circle
{
    private double x = 0;
    private double y = 0;
    private double radius = 1;

    public Circle(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        if (radius <= 0)
        {
            // throw new IllegalArgumentException("Circle setRadius(): radius is negative");
            // vagy System.exit(1);
            radius = 1;
            // etc . . . 
        }
        this.radius = radius;
    }

    public static Circle readFromFile(String filename)
    {
        File input = new File(filename);
        BufferedReader bf = null;
        Circle result = null;

        try
        {
            bf = new BufferedReader(new FileReader(input));
            //System.err.println("Successfully opened file: " + filename);

            double x = Double.parseDouble(bf.readLine());
            double y = Double.parseDouble(bf.readLine());
            double radius = Double.parseDouble(bf.readLine());

            result = new Circle(x, y, radius);

            bf.close();
        }
        catch (IOException | NumberFormatException e)
        {
            result = new Circle(0, 0, 1);
        }
        return result;
    }

    public void saveToFile(String filename) throws FileNotFoundException
    {
        File output = new File(filename);

        try (PrintWriter pw = new PrintWriter(output))
        {
            pw.println(x);
            pw.println(y);
            pw.println(radius);
        }
    }

    public void enlarge(double f)
    {
        radius *= f;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public String toString()
    {
        return "(" + x + "," + y + "), r = " + radius;
    }
}

