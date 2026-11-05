import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("fadjar");
        System.out.println(nama.get(0));

        JOptionPane jop = new JOptionPane();
        nama.add(jop.showInputDialog(null, "Input nama:"));
        jop.showMessageDialog(null, "Nama: " + nama.getLast());

        nama.remove(0);
        System.out.println("Nama setelah dihapus " + nama.get(0));

        // System.out.println(nama.get(1));

        nama.add("Skuy");
        nama.add("Kora");
        System.out.println("List Nama: ");
        for(int i = 0; i < nama.size(); i++){
            System.out.println(nama.get(i));
        }

        nama.clear();
        System.out.println(nama.size());
    }
}
