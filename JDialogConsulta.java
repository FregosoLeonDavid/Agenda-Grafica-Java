import javax.swing.*;
import java.awt.*;
public class JDialogConsulta extends JDialog {
   JPanelConsulta co = new JPanelConsulta();
   
   public JDialogConsulta() {
      initComponents();
   }
   public void initComponents() {
      
      setTitle("Consultar");
      this.setSize(900, 600);
      setLocationRelativeTo(null);
      //setResizable(false); Indica si nuestro JFrame puede cambiar de tamaño o no
      setResizable(false);
      setContentPane(co);
      setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
      setVisible(true);
      
   }
   
}