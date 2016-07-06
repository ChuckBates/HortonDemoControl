package com.qbit.Objects.InstanceRunning;

import com.google.gson.annotations.SerializedName;

/**
 * User: cbates
 */
public class RunningInstancesResponse {

    @SerializedName("Reservations")
    private Reservations[] reservations;

    public RunningInstancesResponse(Reservations[] reservations) {
        this.reservations = reservations;
    }

    public Reservations[] getReservations() {
        return reservations;
    }

    public void setReservations(Reservations[] reservations) {
        this.reservations = reservations;
    }
}
