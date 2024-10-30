package process_scheduler_sim.logic;

public class Process {
    // Initialize attributes
    private String pid;
    private int burstTime, arrivalTime, priority, waitingTime, turnAroundTime;
    
    
    // Constructor to intialize attributes, excluding waitingTime and turnAroundTime
    public Process(String pid, int burstTime, int arrivalTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.arrivalTime = arrivalTime;
        this.priority = priority;
    }
    
    // Get pid
    public String getPid() {
        return pid;
    }

    // Get burstTime
    public int getBurstTime() {
        return burstTime;
    }

    // Get arrival time 
    public int getArrivalTime() {
        return arrivalTime;
    }

    // Get priority
    public int getPriority() {
        return priority;
    }

    // Get waiting time 
    public int getWaitingTime() {
        return waitingTime;
    }

    // Get turnAroundTime
    public int getTurnAroundTime() {
        return turnAroundTime;
    }

    // Set process wait time
    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }
    
    
    // Set process turn around time
    public void setTurnAroundtime(int turnAroundTime) {
        this.turnAroundTime = turnAroundTime;
    }


    // Return Process info
    public void printProcessInfo() {
        System.out.printf("Process info:\nPID: %d\nBurst Time: %d\nArrival Time: %d\nPriority: %d\nWaiting time: %d\nTAT: %d\n", 
        pid, burstTime, arrivalTime, priority, waitingTime, turnAroundTime);
    }
}