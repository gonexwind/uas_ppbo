package soal_dua;

class Petugas {
    private String kode;
    private String nama;

    Petugas(String kode, String nama) {
        super();
        this.kode = kode;
        this.nama = nama;
    }

    Petugas() {

    }

    void getInfo() {
        System.out.println("===========================");
        System.out.println("Informasi Petugas:");
        System.out.println("Kode Petugas : " + this.kode);
        System.out.println("Nama Petugas : " + this.nama);
    }
}
