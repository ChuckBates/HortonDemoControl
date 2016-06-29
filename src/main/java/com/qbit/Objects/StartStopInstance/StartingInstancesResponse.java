package com.qbit.Objects.StartStopInstance;

import com.google.gson.annotations.SerializedName;

/**
 * User: cbates
 */
public class StartingInstancesResponse {

    @SerializedName("StartingInstances")
    private StartingInstances[] startingInstances;

    public StartingInstancesResponse(StartingInstances[] startingInstances) {
        this.startingInstances = startingInstances;
    }

    public StartingInstances[] getStartingInstances() {
        return startingInstances;
    }

    public void setStartingInstances(StartingInstances[] startingInstances) {
        this.startingInstances = startingInstances;
    }
}
