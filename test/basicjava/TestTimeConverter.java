package basicjava;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestTimeConverter {
    @Test
    public void TimeConverterTest(){
        Assert.assertEquals(3661, TimeConverter.TimeConverter(1,1,1));
    }
}
