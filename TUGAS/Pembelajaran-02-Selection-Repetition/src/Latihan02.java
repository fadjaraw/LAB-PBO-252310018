import java.util.Scanner;

public class Latihan02 {
    public static void main(String[] args) {
        long npm;
        boolean prima = true;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NPM: ");
        npm = scanner.nextLong();

        if(npm <= 1){
            prima = false;
        } else{
            for (long i = 2; i <= npm / i; i++) {
                if (npm % i == 0) {
                    prima = false;
                    break;
                }
            }
        }

        if(prima){
            System.out.println("Termasuk bilangan PRIMA");
        } else {
            System.out.println(
                "Bukan termasuk bilangan prima karena dapat dibagi dengan 2"
            );
        }

        scanner.close();
    }
}
