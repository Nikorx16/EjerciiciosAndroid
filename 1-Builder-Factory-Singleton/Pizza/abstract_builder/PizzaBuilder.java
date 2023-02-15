package abstract_builder;

//esta es una clase abstracta porque solo mandamos cosas al ejemplo
public abstract class PizzaBuilder {
    protected Pizza pizza;

    // asi creamos ejemplos de nuestra fabrica
    public void crearNuevaPizza() {
        this.pizza = new Pizza();
    }

    // ---------------------------------

    // devolvemos el ejemplo
    public Pizza getPizza() {
        return this.pizza;
    }

    // ---------------------------------

    public abstract void buildNombre();

    // ---------------------------------

    public abstract void buildRelleno();

    // ---------------------------------

    public abstract void buildSala();

    // factoty-------------------------------------------------------------------

}
