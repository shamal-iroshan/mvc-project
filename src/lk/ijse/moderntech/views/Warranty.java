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
import javax.swing.table.DefaultTableModel;
import lk.ijse.moderntech.controler.WarrantyController;
import lk.ijse.moderntech.model.WarrantyModel;

/**
 *
 * @author Shamal
 */
public class Warranty extends javax.swing.JInternalFrame {

    boolean state;

    public Warranty(boolean state) {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.state = state;
        setTheam();
        loadTable();
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
        lblWarranty = new javax.swing.JLabel();
        txtWarratyid = new javax.swing.JTextField();
        lblDuration = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        btnClear = new keeptoo.KButton();
        btnSave = new keeptoo.KButton();
        btnDelete = new keeptoo.KButton();
        btnUpdate = new keeptoo.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWarranty = new javax.swing.JTable();
        btnUpdate1 = new keeptoo.KButton();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1310, 820));

        pnlBack.setBackground(new java.awt.Color(255, 255, 255));
        pnlBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWarranty.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblWarranty.setText("Warranty ID :");
        pnlBack.add(lblWarranty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        txtWarratyid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtWarratyid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        txtWarratyid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWarratyidActionPerformed(evt);
            }
        });
        pnlBack.add(txtWarratyid, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 320, -1));

        lblDuration.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblDuration.setText("Duration :");
        pnlBack.add(lblDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, -1, -1));

        txtDuration.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtDuration.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        pnlBack.add(txtDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 320, -1));

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
        pnlBack.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

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
        pnlBack.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 150, -1, -1));

        btnDelete.setBorder(null);
        btnDelete.setText("Delete");
        btnDelete.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnDelete.setkAllowGradient(false);
        btnDelete.setkBackGroundColor(new java.awt.Color(231, 84, 78));
        btnDelete.setkBorderRadius(0);
        btnDelete.setkHoverColor(new java.awt.Color(232, 95, 95));
        btnDelete.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnlBack.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        btnUpdate.setBorder(null);
        btnUpdate.setText("Update");
        btnUpdate.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnUpdate.setkAllowGradient(false);
        btnUpdate.setkBackGroundColor(new java.awt.Color(226, 141, 13));
        btnUpdate.setkBorderRadius(0);
        btnUpdate.setkHoverColor(new java.awt.Color(217, 90, 32));
        btnUpdate.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        pnlBack.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, -1, -1));

        tblWarranty.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        tblWarranty.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Warranty ID ", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblWarranty.setRowHeight(20);
        tblWarranty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblWarrantyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblWarranty);

        pnlBack.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 1210, 540));

        btnUpdate1.setBorder(null);
        btnUpdate1.setText("Update");
        btnUpdate1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnUpdate1.setkAllowGradient(false);
        btnUpdate1.setkBackGroundColor(new java.awt.Color(226, 141, 13));
        btnUpdate1.setkBorderRadius(0);
        btnUpdate1.setkHoverColor(new java.awt.Color(217, 90, 32));
        btnUpdate1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        pnlBack.add(btnUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, 1310, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearAll();
        loadTable();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblWarrantyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWarrantyMouseClicked
        int row = tblWarranty.getSelectedRow();
        txtWarratyid.setText(tblWarranty.getValueAt(row, 0).toString());
        txtDuration.setText(tblWarranty.getValueAt(row, 1).toString());
    }//GEN-LAST:event_tblWarrantyMouseClicked

    private void txtWarratyidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWarratyidActionPerformed
        if (txtWarratyid.getText().trim().length() > 0) {
            try {
                WarrantyModel warranty = new WarrantyController().getWarranty(txtWarratyid.getText());
                if (warranty != null) {
                    txtDuration.setText(warranty.getDuration());
                    DefaultTableModel model = (DefaultTableModel) tblWarranty.getModel();
                    model.setRowCount(0);
                    model.addRow(new Object[]{
                        warranty.getWarrantyID(),
                        warranty.getDuration()
                    });
                } else {
                    new InformationBox(new javax.swing.JFrame(), true, "Enter correct Warranty ID.").setVisible(true);
                }
            } catch (ClassNotFoundException ex) {
                new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
            } catch (SQLException ex) {
                new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
            }
        }
    }//GEN-LAST:event_txtWarratyidActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            boolean saved = new WarrantyController().saveWarranty(txtDuration.getText());
            if (saved) {
                new InformationBox(new javax.swing.JFrame(), true, "Saved successfully.").setVisible(true);
            } else {
                new InformationBox(new javax.swing.JFrame(), true, "Something went wrong, Try again.").setVisible(true);
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
        loadTable();
        clearAll();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            WarrantyModel warranty = new WarrantyModel(
                    txtWarratyid.getText(),
                    txtDuration.getText()
            );
            boolean updated = new WarrantyController().updateWarranty(warranty);
            if (updated) {
                new InformationBox(new javax.swing.JFrame(), true, "Updated successfully.").setVisible(true);
            } else {
                new InformationBox(new javax.swing.JFrame(), true, "Something went wrong, Try again.").setVisible(true);
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
        loadTable();
        clearAll();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtWarratyid.getText().trim().length() > 0) {
            try {
                boolean deletd = new WarrantyController().deleteWarranty(txtWarratyid.getText());
                if (deletd) {
                    new InformationBox(new javax.swing.JFrame(), true, "Deleted successfully.").setVisible(true);
                } else {
                    new InformationBox(new javax.swing.JFrame(), true, "Something went wrong, Try again.").setVisible(true);
                }
            } catch (ClassNotFoundException ex) {
                new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
            } catch (SQLException ex) {
                new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
            }
        }
        loadTable();
        clearAll();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnClear;
    private keeptoo.KButton btnDelete;
    private keeptoo.KButton btnSave;
    private keeptoo.KButton btnUpdate;
    private keeptoo.KButton btnUpdate1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblWarranty;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JTable tblWarranty;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtWarratyid;
    // End of variables declaration//GEN-END:variables

    private void setTheam() {
        if (state) {
            pnlBack.setBackground(Color.BLACK);
            lblDuration.setForeground(Color.WHITE);
            lblWarranty.setForeground(Color.WHITE);
            txtDuration.setForeground(Color.WHITE);
            txtWarratyid.setForeground(Color.WHITE);
            txtDuration.setBackground(Color.BLACK);
            txtWarratyid.setBackground(Color.BLACK);

        } else {

        }
    }

    private void clearAll() {
        txtDuration.setText("");
        txtWarratyid.setText("");
    }

    private void loadTable() {
        try {
            List<WarrantyModel> list = new WarrantyController().getAllWarranty();
            DefaultTableModel model = (DefaultTableModel) tblWarranty.getModel();
            model.setRowCount(0);
            for (WarrantyModel warrantyModel : list) {
                model.addRow(new Object[]{
                    warrantyModel.getWarrantyID(),
                    warrantyModel.getDuration()
                });
            }

        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }

}
