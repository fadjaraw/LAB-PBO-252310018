import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        Biodata biodata = new Biodata();

        String fullname = "";
        int usia = 0;
        String alamat = "";

        while (true) {
            fullname = JOptionPane.showInputDialog(null, "Masukkan Fullname:", "Input Biodata", JOptionPane.QUESTION_MESSAGE);
            
            if (fullname == null) {
                System.exit(0);
            }

            if (fullname.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field fullname tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                break;
            }
        }

        while (true) {
            String strUsia = JOptionPane.showInputDialog(null, "Masukkan Usia:", "Input Biodata", JOptionPane.QUESTION_MESSAGE);
            
            if (strUsia == null) {
                System.exit(0);
            }

            if (strUsia.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field usia tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    usia = Integer.parseInt(strUsia.trim());
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Isian usia harus angka", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        while (true) {
            alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat:", "Input Biodata", JOptionPane.QUESTION_MESSAGE);
            
            if (alamat == null) {
                System.exit(0);
            }

            if (alamat.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field alamat tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (alamat.trim().length() < 10) {
                JOptionPane.showMessageDialog(null, "Masukan alamat minimum 10 karakter", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                break;
            }
        }

        biodata.setData(fullname, usia, alamat);

        JOptionPane.showMessageDialog(null, biodata.getInfo(), "Data Biodata Valid", JOptionPane.INFORMATION_MESSAGE);
    }
}
