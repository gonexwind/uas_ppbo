package soal_dua;

import java.util.List;

class Anggota extends Buku {
    private String kode;
    private String nama;
    private Buku pinjamBuku;
    private List<Buku> pinjamBukuBanyak;

    Anggota(String kode, String nama, List<Buku> pinjamBukuBanyak) {
        super();
        this.kode = kode;
        this.nama = nama;
        this.pinjamBukuBanyak = pinjamBukuBanyak;
    }

    Anggota(String kode, String nama, Buku pinjamBuku) {
        super();
        this.kode = kode;
        this.nama = nama;
        this.pinjamBuku = pinjamBuku;
    }


    void getInfo() {
        System.out.println("===========================");
        System.out.println("Informasi Anggota:");
        System.out.println("Kode Anggota : " + this.kode);
        System.out.println("Nama Anggota : " + this.nama);
        System.out.println("Buku yang dipinjam : ");
        pinjamBuku.getJudul();
    }

    void getInfos() {
        System.out.println("===========================");
        System.out.println("Informasi Anggota:");
        System.out.println("Kode Anggota : " + this.kode);
        System.out.println("Nama Anggota : " + this.nama);
        System.out.println("Buku yang dipinjam : ");
        for (Buku buku : pinjamBukuBanyak) {
            buku.getJudul();
        }
    }
}
