package lt.vu.services;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import java.util.Random;

@ApplicationScoped
@Alternative
public class PageGenerator implements Generator{
    @Override
    public Integer generateNumber() {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
        }
        return new Random().nextInt(90) + 10;
    }
}
