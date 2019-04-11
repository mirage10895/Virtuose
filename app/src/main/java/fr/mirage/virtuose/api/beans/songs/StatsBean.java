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
public class StatsBean {
    private int acceptedAnnotations;
    private int contributors;
    private boolean hot;
    private int iqEarners;
    private int transcribers;
    private int unreviewedAnnotations;
    private int verifiedAnnotations;
    private int concurrents;
    private int pageviews;
}
