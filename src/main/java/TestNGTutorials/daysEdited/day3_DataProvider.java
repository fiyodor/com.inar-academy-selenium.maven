package TestNGTutorials.daysEdited;

import org.testng.annotations.*;

public class day3_DataProvider {

    @Parameters({"URL"})

    @Test(timeOut = 40000)                  //wait for the test case to be executed.
    public void webLoginCarLoan(String URL){
        System.out.println("webLoginCarLoan");
        System.out.println(URL);
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

    @Test(dataProvider = "getData")
    public void mobileSignOutCarLoan(String username, String password){
        System.out.println("mobileSignOutCarLoan");
        System.out.println(username);
        System.out.println(password);
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

    @DataProvider
    public Object[][] getData(){
        //1st combination -> username password -> good credit history
        //2nd combination -> username password -> no credit history
        //3rd combination -> username password -> fraudelent credit history
        Object[][] data = new Object[3][2];
        //1st set
        data[0][0] = "firstUserName";
        data[0][1] = "firstPassword";
        //2nd set
        data[1][0] = "seconUserName";
        data[1][1] = "secondPassword";
        //3rd set
        data[2][0] = "thirdUserName";
        data[2][1] = "thirdPassword";
        return data;
    }
}