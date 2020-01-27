package basicjava;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestHypotenuse {
    @Test
    public void HypotenuseTest(){
        Assert.assertEquals(5.0, Hypotenuse.calculateHypotenuse(3.0,4.0), 0.001);
    }
}
