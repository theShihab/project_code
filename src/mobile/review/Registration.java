/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.review;

import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */

public class Registration extends javax.swing.JFrame {

    int rate;
    /**
     * Creates new form Registration
     */
    String wtext = "You are successfully Logged In!";
    public Registration() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_fname = new javax.swing.JTextField();
        jTextField_lname = new javax.swing.JTextField();
        jTextField_uname = new javax.swing.JTextField();
        jTextField_email = new javax.swing.JTextField();
        jPasswordField_pass = new javax.swing.JPasswordField();
        jPasswordField_confirmpass = new javax.swing.JPasswordField();
        jButton_Register = new javax.swing.JButton();
        jLabel_Alreadysigned = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_myphone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox_gender = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jTextField_rate = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("First Name");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));

        jLabel4.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("First Name:");

        jLabel5.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Last Name:");

        jLabel6.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("User Name:");

        jLabel7.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("Email:");

        jLabel8.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("Password:");

        jLabel9.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("Confirm Password:");

        jTextField_fname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_fnameKeyPressed(evt);
            }
        });

        jTextField_lname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_lnameKeyPressed(evt);
            }
        });

        jTextField_uname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_unameKeyPressed(evt);
            }
        });

        jTextField_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_emailKeyPressed(evt);
            }
        });

        jPasswordField_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_passActionPerformed(evt);
            }
        });
        jPasswordField_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_passKeyPressed(evt);
            }
        });

        jPasswordField_confirmpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_confirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_confirmpassActionPerformed(evt);
            }
        });
        jPasswordField_confirmpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_confirmpassKeyPressed(evt);
            }
        });

        jButton_Register.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jButton_Register.setForeground(new java.awt.Color(0, 0, 153));
        jButton_Register.setText("Register");
        jButton_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegisterActionPerformed(evt);
            }
        });

        jLabel_Alreadysigned.setFont(new java.awt.Font("Open Sans Condensed", 0, 14)); // NOI18N
        jLabel_Alreadysigned.setForeground(new java.awt.Color(204, 255, 255));
        jLabel_Alreadysigned.setText("Already a member? Login Here!");
        jLabel_Alreadysigned.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Alreadysigned.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AlreadysignedMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sign Up");

        jLabel10.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 255));
        jLabel10.setText("Your Phone's Name:");

        jTextField_myphone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_myphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_myphoneKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 255, 255));
        jLabel12.setText("Gender:");

        jComboBox_gender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_gender.setForeground(new java.awt.Color(0, 0, 102));
        jComboBox_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel13.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 255));
        jLabel13.setText("Your Rate for your Phone:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(3, 3, 3)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_uname)
                            .addComponent(jTextField_myphone)
                            .addComponent(jTextField_lname)
                            .addComponent(jTextField_fname)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jComboBox_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_rate))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField_email)
                            .addComponent(jPasswordField_pass)
                            .addComponent(jPasswordField_confirmpass, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(346, 417, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_Register)
                            .addComponent(jLabel_Alreadysigned))))
                .addGap(85, 85, 85))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_myphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField_rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jPasswordField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jPasswordField_confirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButton_Register)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Alreadysigned)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Design\\reg2.gif")); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Design\\reg.gif")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_AlreadysignedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AlreadysignedMouseClicked
        // TODO add your handling code here:
        Login log = new Login();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_AlreadysignedMouseClicked

    private void regdata(){
        String fname = jTextField_fname.getText();
        String lname = jTextField_lname.getText();
        String uname = jTextField_uname.getText();
        String myphone = jTextField_myphone.getText();
        String gender = String.valueOf(jComboBox_gender.getSelectedItem());
        
        String email = jTextField_email.getText();
        String pass = String.valueOf(jPasswordField_pass.getPassword());
        String confirmpass = String.valueOf(jPasswordField_confirmpass.getPassword());
        
        if(verifyFields())
        {
            if(!checkUsername(uname))
            {
                PreparedStatement ps;
                ResultSet rs;
                int rate = Integer.parseInt(jTextField_rate.getText());
                String registerUserQuery = "INSERT INTO `user_login`(`firstname`, `lastname`, `email`, `myphone`, `gender`,`rateofphone`, `username`, `password`, `usertype`) VALUES (?,?,?,?,?,?,?,?,?)";
                
                try {
                    ps = MyConnection.getConnection().prepareStatement(registerUserQuery);
                    ps.setString(1, fname);
                    ps.setString(2, lname);
                    ps.setString(3, email);
                    ps.setString(4, myphone);
                    ps.setString(5, gender);
                    ps.setInt(6, rate);
                    ps.setString(7, uname);
                    ps.setString(8, pass);
                    ps.setString(9, "User");
                    if(ps.executeUpdate()!=0){
                            JOptionPane.showMessageDialog(null, "Your Account has been created! Now you can login!");
                            SignIn si = new SignIn(uname,wtext);
                            si.setVisible(true);
                            si.pack();
                            si.setLocationRelativeTo(null);
                            this.dispose();
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Error! Check your information again!");
                        }    
                } catch (SQLException ex) {
                    Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
                }           
            }    
        }
        
    
    }
    
    private void jButton_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegisterActionPerformed
        // TODO add your handling code here:
               regdata();
    }//GEN-LAST:event_jButton_RegisterActionPerformed

    private void jPasswordField_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_passActionPerformed

    private void jPasswordField_confirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_confirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_confirmpassActionPerformed

    private void jTextField_fnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_fnameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jTextField_lname.requestFocus();
        }
    }//GEN-LAST:event_jTextField_fnameKeyPressed

    private void jTextField_lnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_lnameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jTextField_uname.requestFocus();
        }
    }//GEN-LAST:event_jTextField_lnameKeyPressed

    private void jTextField_unameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_unameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jTextField_myphone.requestFocus();
        }
    }//GEN-LAST:event_jTextField_unameKeyPressed

    private void jTextField_myphoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_myphoneKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jTextField_email.requestFocus();
        }
    }//GEN-LAST:event_jTextField_myphoneKeyPressed

    private void jPasswordField_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_passKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jPasswordField_confirmpass.requestFocus();
        }
    }//GEN-LAST:event_jPasswordField_passKeyPressed

    private void jTextField_emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_emailKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jPasswordField_pass.requestFocus();
        }
    }//GEN-LAST:event_jTextField_emailKeyPressed

    private void jPasswordField_confirmpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_confirmpassKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            regdata();
        }
    }//GEN-LAST:event_jPasswordField_confirmpassKeyPressed
    
    //Function to verify fields
    public boolean verifyFields()
    {
        String fname = jTextField_fname.getText();
        String lname = jTextField_lname.getText();
        String uname = jTextField_uname.getText();
        String myphone = jTextField_myphone.getText();
        String email = jTextField_email.getText();
        String rateS = jTextField_rate.getText();
        String pass = String.valueOf(jPasswordField_pass.getPassword());
        String confirmpass = String.valueOf(jPasswordField_confirmpass.getPassword());
        if(fname.trim().equals("") || lname.trim().equals("") || uname.trim().equals("") || myphone.trim().equals("") || email.trim().equals("") || pass.trim().equals("") || confirmpass.trim().equals("")||rateS.equals("")){
            JOptionPane.showMessageDialog(null, "One or More fields are empty. Please, fill up again", "Empty Fields", 2);
            return false;
        }
        //Two Password are equal or not
        else if(!pass.equals(confirmpass))
        {
            JOptionPane.showMessageDialog(null, "Password aren't matching", "Confirm Password", 2);
            return false;
        }   
        /*else if(rate>100){
            JOptionPane.showMessageDialog(null, "Rating Range= 0 to 100", "Error Rating Provided!", 2);
            return false;
        }*/
        else{
            int rate = Integer.parseInt(rateS);    
            if(rate>100 || rate<0){
                JOptionPane.showMessageDialog(null, "Rating Range= 0 to 100", "Error Rating Provided!", 2);
                return false;
            }
            else
                return true;                
        }
    }
    
    //User Name Already Existed of not
    public boolean checkUsername(String username)
    {
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        String query = "SELECT * FROM `user_login` WHERE `username` = ?";
        try {
            st = MyConnection.getConnection().prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                username_exist = true;
                JOptionPane.showMessageDialog(null, "This Username is already taken", "Username failed", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        return username_exist;  
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Register;
    private javax.swing.JComboBox<String> jComboBox_gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Alreadysigned;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField_confirmpass;
    private javax.swing.JPasswordField jPasswordField_pass;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_fname;
    private javax.swing.JTextField jTextField_lname;
    private javax.swing.JTextField jTextField_myphone;
    private javax.swing.JTextField jTextField_rate;
    private javax.swing.JTextField jTextField_uname;
    // End of variables declaration//GEN-END:variables
}
