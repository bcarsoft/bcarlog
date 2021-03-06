/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.site.view;

import com.bcarsoft.account.model.Account;
import com.bcarsoft.bcarlog.BCarLogCenter;
import com.bcarsoft.site.model.Site;
import com.bcarsoft.site.model.SiteTable;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * This is the center of logins account saved.
 * @author abelbcarvalho
 */
public class SiteCenter extends javax.swing.JFrame {
    private final SiteTable siteTable = new SiteTable();
    private Account account;

    /**
     * Creates new form LoginCenter
     */
    public SiteCenter() {
        initComponents();
    }
    
    /**
     * New Instance of LoginCenter Alternative.
     * @param account Account instance.
     */
    public SiteCenter(Account account) {
        this.setAccount(account);
        this.initComponents();
        this.tbSites.setModel(this.getSiteTable());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panMain = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSites = new javax.swing.JTable();
        panData = new javax.swing.JPanel();
        lblTItle = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        lblComeBack = new javax.swing.JLabel();
        lblSubTite = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BCarLog - Site Center");
        getContentPane().setLayout(new java.awt.FlowLayout());

        tbSites.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbSites.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSitesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbSites);

        lblTItle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTItle.setText("BCarLog - Site Center");

        txtSearch.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        lblComeBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/come-back-blue.png"))); // NOI18N
        lblComeBack.setToolTipText("Ir para o inicio de BCarLog.");
        lblComeBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblComeBackMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblComeBackMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblComeBackMouseEntered(evt);
            }
        });

        lblSubTite.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblSubTite.setText("Aqui você pode ver todos os seus sites favoritos.");

        javax.swing.GroupLayout panDataLayout = new javax.swing.GroupLayout(panData);
        panData.setLayout(panDataLayout);
        panDataLayout.setHorizontalGroup(
            panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDataLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblComeBack)
                .addGap(18, 18, 18)
                .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDataLayout.createSequentialGroup()
                        .addComponent(lblSubTite)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panDataLayout.createSequentialGroup()
                        .addComponent(lblTItle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        panDataLayout.setVerticalGroup(
            panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDataLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTItle)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblComeBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubTite)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        btnNew.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        btnNew.setText("Novo");

        javax.swing.GroupLayout panMainLayout = new javax.swing.GroupLayout(panMain);
        panMain.setLayout(panMainLayout);
        panMainLayout.setHorizontalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMainLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        panMainLayout.setVerticalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNew)
                .addGap(20, 20, 20))
        );

        getContentPane().add(panMain);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * It changes color.
     * @param evt 
     */
    private void lblComeBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComeBackMouseEntered
        // TODO add your handling code here:
        lblComeBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/come-back-yellow.png")));
    }//GEN-LAST:event_lblComeBackMouseEntered

    /**
     * It changes color.
     * @param evt 
     */
    private void lblComeBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComeBackMouseExited
        // TODO add your handling code here:
        lblComeBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/come-back-blue.png")));
    }//GEN-LAST:event_lblComeBackMouseExited

    /**
     * it go back to previous window.
     * @param evt 
     */
    private void lblComeBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComeBackMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getDefaultCloseOperation();
        // calls previous window
        BCarLogCenter bcarlog = new BCarLogCenter(this.getAccount());
        bcarlog.setDefaultCloseOperation(EXIT_ON_CLOSE);
        bcarlog.setLocationRelativeTo(null);
        bcarlog.setVisible(true);
    }//GEN-LAST:event_lblComeBackMouseClicked

    /**
     * This method is for update and something more.
     * @param evt 
     */
    private void tbSitesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSitesMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            Site site = new Site();
            site.setFk(this.getAccount().getId());
            site.setId(Integer.parseInt(this.tbSites
                    .getValueAt(this.tbSites.getSelectedRow(), 0).toString()));
            SiteUpdate reg = new SiteUpdate(site);
            reg.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            reg.setLocationRelativeTo(null);
            reg.setVisible(true);
        }
    }//GEN-LAST:event_tbSitesMouseClicked

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
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException 
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiteCenter.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SiteCenter().setVisible(true);
        });
    }
    
    // getters and setters

    /**
     * This method returns a model to inserts into tbSites.
     * @return SiteTable Instance.
     */
    private SiteTable getSiteTable() {
        return siteTable;
    }
    
    private Account getAccount() {
        return account;
    }

    private void setAccount(Account account) {
        this.account = account;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNew;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblComeBack;
    private javax.swing.JLabel lblSubTite;
    private javax.swing.JLabel lblTItle;
    private javax.swing.JPanel panData;
    private javax.swing.JPanel panMain;
    private javax.swing.JTable tbSites;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
