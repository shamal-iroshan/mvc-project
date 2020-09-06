/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.moderntech.views;

import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.moderntech.controler.DailyIncomeController;

/**
 *
 * @author Shamal
 */
public class DailyIncome extends javax.swing.JInternalFrame {

    boolean state;

    /**
     * Creates new form DailyIncome
     */
    public DailyIncome(boolean state) {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.state = state;
        setTheam();
        getDate();
        loadDetail();
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
        lblDate = new javax.swing.JLabel();
        lblD = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblOrderincome = new javax.swing.JLabel();
        lblOrdercount = new javax.swing.JLabel();
        lblOc = new javax.swing.JLabel();
        lnlOi = new javax.swing.JLabel();
        lblTotalorderincome = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblRepairincome = new javax.swing.JLabel();
        lblRc = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblRi = new javax.swing.JLabel();
        lblTotalrepairincome = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblTot = new javax.swing.JLabel();
        lblRepaircount = new javax.swing.JLabel();
        lblT = new javax.swing.JLabel();

        setBorder(null);

        pnlBack.setBackground(new java.awt.Color(255, 255, 255));
        pnlBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDate.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblDate.setText("date");
        pnlBack.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        lblD.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblD.setText("Date :");
        pnlBack.add(lblD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        pnlBack.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1290, 10));

        lblOrderincome.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        lblOrderincome.setText("Order Income");
        pnlBack.add(lblOrderincome, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        lblOrdercount.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblOrdercount.setText("count");
        pnlBack.add(lblOrdercount, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        lblOc.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblOc.setText("Order count :");
        pnlBack.add(lblOc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 120, -1));

        lnlOi.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lnlOi.setText("Total income :");
        pnlBack.add(lnlOi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        lblTotalorderincome.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblTotalorderincome.setText("income");
        pnlBack.add(lblTotalorderincome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));
        pnlBack.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 1290, 10));

        lblRepairincome.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        lblRepairincome.setText("Repair income");
        pnlBack.add(lblRepairincome, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, -1, -1));

        lblRc.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblRc.setText("Repair count :");
        pnlBack.add(lblRc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        lblTotal.setBackground(new java.awt.Color(153, 255, 153));
        lblTotal.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        lblTotal.setText("total");
        pnlBack.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, -1, -1));

        lblRi.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblRi.setText("Total income :");
        pnlBack.add(lblRi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        lblTotalrepairincome.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblTotalrepairincome.setText("income");
        pnlBack.add(lblTotalrepairincome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));
        pnlBack.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 1290, 10));

        lblTot.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        lblTot.setText("Total");
        pnlBack.add(lblTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, -1, -1));

        lblRepaircount.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblRepaircount.setText("count");
        pnlBack.add(lblRepaircount, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        lblT.setBackground(new java.awt.Color(153, 255, 153));
        lblT.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        lblT.setText("Total :");
        pnlBack.add(lblT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, -1, -1));

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblD;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblOc;
    private javax.swing.JLabel lblOrdercount;
    private javax.swing.JLabel lblOrderincome;
    private javax.swing.JLabel lblRc;
    private javax.swing.JLabel lblRepaircount;
    private javax.swing.JLabel lblRepairincome;
    private javax.swing.JLabel lblRi;
    private javax.swing.JLabel lblT;
    private javax.swing.JLabel lblTot;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalorderincome;
    private javax.swing.JLabel lblTotalrepairincome;
    private javax.swing.JLabel lnlOi;
    private javax.swing.JPanel pnlBack;
    // End of variables declaration//GEN-END:variables
    private void setTheam() {
        if (state) {
            pnlBack.setBackground(Color.BLACK);

            lblD.setForeground(Color.WHITE);
            lblDate.setForeground(Color.WHITE);
            lblOc.setForeground(Color.WHITE);
            lblOrdercount.setForeground(Color.WHITE);
            lblOrderincome.setForeground(Color.WHITE);
            lblRc.setForeground(Color.WHITE);
            lblRepaircount.setForeground(Color.WHITE);
            lblRepairincome.setForeground(Color.WHITE);
            lblRi.setForeground(Color.WHITE);
            lblT.setForeground(Color.WHITE);
            lblTot.setForeground(Color.WHITE);
            lblTotal.setForeground(Color.WHITE);
            lblTotalorderincome.setForeground(Color.WHITE);
            lblTotalrepairincome.setForeground(Color.WHITE);
        } else {

        }
    }

    private void getDate() {
        Date D1 = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("YYYY-MM-dd");
        lblDate.setText(format1.format(D1));
    }

    private void loadDetail() {
        try {
            List<String> list = new DailyIncomeController().getOrderDetail(lblDate.getText());
            if (list != null) {
                lblOrdercount.setText(list.get(0));
                lblTotalorderincome.setText(list.get(1));
            } else {
                lblOrdercount.setText("0");
                lblTotalorderincome.setText("0.00");
            }

            List<String> rep = new DailyIncomeController().getRepairDetail(lblDate.getText());
            if (rep != null) {
                lblRepaircount.setText(rep.get(0));
                lblTotalrepairincome.setText(rep.get(1));
            } else {
                lblRepaircount.setText("0");
                lblTotalrepairincome.setText("0.00");
            }
            
            if(lblOrdercount.getText().equals("0") && lblRepaircount.getText().equals("0")){
                lblTotal.setText("0.00");
            }else if(lblOrdercount.getText().equals("0")){
                lblTotal.setText(lblTotalrepairincome.getText());
            }else if(lblRepaircount.getText().equals("0")){
                lblTotal.setText(lblTotalorderincome.getText());
            }else if(!(lblOrdercount.getText().equals("0") && lblRepaircount.getText().equals("0"))){
                lblTotal.setText(Double.valueOf(lblTotalorderincome.getText()) + Double.valueOf(lblTotalrepairincome.getText())+"0");
            }

        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }
}