class M {
    static int m(int[] a, int i) {
        return i == a.length - 1 ? a[i] : Math.max(a[i], m(a, i + 1));
        // bak burada mantik soyle oluyor. 0'inci elemandan baslayarak sunu soruyor
        // "ben mi daha buyugum, sagimda kalan sayilarin en buyugu mu daha buyuk"
        // yani diyoruz ki i son indexe esit olmadigi surece beni sagimda kalan sayilarin maksimumu ile karsilastir
        // anlamasi biraz guc olabilir adim adim gidelim
        //
        //oncelikle elimizdeki dizi 3, 7, 2, 9, 1 tm mi?
        //
        // Adim 0 - m([3,7,2,9,1], 0)
        // i=0, son eleman değil
        // Math.max(3, m(a,1)) --> simdi burada duruyor ve 3 diyor ki hmm ben mi daha buyugum yoksa sagimda kalan bu elemanlarin en buyugu mu daha buyuk
        //
        // Adim 1 - m([3,7,2,9,1], 1)      iste simdi 3'un saginda kalan elemanlarin maksimumunu hesapliyrouz (yani 1inci elemandan baslayarak)
        // i=1, son eleman değil
        // Math.max(7, m(a,2)) --> simdi de 7 durup diyor ki hmm acaba ben mi buyugum yoksa benim sagimdaki elemanlarin en buyugu mu buyuk. bilmiyorum. sagimdakine sorayim.
        //
        // Adim 2 - m([3,7,2,9,1], 2)
        // i=2, son eleman değil
        // Math.max(2, m(a,3)) --> simdi de 2 aynisini diyor sagimdakilere sorayim onlarin en buyugu kim diye
        //
        // Adim 3 - m([3,7,2,9,1], 3)
        // i=3, son eleman değil
        // Math.max(9, m(a,4))
        //
        // Adim 4 - m([3,7,2,9,1], 4)
        // i=4, SON ELEMAN! (length-1 = 4)
        // return 1
        //
        // AHA simdi bak son elemana geldik ya. simdi son elemana geldigimiz icin adimlari geri geri gidicez. cunku hatirlarsan hepsi sagindakine "knk en buyuk eleman hangisi soyleyiver" demisti
        // simdi sondan basa dogru gidecek
        //
        // return 1 dedik daha sonra max(9, 1) = 9 o zaman return 9
        // sonra max(9,2) = 9 o zaman return 9
        // sonra max(9, 7) = 9 o zaman return 9
        // sonra max(9, 3) = 9 o zaman return 9
        //
        // boylece dizinin en buyugu 9 oldugu icin boyu en uzun olan oymus bu yuzden twt fenomeni busesu ile o date'e cikacakmis :(
    }
    
    static int m(int[] a) {
        return m(a, 0);
    }
    
    public static void main(String[] a) {
        System.out.println(m(new int[]{3, 7, 2, 9, 1}));
    }
}
