package sim.core;

import java.util.PriorityQueue;

public class SimCalendar {
    PriorityQueue<SimEvent> simEventQueue = new PriorityQueue<>((simEvent1, simEvent2)-> {
        if (simEvent1.runTime > simEvent2.runTime)
            return 1;
        return -1;
    });

    void addEvent(SimEvent event) {
        simEventQueue.add(event);
    }

    public SimEvent removeFirstEvent() {
        return simEventQueue.poll();
    }
}
