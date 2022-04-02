import javax.swing.*;
import java.awt.*;

public class JDialogAgregar extends JDialog {
   JPanelAgregar pa = new JPanelAgregar();
   
   
   public JDialogAgregar() {
   
      initComponents();
      
   }
   
   public void initComponents() {
      
      setTitle("Agregar");
      this.setSize(800, 600);
      setLocationRelativeTo(null);
      //setResizable(false); Indica si nuestro JFrame puede cambiar de tamaño o no
      setResizable(false);
      setContentPane(pa);
      setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
      setVisible(true);
      
   }
}