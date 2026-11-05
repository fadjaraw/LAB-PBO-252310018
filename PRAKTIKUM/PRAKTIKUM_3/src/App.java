
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        JOptionPane jop = new JOptionPane();
        
        String nama, npm;
        int umur, confirm = 0;

        do { 
            nama = jop.showInputDialog(null, 
                "Masukkan nama anda ",
                "input",
            jop.QUESTION_MESSAGE
            );

            confirm = jop.showConfirmDialog(null,
                "Apakah anda yakin nama anda" + nama
            );
            
            if(confirm ==2){
                return;
            }
        } while (confirm != 1);

        npm = jop.showInputDialog(null,
            "Input NPM",
            "252310018"
        );

        umur = Integer.parseInt(jop.showInputDialog(null,
                "Input Umur ")
            );

        String output = "Nama: " + nama + "\n" +
                        "NPM: " + npm + "\n" +
                        "Umur: " + umur;

        jop.showMessageDialog(null,
            output, "Biodata ",
            jop.ERROR_MESSAGE
        );
    }
}
