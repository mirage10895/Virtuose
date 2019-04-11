package fr.mirage.virtuose.api.beans.annotations;

/**
 * Created by lucasamiaud on 02/03/2019.
 */

public enum Classification {
    ACCEPTED("accepted");

    String label;

    Classification(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
