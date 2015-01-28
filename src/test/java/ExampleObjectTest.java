import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by stephenwa on 28/01/15.
 */
public class ExampleObjectTest {

    @Test
    public void testObject() {
        ExampleClass exampleClass = new ExampleClass("John");
        Assert.assertEquals("Aeert that the name is as expected",exampleClass.getName(), "John");
    }
}
