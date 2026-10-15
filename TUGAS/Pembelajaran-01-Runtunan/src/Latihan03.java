import java.util.Scanner;

public class Latihan03 {
    double diagonal1, diagonal2;
    double Lsisi1, Lsisi2;
    double Palas, Stinggi;
    double Psisi1, Psisi2, Psisi3;
    double Ptinggi;

    double luasLayang(){
        double luas = 0.5 * diagonal1 * diagonal2;
        return luas; 
    }

    double KelilingLayang(){
        double keliling = 2 * (Lsisi1 + Lsisi2);
        return keliling;
    }

    double LuasAlasSegi(){
        double LuasP = 0.5 * Palas * Stinggi;
        return LuasP;
    }

    double kelilingAlasSegitiga(){
        double keliling = Psisi1 + Psisi2 + Psisi3;
        return keliling;
    }

    double LuasPrisma(){
        double luasAlas = LuasAlasSegi();
        double KelilingAlas = kelilingAlasSegitiga();
        double LuasPris = (2 * luasAlas) + (KelilingAlas * Ptinggi);
        return LuasPris;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Latihan03 bangun = new Latihan03();

        int pilihan;
        char ulang;

        do{
        System.out.println("PROGRAM HITUNG LUAS DAN KELILING");
        System.out.println("1. Layang-layang");
        System.out.println("2. Prisma Segitiga");
        System.out.print("Pilih Bangunan: ");
        pilihan = scanner.nextInt();
 
            switch(pilihan){
            case 1:
                System.out.println("Layang-layang");
                System.out.print("Masukkan Diagonal 1: ");
                bangun.diagonal1 = scanner.nextDouble();

                System.out.print("Masukkan Diagonal 2: ");
                bangun.diagonal2 = scanner.nextDouble();

                System.out.print("Masukkan Sisi 1: ");
                bangun.Lsisi1 = scanner.nextDouble();

                System.out.print("Masukkan Sisi 2: ");
                bangun.Lsisi2 = scanner.nextDouble();

                System.out.println("Luas = "+ bangun.luasLayang());

                System.out.println("Keliling = "+ bangun.KelilingLayang());

                break;
            
            case 2:
                System.out.println("Prisma Segitiga");
                System.out.print("Masukkan Alas Segitiga: ");
                bangun.Palas = scanner.nextDouble();

                System.out.print("Masukkan Tinggi Segitiga: ");
                bangun.Stinggi = scanner.nextDouble();

                System.out.print("Masukkan Sisi 1: ");
                bangun.Psisi1 = scanner.nextDouble();

                System.out.print("Masukkan Sisi 2: ");
                bangun.Psisi2 = scanner.nextDouble();

                System.out.print("Masukkan Sisi 3: ");
                bangun.Psisi3 = scanner.nextDouble();

                System.out.print("Masukkan Tinggi: ");
                bangun.Ptinggi = scanner.nextDouble();

                System.out.println("Luas = "+ bangun.LuasPrisma());

                System.out.println("Keliling = "+ bangun.kelilingAlasSegitiga());

                break;

            default:
                System.out.println("Pilihan tidak ada!");
                break;
            }

            System.out.print("\nIngin menghitung lagi? (y/n): ");
            ulang = scanner.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');
        System.out.println("Program selesai.");
        scanner.close();
    }
}
