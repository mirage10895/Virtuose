package fr.mirage.virtuose.dagger.modules;

import android.arch.lifecycle.ViewModelProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import fr.mirage.virtuose.api.retrofit.ArtistsApi;
import fr.mirage.virtuose.api.retrofit.SearchApi;
import fr.mirage.virtuose.api.retrofit.SongsApi;
import fr.mirage.virtuose.view_model.ViewModelFactory;
import fr.mirage.virtuose.repository.ApiRepository;
import retrofit2.Retrofit;

/**
 * Created by lucasamiaud on 10/03/2019.
 */

@Module
public class SongsModule {
    @Provides
    @Singleton
    SongsApi getSongsApiCallInterface(Retrofit retrofit) {
        return retrofit.create(SongsApi.class);
    }

    @Provides
    @Singleton
    SearchApi getSearchApiCallInterface(Retrofit retrofit) {
        return retrofit.create(SearchApi.class);
    }

    @Provides
    @Singleton
    ArtistsApi getArtistApiCallInterface(Retrofit retrofit) {
        return retrofit.create(ArtistsApi.class);
    }

    @Provides
    @Singleton
    ApiRepository getApiRepository(SongsApi songsApi, SearchApi searchApi, ArtistsApi artistsApi) {
        return new ApiRepository(songsApi, searchApi, artistsApi);
    }

    @Provides
    @Singleton
    ViewModelProvider.Factory getSongsViewModelFactory(ApiRepository apiRepository) {
        return new ViewModelFactory(apiRepository);
    }
}
