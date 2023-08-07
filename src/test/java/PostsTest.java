import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class PostsTest extends AbstractTest {
    @Test
    void openMyPage() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        WebElement contact = driver.findElement(By.xpath("//ul[@class=\"svelte-1rc85o5\"]/li[3]"));
        contact.click();
        TimeUnit.SECONDS.sleep(2);
        WebElement profile = driver.findElement(By.xpath("//ul[@class=\"mdc-deprecated-list\"]/li[1]"));
        profile.click();
        TimeUnit.SECONDS.sleep(4);
        Assertions.assertNotNull(driver.findElement(By.xpath("//h1[contains(text(),'Profile Page')]")));
    }

    @Test
    void turnOffButtonPreviousPage() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        WebElement disabledPreviousPage = driver.findElement(By.cssSelector(".svelte-d01pfs.disabled"));
        Assertions.assertNotNull(driver.findElement(By.cssSelector(".svelte-d01pfs.disabled")));
        Assertions.assertNotNull(driver.findElement(By.xpath("//a[@href='/?page=2']")));
    }

    @Test
    void goToLoginPage() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        WebElement contact = driver.findElement(By.xpath("//ul[@class=\"svelte-1rc85o5\"]/li[3]"));
        contact.click();
        TimeUnit.SECONDS.sleep(2);
        WebElement profile = driver.findElement(By.xpath("//ul[@class=\"mdc-deprecated-list\"]/li[2]"));
        profile.click();
        Assertions.assertNotNull(driver.findElement(By.xpath("//form[@id='login']")));
        Assertions.assertNotNull(driver.findElement(By.cssSelector(".svelte-1rc85o5.selected")));
    }

    @Test
    void goToAboutPage() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        WebElement about = driver.findElement(By.xpath("//ul[@class=\"svelte-1rc85o5\"]/li[1]"));
        about.click();
        TimeUnit.SECONDS.sleep(2);
        Assertions.assertNotNull(driver.findElement(By.xpath("//h1[contains(text(),'About Page')]")));
    }

    @Test
    void goToContactPage() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        WebElement contact = driver.findElement(By.xpath("//ul[@class=\"svelte-1rc85o5\"]/li[2]"));
        contact.click();
        Assertions.assertNotNull(driver.findElement(By.xpath("//h1[contains(text(),'Contact us!')]")));
    }


    @Test
    void logOut() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        WebElement contact = driver.findElement(By.xpath("//ul[@class=\"svelte-1rc85o5\"]/li[3]"));
        contact.click();
        TimeUnit.SECONDS.sleep(2);
        WebElement profile = driver.findElement(By.xpath("//ul[@class=\"mdc-deprecated-list\"]/li[2]"));
        profile.click();
        Assertions.assertNotNull(driver.findElement(By.xpath("//form[@id='login']")));
    }

    @Test
    void switchBoxNotMyPosts() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        WebElement switchBox = driver.findElement(By.xpath("//button[@id='SMUI-form-field-1']"));
        switchBox.click();
        TimeUnit.SECONDS.sleep(1);
        Assertions.assertNotNull(driver.findElement(By.xpath("//a[@href='/?page=2&owner=notMe']")));
    }


    @Test
    void checkPosts(){
        WebElement prevPosts = driver.findElement(By.cssSelector(".posts.svelte-127jg4t"));
        Assertions.assertNotNull(driver.findElement(By.xpath("//div[@class=\"posts svelte-127jg4t\"]/a[1]")));
    }


}
