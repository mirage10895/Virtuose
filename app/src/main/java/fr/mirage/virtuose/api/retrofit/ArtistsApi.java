package fr.mirage.virtuose.api.retrofit;

import fr.mirage.virtuose.api.beans.ResponseBean;
import fr.mirage.virtuose.api.beans.artists.ArtistResponseBean;
import fr.mirage.virtuose.api.beans.artists.SongsResponseBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by lucasamiaud on 03/03/2019.
 */

public interface ArtistsApi {

    @GET("artists/{id}?text_format=html")
    Call<ResponseBean<ArtistResponseBean>> getArtistById(@Path("id") String id);

    @GET("artists/{id}/songs?text_format=html")
    Call<ResponseBean<SongsResponseBean>> getSongsByArtistId(@Path("id") String id);
}
