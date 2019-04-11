package fr.mirage.virtuose.view_model;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import fr.mirage.virtuose.api.beans.artists.ArtistResponseBean;
import fr.mirage.virtuose.api.beans.artists.SongsResponseBean;
import fr.mirage.virtuose.repository.ApiRepository;

/**
 * Created by lucasamiaud on 17/03/2019.
 */

public class ArtistsViewModel extends ViewModel {
    private LiveData<ArtistResponseBean> artistResponse;
    private LiveData<SongsResponseBean> songsArtistResponse;
    private ApiRepository apiRepository;

    ArtistsViewModel(ApiRepository apiRepository) {
        this.apiRepository = apiRepository;
    }

    public void searchArtist(String artistId) {
        this.artistResponse = this.apiRepository.getArtist(artistId);
    }

    public void searchArtistSongs(String artistId) {
        this.songsArtistResponse = this.apiRepository.getArtistSongs(artistId);
    }

    public LiveData<ArtistResponseBean> getArtistResponse() {
        return artistResponse;
    }

    public LiveData<SongsResponseBean> getSongsArtistResponse() {
        return songsArtistResponse;
    }
}
