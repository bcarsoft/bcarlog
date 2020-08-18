/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.login.view;

import com.bcarsoft.account.model.Account;
import com.bcarsoft.login.model.Login;
import com.bcarsoft.pass.model.Pass;
import com.bcarsoft.struct.mask.PassMask;
import com.bcarsoft.struct.singleton.SingFacade;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the register Login screen.
 * @author abelbcarvalho
 */
public class LoginRegister extends javax.swing.JFrame {
    private Login login = new Login();
    private List<String> lPass = new ArrayList<>();
    private String password;

    /**
     * Creates new form LoginRegister
     */
    public LoginRegister() {
        initComponents();
    }
    
    /**
     * New instance of LoginRegister, Alternative.
     * @param login Login Instance.
     */
    public LoginRegister(Login login) {
        this.setLogin(login);
        this.initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panHead = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblComeBack = new javax.swing.JLabel();
        panData = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblLink = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtLink = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        radShow = new javax.swing.JRadioButton();
        lblPassGenerator = new javax.swing.JLabel();
        panFunction = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BCarLog - Cadastrar Login");
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setText("BCarLog - Cadastrar Login");

        lblComeBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/come-back-blue.png"))); // NOI18N
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

        javax.swing.GroupLayout panHeadLayout = new javax.swing.GroupLayout(panHead);
        panHead.setLayout(panHeadLayout);
        panHeadLayout.setHorizontalGroup(
            panHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblComeBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panHeadLayout.setVerticalGroup(
            panHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblComeBack, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        lblName.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblName.setText("Nome do Site*");

        lblLink.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblLink.setText("Link do Site*");

        lblUser.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblUser.setText("Usuário");

        lblEmail.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblEmail.setText("E-Mail*");

        lblPass.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblPass.setText("Senha* (Mín. 6, Máx. 15)");

        txtName.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        txtLink.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        txtUser.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        txtPass.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
        });

        radShow.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        radShow.setText("Mostrar");
        radShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radShowMouseClicked(evt);
            }
        });

        lblPassGenerator.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblPassGenerator.setText("Gerar Senha Forte");
        lblPassGenerator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPassGeneratorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPassGeneratorMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPassGeneratorMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panDataLayout = new javax.swing.GroupLayout(panData);
        panData.setLayout(panDataLayout);
        panDataLayout.setHorizontalGroup(
            panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDataLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassGenerator)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panDataLayout.createSequentialGroup()
                        .addComponent(lblPass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radShow))
                    .addComponent(txtLink, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLink)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser)
                    .addComponent(lblEmail))
                .addContainerGap())
        );
        panDataLayout.setVerticalGroup(
            panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLink)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass)
                    .addComponent(radShow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassGenerator)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register.png"))); // NOI18N

        btnRegister.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        btnRegister.setText("Cadastrar");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        lblMsg.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblMsg.setText("<html> <p> Aqui você pode<br> cadastrar seus logins. </p> </html>");

        javax.swing.GroupLayout panFunctionLayout = new javax.swing.GroupLayout(panFunction);
        panFunction.setLayout(panFunctionLayout);
        panFunctionLayout.setHorizontalGroup(
            panFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFunctionLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(panFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg)
                    .addGroup(panFunctionLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        panFunctionLayout.setVerticalGroup(
            panFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFunctionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg)
                .addGap(44, 44, 44)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegister)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panFunction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panFunction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Go back to previous windows.
     * @param evt 
     */
    private void lblComeBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComeBackMouseClicked
        // TODO add your handling code here:
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(false);
        this.getDefaultCloseOperation();
    }//GEN-LAST:event_lblComeBackMouseClicked

    /**
     * Change Image.
     * @param evt 
     */
    private void lblComeBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComeBackMouseEntered
        // TODO add your handling code here:
        this.lblComeBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/come-back-yellow.png")));
    }//GEN-LAST:event_lblComeBackMouseEntered

    /**
     * Change Image.
     * @param evt 
     */
    private void lblComeBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComeBackMouseExited
        // TODO add your handling code here:
        this.lblComeBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/come-back-blue.png")));
    }//GEN-LAST:event_lblComeBackMouseExited

    /**
     * This method can register a new login.
     * @param evt ActionEvent.
     */
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        login.setSiteLogin(this.txtName.getText());
        login.setUrlSiteLogin(this.txtLink.getText());
        login.setEmailLogin(this.txtEmail.getText());
        login.setUserLogin(this.txtUser.getText());
        login.setPassLogin(this.getPassword());
        if (SingFacade.getInstance().saveLogin(login)) {
            javax.swing.JOptionPane.showMessageDialog(null, "Login Registrado com Sucesso.", "Login Cadastrado", 0);
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Um Erro foi encontrado ao tentar\ncadastrar Login.", 
                    "Erro Encontrado", 0);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    /**
     * Insert mask password.
     * @param evt KeyEvent released.
     */
    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
        // TODO add your handling code here:
        this.insertMaskPass();
    }//GEN-LAST:event_txtPassKeyReleased

    /**
     * Show or not the password.
     * @param evt MouseEvent - click.
     */
    private void radShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radShowMouseClicked
        // TODO add your handling code here:
        try {
            if (this.txtPass.getText().isEmpty()) return;
            if (this.radShow.isSelected()) {
                this.txtPass.setText(this.getPassword());
            }
            else {
                this.txtPass.setText(this.getlPass().get(2));
            }
        } catch (IndexOutOfBoundsException e) {
            this.insertMaskPass();
        }
    }//GEN-LAST:event_radShowMouseClicked

    /**
     * This method can generate a new Password.
     * @param evt 
     */
    private void lblPassGeneratorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPassGeneratorMouseClicked
        // TODO add your handling code here:
        Pass pass = new Pass();
        pass.setLowcase(true);
        pass.setUpcase(true);
        pass.setSymbol(false);
        pass.setNumber(true);
        pass.setSize(15);
        this.txtPass.setText(SingFacade.getInstance().generatePassword(pass));
        this.setPassword(this.txtPass.getText());
        this.insertMaskPass();
    }//GEN-LAST:event_lblPassGeneratorMouseClicked

    /**
     * Become Bold.
     * @param evt 
     */
    private void lblPassGeneratorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPassGeneratorMouseEntered
        // TODO add your handling code here:
        this.lblPassGenerator.setFont(new java.awt.Font("Lucida Grande", 1, 15));
    }//GEN-LAST:event_lblPassGeneratorMouseEntered

    /**
     * Become Plain.
     * @param evt 
     */
    private void lblPassGeneratorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPassGeneratorMouseExited
        // TODO add your handling code here:
        this.lblPassGenerator.setFont(new java.awt.Font("Lucida Grande", 0, 15));
    }//GEN-LAST:event_lblPassGeneratorMouseExited

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
            java.util.logging.Logger.getLogger(LoginRegister.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginRegister().setVisible(true);
        });
    }
    
    /**
     * This method can insert mask into a password, it 
     * is being used because it needs to work better and 
     * economize code, more than one method use it.
     */
    private void insertMaskPass() {
        // list
        this.getlPass().clear();
        this.getlPass().add(this.txtPass.getText());
        this.getlPass().add(this.getPassword());
        this.getlPass().add("*");
        // when all happen
        this.lPass = PassMask.returnPass(this.getlPass());
        this.setPassword(this.getlPass().get(1));
        if (this.radShow.isSelected()) {
            this.txtPass.setText(this.getPassword());
        } else {
            this.txtPass.setText(this.getlPass().get(2));
        }
    }
    
    // getters and setters

    private Login getLogin() {
        return login;
    }

    private void setLogin(Login login) {
        this.login = login;
    }

    private String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private List<String> getlPass() {
        return lPass;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel lblComeBack;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblLink;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPassGenerator;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panData;
    private javax.swing.JPanel panFunction;
    private javax.swing.JPanel panHead;
    private javax.swing.JRadioButton radShow;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLink;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}