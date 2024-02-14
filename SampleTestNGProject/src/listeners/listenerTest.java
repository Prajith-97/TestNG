package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.customListner.class)
public class listenerTest {

    @Test
    void Test1(){
        System.out.println("Test1");
        Assert.assertEquals("a", "a");
    }

    @Test
    void Test2(){
        System.out.println(("Test2"));
        Assert.assertEquals("a", "b");
    }

    @Test
    void Test3(){
        System.out.println(("Test3"));
        throw new SkipException("Skip");
    }
}
