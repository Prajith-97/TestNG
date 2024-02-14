import org.testng.annotations.*;

public class TC2 {

    @BeforeClass
    void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("After Class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("before method will execute before every test method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("after method will execute after every test method");
    }

//    @Test
//    void test3(){
//        System.out.println("third test");
//    }
//    @Test
//    void test4(){
//        System.out.println("fourth test");
//    }
}
