/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package juego1;

/**
 *
 * @author kikal
 */
public class InterfazJuego extends javax.swing.JFrame {

    /**
     * Creates new form InterfazJuego
     */
    public InterfazJuego() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_llavesA = new javax.swing.JButton();
        btn_parentesisA = new javax.swing.JButton();
        btn_parentesisC = new javax.swing.JButton();
        btn_si1 = new javax.swing.JButton();
        btn_llavesC = new javax.swing.JButton();
        btn_Condicion = new javax.swing.JButton();
        txtP1 = new javax.swing.JTextField();
        txtP2 = new javax.swing.JTextField();
        txtP3 = new javax.swing.JTextField();
        txtP4 = new javax.swing.JTextField();
        txtP5 = new javax.swing.JTextField();
        txtP6 = new javax.swing.JTextField();
        btnComprobar = new javax.swing.JButton();
        txtP7 = new javax.swing.JTextField();
        btnSentencia = new javax.swing.JButton();
        btnPuntoComa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sintaxis en Java", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Acomoda los elementos en el orden correcto para formar la sintaxis de una estructura si");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18))); // NOI18N

        btn_llavesA.setBackground(new java.awt.Color(204, 204, 204));
        btn_llavesA.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        btn_llavesA.setText("{");
        btn_llavesA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_llavesA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_llavesAActionPerformed(evt);
            }
        });

        btn_parentesisA.setBackground(new java.awt.Color(204, 204, 204));
        btn_parentesisA.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        btn_parentesisA.setText("(");
        btn_parentesisA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_parentesisA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_parentesisAActionPerformed(evt);
            }
        });

        btn_parentesisC.setBackground(new java.awt.Color(204, 204, 204));
        btn_parentesisC.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        btn_parentesisC.setText(")");
        btn_parentesisC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_parentesisC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_parentesisCActionPerformed(evt);
            }
        });

        btn_si1.setBackground(new java.awt.Color(204, 204, 204));
        btn_si1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        btn_si1.setText("si");
        btn_si1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_si1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_si1ActionPerformed(evt);
            }
        });

        btn_llavesC.setBackground(new java.awt.Color(204, 204, 204));
        btn_llavesC.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        btn_llavesC.setText("}");
        btn_llavesC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_llavesC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_llavesCActionPerformed(evt);
            }
        });

        btn_Condicion.setBackground(new java.awt.Color(204, 204, 204));
        btn_Condicion.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        btn_Condicion.setText("verdadero");
        btn_Condicion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Condicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CondicionActionPerformed(evt);
            }
        });

        txtP1.setEditable(false);
        txtP1.setBackground(new java.awt.Color(255, 204, 204));
        txtP1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtP2.setEditable(false);
        txtP2.setBackground(new java.awt.Color(255, 204, 204));
        txtP2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtP3.setEditable(false);
        txtP3.setBackground(new java.awt.Color(255, 204, 204));
        txtP3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtP4.setEditable(false);
        txtP4.setBackground(new java.awt.Color(255, 204, 204));
        txtP4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtP5.setEditable(false);
        txtP5.setBackground(new java.awt.Color(255, 204, 204));
        txtP5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtP6.setEditable(false);
        txtP6.setBackground(new java.awt.Color(255, 204, 204));
        txtP6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnComprobar.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        btnComprobar.setText("Comprobar");

        txtP7.setEditable(false);
        txtP7.setBackground(new java.awt.Color(255, 204, 204));
        txtP7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnSentencia.setBackground(new java.awt.Color(204, 204, 204));
        btnSentencia.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        btnSentencia.setText("Sentencia");
        btnSentencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSentenciaActionPerformed(evt);
            }
        });

        btnPuntoComa.setBackground(new java.awt.Color(204, 204, 204));
        btnPuntoComa.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        btnPuntoComa.setText(";");
        btnPuntoComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoComaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_si1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtP1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtP2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtP3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtP4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtP5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtP6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtP7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_llavesA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_parentesisA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_parentesisC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_llavesC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Condicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnPuntoComa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSentencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnComprobar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(btn_parentesisA)
                .addGap(18, 18, 18)
                .addComponent(btn_si1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_parentesisC)))
                .addGap(18, 18, 18)
                .addComponent(btn_llavesA)
                .addGap(18, 18, 18)
                .addComponent(btn_llavesC)
                .addGap(18, 18, 18)
                .addComponent(btn_Condicion)
                .addGap(18, 18, 18)
                .addComponent(btnSentencia)
                .addGap(18, 18, 18)
                .addComponent(btnPuntoComa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnComprobar)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_parentesisCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_parentesisCActionPerformed
        // TODO add your handling code here:
        String palabra3 = ")";
        //txtP4.setText(palabra3);
        
        if(txtP1.getText().length()==0){
            txtP1.setText(palabra3);
        }else if(txtP2.getText().length()==0){
            txtP2.setText(palabra3);
        }else if(txtP3.getText().length()==0){
            txtP3.setText(palabra3);
        }else if(txtP4.getText().length()==0){
            txtP4.setText(palabra3);
        }else if(txtP5.getText().length()==0){
            txtP5.setText(palabra3);
        }else if(txtP6.getText().length()==0){
            txtP6.setText(palabra3);
        }else if(txtP7.getText().length()==0){
            txtP7.setText(palabra3);
        }
        btn_parentesisC.setEnabled(false);
    }//GEN-LAST:event_btn_parentesisCActionPerformed

    private void btn_si1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_si1ActionPerformed
        // TODO add your handling code here:
        String palabra1 = "si"; 
        //txtP1.setText(palabra1);
        
        if(txtP1.getText().length()==0){
            txtP1.setText(palabra1);
        }else if(txtP2.getText().length()==0){
            txtP2.setText(palabra1);
        }else if(txtP3.getText().length()==0){
            txtP3.setText(palabra1);
        }else if(txtP4.getText().length()==0){
            txtP4.setText(palabra1);
        }else if(txtP5.getText().length()==0){
            txtP5.setText(palabra1);
        }else if(txtP6.getText().length()==0){
            txtP6.setText(palabra1);
        }else if(txtP7.getText().length()==0){
            txtP7.setText(palabra1);
        }
        btn_si1.setEnabled(false);
    }//GEN-LAST:event_btn_si1ActionPerformed

    private void btn_parentesisAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_parentesisAActionPerformed
        // TODO add your handling code here:
        String palabra2 = "(";
        //txtP2.setText(palabra2);
        
        if(txtP1.getText().length()==0){
            txtP1.setText(palabra2);
        }else if(txtP2.getText().length()==0){
            txtP2.setText(palabra2);
        }else if(txtP3.getText().length()==0){
            txtP3.setText(palabra2);
        }else if(txtP4.getText().length()==0){
            txtP4.setText(palabra2);
        }else if(txtP5.getText().length()==0){
            txtP5.setText(palabra2);
        }else if(txtP6.getText().length()==0){
            txtP6.setText(palabra2);
        }else if(txtP7.getText().length()==0){
            txtP7.setText(palabra2);
        }
        btn_parentesisA.setEnabled(false);
    }//GEN-LAST:event_btn_parentesisAActionPerformed

    private void btn_llavesAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_llavesAActionPerformed
        // TODO add your handling code here:
        String palabra4 = "{";
        //txtP5.setText(palabra4);
        
        if(txtP1.getText().length()==0){
            txtP1.setText(palabra4);
        }else if(txtP2.getText().length()==0){
            txtP2.setText(palabra4);
        }else if(txtP3.getText().length()==0){
            txtP3.setText(palabra4);
        }else if(txtP4.getText().length()==0){
            txtP4.setText(palabra4);
        }else if(txtP5.getText().length()==0){
            txtP5.setText(palabra4);
        }else if(txtP6.getText().length()==0){
            txtP6.setText(palabra4);
        }else if(txtP7.getText().length()==0){
            txtP7.setText(palabra4);
        }
        btn_llavesA.setEnabled(false);
    }//GEN-LAST:event_btn_llavesAActionPerformed

    private void btn_llavesCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_llavesCActionPerformed
        // TODO add your handling code here:
        String palabra5 = "}";
        //txtP6.setText(palabra5);
        
        if(txtP1.getText().length()==0){
            txtP1.setText(palabra5);
        }else if(txtP2.getText().length()==0){
            txtP2.setText(palabra5);
        }else if(txtP3.getText().length()==0){
            txtP3.setText(palabra5);
        }else if(txtP4.getText().length()==0){
            txtP4.setText(palabra5);
        }else if(txtP5.getText().length()==0){
            txtP5.setText(palabra5);
        }else if(txtP6.getText().length()==0){
            txtP6.setText(palabra5);
        }else if(txtP7.getText().length()==0){
            txtP7.setText(palabra5);
        }
        btn_llavesC.setEnabled(false);
    }//GEN-LAST:event_btn_llavesCActionPerformed

    private void btn_CondicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CondicionActionPerformed
        // TODO add your handling code here:
        String palabra6 = "verdadero";
        //txtP3.setText(palabra6);
        
        if(txtP1.getText().length()==0){
            txtP1.setText(palabra6);
        }else if(txtP2.getText().length()==0){
            txtP2.setText(palabra6);
        }else if(txtP3.getText().length()==0){
            txtP3.setText(palabra6);
        }else if(txtP4.getText().length()==0){
            txtP4.setText(palabra6);
        }else if(txtP5.getText().length()==0){
            txtP5.setText(palabra6);
        }else if(txtP6.getText().length()==0){
            txtP6.setText(palabra6);
        }else if(txtP7.getText().length()==0){
            txtP7.setText(palabra6);
        }
        btn_Condicion.setEnabled(false);
    }//GEN-LAST:event_btn_CondicionActionPerformed

    private void btnSentenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSentenciaActionPerformed
        // TODO add your handling code here:
        String palabra7 = "Sentencia";
        
        if(txtP1.getText().length()==0){
            txtP1.setText(palabra7);
        }else if(txtP2.getText().length()==0){
            txtP2.setText(palabra7);
        }else if(txtP3.getText().length()==0){
            txtP3.setText(palabra7);
        }else if(txtP4.getText().length()==0){
            txtP4.setText(palabra7);
        }else if(txtP5.getText().length()==0){
            txtP5.setText(palabra7);
        }else if(txtP6.getText().length()==0){
            txtP6.setText(palabra7);
        }else if(txtP7.getText().length()==0){
            txtP7.setText(palabra7);
        }
        btnSentencia.setEnabled(false);
    }//GEN-LAST:event_btnSentenciaActionPerformed

    private void btnPuntoComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoComaActionPerformed
        // TODO add your handling code here:
        String palabra8 = ";";
        
        if(txtP1.getText().length()==0){
            txtP1.setText(palabra8);
        }else if(txtP2.getText().length()==0){
            txtP2.setText(palabra8);
        }else if(txtP3.getText().length()==0){
            txtP3.setText(palabra8);
        }else if(txtP4.getText().length()==0){
            txtP4.setText(palabra8);
        }else if(txtP5.getText().length()==0){
            txtP5.setText(palabra8);
        }else if(txtP6.getText().length()==0){
            txtP6.setText(palabra8);
        }else if(txtP7.getText().length()==0){
            txtP7.setText(palabra8);
        }
        btnPuntoComa.setEnabled(false);
    }//GEN-LAST:event_btnPuntoComaActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprobar;
    private javax.swing.JButton btnPuntoComa;
    private javax.swing.JButton btnSentencia;
    private javax.swing.JButton btn_Condicion;
    private javax.swing.JButton btn_llavesA;
    private javax.swing.JButton btn_llavesC;
    private javax.swing.JButton btn_parentesisA;
    private javax.swing.JButton btn_parentesisC;
    private javax.swing.JButton btn_si1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtP1;
    private javax.swing.JTextField txtP2;
    private javax.swing.JTextField txtP3;
    private javax.swing.JTextField txtP4;
    private javax.swing.JTextField txtP5;
    private javax.swing.JTextField txtP6;
    private javax.swing.JTextField txtP7;
    // End of variables declaration//GEN-END:variables
}
