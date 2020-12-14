package soal_dua;

class Buku extends Petugas {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String penerbit;
    private String kategori;

    Buku(String judul,
         String penulis,
         int tahunTerbit,
         String penerbit,
         String kategori) {
        super();
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
        this.kategori = kategori;
    }

    Buku() {
    }

    void getInfo() {
        System.out.println("===========================");
        System.out.println("Detail Buku:");
        System.out.println("Judul : " + this.judul);
        System.out.println("Penulis : " + this.penulis);
        System.out.println("Tahun Terbit : " + this.tahunTerbit);
        System.out.println("Penerbit : " + this.penerbit);
        System.out.println("Kategori : " + this.kategori);
    }

    void getJudul() {
        System.out.println("Judul : " + this.judul);
    }


}
