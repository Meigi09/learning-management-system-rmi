/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.view.forms.InstruForms;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import learnMgt.model.Gradebook;
import learnMgt.service.GradebookService;
import learnMgt.view.dynamicjasper.PrintTable;
import net.sf.dynamicreports.report.constant.PageOrientation;
import net.sf.dynamicreports.report.constant.PageType;
import net.sf.dynamicreports.report.exception.DRException;
import raven.dynamicjasper.template.PageFormat;

/**
 *
 * @author ELOHOME LTD
 */
public class InsGradeBookForm extends javax.swing.JPanel {

    /**
     * Creates new form InsGradebookForm
     */
    private DefaultTableModel tableModel = new DefaultTableModel();
     private PageFormat pageFormat = new PageFormat(PageType.A4, 0, 0, PageOrientation.PORTRAIT);

    public InsGradeBookForm() {
        initComponents();
        addColumn();
        addRow();
    }

     private void addColumn() {
       
        tableModel.addColumn("Grade Code");
        tableModel.addColumn("Grades");
        tableModel.addColumn("Assessment ID");
        tableModel.addColumn("Assigment ID");
        tableModel.addColumn("Date");
        tableModel.addColumn("Comments");
        tableModel.addColumn("Course Title");
        tableModel.addColumn("Learner Name");        
        gradeTable.setModel(tableModel);
    }

    private void addRow(){
        try {
             Gradebook cAdd = new Gradebook();
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 5000);
            GradebookService service = (GradebookService) registry.lookup("gradebook");
            List<Gradebook> courses = service.findAllGradebook();
            Iterator iterator = courses.iterator();
           for (Gradebook department : courses) {
            Object[] row = {
                department.getGradebookId(), // Assuming getId() returns the department ID
                department.getGrades(), // Assuming getName() returns the department name
                department.getAssessment().getAssessmentId(),
                department.getAssignment().getAssignmentId(),
                department.getDate(),
                department.getCourse().getTitle(),
 
            };
            tableModel.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
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

        materialTabbed1 = new learnMgt.view.tabbed.MaterialTabbed();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gradeTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pdfPrint = new javax.swing.JButton();
        csvPrint = new javax.swing.JButton();
        wordPrint = new javax.swing.JButton();
        viewGrades = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        gradeTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(gradeTable);

        jButton1.setText("Edit Grades");

        jButton2.setText("Delete Grades");

        pdfPrint.setText("Print PDF");
        pdfPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfPrintActionPerformed(evt);
            }
        });

        csvPrint.setText("Print CSV");
        csvPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csvPrintActionPerformed(evt);
            }
        });

        wordPrint.setText("Print Word");
        wordPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordPrintActionPerformed(evt);
            }
        });

        viewGrades.setText("View Grades");
        viewGrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewGradesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(pdfPrint)
                        .addGap(28, 28, 28)
                        .addComponent(csvPrint)
                        .addGap(18, 18, 18)
                        .addComponent(wordPrint)
                        .addGap(18, 18, 18)
                        .addComponent(viewGrades))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(pdfPrint)
                    .addComponent(csvPrint)
                    .addComponent(wordPrint)
                    .addComponent(viewGrades))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        materialTabbed1.addTab("Grades", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        materialTabbed1.addTab("Remarks", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(materialTabbed1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(materialTabbed1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pdfPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfPrintActionPerformed
        File file = showFileChooser();
        if (file != null) {
            try {
                File f = new PrintTable().printTable(gradeTable.getModel(), "Test Report", pageFormat).exportToPdf(file);
                Desktop.getDesktop().open(f);
            } catch (IOException | DRException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_pdfPrintActionPerformed

    private void viewGradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewGradesActionPerformed
        // TODO add your handling code here:
        try {
            new PrintTable().printTable(gradeTable.getModel(), "Dynamic Report", pageFormat);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_viewGradesActionPerformed

    private void csvPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csvPrintActionPerformed
        // TODO add your handling code here:
          File file = showFileChooser();
        if (file != null) {
            try {
                File f = new PrintTable().printTable(gradeTable.getModel(), "Test Report", pageFormat).exportToExcel(file);
                Desktop.getDesktop().open(f);
            } catch (IOException | DRException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_csvPrintActionPerformed

    private void wordPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordPrintActionPerformed
        // TODO add your handling code here:
         File file = showFileChooser();
        if (file != null) {
            try {
                File f = new PrintTable().printTable(gradeTable.getModel(), "Test Report", pageFormat).exportToWord(file);
                Desktop.getDesktop().open(f);
            } catch (IOException | DRException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_wordPrintActionPerformed

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
    private javax.swing.JButton csvPrint;
    private javax.swing.JTable gradeTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private learnMgt.view.tabbed.MaterialTabbed materialTabbed1;
    private javax.swing.JButton pdfPrint;
    private javax.swing.JButton viewGrades;
    private javax.swing.JButton wordPrint;
    // End of variables declaration//GEN-END:variables
}
