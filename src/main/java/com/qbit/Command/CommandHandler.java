package com.qbit.Command;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.qbit.ConfigureSettings;
import com.qbit.Consts.InstanceStatusConst;
import com.qbit.Objects.InstanceRunning.RunningInstancesResponse;
import com.qbit.Objects.StartStopInstance.StartingInstancesResponse;

import java.util.Map;

/**
 * User: chuck
 */
public class CommandHandler {
    public static final String AWS = "aws ";
    public static final String EC2 = "ec2 ";
    public static final String DESCRIBE_INSTANCES = "describe-instances ";
    public static final String START_INSTANCES = "start-instances ";
    public static final String STOP_INSTANCES = "stop-instances ";

    public static final String FLAG_INSTANCE_ID = "--instance-id ";

    private Map<String, String> settingsMap;

    public CommandHandler(Map<String, String> settingsMap) {
        this.settingsMap = settingsMap;
    }

    public boolean isClusterServerRunning() {
        String command = AWS +
                EC2 +
                DESCRIBE_INSTANCES +
                FLAG_INSTANCE_ID +
                settingsMap.get(ConfigureSettings.SERVER_ID);

        String output = CommandUtil.process(command);
        InstanceStatusConst runningServerStatus = getRunningServerStatus(output);
        return runningServerStatus == InstanceStatusConst.RUNNING || runningServerStatus == InstanceStatusConst.PENDING;
    }

    public boolean toggleInstance(String instance, String state) {
        String command = AWS +
                EC2 +
                state +
                FLAG_INSTANCE_ID +
                settingsMap.get(instance);

        String output = CommandUtil.process(command);
        InstanceStatusConst serverStatus = getServerStatus(output);
        if (state.equals(START_INSTANCES)) {
            return serverStatus == InstanceStatusConst.PENDING || serverStatus == InstanceStatusConst.RUNNING;
        } else {
            return serverStatus == InstanceStatusConst.STOPPED || serverStatus == InstanceStatusConst.STOPPING;
        }
    }

    private InstanceStatusConst getServerStatus(String output) {
        Gson gson = new GsonBuilder().create();
        StartingInstancesResponse instance = gson.fromJson(output, StartingInstancesResponse.class);
        return InstanceStatusConst.getConstByName(instance.getStartingInstances()[0].getCurrentState().getName());
    }

    private InstanceStatusConst getRunningServerStatus(String output) {
        Gson gson = new GsonBuilder().create();
        RunningInstancesResponse instance = gson.fromJson(output, RunningInstancesResponse.class);
        return InstanceStatusConst.getConstByName(instance.getReservations()[0].getInstances()[0].getState().getName());
    }

    public boolean isAwsInstalled() {
        String command = AWS;
        String output = CommandUtil.process(command);
        return !output.startsWith("'aws' is not recognized");
    }

//    public boolean isAwsConfigured() {
//        String command = AWS + "configure";
//        String output = CommandUtil.getConfiguration(command);
//        return !output.startsWith("'aws' is not recognized");
//    }

    public void configureAws() {
        // TODO using 3 settings from settingsMap, run through aws cli configure, or possibly set environment variables?
    }
}
