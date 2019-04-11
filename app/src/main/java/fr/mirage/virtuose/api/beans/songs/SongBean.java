package fr.mirage.virtuose.api.beans.songs;

import java.util.List;

import fr.mirage.virtuose.api.beans.annotations.BodyBean;
import fr.mirage.virtuose.api.beans.annotations.DescriptionAnnotationBean;
import fr.mirage.virtuose.api.beans.artists.ArtistBean;
import fr.mirage.virtuose.api.beans.common.MediaBean;
import fr.mirage.virtuose.api.beans.users.UserBean;
import fr.mirage.virtuose.api.beans.users.UserMetadataBean;
import fr.mirage.virtuose.api.beans.users.VerifiedContributorBean;
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
public class SongBean {
    private String annotationCount;
    private String apiPath;
    private String appleMusicId;
    private String appleMusicPlayerUrl;
    private BodyBean description;
    private String embedContent;
    private FactTrackBean factTrack;
    private boolean featuredVideo;
    private String fullTitle;
    private String headerImageThumbNailUrl;
    private String headerImageUrl;
    private int id;
    private int lyricsOwnerId;
    private LyricsState lyricsState;
    private String path;
    private int pyongsCount;
    private String recordingLocation;
    private String releaseDate;
    private String songArtImageThumbnailUrl;
    private String songArtImgeUrl;
    private StatsBean stats;
    private String title;
    private String titleWithFeatured;
    private String url;
    private UserMetadataBean currentUserMetadata;
    private AlbumBean album;
    private List<CustomPerformanceBean> customPerformances;
    private DescriptionAnnotationBean descriptionAnnotation;
    private List<ArtistBean> featuredArtists;
    private UserBean lyricsMarkedCompleteBy;
    private List<MediaBean> media;
    private ArtistBean primaryArtist;
    private List<ArtistBean> producerArtists;
    private List<SongRelationshipBean> songRelationships;
    private List<UserBean> verifiedAnnotationsBy;
    private List<VerifiedContributorBean> verifiedContributors;
    private List<UserBean> verifiedLyricsBy;
    private List<ArtistBean> writerArtists;
}
