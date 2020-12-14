package soal_tiga;

abstract class Barang {
    private String nama;
    private int quantity;
    private int harga;

    Barang(String nama, int quantity, int harga) {
        this.nama = nama;
        this.quantity = quantity;
        this.harga = harga;
    }

    public Barang() {

    }

    public int getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }
}
