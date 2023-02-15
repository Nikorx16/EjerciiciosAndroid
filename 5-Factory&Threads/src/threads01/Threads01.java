package threads01;
//Herencia simple

public class Threads01 extends Thread {

    public Threads01(String threadName) {
//Pasasmos nombre del hilo
        super(threadName);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + super.getName());
            System.out.println("Termina thread " + super.getName());

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        new Threads01("COMANDANTE").start();
//        new Threads01("COMANDANTE").start();
//        System.out.println(" termina programacion  threa");
        new Thread(new SoldierRunnable(), "Comandante").start();
        new Thread(new SoldierRunnable(), "Centurion").start();
        System.out.println("yermina programa threads().");
            
    }

}
