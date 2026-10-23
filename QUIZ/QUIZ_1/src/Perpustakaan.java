import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Perpustakaan {
    public static void main(String[] args) {
        char kembali;
        ArrayList<String> buku = new ArrayList<String>();

        do {
            List<String> optionList = new ArrayList<String>();
            optionList.add("1");
            optionList.add("2");
            optionList.add("3");
            optionList.add("4");
        
            Object[] options = optionList.toArray();

            Object value = JOptionPane.showInputDialog(null, 
                "Pilih Menu (1 - 4): \n 1. Masukkan judul buku yang ingin diinput \n 2. Masukkan Index Buku yang ingin dihapus \n 3. output seluruh data  buku \n 4. Keluar", 
                null,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options, 
                options[0]
                );

            int index = optionList.indexOf(value);

            JOptionPane jop = new JOptionPane();
            if (value.equals("1")){
                buku.add(jop.showInputDialog(null, "Input judul buku:"));
                
            }
            else if(value.equals("2")){
                buku.remove(Integer.parseInt(jop.showInputDialog(null, "Input index buku yang ingin dihapus:")));
            }
            else if(value.equals("3")){
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < buku.size(); i++) {
                    sb.append((i + 1) + "." + buku.get(i)).append(System.lineSeparator());
                }
                JOptionPane.showInputDialog(sb);
            }
            else if(value.equals("4")){
                System.exit(0);
            }
            else{
                JOptionPane.showMessageDialog(null, "Pilihan tidak valid");
            }
            kembali = JOptionPane.showInputDialog(null, "Kembali ke menu? (y/n): ").charAt(0);
        } while (kembali == 'y' || kembali == 'Y');
    }
}
