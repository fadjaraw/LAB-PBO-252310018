
import java.util.Scanner;

public class Latihan09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int npm, semester;
        String fullname, classname;
        float gpa;

        Students myBio = new Students();

        System.out.print("Masukkan NPM: ");
        npm = scanner.nextInt();

        System.out.print("Masukkan Semester: ");
        semester = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan Fullname: ");
        fullname = scanner.nextLine();

        System.out.print("Masukkan Class name: ");
        classname = scanner.nextLine();

        System.out.print("Masukkan GPA: ");
        gpa = scanner.nextFloat();

        System.out.println("\nDATA MAHASISWA");
        System.out.println("NPM: " + myBio.getNpm(npm));
        System.out.println("Semester: " + myBio.getSemester(semester));
        System.out.println("Fullname: " + myBio.getFullname(fullname));
        System.out.println("Class name: " + myBio.getClassname(classname));
        System.out.println("GPA: " + myBio.getGpa(gpa));
    }
}
