package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateDraftPageMethods;
import pages.EmailsPageMethods;

public class CreateDraftPageSteps {
	
	CreateDraftPageMethods draftsPageMethod = new CreateDraftPageMethods(); 

@When("On click on Drafts user should navigate to draft screen")
public void on_click_on_Drafts_user_should_navigate_to_draft_screen() {
	draftsPageMethod.ClickOnEmail();	
	draftsPageMethod.ClickOnDrafts();

}



@Then("Created Draft should be present in list")
public void created_Draft_should_be_present_in_list() {
	Assert.assertTrue("There is no list", draftsPageMethod.isListPresent());
}


@Then("User Open Forst Draft in list")
public void user_Open_Forst_Draft_in_list() {
	draftsPageMethod.OpenFirstDrafts();
	Assert.assertTrue("There is no list", draftsPageMethod.isDraftOpeninPopup());
}








}
