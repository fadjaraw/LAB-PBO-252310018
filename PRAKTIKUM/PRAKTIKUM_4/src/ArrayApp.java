
import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
        String[] nama = new String[4];

        nama[0] = "Fadjar";
        System.out.println(nama[0]);
        System.out.println(nama[1]);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input nama: ");
        nama[1] = scanner.nextLine();
        System.out.println("Nama yang dioutput:" + nama[1]);

        System.out.println("Nama - nama:");
        for(int i = 0; i < 4; i++){
            System.out.println(nama[i]);
        }
    }
}
