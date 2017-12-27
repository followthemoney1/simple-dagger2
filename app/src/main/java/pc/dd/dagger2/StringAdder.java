package pc.dd.dagger2;

import javax.inject.Inject;

/**
 * Created by leaditteam on 27.12.2017.
 */

public class StringAdder {
    StringCreator stringCreator;
    
    @Inject
    public StringAdder(StringCreator stringCreator) {
        this.stringCreator = stringCreator;
    }
    
    public void add(String addString){
        stringCreator.logString += "added string = " + addString;
    }
}
