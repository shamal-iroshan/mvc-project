/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.moderntech.views;

import java.awt.Color;

/**
 *
 * @author Shamal
 */
public class StockMain extends javax.swing.JInternalFrame {

    Main main;
    boolean state;

    /**
     * Creates new form StockMain
     */
    public StockMain(Main main, boolean state) {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.main = main;
        setTheme(state);
        this.state = state;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLeft = new javax.swing.JPanel();
        btnBack = new keeptoo.KButton();
        btnAdd = new keeptoo.KButton();
        btnUpdate = new keeptoo.KButton();
        btnDelete = new keeptoo.KButton();
        pnlCenter = new javax.swing.JPanel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1600, 820));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLeft.setBackground(new java.awt.Color(230, 230, 230));
        pnlLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBorder(null);
        btnBack.setForeground(new java.awt.Color(51, 51, 51));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/moderntech/img/icons8_left_arrow_30px.png"))); // NOI18N
        btnBack.setAlignmentY(0.0F);
        btnBack.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnBack.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBack.setIconTextGap(30);
        btnBack.setkAllowGradient(false);
        btnBack.setkAllowTab(true);
        btnBack.setkBackGroundColor(new java.awt.Color(230, 230, 230));
        btnBack.setkBorderRadius(0);
        btnBack.setkForeGround(new java.awt.Color(51, 51, 51));
        btnBack.setkHoverColor(new java.awt.Color(212, 212, 212));
        btnBack.setkSelectedColor(new java.awt.Color(102, 102, 102));
        btnBack.setkStartColor(new java.awt.Color(255, 102, 102));
        btnBack.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        pnlLeft.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 60));

        btnAdd.setBorder(null);
        btnAdd.setForeground(new java.awt.Color(0, 0, 0));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/moderntech/img/icons8_add_30px.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAdd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnAdd.setIconTextGap(20);
        btnAdd.setkAllowGradient(false);
        btnAdd.setkAllowTab(true);
        btnAdd.setkBackGroundColor(new java.awt.Color(230, 230, 230));
        btnAdd.setkBorderRadius(0);
        btnAdd.setkForeGround(new java.awt.Color(0, 0, 0));
        btnAdd.setkHoverColor(new java.awt.Color(212, 212, 212));
        btnAdd.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnAdd.setkIndicatorColor(new java.awt.Color(0, 120, 215));
        btnAdd.setkIndicatorThickness(5);
        btnAdd.setkSelectedColor(new java.awt.Color(200, 200, 200));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        pnlLeft.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 290, 70));

        btnUpdate.setBorder(null);
        btnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/moderntech/img/icons8_Update_Left_Rotation_30px.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdate.setIconTextGap(20);
        btnUpdate.setkAllowGradient(false);
        btnUpdate.setkAllowTab(true);
        btnUpdate.setkBackGroundColor(new java.awt.Color(230, 230, 230));
        btnUpdate.setkBorderRadius(0);
        btnUpdate.setkForeGround(new java.awt.Color(0, 0, 0));
        btnUpdate.setkHoverColor(new java.awt.Color(212, 212, 212));
        btnUpdate.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnUpdate.setkIndicatorColor(new java.awt.Color(0, 120, 215));
        btnUpdate.setkIndicatorThickness(5);
        btnUpdate.setkSelectedColor(new java.awt.Color(200, 200, 200));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        pnlLeft.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 290, 70));

        btnDelete.setBorder(null);
        btnDelete.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/moderntech/img/icons8_delete_sign_30px.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDelete.setIconTextGap(20);
        btnDelete.setkAllowGradient(false);
        btnDelete.setkAllowTab(true);
        btnDelete.setkBackGroundColor(new java.awt.Color(230, 230, 230));
        btnDelete.setkBorderRadius(0);
        btnDelete.setkForeGround(new java.awt.Color(0, 0, 0));
        btnDelete.setkHoverColor(new java.awt.Color(212, 212, 212));
        btnDelete.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnDelete.setkIndicatorColor(new java.awt.Color(0, 120, 215));
        btnDelete.setkIndicatorThickness(5);
        btnDelete.setkSelectedColor(new java.awt.Color(200, 200, 200));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnlLeft.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 290, 70));

        getContentPane().add(pnlLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 820));

        pnlCenter.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1310, Short.MAX_VALUE)
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );

        getContentPane().add(pnlCenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1310, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        main.pnlMain.removeAll();
        main.pnlMain.repaint();
        main.pnlMain.add(new MainIcons(main, state)).setVisible(true);
        main.lblTitle.setText("Main");
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        pnlCenter.removeAll();
        pnlCenter.repaint();
        pnlCenter.add(new AddStock(state)).setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        pnlCenter.removeAll();
        pnlCenter.repaint();
        pnlCenter.add(new UpdateStock(state)).setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        pnlCenter.removeAll();
        pnlCenter.repaint();
        pnlCenter.add(new DeleteStock(state)).setVisible(true);
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnAdd;
    private keeptoo.KButton btnBack;
    private keeptoo.KButton btnDelete;
    private keeptoo.KButton btnUpdate;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlLeft;
    // End of variables declaration//GEN-END:variables

    private void setTheme(boolean state) {
        if (state) {
            pnlLeft.setBackground(new Color(99, 100, 100));
            pnlCenter.setBackground(Color.BLACK);

            btnBack.setkBackGroundColor(new Color(99, 100, 100));
            btnBack.setkForeGround(Color.WHITE);
            btnAdd.setkBackGroundColor(new Color(99, 100, 100));
            btnAdd.setForeground(Color.WHITE);
            btnAdd.setkForeGround(Color.WHITE);
            btnUpdate.setkBackGroundColor(new Color(99, 100, 100));
            btnUpdate.setForeground(Color.WHITE);
            btnUpdate.setkForeGround(Color.WHITE);
            btnDelete.setkBackGroundColor(new Color(99, 100, 100));
            btnDelete.setForeground(Color.WHITE);
            btnDelete.setkForeGround(Color.WHITE);
        } else {
            pnlLeft.setBackground(new Color(230, 230, 230));
            pnlCenter.setBackground(Color.WHITE);

            btnBack.setkBackGroundColor(new Color(230, 230, 230));
            btnBack.setkForeGround(Color.BLACK);
            btnAdd.setkBackGroundColor(new Color(230, 230, 230));
            btnAdd.setkForeGround(Color.BLACK);
            btnUpdate.setkBackGroundColor(new Color(230, 230, 230));
            btnUpdate.setkForeGround(Color.BLACK);
            btnDelete.setkBackGroundColor(new Color(230, 230, 230));
            btnDelete.setkForeGround(Color.BLACK);            
        }
    }
}
