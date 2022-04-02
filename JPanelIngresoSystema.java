import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JPanelIngresoSystema extends JPanel implements ActionListener {
   private JButton btnIngresar, btnCancelar;
   private JTextField txtUser;
   private JPasswordField passContra;
   
   public JPanelIngresoSystema() {
      setLayout(new GridLayout(3,2));
      JLabel lblUser = new JLabel("Usuario: ", JLabel.RIGHT);
      txtUser = new JTextField(15);
      add(lblUser);
      add(txtUser);
      JLabel lblContra = new JLabel("Contraseña: ", JLabel.RIGHT);
      passContra = new JPasswordField(10);
      passContra.setToolTipText("Ingresa la contraseña");
      add(lblContra);
      add(passContra);
      btnIngresar = new JButton("Ingresar");
      btnIngresar.addActionListener(this);
      btnCancelar = new JButton("Cancelar");
      btnCancelar.addActionListener(this);
      add(btnIngresar);
      add(btnCancelar);
   } 

   
   public void actionPerformed(ActionEvent e) {
      String usuario = txtUser.getText();
      String pass = new String(passContra.getPassword());
      if(e.getSource() == btnIngresar) {
         if (usuario.isEmpty() && pass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese su usuario y contraseña");
            txtUser.requestFocus();
         }  else {
            if (usuario.equals("David") && pass.equals("1234")) {
               JOptionPane.showMessageDialog(null, "Bienvenido Admin");
               JDialogMenuPrincipal menu = new JDialogMenuPrincipal();
               menu.setVisible(true);
               
            } else {
               JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
               txtUser.setText(null);
               passContra.setText(null);
               txtUser.requestFocus();
            }
         }
      }
      if (e.getSource() == btnCancelar) {
         System.exit( 0);
      }
   }
}