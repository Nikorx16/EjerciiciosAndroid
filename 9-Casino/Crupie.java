import java.util.Random;


public class Crupie extends Thread{
    private int numero;
    Random r = new Random();
    private int dinero;

    public Crupie(int dinero){
        this.dinero=dinero;

    }

   
    public int sacarnumero(){
        try {
            sleep((long) (Math.random() * 3000));
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        numero=r.nextInt(5)+1;
        return numero ;
    }


    public void restar() {
      dinero=dinero-360;
    }


    public void sumar() {
      dinero=dinero+10;
    }

    public int getDinero() {
        return dinero;
    }

   

}
