package certification.proyectobase.tasks;

import certification.proyectobase.userinterface.OpenUpPage;
import certification.proyectobase.userinterface.RegisterUPPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class RegisterOpenUP implements Task {

    private RegisterUPPage registerUPPage;

    public static certification.proyectobase.tasks.RegisterOpenUP registerUPPage() {
        return Tasks.instrumented(certification.proyectobase.tasks.RegisterOpenUP.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(net.serenitybdd.screenplay.actions.Open.browserOn(registerUPPage));


    }
}