package sim.core;

public abstract class SimEvent {

    public double runTime;
    protected abstract void stateChange();
    SimManager simMngr;

    public double simTime() {
        if (simMngr != null)
            return simMngr.simTime();
        else
            return 0;
    }

    public SimManager getSimManager() {
        return simMngr;
    }

    protected SimEvent(SimManager simMngr, double runTime) {
        this.simMngr=simMngr;
        this.runTime = runTime;
        simMngr.registerEvent(this);
    }
}
