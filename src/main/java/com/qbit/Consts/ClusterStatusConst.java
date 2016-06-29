package com.qbit.Consts;

import java.awt.*;

/**
 * User: chuck
 */
public enum ClusterStatusConst {

    UNKNOWN("Unknown", new Color(153, 76, 0)),
    RUNNING("Running", new Color(0, 102, 0)),
    STOPPED("Stopped", new Color(153, 0, 0)),
    ;

    private String name;
    private Color color;

    ClusterStatusConst(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public static ClusterStatusConst getConstByName(String name) {
        for (ClusterStatusConst value : values()) {
            if (value.getName().equals(name)) {
                return value;
            }
        }
        return UNKNOWN;
    }
}
