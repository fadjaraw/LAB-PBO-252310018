import javax.swing.JOptionPane;

public class Latihan04 {

    private static boolean keluar() {
    int pilihan = JOptionPane.showConfirmDialog(
        null,
        "Apakah anda ingin keluar?",
        "Konfirmasi",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE
    );
    return pilihan == JOptionPane.YES_OPTION;
}
    public static void main(String[] args) {
        Biodata biodata = new Biodata();

        while (true) {
            String fullname = "";
            int usia = 0;
            String alamat = "";

            while (true) {
                fullname = JOptionPane.showInputDialog(null, "Masukkan Fullname:", "Input Biodata", JOptionPane.QUESTION_MESSAGE);
                
                if (fullname == null) {
                    if (keluar()) {
                        System.exit(0);
                    } else {
                        continue;
                    }
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
                    if (keluar()) {
                        System.exit(0);
                    } else {
                        continue;
                    }
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
                    if (keluar()) {
                        System.exit(0);
                    } else {
                        continue;
                    }
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

            if (keluar()) {
                System.exit(0);
            }
        }
    }
}
