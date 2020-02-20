
import java.awt.Label;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


import javax.swing.table.DefaultTableModel;
public class TeacherFrame extends javax.swing.JFrame {

    private LoginFrame LoginPage;
    private UserNameKey User;
    private UserNameKeys Connect;
    private Teacher teacher;
    private boolean b = false;
    public TeacherFrame(Teacher teacher,LoginFrame LoginPage,UserNameKey User,UserNameKeys Connect,String Type) {
        initComponents();
        this.jScrollPane1.setVisible(b);
        this.jScrollPane2.setVisible(false);
        this.StudentTableCloseButton.setVisible(false);
        this.LoginPage=LoginPage;
        this.User=User;
        this.Connect=Connect;
        this.teacher=teacher;
        
        
        setTitle(Type);
        this.TypeLabel.setText(this.teacher.GetTeachesAt());
        this.PictureLabel.setIcon(new ImageIcon("images/"+Type+".png"));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("th_icon.png")));
        this.NameLabel.setText(this.teacher.GetName());
        //////////////////
        
        DefaultTableModel table= (DefaultTableModel)(this.ProfessionTable.getModel());
        for (Profession pro : this.teacher.GetProfessionsObject().GetProfessionList()) {            
            table.insertRow(0,new Object[]{pro.GetId(),pro.GetName(),pro.GetMegama().GetName(),pro.GetMegama().GetType(),pro.GetStudentNum()});            
        }
       this.ProfessionTable.setModel(table);
 
        setVisible(true);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        WelcomeLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProfessionTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        StudentTable = new javax.swing.JTable();
        StudentTableCloseButton = new javax.swing.JButton();
        ShowHideProfession = new javax.swing.JButton();
        MessegeLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        TypeLabel = new javax.swing.JLabel();
        PictureLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.white);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setName("StudentsFrame"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 768));
        jPanel1.setLayout(null);

        WelcomeLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        WelcomeLabel.setForeground(new java.awt.Color(102, 255, 0));
        WelcomeLabel.setText("Welcome ");
        jPanel1.add(WelcomeLabel);
        WelcomeLabel.setBounds(10, 0, 60, 30);

        NameLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(102, 255, 0));
        NameLabel.setText("Name");
        jPanel1.add(NameLabel);
        NameLabel.setBounds(70, 0, 160, 30);

        jScrollPane1.setBorder(null);

        ProfessionTable.setAutoCreateRowSorter(true);
        ProfessionTable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ProfessionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Profession", "Trend", "TrendLocation", "Students"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProfessionTable.setToolTipText("The Profession You Teach In");
        ProfessionTable.getTableHeader().setReorderingAllowed(false);
        ProfessionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfessionTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProfessionTable);
        if (ProfessionTable.getColumnModel().getColumnCount() > 0) {
            ProfessionTable.getColumnModel().getColumn(0).setResizable(false);
            ProfessionTable.getColumnModel().getColumn(1).setResizable(false);
            ProfessionTable.getColumnModel().getColumn(2).setResizable(false);
            ProfessionTable.getColumnModel().getColumn(3).setResizable(false);
            ProfessionTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(150, 220, 680, 250);

        jScrollPane2.setBorder(null);

        StudentTable.setAutoCreateRowSorter(true);
        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(StudentTable);
        if (StudentTable.getColumnModel().getColumnCount() > 0) {
            StudentTable.getColumnModel().getColumn(0).setResizable(false);
            StudentTable.getColumnModel().getColumn(1).setResizable(false);
            StudentTable.getColumnModel().getColumn(2).setResizable(false);
            StudentTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(150, 470, 680, 160);

        StudentTableCloseButton.setText("Close");
        StudentTableCloseButton.setToolTipText("Close Student Table");
        StudentTableCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentTableCloseButtonActionPerformed(evt);
            }
        });
        jPanel1.add(StudentTableCloseButton);
        StudentTableCloseButton.setBounds(860, 540, 130, 20);

        ShowHideProfession.setText("Show/Hide Table");
        ShowHideProfession.setToolTipText("Show The Professions Table");
        ShowHideProfession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowHideProfessionActionPerformed(evt);
            }
        });
        jPanel1.add(ShowHideProfession);
        ShowHideProfession.setBounds(860, 290, 130, 20);

        MessegeLabel.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        MessegeLabel.setForeground(new java.awt.Color(255, 0, 0));
        MessegeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MessegeLabel.setLabelFor(PictureLabel);
        MessegeLabel.setText("Welcome Teacher!");
        MessegeLabel.setToolTipText("");
        jPanel1.add(MessegeLabel);
        MessegeLabel.setBounds(250, 110, 500, 70);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Change Password", "Log out" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.setToolTipText("Options");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(820, 20, 160, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(120, 190, 770, 10);

        TypeLabel.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        TypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        TypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TypeLabel.setText("Type");
        TypeLabel.setToolTipText("Teaching At");
        jPanel1.add(TypeLabel);
        TypeLabel.setBounds(170, 670, 710, 90);

        PictureLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PictureLabel.setPreferredSize(new java.awt.Dimension(1024, 768));
        jPanel1.add(PictureLabel);
        PictureLabel.setBounds(0, 0, 1024, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ShowHideProfessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowHideProfessionActionPerformed
        
        if(this.b == false)
            this.ShowHideProfession.setToolTipText("Hide The Professions Table");
        else{
            this.ShowHideProfession.setToolTipText("Show The Professions Table");
            this.jScrollPane2.setVisible(false);
            this.StudentTableCloseButton.setVisible(false);
        }
        this.b = this.b == true?false:true;
        this.jScrollPane1.setVisible(this.b);
        
        
            
        
        
        
    }//GEN-LAST:event_ShowHideProfessionActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(this.jComboBox1.getSelectedIndex()==0)
        {
             new PasswordChangeForm(this.User,this.Connect);
        }
        else if(this.jComboBox1.getSelectedIndex()==1)
        {              
        if(new Dialog().AskDialog("Are you sure you want to log out?", "Attention")==0){
             dispose();
            this.LoginPage.ChangeVisible(); 
          }
        }
          
        this.jComboBox1.setSelectedIndex(-1);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void ProfessionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfessionTableMouseClicked
        
        DefaultTableModel table= (DefaultTableModel)(this.ProfessionTable.getRowSorter().getModel());
        Object valuename = table.getValueAt(this.ProfessionTable.convertRowIndexToModel(this.ProfessionTable.getSelectedRow()),1);
        Object valueid = table.getValueAt(this.ProfessionTable.convertRowIndexToModel(this.ProfessionTable.getSelectedRow()),0);
        if(this.ProfessionTable.getSelectedColumn()>-1)
        {
        
            if(new Dialog().AskDialog("do you Want to Show Student In "+valuename.toString()+" Profession", "Attention")==0)
            {
              DefaultTableModel table2 = (DefaultTableModel) this.StudentTable.getModel();
                 table2.setRowCount(0);
                this.StudentTable.setModel(table2); 
              DefaultTableModel tablestudent = (DefaultTableModel)(this.StudentTable.getModel()) ;
              
                for (Student stu : this.teacher.GetProfessionsObject().GetProfessionById(valueid.toString()).GetMegama().GetStudents()) {
                  tablestudent.insertRow(0,new Object[]{stu.GetId(),stu.GetName(),stu.GetPhone(),stu.GetAddress()});  
                }
    
                
                
                
            this.StudentTable.setModel(tablestudent);    
            this.jScrollPane2.setVisible(true);
            this.StudentTableCloseButton.setVisible(true);
            }
        }
        
        //this.ProfessionTable.getSelectedRow()
    }//GEN-LAST:event_ProfessionTableMouseClicked

    private void StudentTableCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentTableCloseButtonActionPerformed
        this.jScrollPane2.setVisible(false);
        this.StudentTableCloseButton.setVisible(false);
       
    }//GEN-LAST:event_StudentTableCloseButtonActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MessegeLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PictureLabel;
    private javax.swing.JTable ProfessionTable;
    private javax.swing.JButton ShowHideProfession;
    private javax.swing.JTable StudentTable;
    private javax.swing.JButton StudentTableCloseButton;
    private javax.swing.JLabel TypeLabel;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
