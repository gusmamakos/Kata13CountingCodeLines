import org.junit.Test;

import static org.junit.Assert.*;

public class LineCounterTest {
    @Test
    public void TestLineCounter(){
        LineCounter lc = new LineCounter();
        lc.addLine("");
        lc.addLine("//");
        lc.addLine("/*");
        lc.addLine("*");
        lc.addLine("*/");
        lc.addLine("*****");
        lc.addLine("****");
        lc.addLine("   ");
        lc.addLine("  //");
        lc.addLine("  /*");
        lc.addLine("  *");
        lc.addLine("  */");
        lc.addLine("  *****");
        lc.addLine("  ****");
        lc.addLine("{");
        lc.addLine("}");
        lc.addLine("public");
        lc.addLine("abc");
        assertEquals("Failed",4,lc.lineCount);
    }

}