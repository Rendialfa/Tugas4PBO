class RekeningOverloaded extends Rekening {
    public RekeningOverloaded(String namaPemilik, String nomorRekening, double saldo) {
        super(namaPemilik, nomorRekening, saldo);
    }

    public void setor(double jumlah, boolean transfer) {
        if (transfer) {
            double biayaAdmin = 2500;
            saldo += (jumlah - biayaAdmin);
            System.out.println("Setor melalui transfer: " + jumlah + " (Biaya admin: " + biayaAdmin + ")");
        } else {
            setor(jumlah);
        }
    }
}