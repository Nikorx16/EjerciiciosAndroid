import java.util.ArrayList;

public abstract class Lider
{
    private ArrayList<IObservador> suscriptores = new ArrayList<IObservador>();
    private String direccion="";
    private String nombre="";
    // ---------------------------------

   public Lider(){
    
   }
    public Lider(String nombre) {
        this.nombre= nombre;
    }
    
     public void setDirecccion(String direccion) {
         this.direccion = direccion;
     }
      public String getDirecccion() {
          return direccion;
      }
      public String getNombre() {
          return nombre;
      }
      public void setNombre(String nombre) {
          this.nombre = nombre;
      }
    // ---------------------------------

    public void agregarObservador(IObservador o)
    {
        suscriptores.add(o);
    }

    // ---------------------------------

    public void eliminarObservador(IObservador o) 
    {
        suscriptores.remove(o);
    }
     // ---------------------------------

     public void notificarObservador()
     {
         // Según nuestro ejemplo, cada vez que se agregue un nuevo observador, los existentes serán notificados
         notificarsuscriptores(this.direccion);
     }

    // ---------------------------------

    public void notificarsuscriptores(String direccion)
    {
        // Enviar la notificación a cada observador a través de su propio método
        for (IObservador obj : suscriptores) {
            obj.observadoActualizado(this.direccion);
        }
    }
}