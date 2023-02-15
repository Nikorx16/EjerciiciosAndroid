package version2;

public class Cajera extends Thread{

    private String nombre;

    private Cliente cliente;

    private long initialTime;
 
    @Override
    public void run() {
        System.out.println("La cajera " + this.nombre
                + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre()+ 
                " EN EL TIEMPO: " + (System.currentTimeMillis() - initialTime) / 1000
                //INITIALTIME  muestra lo que lleva de tiempo desde que lo hemos iniciado en el main
                + "seg");
        //se muestra por pantalla

        for (int i = 0; i < this.cliente.getCarrito().length; i++) {
            //recorre el array
            this.esperarXsegundos(cliente.getCarrito()[i]);
            //espera el mismo valor del array en el que situa i
            System.out.println("Procesado el producto " + (i + 1)+
                    " del cliente " + this.cliente.getNombre()
                    + " ->Tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000
                    //INITIALTIME  muestra lo que lleva de tiempo desde que lo hemos iniciado en el main
                    + "seg");
             //se muestra por pantalla
        }
        System.out.println("La cajera " + this.nombre
                + " HA TERMINADO DE PROCESAR " + this.cliente.getNombre()
                + //INITIALTIME  muestra lo que lleva de tiempo desde que lo hemos iniciado en el main
                " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000
                + "seg");
         //se muestra por pantalla
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
            //suspendido el valor del array y lo multiplica por 1 segundo:
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            //en caso de fallar se usara el metodo interrupt
        }
    }
     public Cajera() {
    }

    public Cajera(String nombre, Cliente cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public String getNombre() {
        return nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }
}
