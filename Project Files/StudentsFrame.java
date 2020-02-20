
import java.awt.Label;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


import javax.swing.table.DefaultTableModel;
public class StudentsFrame extends javax.swing.JFrame {

    private LoginFrame LoginPage;
    private UserNameKey User;
    private UserNameKeys Connect;
    private Student Student;
    private boolean b = false;
    public StudentsFrame(Student _Student,LoginFrame LoginPage,UserNameKey User,UserNameKeys Connect,String Type) {
        initComponents();
        this.jScrollPane1.setVisible(b);
        this.LoginPage=LoginPage;
        this.User=User;
        this.Connect=Connect;
        this.Student=_Student;
        this.MegamaNameLabel.setText(this.Student.GetMegama().GetName());
        this.MegamaIDLabel.setText("("+this.Student.GetMegama().GetId()+")");
        setTitle(Type);
        this.TypeLabel.setText(Type);
        this.PictureLabel.setIcon(new ImageIcon("images/"+Type+".png"));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("th_icon.png")));
        this.NameLabel.setText(this.Student.GetName());
        //////////////////
        
        DefaultTableModel table= (DefaultTableModel)(this.ProfessionTable.getModel());
        for (Profession pro : this.Student.GetMegama().GetProfessionList()) {            
            table.insertRow(0,new Object[]{pro.GetId(),pro.GetName(),pro.GetTeacher().GetName(),pro.GetStudentNum()});            
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
        jButton2 = new javax.swing.JButton();
        MegamaNameLabel = new javax.swing.JLabel();
        MegamaIDLabel = new javax.swing.JLabel();
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
                "ID", "Profession", "Teacher", "Students"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProfessionTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(ProfessionTable);
        if (ProfessionTable.getColumnModel().getColumnCount() > 0) {
            ProfessionTable.getColumnModel().getColumn(0).setResizable(false);
            ProfessionTable.getColumnModel().getColumn(1).setResizable(false);
            ProfessionTable.getColumnModel().getColumn(2).setResizable(false);
            ProfessionTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(170, 290, 680, 250);

        jButton2.setText("Show/Hide Table");
        jButton2.setToolTipText("Show The Professions Table");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(860, 290, 130, 20);

        MegamaNameLabel.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        MegamaNameLabel.setForeground(new java.awt.Color(255, 0, 0));
        MegamaNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MegamaNameLabel.setLabelFor(PictureLabel);
        MegamaNameLabel.setText("MegamaName");
        MegamaNameLabel.setToolTipText("Name Of The Trend You Are In");
        jPanel1.add(MegamaNameLabel);
        MegamaNameLabel.setBounds(210, 100, 500, 70);

        MegamaIDLabel.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        MegamaIDLabel.setForeground(new java.awt.Color(255, 0, 0));
        MegamaIDLabel.setText("MegamaID");
        MegamaIDLabel.setToolTipText("The ID Of The Trend You Are In");
        jPanel1.add(MegamaIDLabel);
        MegamaIDLabel.setBounds(750, 160, 230, 30);

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
        TypeLabel.setText("Type");
        TypeLabel.setToolTipText("This Is The Type Of College You Are In!");
        jPanel1.add(TypeLabel);
        TypeLabel.setBounds(30, 650, 580, 90);

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(this.b == false)
            this.jButton2.setToolTipText("Hide The Professions Table");
        else
            this.jButton2.setToolTipText("Show The Professions Table");
        this.b = this.b == true?false:true;
        this.jScrollPane1.setVisible(this.b);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MegamaIDLabel;
    private javax.swing.JLabel MegamaNameLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PictureLabel;
    private javax.swing.JTable ProfessionTable;
    private javax.swing.JLabel TypeLabel;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
