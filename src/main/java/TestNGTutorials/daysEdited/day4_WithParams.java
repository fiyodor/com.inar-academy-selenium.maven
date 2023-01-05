package TestNGTutorials.daysEdited;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4_WithParams {

    @Parameters({"URL"})

    @Test
    public void webLoginHomeLoan(String url){
        System.out.println("webLoginHomeLoan");
        System.out.println(url);
    }

    @Test(groups = {"Smoke"})
    public void mobileLoginHomeLoan(){
        System.out.println("mobileLoginHomeLoan");
    }

    @Test
    public void LoginAPIHomeLoan(){
        System.out.println("LoginAPIHomeLoan");
    }
}
