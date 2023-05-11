import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();
        
        try (Scanner sc = new Scanner(new File("input.txt"))) {
            while (sc.hasNext()) {
                String elem = sc.nextLine();
                bag.add(elem);
            }

            System.out.println(bag);
            System.out.println(bag.countOf("hello"));
            bag.remove("hello");
            bag.remove("hello");
            bag.remove("hello");

            bag.remove("hello");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (NotInBagException ex) {
            System.out.println(ex.getMessage());
        } 
    }
}
