import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        int angka;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Masukkan NPM: ");
            angka = scanner.nextInt();

            if (angka < 20) {
                System.out.println("Input tidak boleh kurang dari 20!");
            }

        } while (angka < 20);

        System.out.print("ASC: Faktor " + angka + " adalah ");

        for (int i = 1; i <= angka; i++) {
            if (angka % i == 0) {
                System.out.print(i);

                if (i < angka) {
                    System.out.print(", ");
                }
            }
        }

        System.out.println();
        scanner.close();
    }
}
