/*
 * To change this license header, choose License Headers in Project Properties.
 
* To change this template file, choose Tools | Templates
 
* and open the template in the editor.
 
*/
package latihanuas;
import java.text.*;

import javax.swing.JOptionPane;
 

public class fHitung extends javax.swing.JFrame {

    
/**
     
* Creates new form fHitung
     
*/
    public fHitung() {
        
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

        
jLabel1 = new javax.swing.JLabel();
        
jLabel2 = new javax.swing.JLabel();
        
jLabel3 = new javax.swing.JLabel();
        
jLabel4 = new javax.swing.JLabel();
        
lblTotal = new javax.swing.JLabel();
        
txtNamaBarang = new javax.swing.JTextField();
        
txtHarga = new javax.swing.JTextField();
        
txtQty = new javax.swing.JTextField();
        
txtTotal = new javax.swing.JTextField();
       
 btnHitung = new javax.swing.JButton();
        
btnKeluar = new javax.swing.JButton();

        
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
setTitle("Form Hitung");

        
jLabel1.setText("Nama Barang");

        
jLabel2.setText("Harga");

        
jLabel3.setText("QTY");

       
 jLabel4.setText("Total");

       
 lblTotal.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        
lblTotal.setText("TOTAL");

        
txtNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            
public void actionPerformed(java.awt.event.ActionEvent evt) {
                
txtNamaBarangActionPerformed(evt);
            
}
        
});

        
txtHarga.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

       
 txtQty.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

       
 txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        
txtTotal.setEnabled(false);

       
 btnHitung.setMnemonic('H');
       
 btnHitung.setText("Hitung");
        
btnHitung.addActionListener(new java.awt.event.ActionListener() {
            
public void actionPerformed(java.awt.event.ActionEvent evt) {
                
btnHitungActionPerformed(evt);
           
 }
        
});

        
btnKeluar.setMnemonic('K');
        
btnKeluar.setText("Keluar");
       
 btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            
public void actionPerformed(java.awt.event.ActionEvent evt) {
                
btnKeluarActionPerformed(evt);
            
}
        
});

        
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        
getContentPane().setLayout(layout);
        
layout.setHorizontalGroup(
            
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            
.addGroup(layout.createSequentialGroup()
                
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    
.addGroup(layout.createSequentialGroup()
                        
.addContainerGap()
                       
 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            
.addGroup(layout.createSequentialGroup()
                                
.addComponent(lblTotal)
                                
.addGap(11, 11, 11))
                            
.addGroup(layout.createSequentialGroup()
                                
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        
.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        
.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    
.addComponent(jLabel3)
                                    
.addComponent(jLabel4))
                                
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    
.addComponent(txtNamaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    
.addComponent(txtHarga)
                                    .addComponent(txtQty)
                                    .addComponent(txtTotal)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnHitung)
                        .addGap(46, 46, 46)
                        .addComponent(btnKeluar)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(lblTotal)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHitung)
                    .addComponent(btnKeluar))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaBarangActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
            // TODO add your handling code here:
         float jumlah = Float.parseFloat(txtHarga.getText())*
     Float.parseFloat(txtQty.getText());
     txtTotal.setText(Float.toString(jumlah));
     DecimalFormat angka = new DecimalFormat("###,###");
     lblTotal.setText("Total : Rp. "+angka.format(jumlah));
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this,
    "Terima Kasih Sudah Membeli "+txtNamaBarang.getText());
    System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(fHitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fHitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fHitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fHitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fHitung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
