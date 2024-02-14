import javafx.scene.layout.Priority;
import org.testng.annotations.Test;

public class FirstTest {

    @Test(priority = 1)
    void setUp(){
      System.out.print("launch browser");
    }

    @Test(priority = 2)
    void login(){
        System.out.println("login the application");
    }

    @Test(priority = 3)
    void tearDown(){
        System.out.println("close the browser");
    }
}
