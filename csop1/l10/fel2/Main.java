import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();
        try (Scanner sc = new Scanner(new File("in.txt"))) {
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                bag.add(line);
            }

            System.out.println(bag);
            bag.countOf("hello");
            System.out.println(bag);
            bag.remove("hello");
            System.out.println(bag);
            bag.remove("hello");
            System.out.println(bag);
            bag.remove("hello");
            System.out.println(bag);
            bag.remove("hello");
        } catch (FileNotFoundException ex) {
            // Handle exception
        } catch (NotInBagException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
