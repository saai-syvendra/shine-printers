public class PrintJob {  
    String RESET = "\u001B[0m";
    String RED = "\u001B[31m"; 
    static int id;
    {
        id++;
    
    }
    TextFile textFile;
    String user;
    public PrintJob(Object textFile, String user)  throws TypeNotSupportedException {
        this.user = user;
        if (textFile instanceof TextFile) {
            this.textFile = (TextFile) textFile;
        } else {
            throw new TypeNotSupportedException(RED + "[TypeNotSupportedException] Unacceptable type. Please provide a TextFile." + RESET);
        }
    }
}
