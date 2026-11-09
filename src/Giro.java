public class Giro extends Rekening {
    private int batasOverdraft;

    public Giro(String nomor, String nama, int saldo, int batasOverdraft) {
        super(nomor, nama, saldo);
        this.batasOverdraft = batasOverdraft;
    }

    @Override
    public int biayaAdminBulanan() {
        // Giro selalu Rp15.000
        return 15000;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("\tGiro, batas overdraft Rp" + String.format("%,d", batasOverdraft));
    }
}