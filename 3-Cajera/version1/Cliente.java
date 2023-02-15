/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

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