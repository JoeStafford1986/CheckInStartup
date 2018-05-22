import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BagTest {
    Bag bag;


    @Before
    public void before() {
        bag = new Bag(10);
    }


    @Test
    public void canGetBagWeight() {
        assertEquals(10, bag.getWeight());
    }
}
