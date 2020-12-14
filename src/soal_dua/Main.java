package soal_dua;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Buku markesotBelajarNgaji = new Buku("Markesot Belajar Ngaji", "Emha Ainun Nadjib", 2019, "Penerbit Bentang", "Sosial Budaya");
        markesotBelajarNgaji.getInfo();

        Buku senjaDanPagi = new Buku("Senja dan Pagi", "Alffy Rev dan Linka Angelia", 2019, "Loveable x Bhumi Anoma", "Novel");
        senjaDanPagi.getInfo();

        Anggota ardianto = new Anggota("A02", "Ardianto", senjaDanPagi);
        ardianto.getInfo();

        Petugas jisoo = new Petugas("P01", "Kim Jisoo");
        jisoo.getInfo();

        List<Buku> pinjam = new ArrayList<>();
        pinjam.add(senjaDanPagi);
        pinjam.add(markesotBelajarNgaji);

        Anggota fikky = new Anggota("A01", "Fikky", pinjam);
        fikky.getInfos();
    }
}
