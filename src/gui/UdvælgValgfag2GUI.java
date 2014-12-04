/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Ahmed
 */
public class UdvælgValgfag2GUI extends javax.swing.JFrame {

    /**
     * Creates new form UdvælgValgfag2GUI
     */
    
    ArrayList<String> valgfag;
    DefaultListModel model1;
    DefaultListModel model2;
    DefaultListModel model3;

    public UdvælgValgfag2GUI() {
        initComponents();
        valgfag = new ArrayList();

        valgfag.add("C#");
        valgfag.add("Android");
        valgfag.add("Python");
        valgfag.add("Dansk");

        model1 = new DefaultListModel();
        model2 = new DefaultListModel();
        model3 = new DefaultListModel();
        jListValgteValgfag.setModel(model1);
        jListPuljeA.setModel(model2);
        jListPuljeB.setModel(model3);

        for (String fag : valgfag) {
            model1.addElement(fag);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListValgteValgfag = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListPuljeA = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListPuljeB = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonTilAPulje = new javax.swing.JButton();
        jButtonTilPuljeB = new javax.swing.JButton();
        jButtonATilB = new javax.swing.JButton();
        jButtonBTilA = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaTilfredshed = new javax.swing.JTextArea();
        jButtonBeregn = new javax.swing.JButton();
        jButtonBackTilValgfag = new javax.swing.JButton();
        jButtonGem = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListValgteValgfag.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListValgteValgfag);

        jLabel1.setText("Valgte valgfag");

        jListPuljeA.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListPuljeA);

        jListPuljeB.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListPuljeB);

        jLabel2.setText("Pulje A");

        jLabel3.setText("Pulje B");

        jButtonTilAPulje.setText(">> Pulje A");
        jButtonTilAPulje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTilAPuljeActionPerformed(evt);
            }
        });

        jButtonTilPuljeB.setText(">> Pulje B");
        jButtonTilPuljeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTilPuljeBActionPerformed(evt);
            }
        });

        jButtonATilB.setText(">");
        jButtonATilB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonATilBActionPerformed(evt);
            }
        });

        jButtonBTilA.setText("<");
        jButtonBTilA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBTilAActionPerformed(evt);
            }
        });

        jTextAreaTilfredshed.setColumns(20);
        jTextAreaTilfredshed.setRows(5);
        jScrollPane4.setViewportView(jTextAreaTilfredshed);

        jButtonBeregn.setText("Beregn Utilfredshed");

        jButtonBackTilValgfag.setText("<<");
        jButtonBackTilValgfag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackTilValgfagActionPerformed(evt);
            }
        });

        jButtonGem.setText("Gem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonGem)
                    .addComponent(jButtonBeregn)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonTilAPulje)
                            .addComponent(jButtonTilPuljeB))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(163, 163, 163))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonBTilA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonATilB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jButtonBackTilValgfag))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jButtonATilB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBTilA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBackTilValgfag))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButtonTilAPulje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTilPuljeB))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addComponent(jButtonBeregn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonGem)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTilAPuljeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTilAPuljeActionPerformed
        Object valgteFag = jListValgteValgfag.getSelectedValue();
        boolean fundet = model1.removeElement(valgteFag);
        if (fundet) {
            model2.addElement(valgteFag);
        }
    }//GEN-LAST:event_jButtonTilAPuljeActionPerformed

    private void jButtonTilPuljeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTilPuljeBActionPerformed
        Object valgteFag = jListValgteValgfag.getSelectedValue();
        boolean fundet = model1.removeElement(valgteFag);
        if (fundet) {
            model3.addElement(valgteFag);
        }
    }//GEN-LAST:event_jButtonTilPuljeBActionPerformed

    private void jButtonATilBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonATilBActionPerformed
        Object valgteFag = jListPuljeA.getSelectedValue();
        boolean fundet = model2.removeElement(valgteFag);
        if (fundet) {
            model3.addElement(valgteFag);
        }
    }//GEN-LAST:event_jButtonATilBActionPerformed

    private void jButtonBTilAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBTilAActionPerformed
        Object valgteFag = jListPuljeB.getSelectedValue();
        boolean fundet = model3.removeElement(valgteFag);
        if (fundet) {
            model2.addElement(valgteFag);
        }
    }//GEN-LAST:event_jButtonBTilAActionPerformed

    private void jButtonBackTilValgfagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackTilValgfagActionPerformed
        Object valgteFagIB = jListPuljeB.getSelectedValue();
        boolean fundetIB = model3.removeElement(valgteFagIB);
        Object valgteFagIA = jListPuljeA.getSelectedValue();
        boolean fundetIA = model2.removeElement(valgteFagIA);
        
        if (fundetIB) {
            model1.addElement(valgteFagIB);
        }
        else if(fundetIA){
            model1.addElement(valgteFagIA);
        }
    }//GEN-LAST:event_jButtonBackTilValgfagActionPerformed

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
            java.util.logging.Logger.getLogger(UdvælgValgfag2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UdvælgValgfag2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UdvælgValgfag2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UdvælgValgfag2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UdvælgValgfag2GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonATilB;
    private javax.swing.JButton jButtonBTilA;
    private javax.swing.JButton jButtonBackTilValgfag;
    private javax.swing.JButton jButtonBeregn;
    private javax.swing.JButton jButtonGem;
    private javax.swing.JButton jButtonTilAPulje;
    private javax.swing.JButton jButtonTilPuljeB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jListPuljeA;
    private javax.swing.JList jListPuljeB;
    private javax.swing.JList jListValgteValgfag;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextAreaTilfredshed;
    // End of variables declaration//GEN-END:variables
}
