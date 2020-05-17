package lt.vu.decorators;

import javax.enterprise.inject.Default;

@Default
public class GreetingMessage implements Message{
    @Override
    public String greeting(){
        return "Welcome to the online book catalog! Here you can find info about books.";
    }
}
