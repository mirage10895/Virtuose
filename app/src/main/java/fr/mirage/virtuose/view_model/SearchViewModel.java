package fr.mirage.virtuose.view_model;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import fr.mirage.virtuose.api.beans.ResponseBean;
import fr.mirage.virtuose.api.beans.search.SearchResponseBean;
import fr.mirage.virtuose.repository.ApiRepository;

/**
 * Created by lucasamiaud on 09/03/2019.
 */

public class SearchViewModel extends ViewModel {
    private LiveData<SearchResponseBean> searchResponse;
    private ApiRepository apiRepository;

    SearchViewModel(ApiRepository apiRepository) {
        this.apiRepository = apiRepository;
    }
    public void init(String query) {
        this.searchResponse = this.apiRepository.getResultFromSearch(query);
    }

    public LiveData<SearchResponseBean> getSearchResponse() {
        return searchResponse;
    }
}
