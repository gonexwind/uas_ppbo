package soal_tiga;

import java.util.List;

class Pembeli extends AlatKantor {
    String nama;
    List<Barang> beli;
    int bayar;

    Pembeli(String nama,
            List<Barang> beli,
            int bayar) {
        super();
        this.nama = nama;
        this.beli = beli;
        this.bayar = bayar;
    }

    void kembalian() {
        int totalBayar = 0;
        for (Barang barang : beli) {
            totalBayar += barang.getHarga();
        }
        int kembalian = this.bayar - totalBayar;

        System.out.println("Kembalian: Rp. " + kembalian);
    }

    void belanjaan() {
        System.out.println("Barang yang sudah dibeli : ");
        for (Barang barang : beli) {
            System.out.println(barang.getNama());
        }
    }
}
