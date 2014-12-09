/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.Controller;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Ahmed
 */
public class UdvælgValgfag2GUI extends javax.swing.JFrame {

    /**
     * Creates new form UdvælgValgfag2GUI
     */
    Controller controller;
    DefaultListModel modelValgFag;
    DefaultListModel modelPuljeA;
    DefaultListModel modelPuljeB;
    
    public UdvælgValgfag2GUI()
    {
        initComponents();
        controller = new Controller();
        jLabelOutputTitles.setText("Student id"+"\t Valg 1a"+"\t Valg 1b"+"\t Valg 2a"+"\t Valg 2b"+ "\t utilfredshed\n" );
        forberedLister();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabelBesked = new javax.swing.JLabel();
        jLabelOutputTitles = new javax.swing.JLabel();

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
        jButtonBeregn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBeregnActionPerformed(evt);
            }
        });

        jButtonBackTilValgfag.setText("<<");
        jButtonBackTilValgfag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackTilValgfagActionPerformed(evt);
            }
        });

        jButtonGem.setText("Gem");
        jButtonGem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGemActionPerformed(evt);
            }
        });

        jLabelBesked.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelBesked.setForeground(new java.awt.Color(102, 102, 102));

        jLabelOutputTitles.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelOutputTitles.setText("j");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonGem)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonBeregn)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(163, 163, 163))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButtonBTilA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonATilB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jButtonBackTilValgfag))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(16, 16, 16))
                    .addComponent(jLabelBesked, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOutputTitles, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonBeregn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelBesked, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelOutputTitles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonGem)
                .addGap(31, 31, 31))
        );

        jLabelBesked.getAccessibleContext().setAccessibleName("jLabelBesked");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTilAPuljeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTilAPuljeActionPerformed
        controller.flytFag(jListValgteValgfag.getSelectedValue(), modelValgFag, modelPuljeA);
    }//GEN-LAST:event_jButtonTilAPuljeActionPerformed

    private void jButtonTilPuljeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTilPuljeBActionPerformed
        controller.flytFag(jListValgteValgfag.getSelectedValue(), modelValgFag, modelPuljeB);
    }//GEN-LAST:event_jButtonTilPuljeBActionPerformed

    private void jButtonATilBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonATilBActionPerformed
        controller.flytFag(jListPuljeA.getSelectedValue(), modelPuljeA, modelPuljeB);
    }//GEN-LAST:event_jButtonATilBActionPerformed

    private void jButtonBTilAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBTilAActionPerformed
        controller.flytFag(jListPuljeB.getSelectedValue(), modelPuljeB, modelPuljeA);
    }//GEN-LAST:event_jButtonBTilAActionPerformed

    private void jButtonBackTilValgfagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackTilValgfagActionPerformed
        if (jListPuljeB.getSelectedValue() != null)
        {
            controller.flytFag(jListPuljeB.getSelectedValue(), modelPuljeB, modelValgFag);
        } else if (jListPuljeA.getSelectedValue() != null)
        {
            controller.flytFag(jListPuljeA.getSelectedValue(), modelPuljeA, modelValgFag);
        }
    }//GEN-LAST:event_jButtonBackTilValgfagActionPerformed

    private void jButtonGemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonGemActionPerformed
    {//GEN-HEADEREND:event_jButtonGemActionPerformed
        controller.gemPuljerIdb(modelPuljeA, modelPuljeB);
    }//GEN-LAST:event_jButtonGemActionPerformed

    private void jButtonBeregnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBeregnActionPerformed
      jTextAreaTilfredshed.setText("");
        
       List utilfredseStudenter = new ArrayList();
       utilfredseStudenter = controller.beregnTilfredshed(modelPuljeA, modelPuljeB);
       Collections.sort(utilfredseStudenter);
       Collections.reverse(utilfredseStudenter);
       String newString = "";
       
        for (int i = 0; i < utilfredseStudenter.size(); i++) {
            String[] result = ((String)utilfredseStudenter.get(i)).split(" ");
            if(Integer.parseInt(result[0]) == 4){
            jTextAreaTilfredshed.setForeground(Color.red);
            newString =  result[1]+"\t"+  result[2]+"\t"+ result[3]+"\t"+
                                result[4]+"\t"+  result[5]+"\t"+ result[0];
            }
            if(Integer.parseInt(result[0]) == 2 || 
               Integer.parseInt(result[0]) == 3){
                jTextAreaTilfredshed.setForeground(Color.orange);
                newString =  result[1]+"\t"+  result[2]+"\t"+ result[3]+"\t"+
                             result[4]+"\t"+  result[5]+"\t"+ result[0];
            }
            
            
                
            jTextAreaTilfredshed.append(newString + "\n");
            
        }
       jLabelBesked.setText("Der er "+ utilfredseStudenter.size() + " ud af "+ controller.getTotalAntalStudenter()+ " studenter som er utilfredse");
       
       
    }//GEN-LAST:event_jButtonBeregnActionPerformed

    private void forberedLister(){          
        modelValgFag = new DefaultListModel();
        modelPuljeA = new DefaultListModel();
        modelPuljeB = new DefaultListModel();
        jListValgteValgfag.setModel(modelValgFag);
        jListPuljeA.setModel(modelPuljeA);
        jListPuljeB.setModel(modelPuljeB);
        
        
        ArrayList valgfag = controller.visResultat();
        //ArrayList valgfag = controller.hentValgfagFraDB();
        if(valgfag == null)
        {
            System.out.println("Hej");
        }
        for (Object fag : valgfag)
        {
            modelValgFag.addElement(fag);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(UdvælgValgfag2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(UdvælgValgfag2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(UdvælgValgfag2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(UdvælgValgfag2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new UdvælgValgfag2GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabelBesked;
    private javax.swing.JLabel jLabelOutputTitles;
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
