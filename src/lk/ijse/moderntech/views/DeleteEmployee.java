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
import lk.ijse.moderntech.controler.DeleteEmployeeController;
import lk.ijse.moderntech.controler.UpdateEmployeeController;
import lk.ijse.moderntech.model.EmployeeModel;

/**
 *
 * @author Shamal
 */
public class DeleteEmployee extends javax.swing.JInternalFrame {

    boolean state;

    public DeleteEmployee(boolean state) {
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
        lblEmployeeid = new javax.swing.JLabel();
        txtEmployeeid = new javax.swing.JTextField();
        btnClear = new keeptoo.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        btnDelete = new keeptoo.KButton();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1310, 820));

        pnlBack.setBackground(new java.awt.Color(255, 255, 255));
        pnlBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmployeeid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblEmployeeid.setText("Employee ID :");
        pnlBack.add(lblEmployeeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        txtEmployeeid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtEmployeeid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        txtEmployeeid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeidActionPerformed(evt);
            }
        });
        pnlBack.add(txtEmployeeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 320, -1));

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
        pnlBack.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, -1, -1));

        tblEmployee.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Name", "Contact no", "Email", "Address", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployee.setRowHeight(20);
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        pnlBack.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 197, 1270, 580));

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
        pnlBack.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 120, -1, -1));

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

    private void txtEmployeeidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeidActionPerformed
        try {
            EmployeeModel emp = new DeleteEmployeeController().getEmployee(txtEmployeeid.getText());
            DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
            model.setRowCount(0);
            model.addRow(new Object[]{
                emp.getEmployeeID(),
                emp.getName(),
                emp.getContactNo(),
                emp.getEmail(),
                emp.getAddress(),
                emp.getRole()
            });
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }//GEN-LAST:event_txtEmployeeidActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            boolean deleted = new DeleteEmployeeController().deleteEmployee(txtEmployeeid.getText());
            if(deleted){
                new InformationBox(new javax.swing.JFrame(), true, "Deleted successfully.").setVisible(true);
            }else{
                new InformationBox(new javax.swing.JFrame(), true, "Something went wrong, Try again.").setVisible(true);
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseClicked
        int row = tblEmployee.getSelectedRow();
        txtEmployeeid.setText(tblEmployee.getValueAt(row, 0).toString());
    }//GEN-LAST:event_tblEmployeeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnClear;
    private keeptoo.KButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmployeeid;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtEmployeeid;
    // End of variables declaration//GEN-END:variables

    private void setTheam() {
        if (state) {
            pnlBack.setBackground(Color.BLACK);
            lblEmployeeid.setForeground(Color.WHITE);
            txtEmployeeid.setForeground(Color.WHITE);
            txtEmployeeid.setBackground(Color.BLACK);

        } else {
        }
    }

    private void loadTable() {
        try {
            List<EmployeeModel> list = new DeleteEmployeeController().getEmployees();
            DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
            model.setRowCount(0);

            for (EmployeeModel employeeModel : list) {
                model.addRow(new Object[]{
                    employeeModel.getEmployeeID(),
                    employeeModel.getName(),
                    employeeModel.getContactNo(),
                    employeeModel.getEmail(),
                    employeeModel.getAddress(),
                    employeeModel.getRole()
                });
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }
}
