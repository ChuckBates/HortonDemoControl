package com.qbit.Objects.InstanceRunning;

import com.google.gson.annotations.SerializedName;

/**
 * User: cbates
 */
public class Reservations {

    @SerializedName("OwnerId")
    private String ownerId;

    @SerializedName("ReservationId")
    private String reservationId;

    @SerializedName("Groups")
    private String[] groups;

    @SerializedName("Instances")
    private Instances[] instances;

    public Reservations(String ownerId, String reservationId, String[] groups, Instances[] instances) {
        this.ownerId = ownerId;
        this.reservationId = reservationId;
        this.groups = groups;
        this.instances = instances;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String[] getGroups() {
        return groups;
    }

    public void setGroups(String[] groups) {
        this.groups = groups;
    }

    public Instances[] getInstances() {
        return instances;
    }

    public void setInstances(Instances[] instances) {
        this.instances = instances;
    }
}
