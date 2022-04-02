import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class JPanelConsulta extends JPanel implements ActionListener {
   private JLabel lblNombre, lblTelefono, lblDirElec, lblDateCumple, lblDiag1, lblDiag2;
   private JTextField txtNombre, txtTelefono, txtDirElec, txtDia, txtMes, txtAño;
   private JButton btnConsultar;
   GridBagConstraints gbc = new GridBagConstraints();
   
   JPanelConsulta() {
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
      
      btnConsultar = new JButton("Consultar");
      //Indica la cantidad de filas y columnas que abarca el componente
      btnConsultar.addActionListener(this);
      gbc.gridwidth = 3;
      gbc.gridheight = 1;
      gbc.gridx = 1;
      gbc.gridy = 4;
      add(btnConsultar, gbc);
     
      
      
   }
   
   public void actionPerformed(ActionEvent e) {
     
      String nombre = txtNombre.getText();
      int celda = PrincipalAgenda.ap.getCelda(nombre);
      
      if (celda != -1) {
         Persona encont = PrincipalAgenda.ap.consultar(celda);
         txtTelefono.setText(encont.getTelefono());
         txtDirElec.setText(encont.getDirElect());
         txtDia.setText(String.valueOf(encont.getDia()));
         txtMes.setText(String.valueOf(encont.getMes()));
         txtAño.setText(String.valueOf(encont.getAño())); 
      } else {
         JOptionPane.showMessageDialog(this,
               "Persona no registrada",
                "SIN ENCONTRAR",
                JOptionPane.ERROR_MESSAGE);
      }
      
   }

}   
