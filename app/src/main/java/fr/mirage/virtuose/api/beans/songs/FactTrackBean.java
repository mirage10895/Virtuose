package fr.mirage.virtuose.api.beans.songs;

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
public class FactTrackBean {
    private String provider;
    private String externalUrl;
    private String buttonText;
    private String helpLinkText;
    private String helpLinkUrl;
}
