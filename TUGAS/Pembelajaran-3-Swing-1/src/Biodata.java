public class Biodata {
    private int usia;
    private String fullname, alamat;

    public void setData(String fullname, int usia, String alamat) {
        this.fullname = fullname;
        this.usia = usia;
        this.alamat = alamat;
    }

    public String getInfo() {
        return "Fullname: " + fullname + "\n"
             + "Usia: " + usia + " tahun\n"
             + "Alamat: " + alamat;
    }
}
