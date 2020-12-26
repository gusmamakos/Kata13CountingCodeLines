import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("sample1.txt"));
//        BufferedReader br = new BufferedReader(new FileReader("sample2.txt"));
        LineCounter lc = new LineCounter();
        String line;

        while ((line = br.readLine()) != null) {
            lc.addLine(line);
        }
        System.out.println(lc.lineCount + " lines of actual code were found.");
    }
}
