package com.qbit;

import com.qbit.Command.CommandHandler;
import com.qbit.Consts.ClusterStatusConst;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class DemoControl extends JFrame {

    private Map<String, String> settingsMap;
    private CommandHandler commandHandler;

    public DemoControl() {
        initializeSettingsMap();
        commandHandler = new CommandHandler(settingsMap);

        initComponents();
        setStatus(ClusterStatusConst.UNKNOWN);
    }

    private void setStatus(ClusterStatusConst status) {
        lblClusterStatus.setText(status.getName());
        lblClusterStatus.setForeground(status.getColor());
    }

    private void initializeSettingsMap() {
        settingsMap = new HashMap<>();
        // TODO initialize settings map from persisted data if any
    }

    public static void main(String[] args) {
        DemoControl demoControl = new DemoControl();
        demoControl.setTitle("HortonWorks Demo Cluster Control");
        demoControl.setVisible(true);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(375, 200);
    }

    private void btnRefreshActionPerformed() {
        // Validate Java_Home and AWS setup
        if (isClusterServerRunning()) {
            setStatus(ClusterStatusConst.RUNNING);
        } else {
            setStatus(ClusterStatusConst.STOPPED);
        }
    }

    private boolean isClusterServerRunning() {
        return commandHandler.isClusterServerRunning();
    }

    private void btnGoActionPerformed() {
        // Validate Java_Home and AWS setup
        if (!isClusterServerRunning()) {
            commandHandler.startInstance(ConfigureSettings.SERVER_ID);
        } else {
            commandHandler.stopInstance((ConfigureSettings.SERVER_ID));
        }

        // TODO Bring cluster up if down, spin down if up
    }

    private void btnConfigureActionPerformed() {
        ConfigureSettings settings = new ConfigureSettings(this, settingsMap);
        settings.setVisible(true);

        if (!settingsMap.isEmpty()) {
            // TODO somehow persist settings for after restart
            commandHandler.configureAws();
            enableControls(true);
        } else {
            enableControls(false);
        }
    }

    private void enableControls(boolean enable) {
        btnGo.setEnabled(enable);
        btnRefresh.setEnabled(enable);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        btnRefresh = new JButton();
        lblStatus = new JLabel();
        lblClusterStatus = new JLabel();
        btnGo = new JButton();
        btnConfigure = new JButton();

        //======== this ========
        setName("this");
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0, 0.0, 1.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {1.0, 0.0, 0.0, 0.0, 1.0, 1.0E-4};

        //---- btnRefresh ----
        btnRefresh.setText("Refresh");
        btnRefresh.setEnabled(false);
        btnRefresh.setName("btnRefresh");
        btnRefresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnRefreshActionPerformed();
            }
        });
        contentPane.add(btnRefresh, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 5), 0, 0));

        //---- lblStatus ----
        lblStatus.setText("Demo Cluster Status:");
        lblStatus.setName("lblStatus");
        contentPane.add(lblStatus, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 5), 0, 0));

        //---- lblClusterStatus ----
        lblClusterStatus.setName("lblClusterStatus");
        contentPane.add(lblClusterStatus, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 5), 0, 0));

        //---- btnGo ----
        btnGo.setText("Toggle");
        btnGo.setEnabled(false);
        btnGo.setName("btnGo");
        btnGo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnGoActionPerformed();
            }
        });
        contentPane.add(btnGo, new GridBagConstraints(1, 2, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- btnConfigure ----
        btnConfigure.setText("Configure");
        btnConfigure.setName("btnConfigure");
        btnConfigure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnConfigureActionPerformed();
            }
        });
        contentPane.add(btnConfigure, new GridBagConstraints(1, 3, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton btnRefresh;
    private JLabel lblStatus;
    private JLabel lblClusterStatus;
    private JButton btnGo;
    private JButton btnConfigure;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
