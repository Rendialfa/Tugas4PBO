public class BankSystem {
    public static void main(String[] args) {
        // Soal 1
        Rekening r1 = new Rekening("Alice", "12345", 500000);
        r1.setor(100000);
        r1.tarik(200000);
        r1.tampilkanInfo();

        // Soal 2
        Tabungan t1 = new Tabungan("Bob", "67890", 1000000, 5);
        t1.tampilkanInfo();
        System.out.println("Bunga untuk 6 bulan: " + t1.hitungBunga(6));

        Giro g1 = new Giro("Charlie", "11223", 200000, 50000);
        g1.tarik(230000);
        g1.tampilkanInfo();

        // Soal 3
        RekeningOverloaded ro = new RekeningOverloaded("David", "33445", 300000);
        ro.setor(50000, true);
        ro.tampilkanInfo();
    }
}
