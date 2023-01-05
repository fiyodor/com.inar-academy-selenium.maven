package TestNGTutorials.days;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

    @Test
    public void webLoginHomeLoan(){
        System.out.println("webLoginHomeLoan");
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
