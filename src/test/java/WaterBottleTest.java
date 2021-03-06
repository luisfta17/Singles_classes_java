import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle(100);
    }


    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void drink(){
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void emptyBottle(){
        assertEquals(0, bottle.emptyBottle());
    }

    @Test
    public void refillBottle(){
        assertEquals(100, bottle.refillBottle());
    }

}
