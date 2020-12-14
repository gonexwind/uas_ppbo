package soal_satu;

class MataKuliah {
    private String mataKuliah;
    private String kode;
    private int sks;

    MataKuliah(String mataKuliah, String kode, int sks) {
        this.mataKuliah = mataKuliah;
        this.kode = kode;
        this.sks = sks;
    }

    void getInfo() {
        System.out.println("Mata Kuliah: " + this.mataKuliah);
        System.out.println("Kode Mata Kuliah: " + this.kode);
        System.out.println("SKS: " + this.sks);
    }

}
