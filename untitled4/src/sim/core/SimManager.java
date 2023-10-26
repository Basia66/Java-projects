package sim.core;

public class SimManager {
    double startSimTime;
    double endSimTime;
    double currentSimTime;

    static SimManager simMngr;
    boolean simulationStarted;

    SimCalendar simCalendar = new SimCalendar();

    public static SimManager getInstance() {
        if(simMngr == null) {
            simMngr = new SimManager();
        }
        return simMngr;
    }

    private SimManager(){
    }

    public void registerEvent(SimEvent event) {
        simCalendar.addEvent(event);
    }

    public double simTime() {
        return currentSimTime;
    }

    public void startSimulation(double startSimTime) {
        simulationStarted = true;
        this.startSimTime = startSimTime;
        while (simCalendar.simEventQueue.size() > 0 && this.endSimTime > simTime()) {
            nextEvent();
        }
    }

    public void stopSimulation() {
        simulationStarted = false;
    }

    public void setEndSimTime(double endSimTime) {
        this.endSimTime = endSimTime;
    }

    public void nextEvent() {
        SimEvent simEvent = simCalendar.removeFirstEvent();
        this.currentSimTime = simEvent.runTime;
        simEvent.stateChange();
    }
}