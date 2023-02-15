import java.util.concurrent.ThreadLocalRandom;

public class Receiver implements Runnable {
    private Buffer buffer;
    // private Cerveza cerveza;

    // standard constructors
    public Receiver(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (Filosofo receivedMessage = buffer.receive(); !"End".equals(receivedMessage); receivedMessage = buffer
                .receive()) {
            receivedMessage.comiendo(); // El Filosofo come
            System.out.println("Filosofo->" + receivedMessage.getComensal() + " deja de comer, tenedores libres "
                    + (receivedMessage.getMesa().tenedorIzquierda(receivedMessage.getComensal())) + ", "
                    + (receivedMessage.getMesa().tenedorDerecha(receivedMessage.getComensal())) + " .\n "
                    + receivedMessage.getComensal());

            // Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 7000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
    }
}