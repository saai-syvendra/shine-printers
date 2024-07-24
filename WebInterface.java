public class WebInterface extends User implements Runnable {

    public WebInterface(SharedQueue printBuffer, String name) {
        super(printBuffer, name);
    }

    public void makeFiles(){
        for (int i = 0; i < 5; i++) {
            TextFile file = new TextFile();
            file.readAFile("job" + i + ".txt");
            files.add(file);
        }
    }
}
