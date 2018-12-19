/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package packageBkExerc;


import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Gloriose {
    
    public static void main(String[] args) {


System.getProperty("webdriver.gecko.driver","C:\\Program Files\\selenium-server-standalone\\geckodriver-v0.23.0-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.bk.rw");
        WebElement link, table;
        
        driver.findElement(By.xpath("//a[@href='https://www.bk.rw/personal']")).click();

 
      Float buyingPrice=Float.parseFloat(driver.findElement(By.xpath("/html/body/footer/div[1]/div[4]/div/table/tbody/tr[2]/td[2]")).getText());
        Float sellingPrice=Float.parseFloat(driver.findElement(By.xpath("/html/body/footer/div[1]/div[4]/div/table/tbody/tr[2]/td[3]")).getText());
       
        if((sellingPrice>=800) && (sellingPrice>buyingPrice)){
            System.out.println("Rates ok");
            System.out.println(buyingPrice);
            System.out.println(sellingPrice);
            
        }else{
                        System.out.println("Rates not ok");

        }
        driver.findElement(By.xpath("//a[@href='https://www.bk.rw/ways-of-banking/online-banking']")).click();
         
        
      
        driver.findElement(By.xpath("//a[@href='https://www.bk.rw/personal/checking-saving/personal-current']")).click();
        
         
//Click on online banking link under current & saving menu
   driver.findElement(By.xpath("//a[@href='https://www.bk.rw/ways-of-banking/online-banking']")).click();
        
  
    Link =driver.findElement(By.xpath("//a[@href='https://www.bk.rw/online-services/apply-for-online-banking']"));
         link.click();
      
        
        try{
            Thread.sleep(5000);
            
        }catch(InterruptedException ex){               
     
 
            Logger.getLogger(Gloriose.class.getName()).log(Level.SEVERE, null, ex);
        }
        driver.quit();
    }
    
}


