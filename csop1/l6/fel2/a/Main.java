
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

// import java.io.*;


class Main
{
    public static void main(String[] args)
    {
        File input = new File(args[0]);

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(input));

            String line;
            while ((line = br.readLine()) != null)
            {
                String[] parts = line.split(",");

                int sum = 0;
                for (String num : parts)
                {
                    sum += Integer.parseInt(num);
                }
                System.out.println(sum);
            }

            // not the best way to close the BufferedReader
            br.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Unable to access file " + args[0]);
        }
        catch (IOException e)
        {
            System.out.println("IO error");
        }
    }
}
