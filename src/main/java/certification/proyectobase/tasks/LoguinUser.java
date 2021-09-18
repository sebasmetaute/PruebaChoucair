package certification.proyectobase.tasks;

import certification.proyectobase.model.DataLoguin;
import certification.proyectobase.model.DataTable;
import certification.proyectobase.userinterface.LoguinPage;
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

public class LoguinUser implements Task {

    private  List<DataLoguin> dataLoguin;

    public LoguinUser(List<DataLoguin> dataLoguin) {
        this.dataLoguin = dataLoguin;
    }

    public static LoguinUser user(List<DataLoguin> dataLoguin) {

        return Tasks.instrumented(LoguinUser.class,dataLoguin);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        DataLoguin info = dataLoguin.get(0);

        actor.attemptsTo(

                WaitUntil.the(LoguinPage.ICON, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                Click.on(LoguinPage.ICON),
                Enter.theValue(info.getUserName()).into(LoguinPage.USER),
                Enter.theValue(info.getPassword()).into(LoguinPage.PASSWORD),
                Click.on(LoguinPage.SIGN_IN),
                WaitUntil.the(LoguinPage.ANSWER, WebElementStateMatchers.isVisible()).forNoMoreThan(300).seconds()) ;



    }}