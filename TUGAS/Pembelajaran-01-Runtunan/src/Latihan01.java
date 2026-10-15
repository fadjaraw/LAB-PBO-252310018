import java.util.Scanner;

public class Latihan01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Konversi Suhu Celcius");
        System.out.println("=====================");
        System.out.println();
        
        double celcius, fahrenheit, reumur, kelvin;
        
        System.out.print("Masukkan Suhu Celcius: ");
        celcius = scanner.nextDouble();

        fahrenheit = (9.0/5.0 * celcius) + 32;
        reumur = celcius * (4.0/5.0);
        kelvin = celcius + 273.15;

        System.out.println("Konvesi suhu ke fahrenheit sebesar: " + fahrenheit + " derajat kelvin");
        System.out.println("Konvesi suhu ke Reumur sebesar: " + reumur + " derajat Reumur");
        System.out.println("Konvesi suhu ke Kelvin sebesar: " + kelvin + " derajat Kelvin");
    }   
}
