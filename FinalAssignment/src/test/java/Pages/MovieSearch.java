package Pages;

import Commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MovieSearch extends Driver {
    public WebDriver driver;
    public MovieSearch(WebDriver driver) { this.driver=driver; }


    public void removePopUp(){
        WebElement cancelButton = driver.findElement(By.id("wzrk-cancel"));
        cancelButton.click();
    }

    public void searchMovie(String movieName){
        WebElement searchBox=driver.findElement(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']"));
        searchBox.sendKeys(movieName);
    }
    public void viewMovieDetails(){
        WebElement searchBox=driver.findElement(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']"));
        searchBox.sendKeys(Keys.ENTER);
    }
}
