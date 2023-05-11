import java.io.PrintWriter;
import java.util.ArrayList;

public class Article {
    String title, body, conclusion;
    PrintWriter pw;
    ArrayList<Book> refs;

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
                printBookReference(b);
            }
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            pw.close();
        }
    }

    private void printBookReference(Book b) {
        String ref = b.createReference(title, 1, b.getPages());
        pw.println(ref);
    }
}
