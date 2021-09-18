package certification.proyectobase.questions;

import certification.proyectobase.userinterface.RegisterUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheAnswerRegister implements Question<Boolean> {
    private String question;

    public TheAnswerRegister(String question) {
        this.question = question;

    }

    public static TheAnswerRegister is(String question) {
        return new TheAnswerRegister(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String answer = Text.of(RegisterUserPage.ANSWER_REGISTER).viewedBy(actor).asString();
        if (question.equals(answer)) {
            result = true;
        }else {
            result = false;
        }
        return result;



    }


}

