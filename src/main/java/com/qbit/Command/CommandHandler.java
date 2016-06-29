package com.qbit.Command;

import com.qbit.ClusterStatusConst;
import com.qbit.ConfigureSettings;

import java.util.Map;

/**
 * User: chuck
 */
public class CommandHandler {
    public static final String AWS = "aws ";
    public static final String EC2 = "ec2 ";
    public static final String DISPLAY_INSTANCES = "display_instances ";
    public static final String FLAG_INSTANCE_ID = "--instance-id ";

    private Map<String, String> settingsMap;

    public CommandHandler(Map<String, String> settingsMap) {
        this.settingsMap = settingsMap;
    }

    public boolean isClusterServerRunning() {
        String command = AWS +
                EC2 +
                DISPLAY_INSTANCES +
                FLAG_INSTANCE_ID +
                settingsMap.get(ConfigureSettings.SERVER_ID);

        return getServerStatus(CommandUtil.Process(command)) == ClusterStatusConst.RUNNING;
    }

    private ClusterStatusConst getServerStatus(String output) {
        // Convert output to object
        return null;
    }

    public void configureAws() {
        // TODO using 3 settings from settingsMap, run through aws cli configure, or possibly set environment variables?
    }
}
