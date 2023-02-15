public class Principal {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Thread receiver = new Thread(new Receiver(buffer));
        Mesa mesa = new Mesa(5);
        
       
        for (int i = 0; i < 5; i++) {
            Filosofo f = new Filosofo(buffer, mesa, i);
            f.start();
        }
        receiver.start();

    }
}
