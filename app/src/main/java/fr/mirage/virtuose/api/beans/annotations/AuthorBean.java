package fr.mirage.virtuose.api.beans.annotations;

import fr.mirage.virtuose.api.beans.users.UserBean;
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
public class AuthorBean {
    private float attribution;
    private String pinnedRole;
    private UserBean user;
}
