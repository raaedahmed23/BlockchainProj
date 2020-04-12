package cryptoproj;
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EvidenceArea = new javax.swing.JTextArea();
        MineBlockButton = new javax.swing.JButton();
        AddEvidence = new javax.swing.JButton();
        viewUserButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SuspectNameField = new javax.swing.JTextField();
        VictimNameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setText("Suspect Name  :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 50, 90, 30);

        EvidenceArea.setColumns(20);
        EvidenceArea.setRows(5);
        jScrollPane1.setViewportView(EvidenceArea);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(250, 190, 330, 130);

        MineBlockButton.setText("MINE BLOCK");
        MineBlockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MineBlockButtonActionPerformed(evt);
            }
        });
        jPanel1.add(MineBlockButton);
        MineBlockButton.setBounds(130, 460, 130, 50);

        AddEvidence.setText("ADD EVIDENCE");
        AddEvidence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEvidenceActionPerformed(evt);
            }
        });
        jPanel1.add(AddEvidence);
        AddEvidence.setBounds(320, 340, 160, 50);

        viewUserButton.setText("VIEW USER");
        viewUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUserButtonActionPerformed(evt);
            }
        });
        jPanel1.add(viewUserButton);
        viewUserButton.setBounds(400, 460, 120, 50);

        jLabel2.setText("ALL DETAILS ABOVE ARE MANDATORY TO ADD EVIDENCE");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 400, 300, 30);
        jPanel1.add(SuspectNameField);
        SuspectNameField.setBounds(240, 50, 340, 40);

        VictimNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VictimNameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(VictimNameField);
        VictimNameField.setBounds(240, 110, 340, 40);

        jLabel1.setText("Victim Name    :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 110, 90, 40);

        jLabel4.setText("Evidence        :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 190, 100, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void VictimNameFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void AddEvidenceActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void MineBlockButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void viewUserButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton AddEvidence;
    private javax.swing.JTextArea EvidenceArea;
    private javax.swing.JButton MineBlockButton;
    private javax.swing.JTextField SuspectNameField;
    private javax.swing.JTextField VictimNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewUserButton;
    // End of variables declaration                   
}
