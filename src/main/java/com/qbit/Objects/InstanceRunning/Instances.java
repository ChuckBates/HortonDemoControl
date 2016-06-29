package com.qbit.Objects.InstanceRunning;

import com.google.gson.annotations.SerializedName;
import com.qbit.Objects.State;


/**
 * User: cbates
 */
public class Instances {

    @SerializedName("Monitoring")
    private Monitoring monitoring;

    @SerializedName("PublicDnsName")
    private String publicDnsName;

//    @SerializedName("RootDeviceType")
//    private String rootDeviceType;

    @SerializedName("State")
    private State state;

//    @SerializedName("EbsOptimized")
//    private boolean ebsOptimized;
//
//    @SerializedName("LaunchTime")
//    private String launchTime;

    @SerializedName("PrivateIpAddress")
    private String privateIpAddress;

//    @SerializedName("ProductCodes")
//    private String[] productCodes;

//    @SerializedName("VpcId")
//    private String vpcId;

    @SerializedName("StateTransitionReason")
    private String stateTransitionReason;

//    @SerializedName("InstanceId")
//    private String instanceId;

//    @SerializedName("ImageId")
//    private String imageId;

    @SerializedName("PrivateDnsName")
    private String privateDnsName;

//    @SerializedName("KeyName")
//    private String keyName;

//    @SerializedName("SecurityGroups")
//    private SecurityGroup[] securityGroups;


    public Instances(Monitoring monitoring, String publicDnsName, State state, String privateIpAddress, String stateTransitionReason, String privateDnsName) {
        this.monitoring = monitoring;
        this.publicDnsName = publicDnsName;
        this.state = state;
        this.privateIpAddress = privateIpAddress;
        this.stateTransitionReason = stateTransitionReason;
        this.privateDnsName = privateDnsName;
    }

    public Monitoring getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(Monitoring monitoring) {
        this.monitoring = monitoring;
    }

    public String getPublicDnsName() {
        return publicDnsName;
    }

    public void setPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public String getStateTransitionReason() {
        return stateTransitionReason;
    }

    public void setStateTransitionReason(String stateTransitionReason) {
        this.stateTransitionReason = stateTransitionReason;
    }

    public String getPrivateDnsName() {
        return privateDnsName;
    }

    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }
}
