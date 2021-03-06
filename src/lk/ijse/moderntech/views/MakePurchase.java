/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.moderntech.views;

import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.moderntech.controler.MakePurchaseController;
import lk.ijse.moderntech.model.PurchaseModel;

/**
 *
 * @author Shamal
 */
public class MakePurchase extends javax.swing.JInternalFrame {

    boolean state;
    Main main;

    /**
     * Creates new form MakePrchase
     */
    public MakePurchase(boolean state, Main main) {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.state = state;
        setTheam();
        loadPurchaseID();
        this.main = main;
        txtEmployeeid.setText(main.empID);
        loadSupplierID();
        loadDate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBack = new javax.swing.JPanel();
        lblSupplierid = new javax.swing.JLabel();
        txtEmployeeid = new javax.swing.JTextField();
        lblPurchaseid = new javax.swing.JLabel();
        txtPurchaseid = new javax.swing.JTextField();
        lblEmployeeid = new javax.swing.JLabel();
        cmbSupplierid = new javax.swing.JComboBox<>();
        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblAmount = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        btnClear = new keeptoo.KButton();
        btnSave = new keeptoo.KButton();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1310, 820));

        pnlBack.setBackground(new java.awt.Color(255, 255, 255));
        pnlBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSupplierid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblSupplierid.setText("Supplier ID :");
        pnlBack.add(lblSupplierid, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, -1, -1));

        txtEmployeeid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtEmployeeid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        txtEmployeeid.setEnabled(false);
        pnlBack.add(txtEmployeeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 320, -1));

        lblPurchaseid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblPurchaseid.setText("Purchase ID :");
        pnlBack.add(lblPurchaseid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 120, -1));

        txtPurchaseid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtPurchaseid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        txtPurchaseid.setEnabled(false);
        pnlBack.add(txtPurchaseid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 320, -1));

        lblEmployeeid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblEmployeeid.setText("Employee ID :");
        pnlBack.add(lblEmployeeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        cmbSupplierid.setEditable(true);
        cmbSupplierid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        pnlBack.add(cmbSupplierid, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 310, 40));

        lblDate.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblDate.setText("Date :");
        pnlBack.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, -1, -1));

        txtDate.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        txtDate.setEnabled(false);
        pnlBack.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 320, -1));

        lblAmount.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblAmount.setText("Amount :");
        pnlBack.add(lblAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        txtamount.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtamount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        pnlBack.add(txtamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 320, -1));

        btnClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 46, 50)));
        btnClear.setForeground(new java.awt.Color(255, 46, 50));
        btnClear.setText("Clear");
        btnClear.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnClear.setkAllowGradient(false);
        btnClear.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btnClear.setkBorderRadius(0);
        btnClear.setkForeGround(new java.awt.Color(255, 46, 50));
        btnClear.setkHoverColor(new java.awt.Color(255, 46, 50));
        btnClear.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        pnlBack.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 330, -1, -1));

        btnSave.setBorder(null);
        btnSave.setText("Save");
        btnSave.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnSave.setkAllowGradient(false);
        btnSave.setkBackGroundColor(new java.awt.Color(0, 120, 215));
        btnSave.setkBorderRadius(0);
        btnSave.setkHoverColor(new java.awt.Color(0, 80, 143));
        btnSave.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        pnlBack.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearAll();
        loadSupplierID();
        loadDate();
        loadPurchaseID();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        PurchaseModel purchase = new PurchaseModel(
                txtPurchaseid.getText(),
                txtEmployeeid.getText(),
                cmbSupplierid.getSelectedItem().toString(),
                txtamount.getText(),
                txtDate.getText()
        );
        try {
            boolean saved = new MakePurchaseController().savePurchase(purchase);
            if(saved){
                clearAll();
                new InformationBox(new javax.swing.JFrame(), true, "Saved successfully").setVisible(true);
            }else{
                new InformationBox(new javax.swing.JFrame(), true, "Something went wrong. Try again.").setVisible(true);
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnClear;
    private keeptoo.KButton btnSave;
    private javax.swing.JComboBox<String> cmbSupplierid;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEmployeeid;
    private javax.swing.JLabel lblPurchaseid;
    private javax.swing.JLabel lblSupplierid;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmployeeid;
    private javax.swing.JTextField txtPurchaseid;
    private javax.swing.JTextField txtamount;
    // End of variables declaration//GEN-END:variables

    private void setTheam() {
        if (state) {
            pnlBack.setBackground(Color.BLACK);
            lblAmount.setForeground(Color.WHITE);
            lblDate.setForeground(Color.WHITE);
            lblEmployeeid.setForeground(Color.WHITE);
            lblPurchaseid.setForeground(Color.WHITE);
            lblSupplierid.setForeground(Color.WHITE);
            cmbSupplierid.setForeground(Color.WHITE);
            txtDate.setForeground(Color.WHITE);
            txtEmployeeid.setForeground(Color.WHITE);
            txtPurchaseid.setForeground(Color.WHITE);
            txtamount.setForeground(Color.WHITE);
            txtDate.setBackground(Color.BLACK);
            txtEmployeeid.setBackground(Color.BLACK);
            txtPurchaseid.setBackground(Color.BLACK);
            txtamount.setBackground(Color.BLACK);
        } else {
        }
    }

    private void loadPurchaseID() {
        try {
            String id = new MakePurchaseController().getPurchaseID();
            txtPurchaseid.setText(id);
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }

    private void loadSupplierID() {
        try {
            List<String> list = new MakePurchaseController().getSupplierID();
            for (String string : list) {
                cmbSupplierid.addItem(string);
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }

    private void loadDate() {
        try {
            String date = new MakePurchaseController().getDate();
            txtDate.setText(date);
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }

    private void clearAll() {
        txtPurchaseid.setText("");
        txtEmployeeid.setText("");
        txtDate.setText("");
        txtamount.setText("");
        cmbSupplierid.setSelectedIndex(0);
    }
}
