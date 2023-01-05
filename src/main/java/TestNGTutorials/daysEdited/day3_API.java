package TestNGTutorials.daysEdited;

import org.testng.annotations.*;

public class day3_API {

    @Parameters({"URL", "APIKey/username"})

    @Test
    public void webLoginCarLoan(String URL, String key){
        System.out.println("webLoginCarLoan");
        System.out.println(URL);
        System.out.println(key);
    }

    @Test(groups = {"Smoke"})
    public void mobileLoginCarLoan(){
        System.out.println("mobileLoginCarLoan");
    }

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("I am Before Suite Annotation. I will execute first");
    }

    @Test(dependsOnMethods = {"webLoginCarLoan", "mobileSignOutCarLoan"})       // makes this method dependent to params. it means firstly params will execute
    public void APICarLoan(){
        System.out.println("LoginAPICarLoan");
    }

    @Test(enabled = false)          //safely skip this test case
    public void mobileSignInCarLoan(){
        System.out.println("mobileSignInCarLoan");
    }

    @Test(timeOut = 40000)                  //wait for the test case to be executed.
    public void mobileSignOutCarLoan(){
        System.out.println("mobileSignOutCarLoan");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am Before Method Annotation. I will execute before evey test method in day3 class");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am After Method Annotation. I will execute after evey test method in day3 class");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("I am Before Class Annotation. I will execute before executing any methods in day3 class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I am After Class Annotation. I will execute after executing all the methods in day3 class");
    }
}