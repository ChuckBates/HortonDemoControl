package com.qbit;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * User: chuck
 */
public class SettingsUtil {

    public static final String USER_HOME = System.getProperty("user.home");

    public static void saveSettings(Map<String, String> settingsMap) {
        try {
            File settingsFile = new File(USER_HOME + "/awsControl.tmp");
            FileOutputStream outputStream = new FileOutputStream(settingsFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            objectOutputStream.writeObject(settingsMap);
            objectOutputStream.flush();
            objectOutputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, String> readSettings() {
        try {
            File settingsFile = new File(USER_HOME + "/awsControl.tmp");
            FileInputStream inputStream = new FileInputStream(settingsFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            Map<String, String> settingsMap = (Map<String, String>) objectInputStream.readObject();

            objectInputStream.close();
            inputStream.close();

            return settingsMap;
        } catch (IOException | ClassNotFoundException e) {
            return new HashMap<>();
        }
    }
}
