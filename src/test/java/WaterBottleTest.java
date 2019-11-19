import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void drink(){
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void empty(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void full(){
        WaterBottle smallwaterbottle = new WaterBottle(50);
        smallwaterbottle.full();
        assertEquals(100, smallwaterbottle.getVolume());
    }
}

