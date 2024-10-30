package process_scheduler_sim.logic;
import java.util.List;

public class Scheduler {

    public enum SchedulerType {
        FCFS,
        SJF,
        ROUND_ROBIN,
        PRIORITY
    }

    public void runScheduler(SchedulerType type) {
        switch (type) {
            case FCFS:
                fcfs(processList);
                break;
            case SJF:
                sjf();
                break;
            case ROUND_ROBIN:
                roundRobin();
                break;
            case PRIORITY:
                priority();
                break;
        }
    }

    public void fcfs(List<Process> processList) {
        int currentTime = 0;
        for(Process process : processList) {
            int waitingTime = currentTime - process.getArrivalTime();
            process.setWaitingTime(waitingTime);
            currentTime += process.getBurstTime();
            int turnAroundTime = currentTime - process.getArrivalTime();
            process.setTurnAroundtime(turnAroundTime);
            System.out.println("Process " + process.getPid() + ": Waiting Time = " + process.getWaitingTime() + ", Turnaround TIme = " + process.getTurnAroundTime();
        }

    }

    public void sjf() {
        return;
    }

    public void roundRobin() {
        return;
    }

    public void priority() {
        return;
    }
}