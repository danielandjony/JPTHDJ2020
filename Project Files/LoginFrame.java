
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class LoginFrame extends javax.swing.JFrame {
private  Megamot TechnologiMegamot;
private  Megamot  AcademicMegamot; 
private  Students AcademicStudents;
private  Students TechnologitStudents;
private  Teachers teachers;
private  UserNameKeys Connect;
private  LoginFrame log;
    public LoginFrame() {
//////////////////////////////////////////////////////////////////////////////////////////////
           this.TechnologiMegamot=new FileManeger().StartMegamot("TechnologiMegamot","Technologic");
           this.AcademicMegamot=new FileManeger().StartMegamot("AcademicMegamot","Academy");
           this.AcademicStudents=new FileManeger().StartStudents("AcademicStudents",AcademicMegamot);
           this.TechnologitStudents=new FileManeger().StartStudents("TechnologitStudents",TechnologiMegamot);    
           this.teachers=new FileManeger().StartTeachers("Teachers");       
           this.Connect=new FileManeger().StartUserNameKey("Connect");
           new FileManeger().StartProfessions("TechnologiMegamot", this.TechnologiMegamot, this.teachers);
           new FileManeger().StartProfessions("AcademicMegamot", this.AcademicMegamot, this.teachers);
//////////////////////////////////////////////////////////////////////////////////////////////
        initComponents();        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("th_icon.png")));
        
    }
    public void SetLog(LoginFrame l)
    {
        this.log=l;
    }
    /* לשם הנסיון בלבד*/
    public void ChangeVisible(){
        this.UserNameTextField.setText("");
        this.PasswordField.setText("");
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginArea = new javax.swing.JPanel();
        PasswordField = new javax.swing.JPasswordField();
        UserNameTextField = new javax.swing.JTextField();
        UserNameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        ShowPassCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(5, 5, 5));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setName("LoginFrame"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        LoginArea.setBackground(new java.awt.Color(51, 51, 51));
        LoginArea.setForeground(new java.awt.Color(255, 0, 0));
        LoginArea.setMinimumSize(new java.awt.Dimension(1024, 768));
        LoginArea.setLayout(null);

        PasswordField.setToolTipText("Enter Password");
        PasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordFieldKeyPressed(evt);
            }
        });
        LoginArea.add(PasswordField);
        PasswordField.setBounds(440, 190, 185, 21);

        UserNameTextField.setToolTipText("Enter UserName");
        UserNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UserNameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        UserNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserNameTextFieldKeyPressed(evt);
            }
        });
        LoginArea.add(UserNameTextField);
        UserNameTextField.setBounds(440, 160, 185, 21);

        UserNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UserNameLabel.setText("User Name");
        LoginArea.add(UserNameLabel);
        UserNameLabel.setBounds(350, 160, 90, 17);

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PasswordLabel.setText("Password");
        LoginArea.add(PasswordLabel);
        PasswordLabel.setBounds(350, 190, 80, 17);

        LoginButton.setText("Login");
        LoginButton.setToolTipText("Click To Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        LoginArea.add(LoginButton);
        LoginButton.setBounds(440, 220, 185, 20);

        ShowPassCheckBox.setToolTipText("Show Password");
        ShowPassCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassCheckBoxActionPerformed(evt);
            }
        });
        LoginArea.add(ShowPassCheckBox);
        ShowPassCheckBox.setBounds(630, 190, 21, 21);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/th icon.png"))); // NOI18N
        LoginArea.add(jLabel1);
        jLabel1.setBounds(410, 60, 230, 82);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/th_bg.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        LoginArea.add(jLabel2);
        jLabel2.setBounds(0, 0, 1024, 768);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LoginArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LoginArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFieldKeyPressed
        if(evt.getKeyCode()==10)
        {
            this.login();
        }
    }//GEN-LAST:event_PasswordFieldKeyPressed

    private void ShowPassCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassCheckBoxActionPerformed
        if(ShowPassCheckBox.isSelected())
        {
            PasswordField.setEchoChar((char)0);
            ShowPassCheckBox.setToolTipText("Hide Password");
        }else{
            PasswordField.setEchoChar('*');
            ShowPassCheckBox.setToolTipText("Show Password");
        }
    }//GEN-LAST:event_ShowPassCheckBoxActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        this.login();    
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void UserNameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserNameTextFieldKeyPressed
        if(evt.getKeyCode()==10)
        {
            this.login();
        }
    }//GEN-LAST:event_UserNameTextFieldKeyPressed
    private void login()
    {
       UserNameTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        PasswordField.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
        if(UserNameTextField.getText().length()==0)
        {
            UserNameTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            if(PasswordField.getText().length()==0)
        {
            PasswordField.setBorder(BorderFactory.createLineBorder(Color.RED));
        }
        }else if(PasswordField.getText().length()==0)
        {
            PasswordField.setBorder(BorderFactory.createLineBorder(Color.RED));
        }else{
            UserNameKey user=this.Connect.TryConnection(UserNameTextField.getText(), PasswordField.getText());
            if(user!=null)
            {
             switch(user.GetType())
             {
                 case "TechnologitStudents":                                            
                                            new StudentsFrame(this.TechnologitStudents.GetStudent(user.GetId()),this.log,user,this.Connect,"Technologit");
                                            setVisible(false);                                            
                                            break;
                 case    "AcademicStudents":new StudentsFrame(this.AcademicStudents.GetStudent(user.GetId()),this.log,user,this.Connect,"Academic");
                                            setVisible(false); 
                                            break;
                 case            "Teachers":                                            
                                            new TeacherFrame(this.teachers.GetTeacherById(user.GetId()),this.log,user,this.Connect,"Teacher");
                                            setVisible(false);
                                            break;
                 case               "Admin":new AdminFrame(this.teachers, this.TechnologiMegamot, this.AcademicMegamot, this.TechnologitStudents, this.AcademicStudents, this.log, user, this.Connect);
                                            setVisible(false);
                                            break;
             }             
            }      
        } 
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 LoginFrame log=new LoginFrame();
                 log.SetLog(log);
                 log.setVisible(true);
                  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginArea;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JCheckBox ShowPassCheckBox;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
