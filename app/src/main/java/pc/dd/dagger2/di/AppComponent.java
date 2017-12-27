package pc.dd.dagger2.di;

import javax.inject.Singleton;

import dagger.Component;
import pc.dd.dagger2.MainActivity;

/**
 * Created by leaditteam on 27.12.2017.
 */
@Singleton
@Component(modules = {AppModule.class, StringModule.class})
public interface AppComponent {
    
    void inject(MainActivity mainActivity);
}
