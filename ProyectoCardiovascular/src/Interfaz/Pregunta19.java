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
public class Pregunta19 extends javax.swing.JPanel {

    /**
     * Creates new form Pregunta19
     */
    public Pregunta19() {
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

        g1p19 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        p19rb1 = new javax.swing.JRadioButton();
        p19rb2 = new javax.swing.JRadioButton();
        p19rb3 = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(102, 0, 0));
        setPreferredSize(new java.awt.Dimension(630, 230));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("19. ¿Has sentido tensión muscular?");

        g1p19.add(p19rb1);
        p19rb1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        p19rb1.setForeground(new java.awt.Color(255, 255, 255));
        p19rb1.setText("Varias veces");
        p19rb1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p19rb1.setOpaque(false);
        p19rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p19rb1ActionPerformed(evt);
            }
        });

        g1p19.add(p19rb2);
        p19rb2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        p19rb2.setForeground(new java.awt.Color(255, 255, 255));
        p19rb2.setText("Alguna vez");
        p19rb2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p19rb2.setOpaque(false);

        g1p19.add(p19rb3);
        p19rb3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        p19rb3.setForeground(new java.awt.Color(255, 255, 255));
        p19rb3.setText("Una vez");
        p19rb3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p19rb3.setOpaque(false);

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
                            .addComponent(p19rb1)
                            .addComponent(p19rb2)
                            .addComponent(p19rb3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p19rb1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(p19rb2)
                .addGap(5, 5, 5)
                .addComponent(p19rb3)
                .addContainerGap(132, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p19rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p19rb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p19rb1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup g1p19;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JRadioButton p19rb1;
    public javax.swing.JRadioButton p19rb2;
    public javax.swing.JRadioButton p19rb3;
    // End of variables declaration//GEN-END:variables
}
