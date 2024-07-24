import java.util.LinkedList;
import java.util.Queue;

public class SharedQueue {

    // Create a printBuffer shared by producer and consumer
    // Size of printBuffer is 2.
    Queue<PrintJob> printBuffer = new LinkedList<>();
    int capacity = 5;
    String RESET = "\u001B[0m";
    String GREEN = "\u001B[32m";
    String YELLOW = "\u001B[33m";


    // Function called by producer thread
    public void addJob(PrintJob job) throws InterruptedException {
        synchronized (this) {
            // producer thread waits while printBuffer
            // is full
            while (printBuffer.size() == capacity) {
                wait();
            }
            System.out.println(GREEN + "Added job of " + job.user + RESET);

            // to insert the jobs in the printBuffer
            printBuffer.add(job);

            // notifies the consumer thread that
            // now it can start consuming
            notify();

            // makes the working of program easier
            // to understand
            Thread.sleep(1000);
        }
    }

    // Function called by consumer thread
    public void startJob() throws InterruptedException {
        synchronized (this) {
            // consumer thread waits while printBuffer
            // is empty
            while (printBuffer.size() == 0) {
                wait();
            }

            // to retrieve the first job in the printBuffer
            PrintJob job = printBuffer.remove();

            System.out.println(YELLOW + "Printed job of " + job.user + RESET);
            System.out.println(job.textFile.content);

            // Wake up producer thread
            notify();

            // and sleep
            Thread.sleep(1000);
        }
    }
}
