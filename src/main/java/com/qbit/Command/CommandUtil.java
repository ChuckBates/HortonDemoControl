package com.qbit.Command;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * User: chuck
 */
public class CommandUtil {
    public static String process(String command) {
        StringBuilder output = new StringBuilder();
        try {
            Process process = Runtime.getRuntime().exec(command);
            InputStream inputStream = process.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                output.append(line);
            }

            int result = process.waitFor();
            if (result != 0) {
                throw new Exception("process has terminated unexpectedly.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }

        return output.toString();
    }

//    public static String getConfiguration(String command) {
//        StringBuilder output = new StringBuilder();
//        try {
//            Process process = Runtime.getRuntime().exec(command + "\r" + "\r" + "\r" + "\r");
//            InputStream inputStream = process.getInputStream();
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                output.append(line);
//            }
//
//            int result = process.waitFor();
//            if (result != 0) {
//                throw new Exception("process has terminated unexpectedly.");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "";
//        }
//
//        return output.toString();
//    }
}
