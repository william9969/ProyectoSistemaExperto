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
public class Pregunta11 extends javax.swing.JPanel {

    /**
     * Creates new form Pregunta1
     */
    public Pregunta11() {
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

        g1p11 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        p11rb1 = new javax.swing.JRadioButton();
        p11rb4 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 0, 0));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("11.¿Te has sometido alguna vez a un examen médico");

        g1p11.add(p11rb1);
        p11rb1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        p11rb1.setForeground(new java.awt.Color(255, 255, 255));
        p11rb1.setText("No");
        p11rb1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p11rb1.setOpaque(false);
        p11rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p11rb1ActionPerformed(evt);
            }
        });

        g1p11.add(p11rb4);
        p11rb4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        p11rb4.setForeground(new java.awt.Color(255, 255, 255));
        p11rb4.setText("Si");
        p11rb4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p11rb4.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("por un infarto de corazón o sospecha?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p11rb1)
                    .addComponent(p11rb4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(35, 35, 35)
                .addComponent(p11rb1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(p11rb4)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p11rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p11rb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p11rb1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup g1p11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JRadioButton p11rb1;
    public javax.swing.JRadioButton p11rb4;
    // End of variables declaration//GEN-END:variables
}
