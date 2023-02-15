import Concrete.Lampara;
import Concrete.Ordenador;
import Interface.Conectable;

public class Main {

    public static void main(String[] args) {
        // Inicializamos
        Conectable lampara = new Lampara();
        Conectable ordenador = new Ordenador();
        // Encendemos mediante el inteface
        encenderAparato(lampara);
        apagarAparato(ordenador);

        System.out.println("esta encendidaa: " + lampara.isEncendida());
        System.out.println();
    }

    private static void apagarAparato(Conectable aparato) {
        aparato.apagar();
        System.out.println(aparato.isEncendida());
    }

    private static void encenderAparato(Conectable aparato) {
        aparato.encender();
        System.out.println(aparato.isEncendida());
    }

}