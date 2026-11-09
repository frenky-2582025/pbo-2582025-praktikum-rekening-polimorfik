public abstract class Rekening {
    protected String nomor;
    protected String nama;
    protected int saldo;

    public Rekening(String nomor, String nama, int saldo) {
        this.nomor = nomor;
        this.nama = nama;
        this.saldo = saldo;
    }

    // Abstract method: wajib di-override oleh subclass
    public abstract int biayaAdminBulanan();

    // Method konkret sesuai ketentuan tugas
    public int potongBiayaAdmin() {
        int biaya = biayaAdminBulanan();
        saldo -= biaya;
        return biaya;
    }

    public void cetakInfo() {
        System.out.println(nomor + " | " + nama + " | Rp" + String.format("%,d", saldo));
    }
}