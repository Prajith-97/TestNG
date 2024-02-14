package toCheck;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {
    @Test(groups = {"smoke"})
    @Parameters("val1, val2")
    public void testCase1 (String value1, String value2) {
        System.out.println("This is the A Normal Test Case");
    }

    @Test(groups = {"regression"})
    public void beforeMethod () {
        System.out.println("This will execute before every Method");
    }
}
