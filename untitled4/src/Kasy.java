import sim.core.SimEvent;
import sim.core.SimManager;
import sim.random.SimGenerator;

public class Kasy extends SimEvent {
    SimGenerator simGenerator;
    int liczbaKlientow;
    int zajeteKasy = 0;
    public int obslKlienci = 0;
    public int czekajcyKlienci = 0;
    int liczbaKas = 5;

    public Kasy(SimManager simMngr, double delay, SimGenerator simGenerator) {
        super(simMngr, delay);
        this.simGenerator = simGenerator;
    }


    @Override
    protected void stateChange() {
        liczbaKlientow++;
        new Klient(getSimManager(),simGenerator.uniform(1,10) + simTime(), simGenerator, this);
        this.runTime = simGenerator.uniform(1,3) + simTime();
        getSimManager().registerEvent(this);
    }
}
