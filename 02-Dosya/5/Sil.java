import java.io.File;

public class Sil {
    public static void main(String[] a) {
        File f = new File("not.txt");
        
        if (f.exists()) {
            if (f.delete()) {
                System.out.println("Silindi.");
            } else {
                System.out.println("Silinemedi.");
            }
        } else {
            System.out.println("Dosya yok.");
        }
    }
}
