public class UnObservador implements IObservador
{
    private String nombre;

    // ---------------------------------

    public UnObservador(String nombre) {
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

    /**
     * 
     */
    @Override
    public void observadoActualizado(String direccion) {
     System.out.println("Observador [" + this.getNombre() + "] recibe la notificación   " +direccion);
     }

}