package com.qbit.Objects.InstanceRunning;

import com.google.gson.annotations.SerializedName;

/**
 * User: cbates
 */
public class Monitoring {

    @SerializedName("State")
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Monitoring(String state) {

        this.state = state;
    }
}
