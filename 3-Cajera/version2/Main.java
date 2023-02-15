package version2;

public class Main extends Thread{

  
    public static void main(String[] args) {
       
        Cliente cliente1 = new Cliente("Cliente 1", new int[]{2, 2, 1,5,2,3});
        Cliente cliente2 = new Cliente("Cliente 2", new int[]{1, 3, 5,1,1});
         //Creamos clientes con nombre y su compra
        
         long initialTime = System.currentTimeMillis();
        // Tiempo inicial de referencia
        
        Cajera cajera1 = new Cajera("Cajera 1", cliente1, initialTime);
	Cajera cajera2 = new Cajera("Cajera 2", cliente2, initialTime);
            //Creamos cajera con nombre
       
        cajera1.start();
        cajera2.start();
       //Aunque hayamos puesto dos objetos de la clase Cajera (cajera1 y cajera2) no significa que tengamos dos cajeras independientes, lo que estamos diciendo es que dentro del mismo hilo 
        //se ejecute primero los métodos de la cajera1 y después los métodos de la cajera2, por tanto a nivel de procesamiento es como si tuviésemos una sola cajera:
        
    }
    
}
    