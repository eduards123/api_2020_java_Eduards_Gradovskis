package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static helpers.SpaceHelper.*;

public class ClickupSteps
{
    @Given("User has ClickUp")
    public void userHasClickUp()
    {
        fetchFolder();
    }
    
    @When("User adds folder")
    public void userAddsFolder() 
    {
        createClickupFolder();
    }

    @And("Delete the folder")
    public void deleteTheFolder()
    {
        clients.ClickupClient.deleteFolder();
    }


}
