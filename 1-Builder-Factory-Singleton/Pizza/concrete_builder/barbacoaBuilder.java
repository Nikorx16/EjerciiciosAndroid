package concrete_builder;

import abstract_builder.PizzaBuilder;
//Esto es un maquina de crear Barbacoa en el que tenemos los parametros definidos
public class barbacoaBuilder extends PizzaBuilder {

    @Override
    
    public void buildNombre() {
       super.pizza.setNombre("Barbacoa");
        
    }

    @Override
    public void buildRelleno() {
        super.pizza.setRelleno("BQ");
        
    }

    @Override
    public void buildSala() {
        super.pizza.setSalsa("BQ-1");
        
    }




    
}
