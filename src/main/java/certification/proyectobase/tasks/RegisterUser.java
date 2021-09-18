package certification.proyectobase.tasks;

import certification.proyectobase.model.DataTable;
import certification.proyectobase.userinterface.RegisterUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

public class RegisterUser implements Task {

    private  List<DataTable> dataTable;

    public RegisterUser(List<DataTable> dataTable) {
        this.dataTable = dataTable;
    }

    public static RegisterUser user(List<DataTable> dataTable) {

        return Tasks.instrumented(RegisterUser.class,dataTable);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        DataTable info = dataTable.get(0);

       actor.attemptsTo(
               WaitUntil.the(RegisterUserPage.SIGNIN, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
              Click.on(RegisterUserPage.SIGNIN),
               Enter.theValue(info.getEmail()).into(RegisterUserPage.EMAIL),
               Click.on(RegisterUserPage.BUTTON),
               Enter.theValue(info.getFirst_Name()).into(RegisterUserPage.FIRST_NAME),
               Enter.theValue(info.getLast_name()).into(RegisterUserPage.LAST_NAME),
               Enter.theValue(info.getEmail()).into(RegisterUserPage.EMAILDOS),
               Enter.theValue(info.getPassword()).into(RegisterUserPage.PASSWORD),
               //SelectFromOptions.byVisibleText(info.getCity()).from(RegisterUserPage.LISTDAY),
               Enter.theValue(info.getFirst_Name()).into(RegisterUserPage.FIRST_NAMEDOS),
               Enter.theValue(info.getLast_name()).into(RegisterUserPage.LAST_NAMEDOS),
               Enter.theValue(info.getAddress()).into(RegisterUserPage.ADDRESS),
               Enter.theValue(info.getCity()).into(RegisterUserPage.CITY),
               SelectFromOptions.byVisibleText(info.getState()).from(RegisterUserPage.STATE),
               Enter.theValue(info.getPostal_Code()).into(RegisterUserPage.POSTAL),
               SelectFromOptions.byVisibleText(info.getCountry()).from(RegisterUserPage.COUNTRY),
               Enter.theValue(info.getPhone_Number()).into(RegisterUserPage.PHONE_NUMBER),
               Enter.theValue(info.getConfirm_password()).into(RegisterUserPage.ALIAS),
               WaitUntil.the(RegisterUserPage.ALIAS, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
               Click.on(RegisterUserPage.REGISTER));



    }
}
