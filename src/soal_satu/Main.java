package soal_satu;

public class Main {
    public static void main(String[] args) {
        // 201851136 - Fikky Ardianto
        MataKuliah ppbo = new MataKuliah("Praktikum Pemrograman Berorientasi Objek", "MTI504", 2);
        Mahasiswa amanda = new Mahasiswa("Amanda Manopo", ppbo);

        amanda.getInfo();
    }
}
