import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan01 {

    static ArrayList<ArrayList<Integer>> isiMatrix(String nama) {
        ArrayList<ArrayList<Integer>> MatrixAr = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> baris = new ArrayList<Integer>();
            for (int j = 0; j < 2; j++) {
                int angka = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan angka: ",
                        "Matrix " + nama + " [" + i + "][" + j + "]", JOptionPane.QUESTION_MESSAGE));
                baris.add(angka);
            }
            MatrixAr.add(baris);
        }
        return MatrixAr;
    }

    static String tampil(String nama, ArrayList<ArrayList<Integer>> MatrixAr) {
        String teks = "Matrix " + nama + "\n";
        for (int i = 0; i < MatrixAr.size(); i++) {
            for (int j = 0; j < MatrixAr.get(i).size(); j++) {
                teks += MatrixAr.get(i).get(j) + "   ";
            }
            teks += "\n";
        }
        return teks;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = isiMatrix("A");
        ArrayList<ArrayList<Integer>> b = isiMatrix("B");

        String hasil = tampil("A", a) + "\n" + tampil("B", b);

        JOptionPane.showMessageDialog(null, hasil, "Output Matrix", JOptionPane.INFORMATION_MESSAGE);
    }
}