package fr.mirage.virtuose.api.beans;

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
public class ResponseBean<T> {
    private MetaBean meta;
    private T response;
}
