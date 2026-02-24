class P {
  static boolean p(String s, int l, int r) {
    return l >= r ? true : s.charAt(l) != s.charAt(r) ? false : p(s, l + 1, r-1);
  }

  // simdi yukaridaki algoritma two pointer algorithm diye geciyor. karmasik gelebilir ama mantik surada.
  // bir string mesela "kayak" olsun. ilk harfine bir de son harfine bir adam yerlestirdigini dusun
  // bu adamlar birbirleriyle ayni karaktere gelene kadar biri saga dogru biri sola dogru yuruyor
  // ve her adimda kendilerine su soru soruluyor. sen ve diger adamimin ustunde durdugu harf ayni mi
  // ayni degilse bu palindrom olamaz false dondur, eger ayniysa diyorsun ki biriniz bir adim saga digeriniz bir adim sola gidin
  // yani ilk baslangicta : ILK VE SON karakterler ayni mi bakiyorsun
  // daha sonra bastan ikinci ve sondan ikinci ayni mi diye bakiyorsun...
  // ta ki bu ikisi cakisana kadar (ortaya gelene kadar) mesela 5 karakterli bir string icin x x X x x tam ortada cakisirlar
  // 5 karakterli bir tane icin x x X X x x bu buyuk X leri kontrol ettikten sonra l > r oldugu icin direkt true diyor yani palindrom bu, her adimda ikimiz de ayni karakteri okuduk diyor

  static boolean p(String s) { // method overloading yapiyorsun burada, yukaridaki metot ile bunun ismi ayni. ama tek fark buna sadece string geliyor oburune baslangic bitis pozisyonlari geliyor
    return p(s.toLowerCase(), 0, s.length() - 1); // burada s.length() - 1 cok onemli cunku indexler 0dan basliyor unutma yoksa hata alirsin
  }

  public static void main(String[] args) {
    System.out.println(p("Kayak"));
    System.out.println(p("Ahmet"));
  }
}
