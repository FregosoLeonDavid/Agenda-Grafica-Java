import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class JPanelEliminar extends JPanel implements ActionListener {
   private JLabel lblNombre, lblTelefono, lblDirElec, lblDateCumple, lblDiag1, lblDiag2;
   private JTextField txtNombre, txtTelefono, txtDirElec, txtDia, txtMes, txtAño;
   private JButton btnEliminar, btnBuscar;
   GridBagConstraints gbc = new GridBagConstraints();
   
   JPanelEliminar() {
      setLayout(new GridBagLayout());
      gbc.fill = GridBagConstraints.HORIZONTAL;
      //Espacio entre filas
      gbc.insets = new Insets(20, 20, 0, 0);
      
      
      lblNombre = new JLabel("Nombre: ");
      lblNombre.setFont(new Font("Calisto MT", Font.BOLD, 25));
      gbc.gridx = 0;
      gbc.gridy = 0;
      add(lblNombre, gbc);
       
      lblTelefono = new JLabel("Telefono: ");
      lblTelefono.setFont(new Font("Calisto MT", Font.BOLD, 20));
      gbc.gridx = 0;
      gbc.gridy = 1;
      add(lblTelefono, gbc);
      
      lblDirElec = new JLabel("Direccion electronica: ");
      lblDirElec.setFont(new Font("Calisto MT", Font.BOLD, 20));
      gbc.gridx = 0;
      gbc.gridy = 2;
      add(lblDirElec, gbc);
      
      lblDateCumple = new JLabel("Fecha de cumpleaños");
      lblDateCumple.setFont(new Font("Calisto MT", Font.BOLD, 20));
      gbc.gridx = 0;
      gbc.gridy = 3;
      add(lblDateCumple, gbc);
      
      txtNombre = new JTextField(20);
      //Cantidad de filas que abarca el JTextField
      gbc.gridheight = 1;
      //Cantidad de columna que abarca el JTextField

      gbc.gridwidth = 3;
      gbc.gridx = 1;
      gbc.gridy = 0;
        
      add(txtNombre, gbc);
      
      txtTelefono = new JTextField(40);
      txtTelefono.setEditable(false);
      gbc.gridwidth = 3;
      gbc.gridheight = 1;
      gbc.gridx = 1;
      gbc.gridy = 1;
      
      add(txtTelefono, gbc);
      
      txtDirElec = new JTextField(40);
      txtDirElec.setEditable(false);
      gbc.gridwidth = 3;
      gbc.gridheight = 1;
      gbc.gridx = 1;
      gbc.gridy = 2;
      
      add(txtDirElec, gbc);
      
      txtDia = new JTextField(12);
      txtDia.setEditable(false);
      gbc.gridwidth = 1;
      gbc.gridx = 1;
      gbc.gridy = 3;
      
      gbc.anchor = GridBagConstraints.CENTER;
      add(txtDia, gbc);
      
      txtMes = new JTextField(12);
      txtMes.setEditable(false);
      gbc.gridwidth = 1;
      gbc.gridx = 2;
      gbc.gridy = 3;
      gbc.anchor = GridBagConstraints.CENTER;
      
      add(txtMes, gbc);
      
      txtAño = new JTextField(12);
      txtAño.setEditable(false);
      gbc.gridwidth = 1;
      gbc.gridx = 3;
      gbc.gridy = 3;
      gbc.anchor = GridBagConstraints.CENTER;
      
      add(txtAño, gbc);
      
      btnEliminar = new JButton("Eliminar");
      btnEliminar.addActionListener(this);
      btnEliminar.setEnabled(false);
      //Indica la cantidad de filas y columnas que abarca el componente
      gbc.gridwidth = 3;
      gbc.gridheight = 1;
      gbc.gridx = 1;
      gbc.gridy = 4;
      add(btnEliminar, gbc);
     
      
      btnBuscar = new JButton("Buscar");
      btnBuscar.addActionListener(this);
      gbc.gridwidth = 1;
      gbc.gridx = 4;
      gbc.gridy = 0;
      add(btnBuscar, gbc);
      
   }
   
   public void borrarDatos() {
      txtNombre.setText(null);  
      txtTelefono.setText(null);
      txtDirElec.setText(null);
      txtDia.setText(null);
      txtMes.setText(null);
      txtAño.setText(null);
   }
   
   public void actionPerformed(ActionEvent e) {
      int celda = 0;
      if (e.getSource() == btnBuscar) {
         String nombre = txtNombre.getText();
         celda = PrincipalAgenda.ap.getCelda(nombre);
         
         if (celda != -1) {
            Persona encont = PrincipalAgenda.ap.consultar(celda);
            txtTelefono.setText(encont.getTelefono());
            txtDirElec.setText(encont.getDirElect());
            txtDia.setText(String.valueOf(encont.getDia()));
            txtMes.setText(String.valueOf(encont.getMes()));
            txtAño.setText(String.valueOf(encont.getAño()));
            btnEliminar.setEnabled(true);
         } else {
            JOptionPane.showMessageDialog(this,
                  "Persona no registrada",
                   "SIN ENCONTRAR",
                   JOptionPane.ERROR_MESSAGE);
         }
      } else {
         if(PrincipalAgenda.ap.getIndice() == 0) {
            JOptionPane.showMessageDialog(this,
                "No hay mas personas para eliminar",
                "AGENDA VACIA",
                JOptionPane.ERROR_MESSAGE);
            btnEliminar.setEnabled(false);
         } else {
            PrincipalAgenda.ap.eliminar(celda);
            JOptionPane.showMessageDialog(this,
                   "El usuario ah sido eliminado",
                   "Usuario eliminado",
                   JOptionPane.INFORMATION_MESSAGE);
            borrarDatos();
         }
      }
   }
}   
