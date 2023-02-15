package concrete_builder;

import abstract_builder.PizzaBuilder;
//Esto es un maquina de crear Picante en el que tenemos los parametros definidos
public class picanteBuilder extends PizzaBuilder {

    @Override
    
    public void buildNombre() {
       super.pizza.setNombre("Picante");
        
    }

    @Override
    public void buildRelleno() {
        super.pizza.setRelleno("Pimientos");
        
    }

    @Override
    public void buildSala() {
        super.pizza.setSalsa("PC-2");
        
    }




    
}
