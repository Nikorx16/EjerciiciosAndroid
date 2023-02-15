package version1;

public class Cajera {

    private String nombre;

    public Cajera() {
    }

    public Cajera(String nombre) {
        this.nombre = nombre;
    }

    public void accionComprar(Cliente cliente, long initialTime) {
        System.out.println("La cajera " + this.nombre
                + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre()+ 
                " EN EL TIEMPO: " + (System.currentTimeMillis() - initialTime) / 1000
                //INITIALTIME  muestra lo que lleva de tiempo desde que lo hemos iniciado en el main
                + "seg");
        //se muestra por pantalla

        for (int i = 0; i < cliente.getCarrito().length; i++) {
            //recorre el array
            this.esperarXsegundos(cliente.getCarrito()[i]);
            //espera el mismo valor del array en el que situa i
            System.out.println("Procesado el producto " + (i + 1)+
                    " del cliente " + cliente.getNombre()
                    + " ->Tiempo: " + (System.currentTimeMillis() - initialTime) / 1000
                    //INITIALTIME  muestra lo que lleva de tiempo desde que lo hemos iniciado en el main
                    + "seg");
             //se muestra por pantalla
        }
        System.out.println("La cajera " + this.nombre
                + " HA TERMINADO DE PROCESAR " + cliente.getNombre()
                + //INITIALTIME  muestra lo que lleva de tiempo desde que lo hemos iniciado en el main
                " EN EL TIEMPO: " + (System.currentTimeMillis() - initialTime) / 1000
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
}
