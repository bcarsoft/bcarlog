/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.account.view;

import com.bcarsoft.account.model.Account;
import com.bcarsoft.struct.mask.MobileMask;
import com.bcarsoft.struct.mask.PassMask;
import com.bcarsoft.struct.singleton.SingFacade;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the Recovery Password Application Window.
 * @author abelbcarvalho
 */
public class AccountRecovery extends javax.swing.JFrame {
    private List<String> lPass1 = new ArrayList<>();
    private List<String> lPass2 = new ArrayList<>();
    private String password1;
    private String password2;

    /**
     * Creates new form AccountRecovery
     */
    public AccountRecovery() {
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

        panTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        panData = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblRepeat = new javax.swing.JLabel();
        lblMobile = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtRepeat = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        radShow1 = new javax.swing.JRadioButton();
        radShow2 = new javax.swing.JRadioButton();
        panFunction = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        btnComeBack = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BCarLog - Recuperação de Senha");
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setText("BCarLog - Recuperação de Senha");

        javax.swing.GroupLayout panTitleLayout = new javax.swing.GroupLayout(panTitle);
        panTitle.setLayout(panTitleLayout);
        panTitleLayout.setHorizontalGroup(
            panTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTitleLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panTitleLayout.setVerticalGroup(
            panTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTitleLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        lblUser.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblUser.setText("Nome de Usuário/E-Mail*");

        lblPass.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblPass.setText("Senha* (Mín. 6, Máx. 15)");

        lblRepeat.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblRepeat.setText("Confirme Nova Senha*");

        lblMobile.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblMobile.setText("N. Celular*");

        txtUser.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        txtPass.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
        });

        txtRepeat.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        txtRepeat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRepeatKeyReleased(evt);
            }
        });

        txtMobile.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        txtMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMobileKeyReleased(evt);
            }
        });

        radShow1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        radShow1.setText("Mostrar");
        radShow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radShow1MouseClicked(evt);
            }
        });

        radShow2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        radShow2.setText("Mostrar");
        radShow2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radShow2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panDataLayout = new javax.swing.GroupLayout(panData);
        panData.setLayout(panDataLayout);
        panDataLayout.setHorizontalGroup(
            panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDataLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMobile)
                    .addComponent(lblUser)
                    .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panDataLayout.createSequentialGroup()
                            .addComponent(lblPass)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radShow1))
                        .addComponent(txtUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panDataLayout.createSequentialGroup()
                            .addComponent(lblRepeat)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radShow2))
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        panDataLayout.setVerticalGroup(
            panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDataLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass)
                    .addComponent(radShow1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRepeat)
                    .addComponent(radShow2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMobile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recovery.png"))); // NOI18N

        btnComeBack.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        btnComeBack.setText("<-");
        btnComeBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComeBackActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblMessage.setText("<html> <p> Perdeu seu acesso ao<br>BCarLog?<br> Aqui você pode atualizar<br>sua senha. </p> </html>");

        btnUpdate.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        btnUpdate.setText("Atualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panFunctionLayout = new javax.swing.GroupLayout(panFunction);
        panFunction.setLayout(panFunctionLayout);
        panFunctionLayout.setHorizontalGroup(
            panFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFunctionLayout.createSequentialGroup()
                .addGroup(panFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFunctionLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblImg))
                    .addGroup(panFunctionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFunctionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComeBack, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        panFunctionLayout.setVerticalGroup(
            panFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFunctionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnComeBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panFunction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panFunction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method inserts mobile mask into this text field.
     * @param evt KeyEvent - Released.
     */
    private void txtMobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileKeyReleased
        // TODO add your handling code here:
        this.txtMobile.setText(MobileMask.returnMobile(this.txtMobile.getText()));
    }//GEN-LAST:event_txtMobileKeyReleased

    /**
     * This method inserts the password mask into this text field.
     * @param evt KeyEvent - Released.
     */
    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
        // TODO add your handling code here:
        this.insertMaskPass1();
    }//GEN-LAST:event_txtPassKeyReleased

    /**
     * This method inserts the password mask into this text field.
     * @param evt KeyEvent - Released.
     */
    private void txtRepeatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRepeatKeyReleased
        // TODO add your handling code here:
        this.insertMaskPass2();
    }//GEN-LAST:event_txtRepeatKeyReleased

    /**
     * This method allow or not the user to show the password typed.
     * @param evt MouseEvent - click.
     */
    private void radShow1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radShow1MouseClicked
        // TODO add your handling code here:
        try {
            if (this.txtPass.getText().isEmpty()) return;
            if (this.radShow1.isSelected()) {
                this.txtPass.setText(this.getPassword1());
            }
            else {
                this.txtPass.setText(this.getlPass1().get(2));
            }
        } catch (IndexOutOfBoundsException e) {
            this.insertMaskPass1();
        }
    }//GEN-LAST:event_radShow1MouseClicked

    /**
     * This method allow or not the user to show the password typed.
     * @param evt MouseEvent - click.
     */
    private void radShow2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radShow2MouseClicked
        // TODO add your handling code here:
        try {
            if (this.txtRepeat.getText().isEmpty()) return;
            if (this.radShow2.isSelected()) {
                this.txtRepeat.setText(this.getPassword2());
            }
            else {
                this.txtRepeat.setText(this.getlPass2().get(2));
            }
        } catch (IndexOutOfBoundsException e) {
            this.insertMaskPass2();
        }
    }//GEN-LAST:event_radShow2MouseClicked

    /**
     * This method calls login application window.
     * @param evt 
     */
    private void btnComeBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComeBackActionPerformed
        // TODO add your handling code here:
        // close this window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(false);
        this.getDefaultCloseOperation();
        // call back the new window
        AccountAccess access = new AccountAccess();
        access.setDefaultCloseOperation(EXIT_ON_CLOSE);
        access.setLocationRelativeTo(null);
        access.setVisible(true);
    }//GEN-LAST:event_btnComeBackActionPerformed

    /**
     * This method does the operation of update a password.
     * @param evt ActionEvent - click.
     */
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (!this.getPassword1().equals(this.getPassword2())) {
            javax.swing.JOptionPane.showMessageDialog
                (null, "A Senha e a Confirmação não Correspondem.", "Erro Encontrado", 0);
            return;
        }
        Account account = new Account();
        account.setEmailAcc(this.txtUser.getText());
        account.setUserAcc(this.txtUser.getText());
        account.setPassAcc(this.getPassword1());
        account.setMobileAcc(this.txtMobile.getText());
        // check success
        if (SingFacade.getInstance().updatePasswordAccount(account)) {
            // success
            javax.swing.JOptionPane.showMessageDialog
                (null, "Sucesso ao Atualizar Senha.", "Senha Atualizada", 0);
            // come back to the previous window that was closed
            this.btnComeBackActionPerformed(evt);
        } else {
            // an error was found
            javax.swing.JOptionPane.showMessageDialog
                (null, "Não foi possível Atualizar Senha.", "Erro Encontrado", 0);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(AccountRecovery.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AccountRecovery().setVisible(true);
        });
    }
    
    // getters and setters
    
    private String getPassword1() {
        return password1;
    }

    private void setPassword1(String password1) {
        this.password1 = password1;
    }

    private String getPassword2() {
        return password2;
    }

    private void setPassword2(String password2) {
        this.password2 = password2;
    }

    private List<String> getlPass1() {
        return lPass1;
    }

    private List<String> getlPass2() {
        return lPass2;
    }
    
    // ˆ getters and setters
    
    /**
     * This method can insert mask into a password, it 
     * is being used because it needs to work better and 
     * economize code, more than one method use it.
     */
    private void insertMaskPass1() {
        // list
        this.getlPass1().clear();
        this.getlPass1().add(this.txtPass.getText());
        this.getlPass1().add(this.getPassword1());
        this.getlPass1().add("*");
        // when all happen
        this.lPass1 = PassMask.returnPass(this.getlPass1());
        this.setPassword1(this.getlPass1().get(1));
        if (this.radShow1.isSelected()) {
            this.txtPass.setText(this.getPassword1());
        } else {
            this.txtPass.setText(this.getlPass1().get(2));
        }
    }
    
    /**
     * This method can insert mask into a password, it 
     * is being used because it needs to work better and 
     * economize code, more than one method use it.
     */
    private void insertMaskPass2() {
        // list
        this.getlPass2().clear();
        this.getlPass2().add(this.txtRepeat.getText());
        this.getlPass2().add(this.getPassword2());
        this.getlPass2().add("*");
        // when all happen
        this.lPass2 = PassMask.returnPass(this.getlPass2());
        this.setPassword2(this.getlPass2().get(1));
        if (this.radShow2.isSelected()) {
            this.txtRepeat.setText(this.getPassword2());
        } else {
            this.txtRepeat.setText(this.getlPass2().get(2));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComeBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRepeat;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panData;
    private javax.swing.JPanel panFunction;
    private javax.swing.JPanel panTitle;
    private javax.swing.JRadioButton radShow1;
    private javax.swing.JRadioButton radShow2;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtRepeat;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
