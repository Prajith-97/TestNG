public class customDataProvider {
    @org.testng.annotations.DataProvider(name = "loginData")
    public Object[][] getdata(){
        Object[][] data = {{"abc@gmail.com", "abc"}, {"xyz@gmail.com", "xyz"}};
        return data;
    }
}
