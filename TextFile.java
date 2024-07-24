import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFile {
    public String content;
    public void readAFile(String filePath) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            sb.deleteCharAt(sb.length() - 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        content = sb.toString();
    }
    public TextFile() {};
    public TextFile(String s) {
        this.content = s;
    }
}
