package fr.mirage.virtuose.api.beans.songs;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by lucasamiaud on 02/03/2019.
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SongRelationshipBean {
    private String type;
    private List<SongBean> songs;
}
