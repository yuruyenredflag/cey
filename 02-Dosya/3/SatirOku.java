import java.io.*; // BufferedReader icin bu sefer boyle import ediyoruz

public class SatirOku {
    public static void main(String[] a) {
        try {
            // BufferedReader objesi olusturuyoruz. Unutma icinde FileReader koyuyoruz yine
            BufferedReader b = new BufferedReader(new FileReader("not.txt"));
            String s;
            while ((s = b.readLine()) != null) {
                // BUfferedReader sayesinde oncekinin aksine buffer (yani satirlar) halinde okuyoruz
                System.out.println(s);
            }
            b.close();
        } catch (IOException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
