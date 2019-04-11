package fr.mirage.virtuose.api.beans.annotations;

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
public class AnnotatableBean {
    private String apiPath;
    private ClientTimestampsBean clientTimestamps;
    private String context;
    private int id;
    private String imageUrl;
    private String linkTitle;
    private String title;
    private String type;
    private String url;
}
