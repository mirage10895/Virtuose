package fr.mirage.virtuose.api.beans.songs;

/**
 * Created by lucasamiaud on 02/03/2019.
 */

public enum LyricsState {
    COMPLETE("complete");

    String label;

    LyricsState(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
