package fr.mirage.virtuose.view_model;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import fr.mirage.virtuose.repository.ApiRepository;

/**
 * Created by lucasamiaud on 10/03/2019.
 */

public class ViewModelFactory implements ViewModelProvider.Factory {
    private ApiRepository repository;

    @Inject
    public ViewModelFactory(ApiRepository apiRepository) {
        this.repository = apiRepository;
    }


    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(SongsViewModel.class)) {
            return (T) new SongsViewModel(repository);
        } else if (modelClass.isAssignableFrom(SearchViewModel.class)) {
            return (T) new SearchViewModel(repository);
        } else if (modelClass.isAssignableFrom(ArtistsViewModel.class)) {
            return (T) new ArtistsViewModel(repository);
        }
        throw new IllegalArgumentException("Unknown class name");
    }
}
