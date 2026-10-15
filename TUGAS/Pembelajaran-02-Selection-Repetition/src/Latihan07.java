import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Resto resto = new Resto();

        char ulang;

        do {
            resto.chooseMenu(scanner);

            System.out.print(
                "Apakah anda akan memesan kembali ? (y/n): "
            );
            ulang = scanner.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Terimakasih telah memesan.");

        scanner.close();
    }
}
