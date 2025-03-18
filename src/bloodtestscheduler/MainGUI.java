/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author ikram
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPNL = new javax.swing.JPanel();
        titleLBL = new javax.swing.JLabel();
        nameLBL = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        ageLBL = new javax.swing.JLabel();
        ageTF = new javax.swing.JTextField();
        GPDetailLBL = new javax.swing.JLabel();
        GPDetailTF = new javax.swing.JTextField();
        priorityLBL = new javax.swing.JLabel();
        priorityComboBox = new javax.swing.JComboBox<>();
        hospitalLBL = new javax.swing.JLabel();
        hospitalCheckBox = new javax.swing.JCheckBox();
        addPatientBTN = new javax.swing.JButton();
        getNextBTN = new javax.swing.JButton();
        addNoShowBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(80, 18, 18));

        mainPNL.setBackground(new java.awt.Color(65, 15, 15));

        titleLBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLBL.setText("Blood Test Scheduler");

        nameLBL.setForeground(new java.awt.Color(255, 255, 255));
        nameLBL.setText("Name:");

        nameTF.setBackground(new java.awt.Color(51, 51, 51));
        nameTF.setForeground(new java.awt.Color(255, 255, 255));

        ageLBL.setForeground(new java.awt.Color(255, 255, 255));
        ageLBL.setText("Age:");

        ageTF.setBackground(new java.awt.Color(51, 51, 51));
        ageTF.setForeground(new java.awt.Color(255, 255, 255));

        GPDetailLBL.setForeground(new java.awt.Color(255, 255, 255));
        GPDetailLBL.setText("GP Details:");

        GPDetailTF.setBackground(new java.awt.Color(51, 51, 51));
        GPDetailTF.setForeground(new java.awt.Color(255, 255, 255));

        priorityLBL.setForeground(new java.awt.Color(255, 255, 255));
        priorityLBL.setText("Priority:");

        priorityComboBox.setBackground(new java.awt.Color(51, 51, 51));
        priorityComboBox.setForeground(new java.awt.Color(255, 255, 255));
        priorityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Urgent", "Medium", "Low" }));

        hospitalLBL.setForeground(new java.awt.Color(255, 255, 255));
        hospitalLBL.setText("From Hospital:");

        hospitalCheckBox.setBackground(new java.awt.Color(51, 51, 51));
        hospitalCheckBox.setForeground(new java.awt.Color(255, 255, 255));

        addPatientBTN.setBackground(new java.awt.Color(51, 51, 51));
        addPatientBTN.setForeground(new java.awt.Color(255, 255, 255));
        addPatientBTN.setText("Add Patient");

        getNextBTN.setBackground(new java.awt.Color(51, 51, 51));
        getNextBTN.setForeground(new java.awt.Color(255, 255, 255));
        getNextBTN.setText("Get Next Patient");

        addNoShowBTN.setBackground(new java.awt.Color(51, 51, 51));
        addNoShowBTN.setForeground(new java.awt.Color(255, 255, 255));
        addNoShowBTN.setText("Add No-Show");

        javax.swing.GroupLayout mainPNLLayout = new javax.swing.GroupLayout(mainPNL);
        mainPNL.setLayout(mainPNLLayout);
        mainPNLLayout.setHorizontalGroup(
            mainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPNLLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(titleLBL)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mainPNLLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(mainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageLBL)
                    .addComponent(nameLBL)
                    .addComponent(GPDetailLBL)
                    .addComponent(priorityLBL)
                    .addComponent(hospitalLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GPDetailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalCheckBox))
                .addGap(90, 90, 90))
            .addGroup(mainPNLLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(addPatientBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(getNextBTN)
                .addGap(42, 42, 42)
                .addComponent(addNoShowBTN)
                .addGap(47, 47, 47))
        );
        mainPNLLayout.setVerticalGroup(
            mainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLBL)
                .addGap(31, 31, 31)
                .addGroup(mainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameLBL)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(mainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ageLBL)
                    .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(mainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(priorityLBL)
                    .addComponent(priorityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(mainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPNLLayout.createSequentialGroup()
                        .addGroup(mainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GPDetailLBL)
                            .addComponent(GPDetailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hospitalLBL))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPNLLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(hospitalCheckBox)))
                .addGap(61, 61, 61)
                .addGroup(mainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getNextBTN)
                    .addComponent(addPatientBTN)
                    .addComponent(addNoShowBTN))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GPDetailLBL;
    private javax.swing.JTextField GPDetailTF;
    private javax.swing.JButton addNoShowBTN;
    private javax.swing.JButton addPatientBTN;
    private javax.swing.JLabel ageLBL;
    private javax.swing.JTextField ageTF;
    private javax.swing.JButton getNextBTN;
    private javax.swing.JCheckBox hospitalCheckBox;
    private javax.swing.JLabel hospitalLBL;
    private javax.swing.JPanel mainPNL;
    private javax.swing.JLabel nameLBL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JComboBox<String> priorityComboBox;
    private javax.swing.JLabel priorityLBL;
    private javax.swing.JLabel titleLBL;
    // End of variables declaration//GEN-END:variables
}
