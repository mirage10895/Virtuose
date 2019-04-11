package fr.mirage.virtuose.api.beans.users;

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
public class UserBean {
    private String apiPath;
    private AvatarBean avatar;
    private String header_image_url;
    private String human_readable_role_for_display;
    private int id;
    private int iq;
    private String login;
    private String name;
    private String role_for_display;
    private String url;
    private UserMetadataBean currentUserMetadata;
}
