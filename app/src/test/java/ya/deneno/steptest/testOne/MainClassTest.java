package ya.deneno.steptest.testOne;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    private MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber() {
        Assert.assertTrue(mainClass.getLocalNumber() + " != 14", mainClass.getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue(mainClass.getClassNumber() + " <= 45", mainClass.getClassNumber() > 45);
    }

    @Test
    public void testGetClassString() {
        Assert.assertTrue(
                mainClass.getClassString() + " not contains \"Hello\" or \"hello\"",
                mainClass.getClassString().contains("hello")
                        || mainClass.getClassString().contains("Hello")
        );
    }
}
