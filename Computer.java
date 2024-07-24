public class Computer extends User implements Runnable{

    public Computer(SharedQueue printBuffer, String name) {
        super(printBuffer, name);
    }
    
    public void makeFiles() {
        files.add(new TextFile(this.name + "(f1) : A concept without a concept is just a strategy!" ));
        files.add(new TextFile(this.name + "(f2): The best way to predict the future is to invent it."));
        files.add(new Object());
        files.add(new TextFile(this.name + "(f3) : Not being able to communicate, is like winking at a girl in the dark!"));
        files.add(new TextFile(this.name + "(f4) : Love yourself! Because everyone else is taken!"));
    }
    
    
}