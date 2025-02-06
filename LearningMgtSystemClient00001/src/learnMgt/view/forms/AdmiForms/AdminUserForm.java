/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.view.forms.AdmiForms;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import learnMgt.model.Users;
import learnMgt.service.UsersService;
import learnMgt.view.dynamicjasper.PrintTable;
import learnMgt.view.dynamicjasper.PrintTableDetails;
import learnMgt.view.dynamicjasper.ReportOption;
import net.sf.dynamicreports.report.constant.PageOrientation;
import net.sf.dynamicreports.report.constant.PageType;
import net.sf.dynamicreports.report.exception.DRException;
import raven.dynamicjasper.template.PageFormat;

/**
 *
 * @author ELOHOME LTD
 */
public class AdminUserForm extends javax.swing.JPanel {

    /**
     * Creates new form AdminCoursesForm
     */
    private DefaultTableModel tablemodel=new DefaultTableModel();
    private PageFormat pageFormat = new PageFormat(PageType.A4, 0, 0, PageOrientation.PORTRAIT);

    public AdminUserForm() {
        initComponents();
        addColumnTable();
        addRowTable();
    }

    private void addColumnTable() {

        try {
            tablemodel.setColumnCount(0);
            tablemodel.addColumn("Users ID");
            tablemodel.addColumn("First Name");
            tablemodel.addColumn("Last Name");
            tablemodel.addColumn("Username");
            tablemodel.addColumn("Email");
            tablemodel.addColumn("Role");
            tablemodel.addColumn("Departments");
            tablemodel.addColumn("Profile Photo");
            tablemodel.addColumn("Registration Date");
            tablemodel.addColumn("Login Date");
            tablemodel.addColumn("Password");
            userTable.setModel(tablemodel);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void addRowTable() {
        // tablemodel.setRowCount(0);
        //departTable.getCellEditor().cancelCellEditing();
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 5000);
            UsersService userService = (UsersService) registry.lookup("user");
            List<Users> users = userService.findAllUsers();
            for (Users user : users) {
                Object[] row = {
                    user.getUserid(),
                    user.getFirstName(),
                    user.getLastName(),
                    user.getUsername(),
                    user.getEmail(),
                    user.getRole(),
                    user.getDepartments(),
                    user.getImageprofile(),
                    user.getRegistrationDate(),
                    user.getLoginDate(),
                    user.getPassword()
                };
                tablemodel.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
     private ReportOption getReportOption() {
        return new ReportOption("", "No", "Customer", "Amount", new ReportOption("Product List", "No", "Item", "Total", new ReportOption("Detail", "No", "Type", "Qty")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        materialTabbed1 = new tabbed.MaterialTabbed();
        jPanel1 = new javax.swing.JPanel();
        changeBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        userTable = new javaswingdev.swing.table.Table();
        PDFprint = new javax.swing.JButton();
        printCsv = new javax.swing.JButton();
        prntWord = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        table2 = new javaswingdev.swing.table.Table();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table1 = new javaswingdev.swing.table.Table();

        changeBtn.setText("Change");

        deleteBtn.setText("View");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        userTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(userTable);

        PDFprint.setText("Print PDF");
        PDFprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFprintActionPerformed(evt);
            }
        });

        printCsv.setText("Print CSV");
        printCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printCsvActionPerformed(evt);
            }
        });

        prntWord.setText("Print Word");
        prntWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prntWordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(changeBtn)
                        .addGap(44, 44, 44)
                        .addComponent(deleteBtn)
                        .addGap(36, 36, 36)
                        .addComponent(PDFprint)
                        .addGap(32, 32, 32)
                        .addComponent(printCsv)
                        .addGap(46, 46, 46)
                        .addComponent(prntWord))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(changeBtn)
                    .addComponent(PDFprint)
                    .addComponent(printCsv)
                    .addComponent(prntWord))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        materialTabbed1.addTab("Users", jPanel1);

        jButton1.setText("Grant Permissions");

        table2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(table2);

        jButton4.setText("Revoke Permissions");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(153, 153, 153))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(178, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        materialTabbed1.addTab("Permissions", jPanel2);

        table1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(table1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        materialTabbed1.addTab("Activities", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(materialTabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(materialTabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PDFprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFprintActionPerformed
        // TODO add your handling code here:
          File file = showFileChooser();
        if (file != null) {
            try {
                File f = new PrintTable().printTable(userTable.getModel(), "Test Report", pageFormat).exportToPdf(file);
                Desktop.getDesktop().open(f);
            } catch (IOException | DRException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_PDFprintActionPerformed

    private void printCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printCsvActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
          File file = showFileChooser();
        if (file != null) {
            try {
                File f = new PrintTable().printTable(userTable.getModel(), "Test Report", pageFormat).exportToExcel(file);
                Desktop.getDesktop().open(f);
            } catch (IOException | DRException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_printCsvActionPerformed

    
    private void prntWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prntWordActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
         File file = showFileChooser();
        if (file != null) {
            try {
                File f = new PrintTable().printTable(userTable.getModel(), "Test Report", pageFormat).exportToWord(file);
                Desktop.getDesktop().open(f);
            } catch (IOException | DRException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_prntWordActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
         try {
            new PrintTableDetails().printTable(userTable.getModel(), "Dynamic Jasper Report Java", pageFormat, getReportOption()).view();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed
 private File showFileChooser() {
        JFileChooser ch = new JFileChooser();
        int opt = ch.showSaveDialog(this);
        if (opt == JFileChooser.APPROVE_OPTION) {
            return ch.getSelectedFile();
        } else {
            return null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PDFprint;
    private javax.swing.JButton changeBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private tabbed.MaterialTabbed materialTabbed1;
    private javax.swing.JButton printCsv;
    private javax.swing.JButton prntWord;
    private javaswingdev.swing.table.Table table1;
    private javaswingdev.swing.table.Table table2;
    private javaswingdev.swing.table.Table userTable;
    // End of variables declaration//GEN-END:variables
}
