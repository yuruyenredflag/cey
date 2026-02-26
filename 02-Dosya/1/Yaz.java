import java.io.FileWriter; // dosya yazmak icin 
import java.io.IOException; // hata yakalama icin

class Yaz {
  public static void main(String[] args) {
    try { // hata yakalama kismi iste
        FileWriter w = new FileWriter("selamdunya.txt"); // dosya olusturuyoz
        w.write("neeeeeeeeeeeeeeee"); // dosya icerigi simdilik bu kadar
        w.close();
        System.out.println("dosya basarilya yazildi.");
    } catch (IOException e) { // hatayi yakala
        System.out.println("Hata yasandi: " + e.getMessage());
    }
  }
}
