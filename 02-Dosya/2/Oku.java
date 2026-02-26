import java.io.FileReader; // writer yerine reader
import java.io.IOException;

class Oku {
    public static void main(String[] a) {
        try {
            FileReader r = new FileReader("not.txt"); // acmaya calis
            int c;
            while ((c = r.read()) != -1) {
              // buradaki ince detay su r.read() her zaman ascii donduruoyr
              // ornek olarak ABC yaziyorsa dosya icinde
              // r.read() → 65  ('A')
              // r.read() → 66  ('B')
              // r.read() → 67  ('C')
              // r.read() → -1  (dosya bitti!) cunku EOF yani dosya sonuna geliyorsun
              // bu nedenle while loop icinde -1 donene kadar oku diyorsuz

                System.out.print((char) c); // ascii kodu dondurdugu icin bunu char a cast et
            }
            r.close();
        } catch (IOException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
