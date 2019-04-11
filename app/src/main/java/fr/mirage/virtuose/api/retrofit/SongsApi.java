package fr.mirage.virtuose.api.retrofit;

import fr.mirage.virtuose.api.beans.ResponseBean;
import fr.mirage.virtuose.api.beans.songs.SongResponseBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by lucasamiaud on 02/03/2019.
 */

public interface SongsApi {

    @GET("songs/{id}?text_format=html")
    Call<ResponseBean<SongResponseBean>> getSongById(@Path("id") String id);

}
