
public class PasswordChangeForm extends javax.swing.JFrame {
    private String password;
    private UserNameKeys connect;
    private UserNameKey User;
   
    public PasswordChangeForm() {
        this.setVisible(true);
        initComponents();
    }
public PasswordChangeForm(UserNameKey _User, UserNameKeys _connect) {
        this.connect = _connect;
        this.User = _User;
        this.password = User.GetPass();
        this.setVisible(true);
        
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CurrentPassField = new javax.swing.JPasswordField();
        NewPassField = new javax.swing.JPasswordField();
        ReNewPassField = new javax.swing.JPasswordField();
        EnterOldPasswordLabel = new javax.swing.JLabel();
        EnterNewPasswordLabel = new javax.swing.JLabel();
        ReEnterNewPasswordLabel = new javax.swing.JLabel();
        ChangePassTitle = new javax.swing.JLabel();
        ConfirmButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        CurrentPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrentPassFieldActionPerformed(evt);
            }
        });
        getContentPane().add(CurrentPassField);
        CurrentPassField.setBounds(290, 130, 130, 20);

        NewPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPassFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NewPassField);
        NewPassField.setBounds(290, 160, 130, 20);

        ReNewPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReNewPassFieldActionPerformed(evt);
            }
        });
        getContentPane().add(ReNewPassField);
        ReNewPassField.setBounds(290, 190, 130, 20);

        EnterOldPasswordLabel.setText("Enter Old Password");
        getContentPane().add(EnterOldPasswordLabel);
        EnterOldPasswordLabel.setBounds(150, 130, 120, 14);

        EnterNewPasswordLabel.setText("Enter New Password");
        getContentPane().add(EnterNewPasswordLabel);
        EnterNewPasswordLabel.setBounds(150, 160, 120, 14);

        ReEnterNewPasswordLabel.setText("Reenter New Password");
        getContentPane().add(ReEnterNewPasswordLabel);
        ReEnterNewPasswordLabel.setBounds(150, 190, 140, 14);

        ChangePassTitle.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        ChangePassTitle.setForeground(new java.awt.Color(255, 0, 0));
        ChangePassTitle.setText("Change Your Password");
        getContentPane().add(ChangePassTitle);
        ChangePassTitle.setBounds(70, 20, 580, 60);

        ConfirmButton.setText("Confirm");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmButton);
        ConfirmButton.setBounds(240, 240, 90, 23);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(80, 80, 530, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

 
    private void ChangePassword(){
        String OldPass = this.CurrentPassField.getText();
        String NewPass = this.NewPassField.getText();
        String ReNewPass = this.ReNewPassField.getText();
        boolean ok = true;
        
        if(OldPass.length() < 1 ||NewPass.length() < 1 ||ReNewPass.length() < 1)
        {
            new ErrorDialog("Empty Field!");
            ok = false;
        }else if(!OldPass.equals(this.User.GetPass()) && ok)
        {
            new ErrorDialog("Wrong Old Password!");
            ok = false;
        }
        else if(!NewPass.equals(ReNewPass)  && ok)
        {
            new ErrorDialog("New Password Fields Do Not Match!");
            ok = false;
        }
        else if(!OldPass.equals( password) && !NewPass.equals(ReNewPass)  && ok)
        {
            new ErrorDialog("New Password Fields Do Not Match! And Old Password Is Wrong!");
            ok = false;
        }
        if(ok)
        {            
            this.User.SetPass(NewPass);
            new Dialog("Password Changed Successfully!");
            new FileManeger().UpdateUserNameKeys("Connect", this.connect);
            dispose();
        }
        
        
    }
    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        this.ChangePassword();
        
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void CurrentPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrentPassFieldActionPerformed
        this.ChangePassword();
    }//GEN-LAST:event_CurrentPassFieldActionPerformed

    private void NewPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPassFieldActionPerformed
        this.ChangePassword();
    }//GEN-LAST:event_NewPassFieldActionPerformed

    private void ReNewPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReNewPassFieldActionPerformed
        this.ChangePassword();
    }//GEN-LAST:event_ReNewPassFieldActionPerformed

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChangePassTitle;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JPasswordField CurrentPassField;
    private javax.swing.JLabel EnterNewPasswordLabel;
    private javax.swing.JLabel EnterOldPasswordLabel;
    private javax.swing.JPasswordField NewPassField;
    private javax.swing.JLabel ReEnterNewPasswordLabel;
    private javax.swing.JPasswordField ReNewPassField;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
