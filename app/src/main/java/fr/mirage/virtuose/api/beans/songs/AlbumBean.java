package fr.mirage.virtuose.api.beans.songs;

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
@AllArgsConstructor
@NoArgsConstructor
public class AlbumBean {
    private String apiPath;
    private String coverArtUrl;
    private String fullTitle;
    private int id;
    private String name;
    private String url;
    private ArtistBean artist;
}
