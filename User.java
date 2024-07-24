import java.util.ArrayList;

abstract class User {
    String name;
    SharedQueue printBuffer;
    ArrayList<Object> files = new ArrayList<>();

    public User(SharedQueue printBuffer, String name) {
        this.printBuffer = printBuffer;
        this.name = name;   
        makeFiles();
    }

    public abstract void makeFiles();

    public void run() {
        for (Object file : files) {
            try {
                PrintJob printJob = new PrintJob(file, this.name);
                printBuffer.addJob(printJob);
            } catch (TypeNotSupportedException e) {
                System.out.println(e.getMessage());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }   
    }
}
