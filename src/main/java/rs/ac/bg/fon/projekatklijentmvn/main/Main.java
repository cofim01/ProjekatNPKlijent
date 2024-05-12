
package rs.ac.bg.fon.projekatklijentmvn.main;


import javax.swing.SwingUtilities;
import rs.ac.bg.fon.projekatklijentmvn.forme.Login;

/**
 *
 * @author MRDAK-PC
 */
public class Main {
    public static void main(String[] args) {
         SwingUtilities.invokeLater(() -> {
            Login loginFrm = new Login();
            loginFrm.setVisible(true);
        });
    }
    
    
}
