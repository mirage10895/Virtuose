package fr.mirage.virtuose.api.beans.songs;

import java.util.List;

import fr.mirage.virtuose.api.beans.artists.ArtistBean;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by lucasamiaud on 02/03/2019.
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomPerformanceBean {
    private String label;
    private List<ArtistBean> artists;
}
