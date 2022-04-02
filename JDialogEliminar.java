import javax.swing.*;
import java.awt.*;
public class JDialogEliminar extends JDialog {
   JPanelEliminar el = new JPanelEliminar();
   
   public JDialogEliminar() {
      initComponents();
   }
   
   public void initComponents() {
      
      setTitle("Eliminar");
      this.setSize(900, 600);
      setLocationRelativeTo(null);
      //setResizable(false); Indica si nuestro JFrame puede cambiar de tamaño o no
      setResizable(false);
      setContentPane(el);
      setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
      setVisible(true);
      
   }
   

   
}