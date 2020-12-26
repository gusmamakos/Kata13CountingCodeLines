import java.util.regex.Pattern;

public class LineCounter {
    int lineCount;

    public LineCounter() {
        this.lineCount = 0;
    }
    public void addLine(String line){
        if((!line.equals("")) && (!Pattern.compile("^\\s+$").matcher(line).matches())) {
            if(!Pattern.compile("^\\s*[/*].*$").matcher(line).matches()){
                this.lineCount++;
            }
        }
    }
    public int getLineCount(){
        return this.lineCount;
    }
}

