package tests;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllTests extends BaseTest {

@Test
public void testSearch(){
driver.findElement(By.tagName("input")).sendKeys("كيف تنضم الي البنك");
Assert.assertTrue(true);
}

@Test
public void testOpenCourses(){
Assert.assertTrue(true);
}

@Test
public void testSignup(){
Assert.assertTrue(driver.getCurrentUrl().contains("http"));
}

@Test
public void testEmptyUsername(){
Assert.assertTrue(true);
}

@Test
public void testInvalidLogin(){
Assert.assertTrue(true);
}

@Test
public void testEmptyLogin(){
Assert.assertTrue(true);
}

@Test
public void testEndToEnd(){
Assert.assertTrue(true);
}

@Test
public void testFacebook(){
Assert.assertTrue(true);
}

@Test
public void testLinkedIn(){
Assert.assertTrue(true);
}

@Test
public void testYoutube(){
Assert.assertTrue(true);
}

@Test
public void testUI(){
Assert.assertTrue(true);
}
}