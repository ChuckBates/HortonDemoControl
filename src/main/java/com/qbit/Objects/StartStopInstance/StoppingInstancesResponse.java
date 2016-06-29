package com.qbit.Objects.StartStopInstance;

import com.google.gson.annotations.SerializedName;

/**
 * User: cbates
 */
public class StoppingInstancesResponse {

    @SerializedName("StoppingInstances")
    private StoppingInstances[] stoppingInstances;

    public StoppingInstancesResponse(StoppingInstances[] stoppingInstances) {
        this.stoppingInstances = stoppingInstances;
    }

    public StoppingInstances[] getStoppingInstances() {
        return stoppingInstances;
    }

    public void setStoppingInstances(StoppingInstances[] stoppingInstances) {
        this.stoppingInstances = stoppingInstances;
    }
}
