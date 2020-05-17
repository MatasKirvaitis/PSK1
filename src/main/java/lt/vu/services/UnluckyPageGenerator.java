package lt.vu.services;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

@ApplicationScoped
@Alternative
public class UnluckyPageGenerator implements Generator {
    @Override
    public Integer generateNumber(){
        return 100;
    }
}
