package ya.deneno.steptest.testOne;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    private MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber() {
        Assert.assertTrue(mainClass.getLocalNumber() + " != 14", mainClass.getLocalNumber() == 14);
    }
}
