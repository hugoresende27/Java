/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoemvideo.voto;

/**
 *
 * @author Hugo
 */
public class TelVoto extends javax.swing.JFrame {

    /**
     * Creates new form TelVoto
     */
    public TelVoto() {
        initComponents();
        lblRes.setVisible(false);
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
        txtAno = new javax.swing.JTextField();
        btnVoto = new javax.swing.JButton();
        lblRes = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Ano Nascimento");

        txtAno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btnVoto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnVoto.setText("Posso votar?");
        btnVoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotoActionPerformed(evt);
            }
        });

        lblRes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRes.setText("Resultado");

        lblIdade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnVoto)
                        .addGap(84, 84, 84)
                        .addComponent(lblIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(lblRes, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoto)
                    .addComponent(lblIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(lblRes, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotoActionPerformed
        // TODO add your handling code here:
        lblRes.setVisible(true);
        int a = Integer.parseInt(txtAno.getText());
        int idade = 2021 - a;
        lblIdade.setText(Integer.toString(idade));
  /*  if (idade<16)
     {
         lblRes.setText("N??o vota, menor....");
     }
     else
     {
         if ((idade>=16&&idade<18) || (idade>70))
         {
              lblRes.setText("Voto opcional,entre 16 e 18 e mais de 70");
         }
         else
         {
                 lblRes.setText("Obrigat??rio");
         }  
     }*/
  if (idade<16)
     {
         lblRes.setText("N??o vota, menor....");
     }
  else if ((idade>=16&&idade<18) || (idade>70))
         {
              lblRes.setText("Voto opcional,entre 16 e 18 e mais de 70");
         }
  else if (idade>=70)
         {
                 lblRes.setText("Obrigat??rio");
         }  
     
    }//GEN-LAST:event_btnVotoActionPerformed

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
            java.util.logging.Logger.getLogger(TelVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelVoto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblRes;
    private javax.swing.JTextField txtAno;
    // End of variables declaration//GEN-END:variables
}
