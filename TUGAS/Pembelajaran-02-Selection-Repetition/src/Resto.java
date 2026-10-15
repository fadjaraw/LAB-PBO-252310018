import java.util.Scanner;

public class Resto {
        private long Harga, harga;
        String hargaFormat;

        Scanner scanner = new Scanner(System.in);
        
        private Long getPrices(int pilihan){
            if (pilihan == 1) {
                Harga = 22000;
            } else if (pilihan == 2) {
                Harga = 15000;
            } else if (pilihan == 3) {
                Harga = 25000;
            } else {
                Harga = 0;
            }

            return Harga;
        }

        public void chooseMenu(Scanner scanner){
            System.out.println("Menu Sarapan: ");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Bubur Ayam");
            System.out.println("3. Soto Ayam");

            System.out.print("Masukkan pilihan menu (1-3): ");
            int pilihan = scanner.nextInt();

            if (pilihan >= 1 && pilihan <= 3) {
                harga = getPrices(pilihan);
                hargaFormat = String.format("%,d", harga)
                                        .replace(',', '.');

                if (pilihan == 1) {
                    System.out.println(
                        "Anda memesan Nasi Goreng dengan harga Rp "
                        + hargaFormat + ",-"
                    );
                } else if (pilihan == 2) {
                    System.out.println(
                        "Anda memesan Bubur Ayam dengan harga Rp "
                        + hargaFormat + ",-"
                    );
                } else if (pilihan == 3) {
                    System.out.println(
                        "Anda memesan Soto Ayam dengan harga Rp "
                        + hargaFormat + ",-"
                    );
                }
            } else {
                System.out.println(
                    "Maaf menu yang anda masukan salah."
                );
            }
        }

    }
