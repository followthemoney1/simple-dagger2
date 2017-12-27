package pc.dd.dagger2;

import android.app.Application;

import pc.dd.dagger2.di.AppComponent;
import pc.dd.dagger2.di.AppModule;
import pc.dd.dagger2.di.DaggerAppComponent;
import pc.dd.dagger2.di.StringModule;

/**
 * Created by leaditteam on 27.12.2017.
 */

public class App extends Application {
    
    public static AppComponent component;
    
    public static AppComponent getComponent(){
        return  component;
    }
    
    @Override
    public void onCreate() {
        super.onCreate();
        component = build();
    }
    
    private AppComponent build(){
        return DaggerAppComponent
                .builder()
                .stringModule(new StringModule("FIRST STRING"))
                .build();
    }
}
