package certification.proyectobase.questions;

import certification.proyectobase.userinterface.LoguinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheAnswerUser implements Question<Boolean> {
    private String question;

    public TheAnswerUser(String question) {
        this.question = question;

    }

    public static TheAnswerUser is(String question) {
        return new TheAnswerUser(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String answer = Text.of(LoguinPage.ANSWER).viewedBy(actor).asString();
        if (question.equals(answer)) {
            result = true;
        }else {
            result = false;
        }
        return result;



    }


}

