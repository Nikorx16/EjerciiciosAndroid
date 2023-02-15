package director;

import abstract_builder.*;

public class Mesa {
    private static Mesa mesa;

    //SOLO UTILIZAMOS ESTO PARA EL FACTORY

    // ---------------------------------

    // Constructor vacio
    private Mesa() {
      
    }

    // ---------------------------------

    private PizzaBuilder pizzaBuilder;

    // ---------------------------------

    public static Mesa getInstance() {
        // si el mundo que creamos es nuevo este sera null
        if (mesa == null) {
            // dara la orden de crearlo
            mesa = new Mesa();
        }
        return mesa;

    }

    // ---------------------------------

    public void setPizzaBuilder(PizzaBuilder ejemploBuilder) {
        this.pizzaBuilder = ejemploBuilder;
    }

    // ---------------------------------

    public void construirPizza() {
        this.pizzaBuilder.crearNuevaPizza();
        this.pizzaBuilder.buildNombre();
        this.pizzaBuilder.buildRelleno();
        this.pizzaBuilder.buildSala();
    }

    // ---------------------------------

    public Pizza getEjemplo() {
        return this.pizzaBuilder.getPizza();
    }

    // ---------------------------------

    public static String Show(PizzaBuilder ejemplo) {
        String texto;
        texto = "nombre: " + ejemplo.getPizza().getNombre() + "| relleno:  " + ejemplo.getPizza().getRelleno() + "| salsa:  " + ejemplo.getPizza().getSalsa() ;
        return texto;
    }

    // ---------------------------------
}
