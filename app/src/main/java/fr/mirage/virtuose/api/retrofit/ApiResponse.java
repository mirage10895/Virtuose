package fr.mirage.virtuose.api.retrofit;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.gson.JsonElement;

import static fr.mirage.virtuose.api.retrofit.Status.ERROR;
import static fr.mirage.virtuose.api.retrofit.Status.LOADING;
import static fr.mirage.virtuose.api.retrofit.Status.SUCCESS;

/**
 * Created by lucasamiaud on 10/03/2019.
 */

public class ApiResponse<T> {
    public final Status status;

    @Nullable
    public final JsonElement data;

    @Nullable
    public final Throwable error;

    private ApiResponse(Status status, @Nullable JsonElement data, @Nullable Throwable error) {
        this.status = status;
        this.data = data;
        this.error = error;
    }

    public static ApiResponse loading() {
        return new ApiResponse(LOADING, null, null);
    }

    public static ApiResponse success(@NonNull JsonElement data) {
        return new ApiResponse(SUCCESS, data, null);
    }

    public static ApiResponse error(@NonNull Throwable error) {
        return new ApiResponse(ERROR, null, error);
    }
}
