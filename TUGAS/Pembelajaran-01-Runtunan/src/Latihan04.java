import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hargaRoti = 6300, jumlah;
        double total, potongan = 0, totalBayar, diskon;

        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        System.out.println("==================================");
        System.out.println("      TOKO SERBAGUNA IBIK");
        System.out.println("==================================");
        System.out.print("Masukkan jumlah produk yang dibeli: ");
        jumlah = scanner.nextInt();

        total = jumlah * hargaRoti;

        diskon = (jumlah / 3) * 0.05;
        potongan = total * diskon;

        totalBayar = total - potongan;
    
        System.out.println(waktu.format(format));
        System.out.println("ITEM\tQTY\tHARGA\tTOTAL");
        System.out.println("==================================");
        System.out.println("ROTI ENAK\t"+ jumlah + "\t" +  hargaRoti + "\t" + total);
        System.out.println("----------------------------------");
        System.out.println("Diskon: " + Math.round(diskon * 100) + "%");
        System.out.println("Total Bayar: " + totalBayar);

    }
}
