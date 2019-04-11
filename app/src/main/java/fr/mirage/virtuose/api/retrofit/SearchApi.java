package fr.mirage.virtuose.api.retrofit;

import fr.mirage.virtuose.api.beans.ResponseBean;
import fr.mirage.virtuose.api.beans.search.SearchResponseBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lucasamiaud on 03/03/2019.
 */

public interface SearchApi {

    @GET("search?text_format=html")
    Call<ResponseBean<SearchResponseBean>> searchByQuery(
            @Query("q") String query
    );
}
