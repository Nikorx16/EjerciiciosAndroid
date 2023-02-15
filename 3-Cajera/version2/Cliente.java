package version2;

public class Cliente {
    private String nombre;
    private int[] carrito;

    public Cliente() {
    }

    public Cliente(String nombre, int[] carrito) {
        this.nombre = nombre;
        this.carrito = carrito;
    }

    public int[] getCarrito() {
        return carrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCarrito(int[] carrito) {
        this.carrito = carrito;
    }

    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}