class F {
  // cozume gecmeden class (sinif) hakkinda ufak bi bilgilendirme geceyim
  // eger class'in public ise o zaman class ismin dosya isminle ayni olmak zorunda (dosya ismin Selam.java ise public class Selam yazmalisin)
  // ancak eger class'in public degilse dosya ismi ne olursa olsun istedigin ismi verebilirsin. ancak genelde dosya ile ayni ismi class'a vermek sagliklidir
  // ayrica her bir dosyada yalnizca bir tane public class olabilir,
  // eger sinif ismin public olursa o sinifa her yerden erisilebilir, public olmazsa yalnizca ayni package icinden erisilebilir
  
  static int f(int n) { // long da diyebilirdik buyuk sayilari hesaplayabilmesi icin. girdi verirken abartma :D
    return n < 2 ? 1 : n * f(n-1);
    // bak burada ne oldugunu hayal et. verilen her n icin biz n * (n-1) * (n-2) * ... 1 hesapliyoruz ya.
    // iste burada diyorum ki n 2'den kucuk olana kadar (yani 1'e gelene kadar) n ile f(n-1)'i carp.
    // adim adim gel deneyelim:
    // f(5) = 5 * f(4)
    // f(4) = 4 * f(3)
    // f(3) = 3 * f(2)
    // f(2) = 2 * f(1)
    // f(1) = 1
    // sonuc = 5 * 4 * 3 * 2 * 1
    //
    // bir de fonksiyon niye static dersen. main fonksiyonumuz static oldugu icin main'den cagirilan fonksiyonlarin hepsi static olmali...
    // umarim anlamissindir :)
  }

  public static void main(String[] args) {
    System.out.println(f(5));
  }
}
