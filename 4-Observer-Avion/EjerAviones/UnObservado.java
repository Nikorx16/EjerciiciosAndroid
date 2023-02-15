public class UnObservado extends Lider
{
    private String nombre;

    
    // ---------------------------------
    public UnObservado(String nombre) {
        this.setNombre(nombre);
    }
    
    // ---------------------------------

    public String getNombre() {
        return this.nombre;
    }

    // ---------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // ---------------------------------

}