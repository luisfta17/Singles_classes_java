import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 500);
    }

    @Test
    public void hasSheets(){
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void printPages(){
        printer.print(10, 5);
        assertEquals(50, printer.getSheets());
        assertEquals(450, printer.getToner());
    }
    @Test
    public void refillPages(){
        printer.refillPages();
        assertEquals(200, printer.getSheets());
    }

    @Test
    public void hasToner(){
        assertEquals(500, printer.getToner());
    }
}
