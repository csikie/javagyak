import java.io.PrintWriter;
import java.util.ArrayList;

public class Article {
    private String title, body, conclusion;
    private PrintWriter pw;
    private ArrayList<Book> refs;

    public Article(String title, String body, String conclusion) {
        this.title = title;
        this.body = body;
        this.conclusion = conclusion;
        refs = new ArrayList<>();
    }

    public void addBookToReferences(Book b) {
        refs.add(b); // LSP
    }

    public void print(String fileName) {
        try {
            pw = new PrintWriter(fileName);

            pw.println(title);
            pw.println(body);
            pw.println(conclusion);

            for (Book b : refs) {
                printReference(b, title, 1, b.getPages());
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            pw.close();
        }
    }

    private void printReference(Book b, String title, int from, int to) {
        String ref = b.createReferenc(title, from, to);
        pw.println(ref);
    }
}
