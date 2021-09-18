package certification.proyectobase.stepdefinitions;

import certification.proyectobase.model.DataLoguin;
import certification.proyectobase.model.DataTable;
import certification.proyectobase.questions.TheAnswerRegister;
import certification.proyectobase.questions.TheAnswerUser;
import certification.proyectobase.tasks.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class TestStepdefinitions {




    @Given("^she quiere registrar sus datos en the Web Automation advantageonlines$")
    public void sheQuiereRegistrarSusDatosEnTheWebAutomationAdvantageonlines()  {

        OnStage.theActorCalled("").wasAbleTo(RegisterOpenUP.registerUPPage());
    }

    @When("^she enter your personal data$")
    public void sheEnterYourPersonalData(List<DataTable> dataTable)  {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterUser.user(dataTable));

    }

    @Then("^verifies that is loading with text (.*)$")
    public void verifiesThatIsLoadingWithTextSuccessfulRegistration(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheAnswerRegister.is(question)));

    }

    @Given("^that she wants to enter the system$")
    public void thatSheWantsToEnterTheSystem()  {
        OnStage.theActorCalled("").wasAbleTo(OpenUp.openUpPage());
    }


    @When("^she enters username and password$")
    public void sheEntersUsernameAndPassword(List<DataLoguin> dataLoguin)  {

        OnStage.theActorInTheSpotlight().attemptsTo(LoguinUser.user(dataLoguin));


    }

    @Then("^verifies that is loading (.*)$")
    public void verifiesThatIsLoadingORDERPAYMENT(String question)  {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheAnswerUser.is(question)));

    }


}





