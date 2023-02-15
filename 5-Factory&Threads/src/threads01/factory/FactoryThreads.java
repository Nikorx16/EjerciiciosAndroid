
package threads01.factory;


public class FactoryThreads {
    private  static final  String COMANDANTE= "comandante";
    private  static final  String CENTURION= "CENTURION";
    private  static final  String SOLDADO= "SOLDADO";
    
     public static RomaSoldier getInstance(String soldierSelected){}
     
     
      public static PizzaBuilder getInstance(int pizzaSelected) {
        PizzaBuilder pizza = null;
        switch (pizzaSelected) {
            case HAWAII_PIZZA:
                pizza=new HawaiiPizzaBuilder();
                break;
            case PICANTE_PIZZA:
                pizza=new PicantePizzaBuilder();
                break;

        }
        return pizza;
}
