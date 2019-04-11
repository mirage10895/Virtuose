package fr.mirage.virtuose.api.beans.common;

/**
 * Created by lucasamiaud on 02/03/2019.
 */

public enum MediaType {
    AUDIO("audio");

    String label;

    MediaType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
