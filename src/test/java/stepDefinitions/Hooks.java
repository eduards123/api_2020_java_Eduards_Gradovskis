package stepDefinitions;

import cucumber.api.java.Before;
import helpers.TestContext;

public class Hooks
{
    @Before
    public void beforeAll() {
        TestContext.init();
    }


}
