import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DataProvider {

    @Test(dataProvider = "loginData", dataProviderClass=customDataProvider.class)
    void loginTest(String email, String password){
        System.out.println(email+ "" +password);
    }
    @Test(dataProvider = "loginDta")
    void test1(){

    }


}
