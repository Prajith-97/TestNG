import org.testng.annotations.Test;

public class SecondTest {
    @Test(priority = 1)
    void search(){
        System.out.print("Perform search");
    }

    @Test(priority = 2)
    void plp(){
        System.out.println("check plp");
    }

    @Test(priority = 3)
    void slp(){
        System.out.println("check slp");
    }
}
