
import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usia,firstname, lastname, npm, hasil;

        System.out.print("Masukkan usia: ");
        usia = scanner.nextLine();

        System.out.print("Masukkan firstname: ");
        firstname = scanner.nextLine();
        
        System.out.print("Masukkan lastname: ");
        lastname = scanner.nextLine();

        System.out.print("Masukkan npm: ");
        npm = scanner.nextLine();

        hasil = usia.concat(firstname).concat(lastname).concat(npm);

        System.out.print(hasil);
    }
}
