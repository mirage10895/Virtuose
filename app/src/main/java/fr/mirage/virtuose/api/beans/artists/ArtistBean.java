package fr.mirage.virtuose.api.beans.artists;

import java.util.List;

import fr.mirage.virtuose.api.beans.annotations.BodyBean;
import fr.mirage.virtuose.api.beans.annotations.DescriptionAnnotationBean;
import fr.mirage.virtuose.api.beans.users.UserMetadataBean;
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
public class ArtistBean {
    private List<String> alternateNames;
    private String apiPath;
    private BodyBean description;
    private String facebookName;
    private String instagramName;
    private String twitterName;
    private String followersCount;
    private String headerImageUrl;
    private String headerPathUrl;
    private int id;
    private String imageUrl;
    private boolean isMemeVerified;
    private boolean isVerified;
    private String name;
    private String url;
    private String translationArtist;
    private int iq;
    private UserMetadataBean currentUserMetadata;
    private DescriptionAnnotationBean descriptionAnnotation;
}
