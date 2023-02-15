public class Main {
    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        final int numJugadores = 1;
        final int dineroJugador = 1000;
        final int dineroCrupie = 1000;
        int resto = numJugadores;

        Crupie crupie = new Crupie(dineroCrupie);
        Jugador[] jugador = new Jugador[numJugadores];
        Thread[] hilosAsociados = new Thread[numJugadores];

        for (int i = 0; i < numJugadores; i++) {
            String nombreHilo = "Jugador " + i;
            jugador[i] = new Jugador(dineroJugador, nombreHilo, crupie, true , true);
            hilosAsociados[i] = new Thread(jugador[i]);
            hilosAsociados[i].start();
            if (numJugadores == i+1) {
                while (resto > 0) {
                    if (jugador[i].getDinero() <= 0) {
                        System.out.println(jugador[i].getNombre() + "--> Se ha quedado sin banca");
                        resto = resto - 1;
                        hilosAsociados[i].wait();
                    }
                    if (jugador[i].getValorcrupie()==false) {
                        System.out.println("Se acabo el juego perdio la banca-------------------------------------------");
                        for (int j = 0; j < numJugadores; j++) {
                        hilosAsociados[j].wait();
                        }
                        resto = 0;
                    }

                }
            }

        }

    }

}
