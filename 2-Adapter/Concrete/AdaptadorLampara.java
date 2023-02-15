
package Concrete;

import Interface.Conectable;

public class AdaptadorLampara implements Conectable {
    private LamparaInglesa lampInglesa = new LamparaInglesa();

    @Override
    public boolean isEncendida() {
        return this.lampInglesa.isOn();
    }

    @Override
    public void encender() {
        this.lampInglesa.on();
    }

    @Override
    public void apagar() {
        this.lampInglesa.off();
    }

}
