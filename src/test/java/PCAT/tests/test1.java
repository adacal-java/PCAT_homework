package PCAT.tests;


import PCAT.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class test1 extends TestBase{
    /**
     * I tried to push my code to github.
     * And i m Ibrahim B.
     */

    @Test
    public void test(){

        driver.get(ConfigurationReader.get("url"));




    }
}
