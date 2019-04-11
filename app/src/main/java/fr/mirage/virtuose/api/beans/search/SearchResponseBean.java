package fr.mirage.virtuose.api.beans.search;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by lucasamiaud on 04/03/2019.
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchResponseBean {
    private List<SearchBean> hits;
}
