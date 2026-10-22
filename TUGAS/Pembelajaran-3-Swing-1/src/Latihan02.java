import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {
        Biodata biodata = new Biodata();

        String fullname  = JOptionPane.showInputDialog(null, "Masukkan Nama:", "Input Biodata", JOptionPane.QUESTION_MESSAGE);
        
        String strUsia = JOptionPane.showInputDialog(null, "Masukkan Usia:", "Input Biodata", JOptionPane.QUESTION_MESSAGE);
        int usia = Integer.parseInt(strUsia);
        
        String alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat:", "Input Biodata", JOptionPane.QUESTION_MESSAGE);

        biodata.setData(fullname, usia, alamat);

        JOptionPane.showMessageDialog(null, biodata.getInfo(), "Data Biodata", JOptionPane.INFORMATION_MESSAGE);
    }
}
