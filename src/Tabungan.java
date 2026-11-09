public class Tabungan extends Rekening implements BerBunga {
    private double bungaPersen;

    public Tabungan(String nomor, String nama, int saldo, double bungaPersen) {
        super(nomor, nama, saldo);
        this.bungaPersen = bungaPersen;
    }

    @Override
    public int biayaAdminBulanan() {
        // Tabungan gratis kalau saldonya minimal 1.000.000, selain itu Rp5.000
        if (saldo >= 1000000) {
            return 0;
        } else {
            return 5000;
        }
    }

    @Override
    public int tambahBunga() {
        // Bunga dihitung dari saldo sesudah dipotong admin
        int bunga = (int) (saldo * (bungaPersen / 100));
        saldo += bunga;
        return bunga;
    }

    @Override
    public String getNomor() {
        return nomor;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("\tTabungan, bunga " + bungaPersen + "% per bulan");
    }
}