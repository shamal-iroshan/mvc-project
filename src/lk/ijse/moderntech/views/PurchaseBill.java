/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.moderntech.views;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import lk.ijse.moderntech.controler.AddCustomerInterface;
import lk.ijse.moderntech.controler.PurchaseBillController;
import lk.ijse.moderntech.model.ComputerStockModel;
import lk.ijse.moderntech.model.OrderDetailModel;
import lk.ijse.moderntech.model.OrderModel;
import lk.ijse.moderntech.model.PartStockModel;

/**
 *
 * @author Shamal
 */
public class PurchaseBill extends javax.swing.JInternalFrame implements AddCustomerInterface {

    boolean state;

    /**
     * Creates new form PurchaseBill
     */
    public PurchaseBill(boolean state) {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.state = state;
        setTheam();
        loadOrderID();
        loadCustomerID();
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
        lblOrderid = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblCustomerdetail = new javax.swing.JLabel();
        lblCustomerid = new javax.swing.JLabel();
        cmbCustomerid = new javax.swing.JComboBox<>();
        lblCustomername = new javax.swing.JLabel();
        txtCstomername = new javax.swing.JTextField();
        btnSearchcusomer = new keeptoo.KButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblItemdetail = new javax.swing.JLabel();
        lblItemname = new javax.swing.JLabel();
        txtItemname = new javax.swing.JTextField();
        btnItemsearch = new keeptoo.KButton();
        lblQty = new javax.swing.JLabel();
        txtOrderid = new javax.swing.JTextField();
        lblItemid = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        lblBuyingprice = new javax.swing.JLabel();
        lblQtyonhand = new javax.swing.JLabel();
        txtItemid = new javax.swing.JTextField();
        txtDiscount = new javax.swing.JTextField();
        lblItemtotal = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();
        btnAddcustomer = new keeptoo.KButton();
        lblSellingprice = new javax.swing.JLabel();
        lblCash = new javax.swing.JLabel();
        txtCash = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        btnAddtocart = new keeptoo.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnPlaceorder = new keeptoo.KButton();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1310, 820));

        pnlBack.setBackground(new java.awt.Color(255, 255, 255));
        pnlBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrderid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblOrderid.setText("Order ID :");
        pnlBack.add(lblOrderid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txtQty.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtQty.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
        });
        pnlBack.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 100, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        pnlBack.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1270, 10));

        lblCustomerdetail.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        lblCustomerdetail.setText("Customer Details");
        pnlBack.add(lblCustomerdetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        lblCustomerid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblCustomerid.setText("Customer ID :");
        pnlBack.add(lblCustomerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        cmbCustomerid.setEditable(true);
        cmbCustomerid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        cmbCustomerid.setBorder(null);
        cmbCustomerid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCustomeridItemStateChanged(evt);
            }
        });
        cmbCustomerid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCustomeridActionPerformed(evt);
            }
        });
        pnlBack.add(cmbCustomerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 270, 30));

        lblCustomername.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblCustomername.setText("Name :");
        pnlBack.add(lblCustomername, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, -1, -1));

        txtCstomername.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtCstomername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        txtCstomername.setEnabled(false);
        pnlBack.add(txtCstomername, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 320, -1));

        btnSearchcusomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(26, 200, 179)));
        btnSearchcusomer.setForeground(new java.awt.Color(26, 200, 179));
        btnSearchcusomer.setText("Search");
        btnSearchcusomer.setToolTipText("");
        btnSearchcusomer.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnSearchcusomer.setkAllowGradient(false);
        btnSearchcusomer.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btnSearchcusomer.setkBorderRadius(0);
        btnSearchcusomer.setkForeGround(new java.awt.Color(26, 200, 179));
        btnSearchcusomer.setkHoverColor(new java.awt.Color(26, 200, 179));
        btnSearchcusomer.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSearchcusomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchcusomerActionPerformed(evt);
            }
        });
        pnlBack.add(btnSearchcusomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 160, 150, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        pnlBack.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 1270, 10));

        lblItemdetail.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        lblItemdetail.setText("Item Details");
        pnlBack.add(lblItemdetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, -1));

        lblItemname.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblItemname.setText("Name :");
        pnlBack.add(lblItemname, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, -1, -1));

        txtItemname.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtItemname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        txtItemname.setEnabled(false);
        pnlBack.add(txtItemname, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 320, -1));

        btnItemsearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(26, 200, 179)));
        btnItemsearch.setForeground(new java.awt.Color(26, 200, 179));
        btnItemsearch.setText("Search");
        btnItemsearch.setToolTipText("");
        btnItemsearch.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnItemsearch.setkAllowGradient(false);
        btnItemsearch.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btnItemsearch.setkBorderRadius(0);
        btnItemsearch.setkForeGround(new java.awt.Color(26, 200, 179));
        btnItemsearch.setkHoverColor(new java.awt.Color(26, 200, 179));
        btnItemsearch.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnItemsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemsearchActionPerformed(evt);
            }
        });
        pnlBack.add(btnItemsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 300, 150, -1));

        lblQty.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblQty.setText("QTY :");
        pnlBack.add(lblQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, -1));

        txtOrderid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtOrderid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        txtOrderid.setEnabled(false);
        pnlBack.add(txtOrderid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 320, -1));

        lblItemid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblItemid.setText("Item ID :");
        pnlBack.add(lblItemid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        lblBalance.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblBalance.setText("Balance  :");
        pnlBack.add(lblBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 780, -1, -1));

        lblBuyingprice.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblBuyingprice.setText("Buying price :");
        lblBuyingprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        pnlBack.add(lblBuyingprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        lblQtyonhand.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblQtyonhand.setText("QTY on hand :");
        pnlBack.add(lblQtyonhand, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        txtItemid.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtItemid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        txtItemid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemidActionPerformed(evt);
            }
        });
        pnlBack.add(txtItemid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 320, -1));

        txtDiscount.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtDiscount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        txtDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiscountKeyReleased(evt);
            }
        });
        pnlBack.add(txtDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, 100, -1));

        lblItemtotal.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblItemtotal.setText("Total :");
        pnlBack.add(lblItemtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 390, -1, -1));

        lblDiscount.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblDiscount.setText("Discount :");
        pnlBack.add(lblDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, -1, -1));

        btnAddcustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 215)));
        btnAddcustomer.setForeground(new java.awt.Color(0, 120, 215));
        btnAddcustomer.setText("Add");
        btnAddcustomer.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnAddcustomer.setkAllowGradient(false);
        btnAddcustomer.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btnAddcustomer.setkBorderRadius(0);
        btnAddcustomer.setkForeGround(new java.awt.Color(0, 120, 215));
        btnAddcustomer.setkHoverColor(new java.awt.Color(0, 120, 215));
        btnAddcustomer.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnAddcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddcustomerActionPerformed(evt);
            }
        });
        pnlBack.add(btnAddcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 100, 150, -1));

        lblSellingprice.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblSellingprice.setText("Selling price :");
        pnlBack.add(lblSellingprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        lblCash.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblCash.setText("Cash :");
        pnlBack.add(lblCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 780, -1, -1));

        txtCash.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtCash.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 120, 215)));
        txtCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCashKeyReleased(evt);
            }
        });
        pnlBack.add(txtCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 780, 100, -1));

        lblTotal.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblTotal.setText("Total :");
        pnlBack.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 780, -1, -1));

        btnAddtocart.setBorder(null);
        btnAddtocart.setText("Add to cart");
        btnAddtocart.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnAddtocart.setkAllowGradient(false);
        btnAddtocart.setkBackGroundColor(new java.awt.Color(255, 102, 102));
        btnAddtocart.setkBorderRadius(0);
        btnAddtocart.setkHoverColor(new java.awt.Color(170, 68, 68));
        btnAddtocart.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnAddtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtocartActionPerformed(evt);
            }
        });
        pnlBack.add(btnAddtocart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 380, 150, -1));

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Name", "Unit price", "Qty", "Discount", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
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
        tblOrder.setRowHeight(20);
        tblOrder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblOrderKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrder);

        pnlBack.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 1270, 310));

        btnPlaceorder.setBorder(null);
        btnPlaceorder.setText("Place Order");
        btnPlaceorder.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnPlaceorder.setkAllowGradient(false);
        btnPlaceorder.setkBackGroundColor(new java.awt.Color(0, 120, 215));
        btnPlaceorder.setkBorderRadius(0);
        btnPlaceorder.setkHoverColor(new java.awt.Color(0, 80, 143));
        btnPlaceorder.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnPlaceorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceorderActionPerformed(evt);
            }
        });
        pnlBack.add(btnPlaceorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 760, -1, -1));

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

    private void cmbCustomeridItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCustomeridItemStateChanged
        try {
            String name = new PurchaseBillController().getCustomerName(cmbCustomerid.getSelectedItem().toString());
            if (name != null) {
                txtCstomername.setText(name);
            } else {
                new InformationBox(new javax.swing.JFrame(), true, "Check customer ID.").setVisible(true);
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }//GEN-LAST:event_cmbCustomeridItemStateChanged

    private void cmbCustomeridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCustomeridActionPerformed
        try {
            String name = new PurchaseBillController().getCustomerName(cmbCustomerid.getSelectedItem().toString());
            if (name != null) {
                txtCstomername.setText(name);
            } else {
                new InformationBox(new javax.swing.JFrame(), true, "Check customer ID.").setVisible(true);
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }//GEN-LAST:event_cmbCustomeridActionPerformed

    private void txtItemidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemidActionPerformed
        if (txtItemid.getText().trim().length() > 0) {
            String id = txtItemid.getText().substring(0, 1);

            try {
                if (id.equals("P")) {
                    PartStockModel partStock = new PurchaseBillController().getPartDetails(txtItemid.getText());
                    if (partStock != null) {
                        txtItemname.setText(partStock.getName());
                        lblSellingprice.setText("Selling price :RS." + partStock.getSellingPrice());
                        lblBuyingprice.setText("Buying price :RS." + partStock.getBuyingPrice());
                        lblQtyonhand.setText("QTY on hand :" + partStock.getQtyOnHand());
                    } else {
                        new InformationBox(new javax.swing.JFrame(), true, "Check the Item id.").setVisible(true);
                    }

                } else if (id.equals("C")) {
                    ComputerStockModel computerStock = new PurchaseBillController().getComputerDetail(txtItemid.getText());
                    if (computerStock != null) {
                        txtItemname.setText(computerStock.getBrand() + " " + computerStock.getDescription());
                        lblSellingprice.setText("Selling price :RS." + computerStock.getSellingPrice());
                        lblBuyingprice.setText("Buying price :RS." + computerStock.getBuyingPrice());
                        lblQtyonhand.setText("QTY on hand :" + computerStock.getQtyOnHand());
                    } else {
                        new InformationBox(new javax.swing.JFrame(), true, "Check the Item id.").setVisible(true);
                    }
                } else {
                    new InformationBox(new javax.swing.JFrame(), true, "Check the Item id.").setVisible(true);
                }
            } catch (ClassNotFoundException ex) {
                new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
            } catch (SQLException ex) {
                new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
            }
        }
        txtQty.setText("");
        txtDiscount.setText("");
        lblItemtotal.setText("Total :");
    }//GEN-LAST:event_txtItemidActionPerformed

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased
        if (txtQty.getText().trim().length() > 0) {
            if (!txtQty.getText().matches("[0-9]*")) {
                new InformationBox(new javax.swing.JFrame(), true, "Please only enter numbers.").setVisible(true);
                txtQty.setText(txtQty.getText().substring(0, txtQty.getText().length() - 1));
            } else {
                int qtyonhand = Integer.valueOf(lblQtyonhand.getText().substring(13, lblQtyonhand.getText().length()));
                int qty = Integer.valueOf(txtQty.getText());

                if (qty <= qtyonhand) {
                    String sell = lblSellingprice.getText().substring(18, lblSellingprice.getText().length());
                    double price = Double.valueOf(sell);
                    lblItemtotal.setText("Total :RS." + (price * qty));
                } else {
                    new InformationBox(new javax.swing.JFrame(), true, "Out of stock").setVisible(true);
                    txtQty.setText("");
                    lblItemtotal.setText("Total :");
                }
            }
        }
    }//GEN-LAST:event_txtQtyKeyReleased

    private void txtDiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountKeyReleased
        if (txtQty.getText().trim().length() > 0 && txtDiscount.getText().trim().length() > 0) {
            if (!txtDiscount.getText().matches("[0-9]*")) {
                new InformationBox(new javax.swing.JFrame(), true, "Please only enter numbers.").setVisible(true);
                txtDiscount.setText(txtDiscount.getText().substring(0, txtDiscount.getText().length() - 1));
            } else {
                int qtyonhand = Integer.valueOf(lblQtyonhand.getText().substring(13, lblQtyonhand.getText().length()));
                int qty = Integer.valueOf(txtQty.getText());
                int discount = Integer.valueOf(txtDiscount.getText());

                if (qty <= qtyonhand) {
                    String sell = lblSellingprice.getText().substring(18, lblSellingprice.getText().length());
                    double price = Double.valueOf(sell);
                    price -= discount;
                    lblItemtotal.setText("Total :RS." + (price * qty));
                } else {
                    new InformationBox(new javax.swing.JFrame(), true, "Out of stock").setVisible(true);
                    txtQty.setText("");
                    lblItemtotal.setText("Total :");
                }
            }
        }
    }//GEN-LAST:event_txtDiscountKeyReleased

    private void btnAddtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtocartActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
        double discount;
        if (txtDiscount.getText().trim().length() > 0) {
            discount = Double.valueOf(txtDiscount.getText());
        } else {
            discount = 0.00;
        }
        String sell = lblSellingprice.getText().substring(18, lblSellingprice.getText().length());
        double unitPrice = Double.valueOf(sell);
        int qty = Integer.valueOf(txtQty.getText());

        double total = Double.valueOf(lblItemtotal.getText().substring(10));

        int rowIndex = isExsist(txtItemid.getText());
        if (rowIndex == -1) {
            model.addRow(new Object[]{
                txtItemid.getText(),
                txtItemname.getText(),
                unitPrice,
                qty,
                discount,
                total
            });
        } else {
            qty += (int) model.getValueAt(rowIndex, 3);
            total = qty * unitPrice;
            tblOrder.setValueAt(qty, rowIndex, 3);
            tblOrder.setValueAt(total, rowIndex, 5);
        }
        calculateTotal();
        txtQty.setText("");
        txtDiscount.setText("");
        lblItemtotal.setText("Total :");
    }//GEN-LAST:event_btnAddtocartActionPerformed

    private void txtCashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashKeyReleased
        double total = Double.valueOf(lblTotal.getText().substring(10));
        double cash = Double.valueOf(txtCash.getText());
        lblBalance.setText("Balance :RS." + (cash - total));
    }//GEN-LAST:event_txtCashKeyReleased

    private void btnPlaceorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceorderActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();

        if (model.getRowCount() > 0) {

            List<OrderDetailModel> list = new ArrayList();

            for (int i = 0; i < model.getRowCount(); i++) {

                String itemCode = (String) model.getValueAt(i, 0);
                double unitPrice = (double) model.getValueAt(i, 2);
                int QTY = (int) model.getValueAt(i, 3);
                double discount = (double) model.getValueAt(i, 4);
                double total = (double) model.getValueAt(i, 5);

                OrderDetailModel orderDetail = new OrderDetailModel();
                String id = itemCode.substring(0, 1);
                if (id.equals("P")) {
                    orderDetail.setPartID(itemCode);
                } else if (id.equals("C")) {
                    orderDetail.setComputerID(itemCode);
                }
                orderDetail.setOrderID(txtOrderid.getText());
                orderDetail.setUnitPrice(unitPrice);
                orderDetail.setQty(QTY);
                orderDetail.setDiscount(discount);
                orderDetail.setTotal(total);

                list.add(orderDetail);
            }
            OrderModel order = new OrderModel(txtOrderid.getText(), cmbCustomerid.getSelectedItem().toString(), list);

            try {
                boolean saved = new PurchaseBillController().saveOrder(order);
                if (saved) {
                    new InformationBox(new javax.swing.JFrame(), true, "Order placed.").setVisible(true);
                    txtItemid.setText("");
                    txtItemname.setText("");
                    lblSellingprice.setText("Selling price :");
                    lblBuyingprice.setText("Buying price :");
                    lblQtyonhand.setText("Qty on hand :");
                    txtQty.setText("");
                    txtDiscount.setText("");
                    lblItemtotal.setText("Total :");
                    lblBalance.setText("Balance :");
                    txtCash.setText("");
                    lblTotal.setText("Total :");
                    tblOrder.removeAll();
                } else {
                    new InformationBox(new javax.swing.JFrame(), true, "Something went wrong.").setVisible(true);
                }
            } catch (ClassNotFoundException ex) {
                new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
            } catch (SQLException ex) {
                new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
            }
        } else {
            new InformationBox(new javax.swing.JFrame(), true, "Add items to cart first.").setVisible(true);
        }
    }//GEN-LAST:event_btnPlaceorderActionPerformed

    private void btnAddcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddcustomerActionPerformed
        new AddCustomer_quick(new javax.swing.JFrame(), true, this).setVisible(true);
    }//GEN-LAST:event_btnAddcustomerActionPerformed

    private void btnSearchcusomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchcusomerActionPerformed
        new SearchCustomer_quick(new javax.swing.JFrame(), true, this).setVisible(true);
    }//GEN-LAST:event_btnSearchcusomerActionPerformed

    private void btnItemsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemsearchActionPerformed
        new SearchItem_quick(new javax.swing.JFrame(), true, this).setVisible(true);
    }//GEN-LAST:event_btnItemsearchActionPerformed

    private void tblOrderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblOrderKeyPressed
        InputMap inputMap = tblOrder.getInputMap(WHEN_FOCUSED);
        ActionMap actionMap = tblOrder.getActionMap();
        
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), "delete");
        actionMap.put("delete", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
                int row = tblOrder.getSelectedRow();
                model.removeRow(row);
            }
        });
    }//GEN-LAST:event_tblOrderKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnAddcustomer;
    private keeptoo.KButton btnAddtocart;
    private keeptoo.KButton btnItemsearch;
    private keeptoo.KButton btnPlaceorder;
    private keeptoo.KButton btnSearchcusomer;
    public javax.swing.JComboBox<String> cmbCustomerid;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblBuyingprice;
    private javax.swing.JLabel lblCash;
    private javax.swing.JLabel lblCustomerdetail;
    private javax.swing.JLabel lblCustomerid;
    private javax.swing.JLabel lblCustomername;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblItemdetail;
    private javax.swing.JLabel lblItemid;
    private javax.swing.JLabel lblItemname;
    private javax.swing.JLabel lblItemtotal;
    private javax.swing.JLabel lblOrderid;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblQtyonhand;
    private javax.swing.JLabel lblSellingprice;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextField txtCash;
    protected javax.swing.JTextField txtCstomername;
    private javax.swing.JTextField txtDiscount;
    protected javax.swing.JTextField txtItemid;
    private javax.swing.JTextField txtItemname;
    private javax.swing.JTextField txtOrderid;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables

    private void setTheam() {
        if (state) {
            pnlBack.setBackground(Color.BLACK);
            lblBuyingprice.setForeground(Color.WHITE);
            lblCash.setForeground(Color.WHITE);
            lblCustomerdetail.setForeground(Color.WHITE);
            lblCustomerid.setForeground(Color.WHITE);
            lblCustomername.setForeground(Color.WHITE);
            lblDiscount.setForeground(Color.WHITE);
            lblItemdetail.setForeground(Color.WHITE);
            lblItemid.setForeground(Color.WHITE);
            lblItemname.setForeground(Color.WHITE);
            lblItemtotal.setForeground(Color.WHITE);
            lblOrderid.setForeground(Color.WHITE);
            lblQty.setForeground(Color.WHITE);
            lblQtyonhand.setForeground(Color.WHITE);
            lblSellingprice.setForeground(Color.WHITE);
            lblTotal.setForeground(Color.WHITE);
            lblBalance.setForeground(Color.WHITE);
            cmbCustomerid.setForeground(Color.WHITE);
            txtCash.setForeground(Color.WHITE);
            txtCstomername.setForeground(Color.WHITE);
            txtDiscount.setForeground(Color.WHITE);
            txtItemid.setForeground(Color.WHITE);
            txtItemname.setForeground(Color.WHITE);
            txtOrderid.setForeground(Color.WHITE);
            txtQty.setForeground(Color.WHITE);
            cmbCustomerid.setBackground(Color.BLACK);
            txtCash.setBackground(Color.BLACK);
            txtCstomername.setBackground(Color.BLACK);
            txtDiscount.setBackground(Color.BLACK);
            txtItemid.setBackground(Color.BLACK);
            txtItemname.setBackground(Color.BLACK);
            txtOrderid.setBackground(Color.BLACK);
            txtQty.setBackground(Color.BLACK);
        } else {
        }
    }

    private void loadOrderID() {
        try {
            String id = new PurchaseBillController().getOrderID();
            if (id != null) {
                txtOrderid.setText(id);
            } else {
                new InformationBox(new javax.swing.JFrame(), true, "Can't load Order ID").setVisible(true);
            }
        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }

    private void loadCustomerID() {
        try {
            List<String> list = new PurchaseBillController().getCustomerID();

            for (String string : list) {
                cmbCustomerid.addItem(string);
            }

        } catch (ClassNotFoundException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Class not found exception").setVisible(true);
        } catch (SQLException ex) {
            new ErrorBox(new javax.swing.JFrame(), true, "Sql exception").setVisible(true);
        }
    }

    private int isExsist(String text) {
        DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            String temp = model.getValueAt(i, 0).toString();
            if (temp.equalsIgnoreCase(text)) {
                return i;
            }
        }
        return -1;
    }

    private void calculateTotal() {
        DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
        double temptotal = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            temptotal += (double) model.getValueAt(i, 5);
        }
        lblTotal.setText("Total :RS." + temptotal);
    }

    @Override
    public void getCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}