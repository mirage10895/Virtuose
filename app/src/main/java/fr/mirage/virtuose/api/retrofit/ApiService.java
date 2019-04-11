package fr.mirage.virtuose.api.retrofit;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import fr.mirage.virtuose.api.exceptions.ApiException;
import lombok.Getter;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lucasamiaud on 03/03/2019.
 */

@Getter
public class ApiService<T> {
    public final T api;

    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    private static final String APPLICATION_JSON = "application/json";
    private static final String APPLICATION_JSON_CHARSET_UTF8 = APPLICATION_JSON + "; charset=utf-8";
    private static final String BASE_URL = "https://api.genius.com/";
    private static final String AUTHORIZATION = "Authorization";
    private static final String BEARER_TOKEN = "Bearer mrFhfOCv3eDIlYg_Wxqoj6fTh9eN2nox2-o58cFEVWOTXGyFD7pFcXvFBFg9NxM4";



    protected ApiService(Class<T> typeClass) {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        this.api =
                new Retrofit
                        .Builder()
                        .baseUrl(BASE_URL)
                        .client(
                                new OkHttpClient
                                        .Builder()
                                        .connectTimeout(15, TimeUnit.SECONDS)
                                        .writeTimeout(15, TimeUnit.SECONDS)
                                        .readTimeout(60, TimeUnit.SECONDS)
                                        .addInterceptor(chain -> {
                                            Request original = chain.request();
                                            HttpUrl originalHttpUrl = original.url();

                                            HttpUrl url =
                                                    originalHttpUrl
                                                            .newBuilder()
                                                            .build();

                                            Request request =
                                                    original
                                                            .newBuilder()
                                                            .url(url)
                                                            .addHeader(CONTENT_TYPE_HEADER, APPLICATION_JSON_CHARSET_UTF8)
                                                            .addHeader(AUTHORIZATION, BEARER_TOKEN)
                                                            .build();

                                            return chain.proceed(request);
                                        })
                                        .build())
                        .addConverterFactory(GsonConverterFactory.create(gson))
                        .build()
                        .create(typeClass);
    }

    protected <T> T executeRequest(Call<T> apiCall) {
        retrofit2.Response<T> response;
        try {
            response = apiCall.execute();
            if (response.isSuccessful()) {
                return response.body();
            } else {
                throw new ApiException(response.code() + " " + response.message() + ":\n" + response.errorBody());
            }
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }
}
