public class Main{
    public static void main(String[] args){
        SharedQueue printBuffer = new SharedQueue();
        Computer computer1 = new Computer(printBuffer, "Computer1");
        Computer computer2 = new Computer(printBuffer, "Computer2");
        Computer computer3 = new Computer(printBuffer, "Computer3");
        Printer printer1 = new Printer(printBuffer, "Printer1");
        Printer printer2 = new Printer(printBuffer, "Printer2");
        WebInterface webInterface = new WebInterface(printBuffer, "webInterface");
        Thread t1 = new Thread(computer1);
        Thread t2 = new Thread(computer2);
        Thread t3 = new Thread(computer3);
        Thread t4 = new Thread(printer1);
        Thread t5 = new Thread(printer2);
        Thread t6 = new Thread(webInterface);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t6.setPriority(2);
    }
}