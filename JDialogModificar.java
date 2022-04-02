import javax.swing.*;
import java.awt.*;
public class JDialogModificar extends JDialog {
   JPanelModificar mo = new JPanelModificar();
   
   public JDialogModificar() {
      initComponents();
   }
   public void initComponents() {
      
      setTitle("Modificar");
      this.setSize(900, 600);
      setLocationRelativeTo(null);
      //setResizable(false); Indica si nuestro JFrame puede cambiar de tamaño o no
      setResizable(false);
      setContentPane(mo);
      setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
      setVisible(true);
      
   }
   
   
   
   
}