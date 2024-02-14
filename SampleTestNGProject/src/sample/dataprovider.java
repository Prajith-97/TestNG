package sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {

    @DataProvider(name = "Testdata")
    public Object[][] dataprovider(){
        return new Object[][] {{"first Value"}, {"Second value"}};
    }

    @Test(dataProvider = "Testdata")
    void test1(String value){
        System.out.println(value);
    }
}
