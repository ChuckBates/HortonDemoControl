package com.qbit.Objects.StartStopInstance;

import com.google.gson.annotations.SerializedName;
import com.qbit.Objects.State;

/**
 * User: cbates
 */
public class StoppingInstances {

    @SerializedName("InstanceId")
    private String instanceId;

    @SerializedName("CurrentState")
    private State currentState;

    @SerializedName("PreviousState")
    private State previousState;

    public StoppingInstances(String instanceId, State currentState, State previousState) {
        this.instanceId = instanceId;
        this.currentState = currentState;
        this.previousState = previousState;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getPreviousState() {
        return previousState;
    }

    public void setPreviousState(State previousState) {
        this.previousState = previousState;
    }
}
