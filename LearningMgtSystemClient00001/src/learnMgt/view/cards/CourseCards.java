/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.view.cards;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.SimpleDateFormat;
import java.util.Set;
import learnMgt.model.Courses;
import learnMgt.model.Departments;

/**
 *
 * @author ELOHOME LTD
 */
public class CourseCards extends javax.swing.JPanel {

    public CourseCards(boolean selected, Courses data) {
        this.selected = selected;
        this.data = data;
    }
      public Courses getData() {
        return data;
    }

    public boolean selected;

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    public CourseCards() {
        initComponents();
        setOpaque(false);
        setData(data);
    }

    private Courses data;

    public void setData(Courses data) {
        this.data = data;
        lbCourseName.setText(data.getTitle());
        // Assuming depart is a Set<Departments>        
        lbDepart.setText(data.getInstructor().getUser().getDepartments().getName());
        lbInsName.setText(data.getInstructor().getUser().getFirstName());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        lbStartDate.setText(dateFormat.format(data.getStartDate()));
        lbEndDate.setText(dateFormat.format(data.getEndDate()));
    }



    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.white);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        if (selected) {
            g2.setColor(new Color(94, 156, 255));
            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
        }
        super.paint(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCourseName = new javax.swing.JLabel();
        lbInsName = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        lbStartDate = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lbDepart = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lbEndDate = new javax.swing.JLabel();

        lbCourseName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbCourseName.setText("Course Name");

        lbInsName.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbInsName.setForeground(new java.awt.Color(188, 188, 188));
        lbInsName.setText("Instructor's name");

        lb.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb.setForeground(new java.awt.Color(188, 188, 188));
        lb.setText("Department:");

        lbStartDate.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbStartDate.setForeground(new java.awt.Color(188, 188, 188));
        lbStartDate.setText("Start date:");

        lb2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb2.setForeground(new java.awt.Color(188, 188, 188));
        lb2.setText("Start date:");

        lbDepart.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbDepart.setForeground(new java.awt.Color(188, 188, 188));
        lbDepart.setText("Department");

        lb3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb3.setForeground(new java.awt.Color(188, 188, 188));
        lb3.setText("End date:");

        lbEndDate.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbEndDate.setForeground(new java.awt.Color(188, 188, 188));
        lbEndDate.setText("Start date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCourseName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbInsName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb2)
                                    .addComponent(lb3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbEndDate)
                                    .addComponent(lbStartDate))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lbCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbInsName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lbCourseName;
    private javax.swing.JLabel lbDepart;
    private javax.swing.JLabel lbEndDate;
    private javax.swing.JLabel lbInsName;
    private javax.swing.JLabel lbStartDate;
    // End of variables declaration//GEN-END:variables
}
