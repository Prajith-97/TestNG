package toCheck;

import org.testng.annotations.Test;

public class groups {



        @Test(groups = {"smoke"})
        public void testCase1 () {
            System.out.println("This is the A Normal Test Case");
        }

        @Test(groups = {"regression"})
        public void beforeMethod () {
            System.out.println("This will execute before every Method");
        }

        @Test(groups ={"smoke"})
        public void afterMethod () {
            System.out.println("This will execute after every Method");
        }

    }
