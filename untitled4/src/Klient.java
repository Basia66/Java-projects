import sim.core.SimEvent;
import sim.core.SimManager;
import sim.random.SimGenerator;

public class Klient extends SimEvent {

    int id;
    static int newId = 1;
    double czasObsl;
    SimManager simMngr;
    Kasy kasy;
    SimGenerator simGenerator;
    boolean jestObsl = false;

    public Klient(SimManager simMngr, double delay, SimGenerator simGenerator, Kasy kasy) {
        super(simMngr, delay);
        this.simMngr = simMngr;
        this.kasy = kasy;
        this.id = newId;
        this.simGenerator = simGenerator;
        this.czasObsl = simGenerator.uniform(2, 5) + delay;

    }

    @Override
    protected void stateChange() {
        if(this.simMngr.simTime() != this.czasObsl) {
            simMngr.registerEvent(this);
            this.runTime = czasObsl;
            System.out.println(simTime() + ": Klient " + this.id + " stanął w kolejcę");
            newId += 1;

            if(kasy.zajeteKasy < kasy.liczbaKas) {
                kasy.zajeteKasy++;
                //kasy.obslKlienci++;
                System.out.println("Liczba zajętych kas: " + this.kasy.zajeteKasy);
                jestObsl = true;
            }
            else {
                System.out.println("Brak wolnych kas - klient " + this.id + " rezygnuje z zakupów");
                kasy.czekajcyKlienci++;
            }
        }
        else if(jestObsl) {
            System.out.println(simTime() + " Klient " + this.id + " został obsłużony.");
            kasy.zajeteKasy--;
            kasy.obslKlienci++;
            System.out.println("Liczba zajetych kas: " + kasy.zajeteKasy);
        }

    }
}
