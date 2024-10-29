package process_scheduler_sim.logic;

public class Process {
    // Initialize attributes
    private String pid;
    private int burstTime, arrivalTime;
    public int priority, waitingTime;
    

    // Constructor to intialize attributes
    public Process(String pid, int burstTime, int arrivalTime, int priority, int waitingTime) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.arrivalTime = arrivalTime;
        this.priority = priority;
        this.waitingTime = waitingTime;
    }

    // Return Process info
    public void printProcessInfo() {
        System.out.printf("Process info:\nPID: %d\nBurst Time: %d\nArrival Time: %d\nPriority: %d\nWaiting time: %d\n", 
        pid, burstTime, arrivalTime, priority, waitingTime);
    }
}