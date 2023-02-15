package concrete_builder;

import abstract_builder.PizzaBuilder;
//Esto es un maquina de crear Carbonara en el que tenemos los parametros definidos
public class carbonaraBuilder extends PizzaBuilder {

    @Override
    
    public void buildNombre() {
       super.pizza.setNombre("Carbonara");
        
    }

    @Override
    public void buildRelleno() {
        super.pizza.setRelleno("Vegetal/carne");
        
    }

    @Override
    public void buildSala() {
        super.pizza.setSalsa("CB-3");        
    }

 
    
}
