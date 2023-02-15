package factory;

import abstract_builder.PizzaBuilder;
import concrete_builder.*;

public class PIZZA_FACTORY {

    public final static int barbacoaMenu = 1;
    public final static int picanteMenu = 2;
    public final static int carbonaraMenu = 3;
    public final static int polloMenu = 4;

    public static PizzaBuilder getInstance(int ejemploSelected) {
        PizzaBuilder pizza = null;
        switch (ejemploSelected) {
            case barbacoaMenu:
                pizza = new barbacoaBuilder();
                break;
            case carbonaraMenu:
                pizza = new carbonaraBuilder();
                break;
            case picanteMenu:
                pizza = new picanteBuilder();
                break;
            case polloMenu:
                pizza = new polloBuilder();
                break;
        }
        return pizza;

    }
}
