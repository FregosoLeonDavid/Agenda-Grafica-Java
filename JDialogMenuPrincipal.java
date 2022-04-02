
import javax.swing.*;
import java.awt.*;
public class JDialogMenuPrincipal extends JDialog {
   JPanelMenuPrincipal mp = new JPanelMenuPrincipal();
   
   public JDialogMenuPrincipal() {
      initComponents();
   }
   
   public void initComponents() {
      
      setTitle("Menu principal");
      this.setSize(800, 600);
      setLocationRelativeTo(null);

      //setResizable(false); Indica si nuestro JFrame puede cambiar de tamaño o no
      setResizable(false);
      setContentPane(mp);
      setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
      setVisible(true);
      
   }
   
   
   
}