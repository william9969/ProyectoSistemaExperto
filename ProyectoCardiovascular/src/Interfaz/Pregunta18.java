/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author Jessica
 */
public class Pregunta18 extends javax.swing.JPanel {

    /**
     * Creates new form Pregunta18
     */
    public Pregunta18() {
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

        g1p18 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        p18rb1 = new javax.swing.JRadioButton();
        p18rb2 = new javax.swing.JRadioButton();
        p18rb3 = new javax.swing.JRadioButton();
        p18rb4 = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(102, 0, 0));
        setPreferredSize(new java.awt.Dimension(630, 230));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("18. ¿Qué tan a menudo haces ejercicio?");

        g1p18.add(p18rb1);
        p18rb1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        p18rb1.setForeground(new java.awt.Color(255, 255, 255));
        p18rb1.setText("Dos o tres veces a la semana");
        p18rb1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p18rb1.setOpaque(false);
        p18rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p18rb1ActionPerformed(evt);
            }
        });

        g1p18.add(p18rb2);
        p18rb2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        p18rb2.setForeground(new java.awt.Color(255, 255, 255));
        p18rb2.setText("Una vez a la semana");
        p18rb2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p18rb2.setOpaque(false);

        g1p18.add(p18rb3);
        p18rb3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        p18rb3.setForeground(new java.awt.Color(255, 255, 255));
        p18rb3.setText("Una vez al mes");
        p18rb3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p18rb3.setOpaque(false);

        g1p18.add(p18rb4);
        p18rb4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        p18rb4.setForeground(new java.awt.Color(255, 255, 255));
        p18rb4.setText("No hago ejercicio");
        p18rb4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p18rb4.setOpaque(false);
        p18rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p18rb4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p18rb1)
                            .addComponent(p18rb2)
                            .addComponent(p18rb3)
                            .addComponent(p18rb4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p18rb1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(p18rb2)
                .addGap(5, 5, 5)
                .addComponent(p18rb3)
                .addGap(5, 5, 5)
                .addComponent(p18rb4)
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p18rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p18rb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p18rb1ActionPerformed

    private void p18rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p18rb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p18rb4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup g1p18;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JRadioButton p18rb1;
    public javax.swing.JRadioButton p18rb2;
    public javax.swing.JRadioButton p18rb3;
    public javax.swing.JRadioButton p18rb4;
    // End of variables declaration//GEN-END:variables
}
