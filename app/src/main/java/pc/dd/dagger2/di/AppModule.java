package pc.dd.dagger2.di;

import android.content.Context;

import dagger.Module;

/**
 * Created by leaditteam on 27.12.2017.
 */
@Module
public class AppModule {
    
    private Context context;
    
    public AppModule(Context context) {
        this.context = context;
    }
}
