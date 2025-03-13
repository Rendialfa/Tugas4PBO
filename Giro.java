class Giro extends Rekening {
    private double limitPenarikan;

    public Giro(String namaPemilik, String nomorRekening, double saldo, double limitPenarikan) {
        super(namaPemilik, nomorRekening, saldo);
        this.limitPenarikan = limitPenarikan;
    }

    @Override
    public void tarik(double jumlah) {
        if (jumlah <= saldo + limitPenarikan) {
            saldo -= jumlah;
            if (saldo < -limitPenarikan) {
                saldo = -limitPenarikan; // Pastikan saldo tidak kurang dari batas limit
            }
            System.out.println("Tarik tunai dari Giro: " + jumlah);
        } else {
            System.out.println("Melebihi batas penarikan Giro!");
        }
    }
}