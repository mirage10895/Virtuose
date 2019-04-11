package fr.mirage.virtuose.api.beans.annotations;

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
@NoArgsConstructor
@AllArgsConstructor
public class DescriptionAnnotationBean {
    private String _type;
    private int annotatorId;
    private String annotatorLogin;
    private String apiPath;
    private Classification classification;
    private String fragment;
    private int id;
    private boolean isDescription;
    private String path;
    private RangeBean range;
    private int songId;
    private String url;
    private List<Integer> verifiedAnnotatorIds;
    private AnnotatableBean annotatable;
    private List<AnnotationBean> annotations;
}
