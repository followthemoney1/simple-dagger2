package pc.dd.dagger2;

import javax.inject.Inject;

/**
 * Created by leaditteam on 27.12.2017.
 */

public class StringCreator {
    String logString;
    
   
    public StringCreator(String logString) {
        this.logString = logString;
    }
    
    public String getLogString() {
        return logString;
    }
}
