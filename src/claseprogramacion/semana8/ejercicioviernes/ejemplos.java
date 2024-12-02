package claseprogramacion.semana8.ejercicioviernes;

import javax.swing.JOptionPane;

public class ejemplos extends javax.swing.JFrame {

    
    public ejemplos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnejemplo1 = new javax.swing.JButton();
        btnejemplo2 = new javax.swing.JButton();
        textoejemplo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnejemplo1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnejemplo1.setText("Ejemplo 1");
        btnejemplo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnejemplo1ActionPerformed(evt);
            }
        });

        btnejemplo2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnejemplo2.setText("Ejemplo 2");
        btnejemplo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnejemplo2ActionPerformed(evt);
            }
        });

        textoejemplo2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoejemplo2.setText("Aqui va lo que escriban de ejemplo 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnejemplo1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnejemplo2)
                        .addGap(18, 18, 18)
                        .addComponent(textoejemplo2)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnejemplo1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnejemplo2)
                    .addComponent(textoejemplo2))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnejemplo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnejemplo1ActionPerformed
        JOptionPane.showMessageDialog(this, "Clase Programacion 1", "Bienvenidos", JOptionPane.OK_CANCEL_OPTION);
    }//GEN-LAST:event_btnejemplo1ActionPerformed

    private void btnejemplo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnejemplo2ActionPerformed
        String cadena;
        cadena = JOptionPane.showInputDialog(this, "Ingrese su nombre", "Cadena", JOptionPane.OK_OPTION);
        
        if(cadena == null)
            return;
        if(cadena.trim().length()==0)
            return;
        textoejemplo2.setText(cadena);
    }//GEN-LAST:event_btnejemplo2ActionPerformed

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
            java.util.logging.Logger.getLogger(ejemplos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejemplos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejemplos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejemplos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejemplos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnejemplo1;
    private javax.swing.JButton btnejemplo2;
    private javax.swing.JLabel textoejemplo2;
    // End of variables declaration//GEN-END:variables
}
