import java.util.Scanner;

public class Latihan10 {
    public static void main(String[] args) {
        long saldo = 1000000;
        String pin;
        int pilihan;
        char kembali;
        String pinRil = "252310018";

        Scanner scanner = new Scanner(System.in);

         while (true) {
            System.out.print("Masukkan PIN: ");
            pin = scanner.nextLine();

            if (pin.equals(pinRil)) {
                System.out.println("PIN benar.");
                break;
            } else {
                System.out.println("PIN salah, silakan coba lagi.");
            }
        }

        do {
            System.out.println("\n===MENU ATM===");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            pilihan = scanner.nextInt();

            if (pilihan == 1) {
                System.out.println("Saldo Anda: Rp " + saldo);
            } else if (pilihan == 2) {
                System.out.print("Masukkan nominal setor tunai: Rp ");
                long setor = scanner.nextLong();

                if (setor > 0) {
                    saldo += setor;
                    System.out.println("Setor tunai berhasil.");
                    System.out.println("Saldo Anda: Rp " + saldo);
                } else {
                    System.out.println("Nominal setor harus lebih dari 0.");
                }
            } else if (pilihan == 3) {
                System.out.print("Masukkan nominal tarik tunai: Rp ");
                long tarik = scanner.nextLong();

                if (tarik > 0 && saldo >= tarik) {
                    saldo -= tarik;
                    System.out.println("Tarik tunai berhasil.");
                    System.out.println("Saldo Anda: Rp " + saldo);
                } else {
                    System.out.println("Saldo tidak cukup atau nominal tidak valid.");
                }
            } else if (pilihan == 4) {
                System.out.println("Anda memilih menu Keluar.");
            } else {
                System.out.println("Pilihan menu tidak valid.");
            }

            System.out.print("Kembali ke menu? (y/n): ");
            kembali = scanner.next().charAt(0);

        } while (kembali == 'y' || kembali == 'Y');

        System.out.println("Terima kasih telah menggunakan ATM.");

        scanner.close();
    }
}
