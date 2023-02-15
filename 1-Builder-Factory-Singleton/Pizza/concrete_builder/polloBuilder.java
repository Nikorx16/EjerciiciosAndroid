package concrete_builder;

import abstract_builder.PizzaBuilder;
//Esto es un maquina de crear Pollo en el que tenemos los parametros definidos
public class polloBuilder extends PizzaBuilder {

    @Override
    
    public void buildNombre() {
       super.pizza.setNombre("Pollo");
        
    }

    @Override
    public void buildRelleno() {
        super.pizza.setRelleno("POLLO CURRI");
        
    }

    @Override
    public void buildSala() {
        super.pizza.setSalsa("PO-4");
        
    }



    
}
