
import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama, hasil;

        System.out.print("Masukkan nama: ");
        nama = scanner.nextLine();

        hasil = nama.replaceAll("[aeiouAEIOU]", "X");

        System.out.println(nama + "=>" + hasil);
    }
}
