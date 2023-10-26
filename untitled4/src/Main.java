import sim.core.SimManager;
import sim.random.SimGenerator;

public class Main {
    public static void main(String[] args) {
        System.out.println("POCZĄTEK SYMULACJI");
        System.out.println("");

        SimGenerator simGenerator = new SimGenerator();
        SimManager simMngr = SimManager.getInstance();
        simMngr.setEndSimTime(50);
        Kasy kasy = new Kasy(simMngr, 5, simGenerator);
        simMngr.startSimulation(0);

        System.out.println("");
        System.out.println("KONIEC SYMULACJI");
        System.out.println("Obsłuzonych klientów: " + kasy.obslKlienci);
        System.out.println("Nieobsluzonych klientów: " + kasy.czekajcyKlienci);


    }
}
