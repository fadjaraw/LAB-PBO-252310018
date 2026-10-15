
import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kalimat;

        System.out.print("Masukkan Kalimat: ");
        kalimat = scanner.nextLine().toUpperCase();

        System.out.println("Hasil: " + kalimat);
    }

}
