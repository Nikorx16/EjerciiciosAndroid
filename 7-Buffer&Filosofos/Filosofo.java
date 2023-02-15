public class Filosofo extends Thread {
    private Mesa mesa;
    private int comensal;
    private Buffer buffer;
    //CONSTRUCTOR CON EL BUFFER
    public Filosofo(Buffer buffer, Mesa m, int comensal) {
        this.mesa = m;
        this.comensal = comensal;
        this.buffer = buffer;
    }
    //GETTERS Y SETTERS QUE UTILIZAREMOS DESDE LA CLASE RECEIVER

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public int getComensal() {
        return comensal;
    }

    public void setComensal(int comensal) {
        this.comensal = comensal;
    }


    @Override
    public void run() {
        /* ¿Tiene aspecto de patrón? */
        while (true) {
            this.pensando(); // Piensan todos a la vez
            this.mesa.cogerTenedores(comensal); // Se pelean por los tenedores
            buffer.sender(this); // Mandamos la informacion de la Thread que haya entrado.
            this.mesa.dejarTenedores(comensal); // Dejamos los tenedores


        }

    }

    public void comiendo() {
        System.out.println("Filósofo->" + comensal + " esta Comiendo. ");
        try {
            sleep((long) (Math.random() * 4000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pensando() {

        System.out.println("Filosofo->" + comensal + " Pensando. ");
        try {
            sleep((long) (Math.random() * 4000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
