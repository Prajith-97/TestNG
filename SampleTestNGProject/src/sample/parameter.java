package sample;

import org.openqa.selenium.ElementNotVisibleException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class parameter {


    private Object expectedExceptions;

    @Test
    @Parameters({"val1", "val2"})
    void test1(int val1,int val2){
        int sum = val1+val2;
        System.out.println(sum);
    }

    @Test(expectedExceptions = {ElementNotVisibleException.class})
    @Parameters({"val1", "val2"})
    void test2(int val1,int val2){
        int sum = val1+val2;
        System.out.println(sum);
    }
}
