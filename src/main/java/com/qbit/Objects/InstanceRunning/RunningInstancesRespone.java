package com.qbit.Objects.InstanceRunning;

import com.google.gson.annotations.SerializedName;

/**
 * User: cbates
 */
public class RunningInstancesRespone {

    @SerializedName("Reservations")
    private Reservations[] reservations;

    public RunningInstancesRespone(Reservations[] reservations) {
        this.reservations = reservations;
    }

    public Reservations[] getReservations() {
        return reservations;
    }

    public void setReservations(Reservations[] reservations) {
        this.reservations = reservations;
    }
}
