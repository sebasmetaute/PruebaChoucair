package certification.proyectobase.tasks;

import certification.proyectobase.userinterface.OpenUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class OpenUp implements Task {

    private OpenUpPage openUpPage;

    public static certification.proyectobase.tasks.OpenUp openUpPage() {
        return Tasks.instrumented(certification.proyectobase.tasks.OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(net.serenitybdd.screenplay.actions.Open.browserOn(openUpPage));
    }
}


