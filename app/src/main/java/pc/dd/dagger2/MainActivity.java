package pc.dd.dagger2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends Activity {
    
    @Inject
    StringCreator stringCreator;
    
    @Inject
    StringAdder stringAdder;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inject();
    }
    
    private void inject(){
        App.getComponent().inject(this);
        
        Log.d("Creating string -- ", stringCreator.getLogString());
        stringAdder.add("SECOND STRING");
        Log.d("Added string --", stringCreator.getLogString());
    }
}
