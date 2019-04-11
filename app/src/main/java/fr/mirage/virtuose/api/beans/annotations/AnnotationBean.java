package fr.mirage.virtuose.api.beans.annotations;

import java.util.List;

import fr.mirage.virtuose.api.beans.artists.ArtistBean;
import fr.mirage.virtuose.api.beans.songs.LyricsState;
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
public class AnnotationBean {
    private String apiPath;
    private BodyBean body;
    private int commentCount;
    private boolean community;
    private String customPreview;
    private boolean hasVoters;
    private int id;
    private boolean pinned;
    private String shareUrl;
    private String source;
    private LyricsState state;
    private String url;
    private boolean verified;
    private int votesTotal;
    private UserMetadataBean currentUserMetadata;
    private List<AuthorBean> authors;
    private List<ArtistBean> cosignedBy;
    private String rejectionComment;
    private String verifiedBy;
}
