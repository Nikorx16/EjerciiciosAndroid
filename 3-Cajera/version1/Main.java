package version1;


public class Main extends Thread{

  
    public static void main(String[] args) {
       
        Cliente cliente1 = new Cliente("Cliente 1", new int[]{2, 2, 1,5,2,3});
         //Creamos clientes con nombre y su compra
        
        Cajera cajera1 = new Cajera("Cajera 1");
        //Creamos cajera con nombre
        
        
        long initialTime = System.currentTimeMillis();
        // Tiempo inicial de referencia
        
        cajera1.accionComprar(cliente1, initialTime);
        //Iniciamos la funcion accionCompra que pasamos a la cajera el cliente y el tiempo
        
       
    }
    
}
