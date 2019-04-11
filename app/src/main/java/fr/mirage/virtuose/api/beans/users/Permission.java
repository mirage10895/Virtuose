package fr.mirage.virtuose.api.beans.users;

/**
 * Created by lucasamiaud on 02/03/2019.
 */

public enum Permission {
    SEE_PAGEVIEWS("see_pageviews"),
    WATCH_FACT_TRACK("watch_fact_track"),
    VIEW_APPLE_MUSIC_PLAYER("view_apple_music_player"),
    CREATE_COMMENT("create_comment"),
    VIEW_SONG_STORY_GALLERY("view_song_story_gallery");

    String label;

    Permission(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
