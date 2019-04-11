package fr.mirage.virtuose;

import android.app.Application;
import android.content.Context;

import fr.mirage.virtuose.dagger.component.AppComponent;
import fr.mirage.virtuose.dagger.component.DaggerAppComponent;

/**
 * Created by lucasamiaud on 10/03/2019.
 */

public class VirtuoseApplication extends Application {
    AppComponent appComponent;
    Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        appComponent = DaggerAppComponent
                .builder()
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
