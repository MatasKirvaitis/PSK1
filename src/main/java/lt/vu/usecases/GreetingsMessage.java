package lt.vu.usecases;

import lt.vu.decorators.GreetingMessage;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class GreetingsMessage {
    @Inject
    private GreetingMessage greetingMessage;

    public String greeting(){
        return greetingMessage.greeting();
    }
}
