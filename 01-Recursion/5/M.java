class M {
    static boolean s(int[][] m, int r, int c) {
        // bu algoritmayi anlamak icin temel mantik su. su an yazdigim metot sunu yapiyor:
        // su an bulundugum koordinattan (r, c) saga, sola, yukari veya asagi gidersem CIKISA ULASMIS oluyor muyum ??? 
        // eger verilen r ve c (row ve coloumn) koordinati icin 4 yonden birine gidip cikabiliyorsam true donduruyor, yoksa false donduruyor

        if (r < 0 || r >= m.length || c < 0 || c >= m[0].length) return false; // kontrol ettigim r ve c koordinat disinda bi yer mi? oyleyse direkt false (sinirlardeyken yanlislikla labirent disina tasabilir kontrolumuz)
        if (m[r][c] != 0) return false; // kontrol ettigim yer 0 (yani yurunebilir yol mu) yoksa 1 mi (duvar mi). duvarsa zaten o koordinata ulasamam duvar var o yuzden false
        if (r == m.length - 1 && c == m[0].length - 1) return true; // r ve c son indis mi? cikisa ulastim mi? ulastiysam true dondur.
        m[r][c] = 2; // eger bu r, c kordinatini ZATEN kontrol ettiysem 2 yazdiriyorum ki yine burayi kontrol etmeyek
        return s(m, r + 1, c) || s(m, r, c + 1) || s(m, r - 1, c) || s(m, r, c - 1); // burada da sagi solu yukariyi asagiyi deniyor tek tek cikis var mi diye
        

        // simdi burada kafani karistirabilir nasil isledigi bu koddaki ornekten degil daha basit bir ornek ile anlatayim
        // 
        // labirent:
        // 0 1 0
        // 0 0 0
        // 0 0 0
        //
        // s (0, 0) yani ust soldan basliyoruz
        // 0, 0 labirentin icinde mi (tasma var mi)? yok. guzel.
        // 0, 0 = 0 mi? yani burasi yurunebilir yol mu duvar mi? yurunebilir yol. guzel.
        // 0, 0 cikis mi? yok hayir cikisimiz sag asagisi...
        // o zaman burayi 2 olarak isaretle once
        //
        // labirent:
        // 2 1 0
        // 0 0 0
        // 0 0 0
        //
        // ve simdi 4 yonu (asagi, sag, sol, yukari) dene:
        //
        // s(1,0) a geldik yani 1 indexli (2inci) satir ve 0inci index sutun
        //
        // 2 1 0
        // X 0 0
        // 0 0 0
        //
        // (yani X yazdigim yerdeyiz simdi burayi kontrol ediyoruz)
        //
        // yine ayni kontroller, labirent icinde mi evet, yurunebilir yer mi evet, cikis mi hayir. o zaman burayi da 2 yap sonrakine yuru
        //
        // labirent:
        // 2 1 0
        // 2 0 0
        // X 0 0
        //
        // yine ayni kontroller, labirent icinde mi evet, yurunebilir yer mi evet, cikis mi hayir. o zaman burayi da 2 yap sonrakine yuru
        //
        // AMAAAAAA bir asagi daha indigi zaman
        //
        // 2 1 0
        // 2 0 0
        // 2 0 0
        // X _ _ --> HOOOOOP iste simdi LABIRENT DISINDAYIZ. (yazdigimiz kontrolu hatirla) o yuzden direkt false donduruyor bu. onceki adima geri donuyoruz
        //
        // ve bu sefer asagi inmek yerine saga gidiyoruz:
        //
        // 2 1 0
        // 2 0 0
        // 2 X 0
        //
        // anladin mi bu sefer saga gidiyoz. eger sag da olmasaydi bu sefer solu denicektik. o da olmazsa yukariyi deneyecektik. 
        //
        // sonraki adim:
        //
        // 2 1 0
        // 2 0 0
        // 2 2 X 
        //
        // ve labirent cozuldu!!!!!
        //
        // yani labirent ne kadar buyuk olursa olsun belki 4 adim sonra sikissa da onceki adima donup orayi da deniyor, o olmazsa ondan oncekine gidip farkli yolu deniyor...
        // taaa ki hepsini deneyene kadar. en sonda cozum yoksa yok diyor ztn
        //
    }
    
    public static void main(String[] a) {
        int[][] b = {
            {0, 1, 0, 0, 0},
            {0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 1, 1, 0}
        };
        System.out.println(s(b, 0, 0));
    }
}
