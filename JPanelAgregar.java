import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class JPanelAgregar extends JPanel implements ActionListener {
   
   private JLabel lblNombre, lblTelefono, lblDirElec, lblDateCumple, lblDiag1, lblDiag2;
   private JTextField txtNombre, txtTelefono, txtDirElec, txtDia, txtMes, txtAño;
   private JButton btnAgregar;
   GridBagConstraints gbc = new GridBagConstraints();
   
   JPanelAgregar() {
      
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
      
      txtNombre = new JTextField(30);
      //Cantidad de filas que abarca el JTextField
      gbc.gridheight = 1;
      //Cantidad de columna que abarca el JTextField

      gbc.gridwidth = 3;
      gbc.gridx = 1;
      gbc.gridy = 0;
        
      add(txtNombre, gbc);
      
      txtTelefono = new JTextField(30);
      gbc.gridwidth = 3;
      gbc.gridheight = 1;
      gbc.gridx = 1;
      gbc.gridy = 1;
      
      add(txtTelefono, gbc);
      
      txtDirElec = new JTextField(30);
      gbc.gridwidth = 3;
      gbc.gridheight = 1;
      gbc.gridx = 1;
      gbc.gridy = 2;
      
      add(txtDirElec, gbc);
      
      txtDia = new JTextField(12);
      gbc.gridwidth = 1;
      gbc.gridx = 1;
      gbc.gridy = 3;
      
      gbc.anchor = GridBagConstraints.CENTER;
      add(txtDia, gbc);
      
      txtMes = new JTextField(12);
      gbc.gridwidth = 1;
      gbc.gridx = 2;
      gbc.gridy = 3;
      gbc.anchor = GridBagConstraints.CENTER;
      add(txtMes, gbc);
      
      txtAño = new JTextField(12);
      gbc.gridwidth = 1;
      gbc.gridx = 3;
      gbc.gridy = 3;
      gbc.anchor = GridBagConstraints.CENTER;
      
      add(txtAño, gbc);
      
      btnAgregar = new JButton("Agregar");
      btnAgregar.addActionListener(this);
      gbc.gridwidth = 3;
      gbc.gridheight = 1;
      gbc.gridx = 1;
      gbc.gridy = 4;
      add(btnAgregar, gbc);
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
 
      
      if(txtNombre.getText().equals("") || txtTelefono.getText().equals("") || txtDirElec.getText().equals("") || 
         txtDia.getText().equals("") || txtMes.getText().equals("") || txtAño.getText().equals("")) {
         JOptionPane.showMessageDialog(this,
                "No debe dejar ninguna casilla vacia",
                "CASILLA VACIA",
                JOptionPane.ERROR_MESSAGE);        
      } else {
        
         String nombre = txtNombre.getText();
         if(PrincipalAgenda.ap.getCelda(nombre) == -1 ) {
            
            String telefono = txtTelefono.getText();
            boolean res= validar(telefono);
            if(res==true){
               String dirElec = txtDirElec.getText();
               int dia = validarN(txtDia.getText());
               int mes = validarN(txtMes.getText());
               int año = validarN(txtAño.getText());
               if(dia!=0 && mes!=0 &&año!=0){
                  Persona p = new Persona(nombre, telefono, dirElec, dia, mes, año);
                  PrincipalAgenda.ap.agregar(p);
                  
                  JOptionPane.showMessageDialog(this,
                      "El usuario ah sido registrado",
                      "Usuario registrado",
                      JOptionPane.INFORMATION_MESSAGE);
               
                  borrarDatos();
               }else{
                  txtDia.requestFocus();
               }
            }else{
               JOptionPane.showMessageDialog(this,
                   "el telefono solo debe contener numeros",
                   "telefono incorrecto",
                   JOptionPane.ERROR_MESSAGE);
            }
            
            
            
            
              
         } else {
            JOptionPane.showMessageDialog(this,
                "El usuario ya ah sido registrado",
                "USUARIO REPETIDO",
                JOptionPane.ERROR_MESSAGE);
            borrarDatos();
         }
      } 
   }
   
   public boolean validar(String num){
   
      boolean res=true;
      for(int x=0; x<num.length();x++){
         if(num.charAt(x) >='0' && num.charAt(x) <= '9' ){
           res= true;
         
         }
         else{
            res=false;
            return res;
         }
      
      }
      return res;
   }
   public int validarN(String num){
      int n=0;
      try{
         n=Integer.parseInt(num);
         
      }
      catch(NumberFormatException e){
         JOptionPane.showMessageDialog(this,
                   "La fecha solo debe llevar numeros, no se admiten otros caracteres",
                   "Fecha de Nacimiento Incorrecta",
                   JOptionPane.ERROR_MESSAGE);
      }
      return n;
   }

}