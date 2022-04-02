import java.util.*;
public class AdmonPersona {
   static ArrayList<Persona> ArrPersona = new ArrayList<Persona>();
   private Persona objPersona;
   private int indice = 0;
   
   AdmonPersona() {}
   
   public void agregar(Persona p) {
      ArrPersona.add(p);
      indice++;         
   }
   
   public Persona consultar(int indice) {
      return ArrPersona.get(indice);
   }
   
   public void modificar(int indice, Persona p) {
      ArrPersona.set(indice, p);
   }
   
   public void eliminar(int indice){
      ArrPersona.remove(indice);
      this.indice--;
   }
   
   public int getCelda(String nombrePar) {
      if (indice == 0) {
         return -1;
      } else {
         for (int x=0; x < indice; x++) {
            if (ArrPersona.get(x).getNombre().equals(nombrePar)) {
                   return x;
            }
         }
      }
      return -1;
   }
   
   public int getIndice() {
      return this.indice;
   }
   
   public ArrayList Datos(){
     return ArrPersona;
  }
}