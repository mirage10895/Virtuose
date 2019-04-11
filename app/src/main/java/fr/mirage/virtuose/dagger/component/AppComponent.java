package fr.mirage.virtuose.dagger.component;

import javax.inject.Singleton;

import dagger.Component;
import fr.mirage.virtuose.MainActivity;
import fr.mirage.virtuose.dagger.modules.ApiModule;
import fr.mirage.virtuose.dagger.modules.AppModule;
import fr.mirage.virtuose.dagger.modules.SongsModule;

/**
 * Created by lucasamiaud on 10/03/2019.
 */

@Singleton
@Component(modules = {AppModule.class, ApiModule.class, SongsModule.class})
public interface AppComponent {

    void doInjection(MainActivity mainActivity);

}
