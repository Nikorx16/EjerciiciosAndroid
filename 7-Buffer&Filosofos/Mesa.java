import java.util.logging.Level;
import java.util.logging.Logger;

public class Mesa {
    private boolean[] tenedores; // ARRAY QUE GUARDA LOS TENEDORES

    public Mesa(int numTenedores) {
        this.tenedores = new boolean[numTenedores];
    }

    public int tenedorIzquierda(int comensal) {
        return comensal;
    }

    public int tenedorDerecha(int comensal) {
        if (comensal == 0) {
            return (this.tenedores.length - 1);
        } else {
            return (comensal - 1);
        }
    }

    

    public synchronized void cogerTenedores(int comensal) {
        boolean izquierda = tenedores[tenedorIzquierda(comensal)];
        boolean derecha = tenedores[tenedorDerecha(comensal)];
        // TENEDORES OCUPADOS
        while (izquierda || derecha) {
            try {
                wait();
                izquierda = tenedores[tenedorIzquierda(comensal)];
                derecha = tenedores[tenedorDerecha(comensal)];
            } catch (InterruptedException ex) {
                Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // TENEDORES LIBRES
        tenedores[tenedorIzquierda(comensal)] = true;
        tenedores[tenedorDerecha(comensal)] = true;
    }

    public synchronized void dejarTenedores(int comensal) {
        tenedores[tenedorIzquierda(comensal)] = false;
        tenedores[tenedorDerecha(comensal)] = false;
        notifyAll();
    }
}
