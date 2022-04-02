public class Persona {
   private String nombre;
   private String dirElect;
   private String telefono;
   private int dia;
   private int mes;
   private int año;
   
   Persona() {}
   
   Persona(String nombre, String telefono, String dirElect, int dia, int mes, int año){
      this.nombre = nombre;
      this.telefono = telefono;
      this.dirElect = dirElect;
      this.dia = dia;
      this.mes = mes;
      this.año = año;
   }
   
   public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirElect() {
        return dirElect;
    }

    public void setDirElect(String dirElect) {
        this.dirElect = dirElect;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}