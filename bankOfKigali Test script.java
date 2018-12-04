/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package packageBk;


import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bankOfKigali {
    
    public static void main(String[] args) {
        System.getProperty("webdriver.gecko.driver","C:\\Program Files\\selenium-server-standalone\\geckodriver-v0.23.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
          driver.get("https://www.bk.rw");
        WebElement link, link1, link2, link3, link4;
        //link =driver.findElement(By.linkText("personal"));
        link =driver.findElement(By.xpath("//a[@href='https://www.bk.rw/personal']"));
                link.click();
              
                //First click "Current & Saving"
                link1=driver.findElement(By.xpath("[a[@id=\"nav\"]/div/div/div[2]/u|[1]/li[2]/a"));
                link1.click();
                // click on"Personal account link "
                link2 =driver.findElement(By.xpath("//a[@href='https://www.bk.rw/personal/checking-saving/personal-current']"));
         link2.click();
         
             //Click on online banking link under current  & saving menu
         link3 =driver.findElement(By.xpath("//a[@href='https://www.bk.rw/ways-of-banking/online-banking']"));
         link3.click();
         //get a link for "Apply now button"
         link4=driver.findElement(By.xpath("//a[@href='https://www.bk.rw/online-services/apply-for-online-banking']"));
         link4.click();
        try{
            Thread.sleep(5000);
            
        }catch(InterruptedException ex){               
     
 
            Logger.getLogger(bankOfKigali.class.getName()).log(Level.SEVERE, null, ex);
        }
        driver.quit();
    }
    
}
