package fr.mirage.virtuose.api.beans.users;

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
public class UserMetadataBean {
    List<Permission> permissions;
    List<Permission> excludedPermissions;
    InteractionsBean interactions;
    Object relationships;
    Object iqByActions;
}
