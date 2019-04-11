package fr.mirage.virtuose.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Singleton;

import fr.mirage.virtuose.api.beans.ResponseBean;
import fr.mirage.virtuose.api.beans.artists.ArtistBean;
import fr.mirage.virtuose.api.beans.artists.ArtistResponseBean;
import fr.mirage.virtuose.api.beans.artists.SongsResponseBean;
import fr.mirage.virtuose.api.beans.search.SearchResponseBean;
import fr.mirage.virtuose.api.beans.songs.SongBean;
import fr.mirage.virtuose.api.beans.songs.SongResponseBean;
import fr.mirage.virtuose.api.retrofit.ArtistsApi;
import fr.mirage.virtuose.api.retrofit.SearchApi;
import fr.mirage.virtuose.api.retrofit.SongsApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by lucasamiaud on 09/03/2019.
 */

@Singleton
public class ApiRepository {
    private SongsApi songsApi;
    private SearchApi searchApi;
    private ArtistsApi artistsApi;

    public ApiRepository(SongsApi songsApi, SearchApi searchApi, ArtistsApi artistsApi) {
        this.songsApi = songsApi;
        this.searchApi = searchApi;
        this.artistsApi = artistsApi;
    }

    public LiveData<SongResponseBean> getSong(String id) {
        final MutableLiveData<SongResponseBean> data = new MutableLiveData<>();
        this.songsApi.getSongById(id).enqueue(new Callback<ResponseBean<SongResponseBean>>() {
            @Override
            public void onResponse(@NonNull Call<ResponseBean<SongResponseBean>> call,
                                   @NonNull Response<ResponseBean<SongResponseBean>> response) {
                if (response.body() != null && response.body().getMeta().getStatus() == 200) {
                    data.setValue(response.body().getResponse());
                } else {
                    Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO, "Empty response");
                    data.setValue(new SongResponseBean(new SongBean()));
                }
            }

            @Override
            public void onFailure(@NonNull Call<ResponseBean<SongResponseBean>> call,
                                  @NonNull Throwable t) {
                Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.SEVERE, t.getMessage());
                data.setValue(new SongResponseBean(new SongBean()));
            }
        });
        return data;
    }

    public LiveData<SearchResponseBean> getResultFromSearch(String query) {
        final MutableLiveData<SearchResponseBean> data = new MutableLiveData<>();
        this.searchApi.searchByQuery(query).enqueue(new Callback<ResponseBean<SearchResponseBean>>() {
            @Override
            public void onResponse(@NonNull Call<ResponseBean<SearchResponseBean>> call,
                                   @NonNull Response<ResponseBean<SearchResponseBean>> response) {
                if (response.body() != null && response.body().getMeta().getStatus() == 200) {
                    data.setValue(response.body().getResponse());
                } else {
                    Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO, "Empty response");
                    data.setValue(new SearchResponseBean(new ArrayList<>()));
                }
            }

            @Override
            public void onFailure(@NonNull Call<ResponseBean<SearchResponseBean>> call,
                                  @NonNull Throwable t) {
                Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.SEVERE, t.getMessage());
                data.setValue(new SearchResponseBean(new ArrayList<>()));
            }
        });
        return data;
    }

    public LiveData<ArtistResponseBean> getArtist(String artistId) {
        final MutableLiveData<ArtistResponseBean> data = new MutableLiveData<>();
        this.artistsApi.getArtistById(artistId).enqueue(new Callback<ResponseBean<ArtistResponseBean>>() {
            @Override
            public void onResponse(@NonNull Call<ResponseBean<ArtistResponseBean>> call,
                                   @NonNull Response<ResponseBean<ArtistResponseBean>> response) {
                if (response.body() != null && response.body().getMeta().getStatus() == 200) {
                    data.setValue(response.body().getResponse());
                } else {
                    Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO, "Empty response");
                    data.setValue(new ArtistResponseBean(new ArtistBean()));
                }
            }

            @Override
            public void onFailure(@NonNull Call<ResponseBean<ArtistResponseBean>> call,
                                  @NonNull Throwable t) {
                Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.SEVERE, t.getMessage());
                data.setValue(new ArtistResponseBean(new ArtistBean()));
            }
        });
        return data;
    }

    public LiveData<SongsResponseBean> getArtistSongs(String artistId) {
        final MutableLiveData<SongsResponseBean> data = new MutableLiveData<>();
        this.artistsApi.getSongsByArtistId(artistId).enqueue(new Callback<ResponseBean<SongsResponseBean>>() {
            @Override
            public void onResponse(@NonNull Call<ResponseBean<SongsResponseBean>> call,
                                   @NonNull Response<ResponseBean<SongsResponseBean>> response) {
                if (response.body() != null && response.body().getMeta().getStatus() == 200) {
                    data.setValue(response.body().getResponse());
                } else {
                    Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO, "Empty response");
                    data.setValue(new SongsResponseBean(new ArrayList<>()));
                }
            }

            @Override
            public void onFailure(@NonNull Call<ResponseBean<SongsResponseBean>> call,
                                  @NonNull Throwable t) {
                Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.SEVERE, t.getMessage());
                data.setValue(new SongsResponseBean(new ArrayList<>()));
            }
        });
        return data;
    }
}
