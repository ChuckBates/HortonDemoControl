package com.qbit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class ConfigureSettings extends JDialog {

    public static final String ACCESS_KEY = "Access Key";
    public static final String SECRET = "Secret";
    public static final String REGION = "Region";
    public static final String SERVER_ID = "Server Id";
    public static final String NODE_1_ID = "Node 1 Id";
    public static final String NODE_2_ID = "Node 2 Id";
    public static final String NODE_3_ID = "Node 3 Id";
    public static final String NODE_4_ID = "Node 4 Id";
    public static final String NODE_5_ID = "Node 5 Id";
    public static final String NODE_6_ID = "Node 6 Id";
    public static final String INVALID_SETTINGS_TITLE = "Invalid Settings";

    private Map<String, String> settingsMap;

    public ConfigureSettings(Frame owner, Map<String, String> settingsMap) {
        super(owner);
        initComponents();

        this.settingsMap = settingsMap;
        populateFields();
    }

    private void populateFields() {
        txtAccessKey.setText(settingsMap.get(ACCESS_KEY));
        txtSecret.setText(settingsMap.get(SECRET));
        txtRegion.setText(settingsMap.get(REGION));

        txtServerId.setText(settingsMap.get(SERVER_ID));
        txtNode1.setText(settingsMap.get(NODE_1_ID));
        txtNode2.setText(settingsMap.get(NODE_2_ID));
        txtNode3.setText(settingsMap.get(NODE_3_ID));
        txtNode4.setText(settingsMap.get(NODE_4_ID));
        txtNode5.setText(settingsMap.get(NODE_5_ID));
        txtNode6.setText(settingsMap.get(NODE_6_ID));
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(630, 325);
    }

    private void btnSaveActionPerformed() {
        settingsMap.clear();
        // AWS CLI Settings
        settingsMap.put(ACCESS_KEY, txtAccessKey.getText());
        settingsMap.put(SECRET, txtSecret.getText());
        settingsMap.put(REGION, txtRegion.getText());

        // Demo Cluster Settings
        settingsMap.put(SERVER_ID, txtServerId.getText());
        settingsMap.put(NODE_1_ID, txtNode1.getText());
        settingsMap.put(NODE_2_ID, txtNode2.getText());
        settingsMap.put(NODE_3_ID, txtNode3.getText());
        settingsMap.put(NODE_4_ID, txtNode4.getText());
        settingsMap.put(NODE_5_ID, txtNode5.getText());
        settingsMap.put(NODE_6_ID, txtNode6.getText());

        if (validateFields()) {
            btnCancelActionPerformed();
        }
    }

    private boolean validateFields() {
        if (SettingsUtil.isEmpty(txtAccessKey.getText())) {
            JOptionPane.showMessageDialog(this, "Access Key required.", INVALID_SETTINGS_TITLE, JOptionPane.ERROR_MESSAGE);
            txtAccessKey.requestFocus();
            return false;
        }

        if (SettingsUtil.isEmpty(txtSecret.getText())) {
            JOptionPane.showMessageDialog(this, "Secret Access Key required.", INVALID_SETTINGS_TITLE, JOptionPane.ERROR_MESSAGE);
            txtSecret.requestFocus();
            return false;
        }

        if (SettingsUtil.isEmpty(txtRegion.getText())) {
            JOptionPane.showMessageDialog(this, "Region required.", INVALID_SETTINGS_TITLE, JOptionPane.ERROR_MESSAGE);
            txtRegion.requestFocus();
            return false;
        }

        if (SettingsUtil.isEmpty(txtServerId.getText())) {
            JOptionPane.showMessageDialog(this, "Ambari Server instance ID required.", INVALID_SETTINGS_TITLE, JOptionPane.ERROR_MESSAGE);
            txtServerId.requestFocus();
            return false;
        }

        if (SettingsUtil.isEmpty(txtNode1.getText())) {
            JOptionPane.showMessageDialog(this, "Node 1 instance ID required.", INVALID_SETTINGS_TITLE, JOptionPane.ERROR_MESSAGE);
            txtNode1.requestFocus();
            return false;
        }

        if (SettingsUtil.isEmpty(txtNode2.getText())) {
            JOptionPane.showMessageDialog(this, "Node 2 instance ID required.", INVALID_SETTINGS_TITLE, JOptionPane.ERROR_MESSAGE);
            txtNode2.requestFocus();
            return false;
        }

        if (SettingsUtil.isEmpty(txtNode3.getText())) {
            JOptionPane.showMessageDialog(this, "Node 3 instance ID required.", INVALID_SETTINGS_TITLE, JOptionPane.ERROR_MESSAGE);
            txtNode3.requestFocus();
            return false;
        }

        if (SettingsUtil.isEmpty(txtNode4.getText())) {
            JOptionPane.showMessageDialog(this, "Node 4 instance ID required.", INVALID_SETTINGS_TITLE, JOptionPane.ERROR_MESSAGE);
            txtNode4.requestFocus();
            return false;
        }

        if (SettingsUtil.isEmpty(txtNode5.getText())) {
            JOptionPane.showMessageDialog(this, "Node 5 instance ID required.", INVALID_SETTINGS_TITLE, JOptionPane.ERROR_MESSAGE);
            txtNode5.requestFocus();
            return false;
        }

        if (SettingsUtil.isEmpty(txtNode6.getText())) {
            JOptionPane.showMessageDialog(this, "Node 6 instance ID required.", INVALID_SETTINGS_TITLE, JOptionPane.ERROR_MESSAGE);
            txtNode6.requestFocus();
            return false;
        }

        return true;
    }

    private void btnCancelActionPerformed() {
        setVisible(false);
        dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        JLabel lblCLI = new JLabel();
        JLabel lblAccessKey = new JLabel();
        txtAccessKey = new JTextField();
        JLabel lblSecretAccessKey = new JLabel();
        txtSecret = new JTextField();
        JLabel lblRegion = new JLabel();
        txtRegion = new JTextField();
        JLabel lblCluster = new JLabel();
        JLabel lblServerId = new JLabel();
        txtServerId = new JTextField();
        JLabel lblNode4 = new JLabel();
        txtNode4 = new JTextField();
        JLabel lblNode1 = new JLabel();
        txtNode1 = new JTextField();
        JLabel lblNode5 = new JLabel();
        txtNode5 = new JTextField();
        JLabel lblNode2 = new JLabel();
        txtNode2 = new JTextField();
        JLabel lblNode6 = new JLabel();
        txtNode6 = new JTextField();
        JLabel lblNode3 = new JLabel();
        txtNode3 = new JTextField();
        JPanel panel1 = new JPanel();
        JButton btnSave = new JButton();
        JButton btnCancel = new JButton();

        //======== this ========
        setTitle("Settings");
        setModal(true);
        setName("this");
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0E-4};

        //---- lblCLI ----
        lblCLI.setText("AWS Command Line Interface Settings");
        lblCLI.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
        lblCLI.setName("lblCLI");
        contentPane.add(lblCLI, new GridBagConstraints(1, 1, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- lblAccessKey ----
        lblAccessKey.setText("Access Key ID:");
        lblAccessKey.setName("lblAccessKey");
        contentPane.add(lblAccessKey, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- txtAccessKey ----
        txtAccessKey.setName("txtAccessKey");
        contentPane.add(txtAccessKey, new GridBagConstraints(2, 2, 4, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- lblSecretAccessKey ----
        lblSecretAccessKey.setText("Secret Access Key:");
        lblSecretAccessKey.setName("lblSecretAccessKey");
        contentPane.add(lblSecretAccessKey, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- txtSecret ----
        txtSecret.setName("txtSecret");
        contentPane.add(txtSecret, new GridBagConstraints(2, 3, 4, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- lblRegion ----
        lblRegion.setText("Region Name:");
        lblRegion.setName("lblRegion");
        contentPane.add(lblRegion, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- txtRegion ----
        txtRegion.setName("txtRegion");
        contentPane.add(txtRegion, new GridBagConstraints(2, 4, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- lblCluster ----
        lblCluster.setText("Demo Cluster Settings");
        lblCluster.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
        lblCluster.setName("lblCluster");
        contentPane.add(lblCluster, new GridBagConstraints(1, 6, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- lblServerId ----
        lblServerId.setText("Server Instance ID:");
        lblServerId.setName("lblServerId");
        contentPane.add(lblServerId, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- txtServerId ----
        txtServerId.setName("txtServerId");
        contentPane.add(txtServerId, new GridBagConstraints(2, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- lblNode4 ----
        lblNode4.setText("Node 4 Instance ID:");
        lblNode4.setName("lblNode4");
        contentPane.add(lblNode4, new GridBagConstraints(4, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- txtNode4 ----
        txtNode4.setName("txtNode4");
        contentPane.add(txtNode4, new GridBagConstraints(5, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- lblNode1 ----
        lblNode1.setText("Node 1 Instance ID:");
        lblNode1.setName("lblNode1");
        contentPane.add(lblNode1, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- txtNode1 ----
        txtNode1.setName("txtNode1");
        contentPane.add(txtNode1, new GridBagConstraints(2, 8, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- lblNode5 ----
        lblNode5.setText("Node 5 Instance ID:");
        lblNode5.setName("lblNode5");
        contentPane.add(lblNode5, new GridBagConstraints(4, 8, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- txtNode5 ----
        txtNode5.setName("txtNode5");
        contentPane.add(txtNode5, new GridBagConstraints(5, 8, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- lblNode2 ----
        lblNode2.setText("Node 2 Instance ID:");
        lblNode2.setName("lblNode2");
        contentPane.add(lblNode2, new GridBagConstraints(1, 9, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- txtNode2 ----
        txtNode2.setName("txtNode2");
        contentPane.add(txtNode2, new GridBagConstraints(2, 9, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- lblNode6 ----
        lblNode6.setText("Node 6 Instance ID:");
        lblNode6.setName("lblNode6");
        contentPane.add(lblNode6, new GridBagConstraints(4, 9, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- txtNode6 ----
        txtNode6.setName("txtNode6");
        contentPane.add(txtNode6, new GridBagConstraints(5, 9, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- lblNode3 ----
        lblNode3.setText("Node 3 Instance ID:");
        lblNode3.setName("lblNode3");
        contentPane.add(lblNode3, new GridBagConstraints(1, 10, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- txtNode3 ----
        txtNode3.setName("txtNode3");
        contentPane.add(txtNode3, new GridBagConstraints(2, 10, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== panel1 ========
        {
            panel1.setName("panel1");
            panel1.setLayout(new GridBagLayout());
            ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0};
            ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {1.0, 1.0, 0.0, 1.0, 1.0, 1.0E-4};
            ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

            //---- btnSave ----
            btnSave.setText("Save");
            btnSave.setName("btnSave");
            btnSave.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    btnSaveActionPerformed();
                }
            });
            panel1.add(btnSave, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- btnCancel ----
            btnCancel.setText("Cancel");
            btnCancel.setName("btnCancel");
            btnCancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    btnCancelActionPerformed();
                }
            });
            panel1.add(btnCancel, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
        }
        contentPane.add(panel1, new GridBagConstraints(0, 12, 7, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JTextField txtAccessKey;
    private JTextField txtSecret;
    private JTextField txtRegion;
    private JTextField txtServerId;
    private JTextField txtNode4;
    private JTextField txtNode1;
    private JTextField txtNode5;
    private JTextField txtNode2;
    private JTextField txtNode6;
    private JTextField txtNode3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
