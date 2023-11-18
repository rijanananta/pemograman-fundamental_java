package Tugas2;
import javax.swing.JOptionPane;
public class Authenticator {
    public static void main(String[] args){
        String username = JOptionPane.showInputDialog("Username:");
        String password = JOptionPane.showInputDialog("Password:");
        if ( username != null && password != null
                && (
                (username.equals("rijan") && password.equals("rijan123")) ||
                        (username.equals("bburd") && password.equals("swordfish"))
        )
        )
        {
            JOptionPane.showMessageDialog(null, "Selamat Datang");
        }	else {
            JOptionPane.showMessageDialog(null, " Kamu Penyusup");
        }
    }
}
