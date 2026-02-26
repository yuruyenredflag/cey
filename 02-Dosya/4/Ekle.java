import java.io.FileWriter;
import java.io.IOException;

public class Ekle {
    public static void main(String[] a) {
        try {
            FileWriter w = new FileWriter("not.txt", true); // true = ekleme modu
            w.write("\nYeni satir eklendi.");
            w.close();
            System.out.println("Eklendi.");
        } catch (IOException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
