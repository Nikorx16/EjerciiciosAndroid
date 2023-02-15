package Concrete;

import Interface.Conectable;

public class Lampara implements Conectable{

    //damos valor al interruptor
    private boolean encendida; 

    //Traemos los metodos
    @Override
    public boolean isEncendida() {
        return this.encendida;
    }

    @Override
    public void encender() {
        this.encendida=true;
    }

    @Override
    public void apagar() {
        this.encendida=false;
        
    }

    
}
