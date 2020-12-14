package soal_tiga;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Barang kertas = new AlatKantor("HVS SIDU 70 gram", 1, 45000);
        Barang tinta = new AlatKantor("Tinta Toner Blue Print", 1, 165000);
        Barang printer = new AlatKantor("Canon MP237", 1, 1250000);
        Barang pulpen = new AlatKantor("Pilot", 1, 35000);

        List<Barang> belanja = new ArrayList<>();
        belanja.add(kertas);
        belanja.add(tinta);
        belanja.add(printer);
        belanja.add(pulpen);

        Pembeli pakAli = new Pembeli("Pak Ali", belanja, 2250000);
        pakAli.kembalian();
        pakAli.belanjaan();

    }
}
