package fr.mirage.virtuose.view_model;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import fr.mirage.virtuose.api.beans.ResponseBean;
import fr.mirage.virtuose.api.beans.songs.SongResponseBean;
import fr.mirage.virtuose.repository.ApiRepository;

/**
 * Created by lucasamiaud on 09/03/2019.
 */

public class SongsViewModel extends ViewModel {
    private LiveData<SongResponseBean> song;
    private ApiRepository apiRepository;

    SongsViewModel(ApiRepository apiRepository) {
        this.apiRepository = apiRepository;
    }
    public void init(String id) {
        this.song = this.apiRepository.getSong(id);
    }

    public LiveData<SongResponseBean> getSong(){
        return song;
    }
}
