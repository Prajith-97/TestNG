import org.testng.annotations.*;

public class TC1 {


    @BeforeClass
    void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("After Class");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("Executes before test starts");
    }

    @AfterTest
    void afterTest(){
        System.out.println("Executes after test");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("before method will execute before every test method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("after method will execute after every test method");
    }
//
//    @Test
//    void test1(){
//        System.out.println("first test");
//    }
//    @Test
//    void test2(){
//        System.out.println("second test");
//    }
}
