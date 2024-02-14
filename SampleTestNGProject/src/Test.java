public class Test {


    @org.testng.annotations.Test(groups = "smoke")
    void test1(){
        System.out.println("Group 1");
    }

    @org.testng.annotations.Test
    void test12(){
        System.out.println("Group 2");
    }
}
