class PesananFood {
    private String idPesanan;
    private String namaMenu;
    private double hargaTotal;

    public PesananFood(String idPesanan, String namaMenu, double hargaTotal) {
        this.idPesanan = idPesanan;
        this.namaMenu = namaMenu;
        this.hargaTotal = hargaTotal;
    }

    public void hitungTotal() {
        System.out.println("Total pesanan " + idPesanan + ": Rp" + hargaTotal);
    }

    public double getHargaTotal() {
        return hargaTotal;
    }
}

class Driver {
    private String id_Driver;
    private String nama_Driver;
    private boolean statusAktif = true;

    public Driver(String id_Driver, String nama_Driver) {
        this.id_Driver = id_Driver;
        this.nama_Driver = nama_Driver;
    }

    public void terimaPesanan() {
        this.statusAktif = false;
        System.out.println("Driver " + nama_Driver + " mengambil pesanan (Status: Sibuk).");
    }

    public void selesaikanTugas() {
        this.statusAktif = true;
        System.out.println("Driver " + nama_Driver + " selesai bertugas (Status: Aktif).");
    }
}

public class StudiKasusA {
    public static void main(String[] args) {
        PesananFood pesanan = new PesananFood("ORD-01", "Seblak", 15000);
        Driver driver = new Driver("DRV-01", "Kevin");

        pesanan.hitungTotal();
        driver.terimaPesanan();
        driver.selesaikanTugas();
    }
}