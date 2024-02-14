import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Grouping {

    @Test(groups = {"sanity"})
    void test1(){
        System.out.println("test1");
    }

    @Test(groups = {"sanity"})
    void test2(){
        System.out.println("test2");
    }

    @Test(groups = {"smoke"})
    void test3(){
        System.out.println("test3");
    }

    @Test(groups = {"smoke"})
    void test4(){
        System.out.println("test4");
    }
}
