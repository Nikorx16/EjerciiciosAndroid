import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        try (Scanner leer = new Scanner (System.in)) {
            String direccion="";

            UnObservado lider = new UnObservado("lider");
            System.out.println("dame una direccion");
            direccion=leer.next();
            lider.setDirecccion(direccion);
            // Instanciar y registrar otro Observador
            UnObservador avion1  = new UnObservador("Observador1");
            lider.agregarObservador(avion1);
            // Instanciar y registrar otro Observador
            UnObservador avion2 = new UnObservador("Observador2");
            lider.agregarObservador(avion2);
            //Llamamos al ultimo de la lista
            lider.notificarObservador();
        }

    }
}