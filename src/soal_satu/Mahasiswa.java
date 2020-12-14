package soal_satu;

// 201851136 - Fikky Ardianto
class Mahasiswa {
    private String nama;
    private MataKuliah mataKuliah;

    Mahasiswa(String nama, MataKuliah mataKuliah) {
        this.nama = nama;
        this.mataKuliah = mataKuliah;
    }

    void getInfo() {
        System.out.println("Nama Mahasiswa: " + this.nama);
        this.mataKuliah.getInfo();
    }
}
