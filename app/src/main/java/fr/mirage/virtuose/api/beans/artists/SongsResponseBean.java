package fr.mirage.virtuose.api.beans.artists;

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
@AllArgsConstructor
@NoArgsConstructor
public class SongsResponseBean {
    private List<SongBean> songs;
}
