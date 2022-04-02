import javax.swing.*;
import java.awt.*;
public class JFrameIngreso extends JFrame{
   JPanelIngresoSystema pi = new JPanelIngresoSystema();
   
   public JFrameIngreso() {
      initComponents();
   }
   public void initComponents() {
      setSize(700, 500);
      setTitle("Usuario y Contraseña");
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //setResizable(false); Indica si nuestro JFrame puede cambiar de tamaño o no
      setResizable(false);
      setContentPane(pi);
      setVisible(true);
      
   }
}