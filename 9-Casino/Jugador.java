import java.util.Random;


public class Jugador implements Runnable {
    private int dinero;
    private boolean valor;
    private boolean valorcrupie; 
    private String nombre;
    private Crupie crupie;
    private int numero;
    private Random r = new Random();

    public Jugador(int dinero, String nombre, Crupie crupie, boolean valor, boolean valorcrupie){
        this.dinero=dinero;
        this.nombre=nombre;
        this.crupie=crupie;
        this.valor=valor;
        this.valorcrupie=valorcrupie;

    }

    @Override
    public void run() {
        
        int numeroCrupie;
        while (dinero>0) {
            numero=sacarnumero();
            numeroCrupie=crupie.sacarnumero();
            if (numero==numeroCrupie) {
                dinero=dinero+300;
                System.out.println(nombre + " he ganado/me quedan: " + dinero) ;
                crupie.restar();
                System.out.println(crupie.getDinero());
                if(crupie.getDinero()<=0){
                    System.out.println("La banca se ha quedado sin dinero");
                    setValorcrupie(false);
                    Thread.interrupted();
                 
                }
            } else {
                dinero=dinero-10;
                System.out.println(nombre + " he perdido/me quedan: " + dinero );
                crupie.sumar();
                if(dinero<=0){
                     valor=false;
                     System.out.println(nombre+ " me quede sin dinero");
                }
            }
        }  
    }

    
    

    private int sacarnumero() {
        numero = r.nextInt(5)+1;
    return numero;
    }

    public String getNombre() {
        return nombre;
    }
    
     public void setDinero(int dinero) {
         this.dinero = dinero;
     }

     public int getDinero() {
         return dinero;
     }

     public boolean getValorcrupie() {
        return valorcrupie;
    }
      
       public void setValorcrupie(boolean valorcrupie) {
           this.valorcrupie = valorcrupie;
       }
 }
