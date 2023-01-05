package TestNGTutorials.days;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

    @Test
    public void Demo(){
        System.out.println("hello");
    }

    @Test
    public void SecondTest(){
        System.out.println("Bye");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("I am After Suite Annotation . I will execute last");
    }

    @AfterTest
    public void lastExecution(){
        System.out.println("I am After Test Annotation. I will execute after the tests in the day1 class are done");
    }

}
