import javax.swing.*;
import java.awt.*;
import java.util.*;

public class JPanelTablaDatos extends JPanel
{
  JTable tabla;
  JScrollPane scroll = new JScrollPane();
  AdmonPersona mp = new AdmonPersona();
  ArrayList<Persona> datosPer = new ArrayList<Persona>();
  
  public JPanelTablaDatos()
  {
     datosPer = mp.Datos();
     String titulos [] = {"Nombre", "Direccon electronica", "Telefono", "Dia en que nacio", "Mes en que nacio" , "Año en que nacio"};
     String info [][] = obtenerDatos();
     setLayout (new BorderLayout());
   
     tabla = new JTable(info, titulos);
     tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
     scroll.setViewportView(tabla);
     add(tabla.getTableHeader(), BorderLayout.NORTH);
     add(tabla, BorderLayout.CENTER);
     add(scroll, BorderLayout.EAST);

  }
  
  private String[][] obtenerDatos() {
    int x=0;
    String informacion[][] = new String[datosPer.size()][6];
    Iterator<Persona> itrPersona = datosPer.iterator();
    while(itrPersona.hasNext()){
       Persona persona = itrPersona.next();
       informacion[x][0] = persona.getNombre();
       informacion[x][1] = persona.getDirElect();
       informacion[x][2] = persona.getTelefono();
       informacion[x][3] = String.valueOf(persona.getDia());
       informacion[x][4] = String.valueOf(persona.getMes());
       informacion[x][5] = String.valueOf(persona.getAño());
       x++;
     }
     return informacion;
  }
}