package basicjava;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestOddEven {
    @Test
    public void OddEvenTest(){
        Assert.assertEquals(true,OddEven.isOdd(-3));
    }
}
