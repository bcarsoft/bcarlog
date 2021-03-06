/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bcarsoft.pass.view;

import com.bcarsoft.pass.model.Pass;
import com.bcarsoft.struct.singleton.SingFacade;

/**
 * This Class is the view to a password generator.
 * @author abelbcarvalho
 */
public class GeraSenha extends javax.swing.JFrame {
    private String password;

    /** Creates new form PassGenerate */
    public GeraSenha() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        panData = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblSubtitle = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sldSize = new javax.swing.JSlider();
        radUpCase = new javax.swing.JRadioButton();
        radLowCase = new javax.swing.JRadioButton();
        radNumber = new javax.swing.JRadioButton();
        radSymbol = new javax.swing.JRadioButton();
        lblSize = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        panSide = new javax.swing.JPanel();
        lblMsg = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GeraSenha");
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        lblTitle.setText("GeraSenha - Gere sua Senha");

        lblSubtitle.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblSubtitle.setText("Escolha quais as opções desejada para sua senha.");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel5.setText("Selecione o Tamanho");

        sldSize.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        sldSize.setMaximum(15);
        sldSize.setValue(0);
        sldSize.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sldSizeMouseDragged(evt);
            }
        });

        radUpCase.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        radUpCase.setText("Letras Maiusculas");

        radLowCase.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        radLowCase.setText("Letras Minúsculas");

        radNumber.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        radNumber.setText("Números");

        radSymbol.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        radSymbol.setText("Símbolos");

        lblSize.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblSize.setText("0");

        txtData.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        btnNovo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panDataLayout = new javax.swing.GroupLayout(panData);
        panData.setLayout(panDataLayout);
        panDataLayout.setHorizontalGroup(
            panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDataLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDataLayout.createSequentialGroup()
                        .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radSymbol)
                            .addComponent(radNumber))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panDataLayout.createSequentialGroup()
                        .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(radUpCase)
                                .addComponent(jLabel5)
                                .addComponent(lblSubtitle)
                                .addComponent(lblTitle)
                                .addGroup(panDataLayout.createSequentialGroup()
                                    .addComponent(sldSize, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panDataLayout.createSequentialGroup()
                                .addComponent(radLowCase)
                                .addGap(200, 200, 200))
                            .addGroup(panDataLayout.createSequentialGroup()
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 39, Short.MAX_VALUE))))
        );
        panDataLayout.setVerticalGroup(
            panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDataLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubtitle)
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sldSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(radUpCase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radLowCase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radSymbol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(panDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo))
                .addGap(26, 26, 26))
        );

        lblMsg.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblMsg.setText("<html> <p> Uma realização:<br> <i>BCarSoft<I> </p> </html>");

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pass-gen-img.png"))); // NOI18N

        javax.swing.GroupLayout panSideLayout = new javax.swing.GroupLayout(panSide);
        panSide.setLayout(panSideLayout);
        panSideLayout.setHorizontalGroup(
            panSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSideLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(panSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg))
                .addGap(36, 36, 36))
        );
        panSideLayout.setVerticalGroup(
            panSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSideLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImg)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Update value of size.
     * @param evt MouseWheelEvent - dragged.
     */
    private void sldSizeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldSizeMouseDragged
        // TODO add your handling code here:
        this.lblSize.setText(Integer.toString(this.sldSize.getValue()));
    }//GEN-LAST:event_sldSizeMouseDragged

    /**
     * Generate a new password.
     * @param evt ActionEvent.
     */
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        Pass pass = new Pass();
        // set size
        pass.setSize(Integer.parseInt(this.lblSize.getText()));
        // set up case bool
        pass.setUpcase(this.radUpCase.isSelected());
        // set low case bool
        pass.setLowcase(this.radLowCase.isSelected());
        // set number bool
        pass.setNumber(this.radNumber.isSelected());
        // set symbol bool
        pass.setSymbol(this.radSymbol.isSelected());
        // where all happen
        this.setPassword(SingFacade.getInstance().generatePassword(pass));
        if (this.getPassword().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Tamanho ou Caracteres Inválidos.\n"
                    + "Senha Não gerada.", 
                    "Erro Encontrado", 0);
        } else {
            this.txtData.setText(this.getPassword());
        }
    }//GEN-LAST:event_btnNovoActionPerformed

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
            java.util.logging.Logger.getLogger(GeraSenha.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GeraSenha().setVisible(true);
        });
    }
    
    // getters and setters
    
    private String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panData;
    private javax.swing.JPanel panSide;
    private javax.swing.JRadioButton radLowCase;
    private javax.swing.JRadioButton radNumber;
    private javax.swing.JRadioButton radSymbol;
    private javax.swing.JRadioButton radUpCase;
    private javax.swing.JSlider sldSize;
    private javax.swing.JTextField txtData;
    // End of variables declaration//GEN-END:variables

}
