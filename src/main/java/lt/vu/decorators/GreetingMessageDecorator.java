package lt.vu.decorators;

import lt.vu.services.SimpleDateTimeService;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Decorator
public class GreetingMessageDecorator implements Message{
    @Inject
    @Delegate
    @Any
    GreetingMessage greetingMessage;

    @Inject
    private SimpleDateTimeService simpleDateTimeService;

    @Override
    public String greeting(){
        return greetingMessage.greeting() + "Current date and time is: " + simpleDateTimeService.date() + " " + simpleDateTimeService.time();
    }
}
