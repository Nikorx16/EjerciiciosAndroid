import director.Mesa;
import factory.PIZZA_FACTORY;
import abstract_builder.*;
// import buffer.*;

public class Main extends Thread {

    public static void main(String[] args) {

        // ---------------------------------

        // Aquie creamos el mundo del programa
        Mesa mesa = Mesa.getInstance();

        // ---------------------------------

        // Nosotros crearemos las dos clases que queremos gracias al factory
        PizzaBuilder barbacoa = PIZZA_FACTORY.getInstance(PIZZA_FACTORY.barbacoaMenu);
        PizzaBuilder picante = PIZZA_FACTORY.getInstance(PIZZA_FACTORY.picanteMenu);
        PizzaBuilder carbonara = PIZZA_FACTORY.getInstance(PIZZA_FACTORY.carbonaraMenu);
        PizzaBuilder pollo = PIZZA_FACTORY.getInstance(PIZZA_FACTORY.polloMenu);
        // ---------------------------------

        // Metemos dentro en los datos la clase creada
        mesa.setPizzaBuilder(barbacoa);
       
        // Podemos meter los datos que habiamos asignado
        mesa.construirPizza();
        System.out.println(Mesa.Show(barbacoa));

        // ---------------------------------

        // Metemos dentro en los datos la clase creada
        mesa.setPizzaBuilder(picante);
        // Podemos meter los datos que habiamos asignado
        mesa.construirPizza();
        System.out.println(Mesa.Show(picante));

        // ---------------------------------

        // procedemos a crear varios "servidores de gabo"

        mesa.setPizzaBuilder(carbonara);
        // Podemos meter los datos que habiamos asignado
        mesa.construirPizza();
        // -------------------------------------------
        System.out.println(Mesa.Show(carbonara));
        // ---------------------------------
        mesa.setPizzaBuilder(pollo);
        // Podemos meter los datos que habiamos asignado
        mesa.construirPizza();
        // -------------------------------------------
        System.out.println(Mesa.Show(pollo));

        // ---------------------------------

    }


}