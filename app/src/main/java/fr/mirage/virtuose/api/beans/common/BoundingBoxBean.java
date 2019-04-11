package fr.mirage.virtuose.api.beans.common;

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
public class BoundingBoxBean {
    private int width;
    private int height;
}
