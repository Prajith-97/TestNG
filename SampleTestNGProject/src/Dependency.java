import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {

    @Test
    void startCar(){
        System.out.println("start car");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar(){
        System.out.println("Stop car");
    }

    @Test
    void driveCar(){
        System.out.println("Drive car");
        Assert.fail();
    }


    @Test(dependsOnMethods = {"driveCar", "stopCar"},alwaysRun = true)
    void parkCar(){
        System.out.println("Park car");
    }
}
