class Printer implements Runnable{
    SharedQueue printBuffer;
    String name;

    public Printer(SharedQueue printBuffer, String name) {
        this.printBuffer = printBuffer;
        this.name = name;
    }

    public void run() {
        while(true){
            try {
                printBuffer.startJob();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}