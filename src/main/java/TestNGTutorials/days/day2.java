package TestNGTutorials.days;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

    @Test(groups = "Smoke")     // {} are optional i think
    public void loan(){
        System.out.println("good");
    }

    @BeforeTest
    public void prequisite(){
        System.out.println("I am Before Test Annotation");
    }
}
