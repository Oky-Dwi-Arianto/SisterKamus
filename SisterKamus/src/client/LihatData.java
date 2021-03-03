/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import translate.CRUDInterface;
import translate.DB_kamus;
import translate.Kamus;
import translate.TB_kamus;
import translate.TranslateInterface;

/**
 *
 * @author okyda
 */
public class LihatData extends javax.swing.JFrame {

    DefaultTableModel model;
    Connection con = new DB_kamus().getConnection();
    public LihatData() throws NotBoundException, MalformedURLException, RemoteException{
        initComponents();
        
        String[] kolom = {"Indonesia", "Inggris", "Jawa"};
        model = new DefaultTableModel(kolom, 0);
        tabelKamus.setModel(model);
        printTabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKamus = new javax.swing.JTable();
        buttonTambah = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textFieldCari = new javax.swing.JTextField();
        textFieldIndonesia = new javax.swing.JTextField();
        textFieldInggris = new javax.swing.JTextField();
        textFieldJawa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelKamus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelKamus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKamusMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelKamus);

        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonUpdate.setText("Update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonKeluar.setText("Keluar");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });

        jLabel1.setText("Lhat Data Kamus");

        textFieldCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCariActionPerformed(evt);
            }
        });
        textFieldCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldCariKeyPressed(evt);
            }
        });

        jLabel2.setText("Indonesia");

        jLabel3.setText("Inggris");

        jLabel4.setText("Jawa");

        jLabel5.setText("Cari");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(260, 260, 260))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textFieldIndonesia)
                                        .addComponent(textFieldJawa, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                                        .addComponent(textFieldInggris)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonTambah)
                        .addGap(15, 15, 15)
                        .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldIndonesia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldInggris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(textFieldJawa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonHapus)
                    .addComponent(buttonUpdate)
                    .addComponent(buttonTambah)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonKeluar)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        Kamus kamus = new Kamus();
        kamus.setIndonesia(textFieldIndonesia.getText());
        kamus.setInggris(textFieldInggris.getText());
        kamus.setJawa(textFieldJawa.getText());
        try{
            insertData(kamus);
            printTabel();
            reset();
        }catch(Exception e){
            System.out.println(e);
        }
   
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
    Kamus kamus = new Kamus();
        kamus.setIndonesia(textFieldIndonesia.getText());
        kamus.setInggris(textFieldInggris.getText());
        kamus.setJawa(textFieldJawa.getText());
        try{
            updateData(kamus, textFieldIndonesia.getText());
            printTabel();
            reset();
        }catch(Exception e){
            System.out.println("gagal tambah data");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        try{
            hapusData(textFieldIndonesia.getText());
            printTabel();
            reset();
        }catch(Exception e){
            System.out.println(e);
        }    
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void tabelKamusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKamusMouseClicked
        int n = tabelKamus.getSelectedRow();
        
        if(n>-1){
            textFieldIndonesia.setText(model.getValueAt(n, 0).toString());
            textFieldInggris.setText(model.getValueAt(n, 1).toString());
            textFieldJawa.setText(model.getValueAt(n, 2).toString());
        }
    }//GEN-LAST:event_tabelKamusMouseClicked

    private void textFieldCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCariActionPerformed

    private void textFieldCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldCariKeyPressed
        DefaultTableModel model = (DefaultTableModel)tabelKamus.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tabelKamus.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(textFieldCari.getText().trim()));
    }//GEN-LAST:event_textFieldCariKeyPressed

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
            java.util.logging.Logger.getLogger(LihatData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LihatData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LihatData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LihatData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LihatData().setVisible(true);
                } catch (NotBoundException ex) {
                    Logger.getLogger(LihatData.class.getName()).log(Level.SEVERE, null, ex);
                } catch (MalformedURLException ex) {
                    Logger.getLogger(LihatData.class.getName()).log(Level.SEVERE, null, ex);
                } catch (RemoteException ex) {
                    Logger.getLogger(LihatData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelKamus;
    private javax.swing.JTextField textFieldCari;
    private javax.swing.JTextField textFieldIndonesia;
    private javax.swing.JTextField textFieldInggris;
    private javax.swing.JTextField textFieldJawa;
    // End of variables declaration//GEN-END:variables

    private void printTabel() throws NotBoundException, MalformedURLException, RemoteException, RemoteException{
        int baris = tabelKamus.getRowCount();
        CRUDInterface admin = (CRUDInterface) Naming.lookup("rmi://127.0.0.1:190/Admin");
        List<Kamus> listKata = admin.getAllKata();
        for(int i=0;i<baris;i++){
            model.removeRow(0);
        }        
       
        for(int j=0;j<listKata.size();j++){
            String kata[] = {listKata.get(j).getIndonesia(),listKata.get(j).getInggris(),listKata.get(j).getJawa()};
            model.addRow(kata);
        }
        
    }
    
    private void hapusData(String kata) throws NotBoundException, MalformedURLException, RemoteException{
        CRUDInterface admin = (CRUDInterface) Naming.lookup("rmi://127.0.0.1:190/Admin");
        System.out.println("tersambung");
        admin.deleteKata(kata);
    }
    
    private void insertData(Kamus kamus) throws NotBoundException, MalformedURLException, RemoteException{
        CRUDInterface admin = (CRUDInterface) Naming.lookup("rmi://127.0.0.1:190/Admin");
        System.out.println("tersambung");
        admin.insertKata(kamus);
    }
    
    private void updateData(Kamus kamus, String kata) throws NotBoundException, MalformedURLException, RemoteException{
        CRUDInterface admin = (CRUDInterface) Naming.lookup("rmi://127.0.0.1:190/Admin");
        System.out.println("tersambung");
        admin.updateKata(kamus, kata);
    }

    private void reset(){
        textFieldIndonesia.setText("");
        textFieldInggris.setText("");
        textFieldJawa.setText("");
    }
}
