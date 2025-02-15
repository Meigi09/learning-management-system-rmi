/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.view.main.Dialogs;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import learnMgt.view.main.generatedOTP;

/**
 *
 * @author ELOHOME LTD
 */
public class forgotPassword extends javax.swing.JDialog {

    /**
     * Creates new form forgotPassword
     */
    private final JTextField usernameOrEmailField;
    private final JButton sendOTPButton;
    private final JButton verifyOTPButton;
    private final JTextField otpField;
    private final JLabel statusLabel;
    private final Random random;
    public forgotPassword(java.awt.Frame parent, boolean modal) {
        super(parent, "Forgot Password", true);

        random = new Random();

        JPanel panel = new JPanel(new GridLayout(4, 1));
        usernameOrEmailField = new JTextField();
        sendOTPButton = new JButton("Send OTP");
        verifyOTPButton = new JButton("Verify OTP");
        otpField = new JTextField();
        statusLabel = new JLabel();

        panel.add(new JLabel("Enter Username or Email:"));
        panel.add(usernameOrEmailField);
        panel.add(sendOTPButton);
        panel.add(otpField);
        panel.add(verifyOTPButton);
        panel.add(statusLabel);

        sendOTPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendOTP();
            }
        });

        verifyOTPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verifyOTP();
            }
        });

        add(panel);
        pack();
        setLocationRelativeTo(parent);
    }
     private void sendOTP() {
        // Simulate sending OTP via email or SMS
        int otp = generateOTP();
        JOptionPane.showMessageDialog(this, "OTP sent to your registered email or phone: " + otp, "OTP Sent", JOptionPane.INFORMATION_MESSAGE);
    }

    private void verifyOTP() {
        String enteredOTP = otpField.getText();
        // Validate OTP (for simplicity, just check if it's numeric)
        if (enteredOTP.matches("\\d+")) {
            int otp = Integer.parseInt(enteredOTP);
            // Simulate OTP verification (compare with generated OTP)
            if (otp == generateOTP()) {
                resetPassword();
            } else {
                statusLabel.setText("Invalid OTP. Please try again.");
            }
        } else {
            statusLabel.setText("Please enter a numeric OTP.");
        }
    }

    private void resetPassword() {
        // Show password reset dialog
        // You can implement this part according to your application's password reset logic
        // For example, prompt the user to enter a new password and update it in the database
        JOptionPane.showMessageDialog(this, "Password reset successful. Please configure a new password.", "Password Reset", JOptionPane.INFORMATION_MESSAGE);
        dispose(); // Close the dialog after password reset
    }

    private int generateOTP() {
        return 100000 + random.nextInt(900000); // Generate a 6-digit OTP
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                forgotPassword dialog = new forgotPassword(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
