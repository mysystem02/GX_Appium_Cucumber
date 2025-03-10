package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.Menu_POM;
import pages.Sign_in_POM;
import utils.DriverManager;

public class Hooks {

    @Before
    public void setUp() {
        DriverManager.initializeDriver();

    }


    @After
    public void tearDown() {
        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
        }
    }
}
