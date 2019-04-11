package fr.mirage.virtuose.api.beans.search;

import java.util.List;

import fr.mirage.virtuose.api.beans.songs.SongBean;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by lucasamiaud on 03/03/2019.
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchBean {
    private List<String> highlights;
    private String index;
    private String type;
    private SongBean result;
}
