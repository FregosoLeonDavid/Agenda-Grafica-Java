import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class JPanelMenuPrincipal extends JPanel implements ActionListener {
      
   private JMenuBar menuPrin;
   private JMenu menuAccAgen, menuAccPers, menuAccInf;
   private JMenuItem salir, agregar, consultar, consultaGeneral, modificar, eliminar, programador;

   
   
   JPanelMenuPrincipal() {
      setLayout(new BorderLayout());
      
      menuPrin = new JMenuBar();
      
      add(menuPrin, BorderLayout.NORTH);
      
      menuAccAgen = new JMenu("Agenda");
      menuAccAgen.setFont(new Font("Calisto MT", Font.BOLD, 30));
      menuPrin.add(menuAccAgen);
      
      menuAccPers = new JMenu("Acciones");
      menuAccPers.setFont(new Font("Calisto MT", Font.BOLD, 30));
      menuPrin.add(menuAccPers);
      
      menuAccInf = new JMenu("Informacion");
      menuAccInf.setFont(new Font("Calisto MT", Font.BOLD, 30));
      menuPrin.add(menuAccInf);
      
      salir = new JMenuItem("Salir");
      salir.addActionListener(this);
      salir.setFont(new Font("Calisto MT", Font.BOLD, 20));
      menuAccAgen.add(salir);
      
      agregar = new JMenuItem("Agregar");
      agregar.addActionListener(this);
      agregar.setFont(new Font("Calisto MT", Font.BOLD, 20));
      menuAccPers.add(agregar);
      
      consultar = new JMenuItem("Consultar");
      consultar.addActionListener(this);
      consultar.setFont(new Font("Calisto MT", Font.BOLD, 20));
      menuAccPers.add(consultar);
      
      consultaGeneral = new JMenuItem("ConsultaGeneral");
      consultaGeneral.addActionListener(this);
      consultaGeneral.setFont(new Font("Calisto MT", Font.BOLD, 20));
      menuAccPers.add(consultaGeneral);
      
      modificar = new JMenuItem("Modificar");
      modificar.addActionListener(this);
      modificar.setFont(new Font("Calisto MT", Font.BOLD, 20));
      menuAccPers.add(modificar);
      
      eliminar = new JMenuItem("Eliminar");
      eliminar.addActionListener(this);
      eliminar.setFont(new Font("Calisto MT", Font.BOLD, 20));
      menuAccPers.add(eliminar);
      
      programador = new JMenuItem("Programadores");
      programador.addActionListener(this);
      programador.setFont(new Font("Calisto MT", Font.BOLD, 20));
      menuAccInf.add(programador);    
   }
   public void actionPerformed(ActionEvent e) {
      if(e.getSource() == salir) {
         System.exit(0);
      }
      
      if(e.getSource() == agregar){
         JDialogAgregar agg = new JDialogAgregar();
         agg.setVisible(true);
      }
      if(e.getSource() == consultar){
         if (PrincipalAgenda.ap.getIndice() != 0) {
            JDialogConsulta co = new JDialogConsulta();
            co.setVisible(true);
         } else {
            JOptionPane.showMessageDialog(this,
               "Aun no se han registrado personas",
                "AGENDA VACIA",
                JOptionPane.ERROR_MESSAGE);
         }
      }
      
      if(e.getSource() == consultaGeneral){
         if (PrincipalAgenda.ap.getIndice() != 0) {
            JDialogConsultaGeneral cg = new JDialogConsultaGeneral();
            cg.setVisible(true);
         } else {
            JOptionPane.showMessageDialog(this,
               "Aun no se han registrado personas",
                "AGENDA VACIA",
                JOptionPane.ERROR_MESSAGE);
         }
      }
      if(e.getSource() == modificar){
         if (PrincipalAgenda.ap.getIndice() != 0) {
            JDialogModificar mo = new JDialogModificar();
            mo.setVisible(true);
         } else {
            JOptionPane.showMessageDialog(this,
               "Aun no se han registrado personas",
                "AGENDA VACIA",
                JOptionPane.ERROR_MESSAGE);
         }
      }
      if(e.getSource() == eliminar){
         if (PrincipalAgenda.ap.getIndice() != 0) {
            JDialogEliminar el = new JDialogEliminar();
            el.setVisible(true);
         } else {
            JOptionPane.showMessageDialog(this,
               "Aun no se han registrado personas",
                "AGENDA VACIA",
                JOptionPane.ERROR_MESSAGE);
         }   
      }
      
      if(e.getSource() == programador){
         JOptionPane.showMessageDialog(this,
                  "Programadores: Fregoso Leon David \n Alma Delia Vargas Baltazar",
                  "Creador del programa",
                  JOptionPane.INFORMATION_MESSAGE );
      }
   }
}