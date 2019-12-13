package PCAT.tests;


import PCAT.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class test1 extends TestBase{


    @Test
    public void test(){
        driver.get(ConfigurationReader.get("url"));
    }
}
