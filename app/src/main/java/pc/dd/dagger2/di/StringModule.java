package pc.dd.dagger2.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pc.dd.dagger2.StringAdder;
import pc.dd.dagger2.StringCreator;

/**
 * Created by leaditteam on 27.12.2017.
 */

@Module
public class StringModule {
    
    String stringCreate;
    
    public StringModule(String stringCreate) {
        this.stringCreate = stringCreate;
    }
    
    @Singleton
    @Provides
    StringCreator createString(){
        return new StringCreator(stringCreate);
    }
    
}
