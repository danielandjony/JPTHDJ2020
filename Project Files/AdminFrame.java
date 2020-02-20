
import java.awt.Label;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


import javax.swing.table.DefaultTableModel;
public class AdminFrame extends javax.swing.JFrame {

    private LoginFrame LoginPage;
    private UserNameKey User;
    private  Megamot TechnologiMegamot;
    private  Megamot  AcademicMegamot; 
    private  Students AcademicStudents;
    private  Students TechnologitStudents;
    private  Teachers teachers;
    private  UserNameKeys Connect;
    private int choice = 0;
    private int TeacherChoice=0;
    private int StudentChoice=0;
private  LoginFrame log;
    public AdminFrame(Teachers teachers,Megamot TechnologiMegamot,Megamot  AcademicMegamot,Students TechnologitStudents,Students AcademicStudents,LoginFrame LoginPage,UserNameKey User,UserNameKeys Connect) {
        initComponents();
        HideUnused();
        this.LoginPage=LoginPage;
        this.User=User;
        this.Connect=Connect;
        this.teachers=teachers;
        this.TechnologiMegamot=TechnologiMegamot;
        this.AcademicMegamot=AcademicMegamot;
        this.TechnologitStudents=TechnologitStudents;
        this.AcademicStudents=AcademicStudents;
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(5, 5, 5));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("th_icon.png")));

        setVisible(true);
        
    }
public void HideUnused()
{
    this.TrendsScrollPane.setVisible(false);
        this.TrendsScrollPane.setVisible(false);
        this.ProfessionScroll.setVisible(false);
        this.FilterAllButton.setVisible(false);
        this.FilterAcademyButton.setVisible(false);
        this.FilterTechnologicButton.setVisible(false);
        this.NameEnterLabel.setVisible(false);
        this.ActionNameLabel.setVisible(false);
        this.InfoField.setVisible(false);
        this.ApplyButton.setVisible(false);
        this.AcademySelectedRadioButton.setVisible(false);
        this.TechnoligSelectedRadioButton.setVisible(false);
        this.InfoSeparator.setVisible(false);
        this.TeacherIDLabel.setVisible(false);
        this.TrendIDLabel.setVisible(false);
        this.TeacherInfoField.setVisible(false);
        this.TredInfoField.setVisible(false);
        ToggleSearch();
        TeacherSearchHide(false);
        TeacherActionHide(false);
        TeacherProfessionsTableHide(false);
        TeacherTableHide(false);
        StudentSearchHide(false);
        StudentActionHide(false);
        StudentProfessionTableHide(false);
        StudentTableHide(false);
}
public void TeacherSearchHide(boolean toggle){
    this.TeacherSearchResultLabel.setVisible(toggle);
    this.TeacherVerticalSeperator.setVisible(toggle);
    this.TeacherSearchNameLabel.setVisible(toggle);
    this.TeacherNameSearchValue.setVisible(toggle);
    this.TeacherIDSearchLabel.setVisible(toggle);
    this.TeacherIDSearchValue.setVisible(toggle);
    this.TeacherPhoneSearchLabel.setVisible(toggle);
    this.TeacherPhoneSearchValue.setVisible(toggle);
    this.TeacherAddressSearchLabel.setVisible(toggle);
    this.TeacherAddressSearchValue.setVisible(toggle);
    this.TeachesAtSearchLabel.setVisible(toggle);
    this.TeachesAtSearchValue.setVisible(toggle);
}
public void StudentSearchHide(boolean toggle)
{
    this.StudentSearchResultLabel.setVisible(toggle);
    this.StudentVerticalSeperator.setVisible(toggle);
    this.StudentSearchNameLabel.setVisible(toggle);
    this.StudentNameSearchValue.setVisible(toggle);
    this.StudentIDSearchLabel.setVisible(toggle);
    this.StudentIDSearchValue.setVisible(toggle);
    this.StudentPhoneSearchLabel.setVisible(toggle);
    this.StudentPhoneSearchValue.setVisible(toggle);
    this.StudentAddressSearchLabel.setVisible(toggle);
    this.StudentAddressSearchValue.setVisible(toggle);
    this.StudentCollegeSearchLabel.setVisible(toggle);
    this.StudentCollegeSearchValue.setVisible(toggle);
    this.StudentTrendSearchLabel.setVisible(toggle);
    this.StudentTrendSearchValue.setVisible(toggle);
}
public void StudentActionHide(boolean toggle)
{
    this.StudentsActionNameLabel.setVisible(toggle);
    this.StudentHorizontalSeperator.setVisible(toggle);
    this.StudentNameLabel.setVisible(toggle);
    this.StudentNameField.setVisible(toggle);
    this.StudentApplyButton.setVisible(toggle);
    this.EnterStudentIDLabel.setVisible(toggle);
    this.StudentIDField.setVisible(toggle);
    this.StudentPhoneLabel.setVisible(toggle);
    this.StudentPhoneField.setVisible(toggle);
    this.StudentAddressLabel.setVisible(toggle);
    this.StudentAddressField.setVisible(toggle);
    this.StudentTrendLabel.setVisible(toggle);
    this.StudentTrendIDField.setVisible(toggle);
    this.StudentTrendLabel.setVisible(toggle);
    this.StudentYearHide(false);
}
private void StudentYearHide(boolean toggle){
    this.StudentYearLabel.setVisible(toggle);
    StudentYearA.setVisible(toggle);
    StudentYearB.setVisible(toggle);
    StudentYearC.setVisible(toggle);
    StudentYearD.setVisible(toggle);
}
public void TeacherActionHide(boolean toggle)
{
    this.TeacherActionNameLabel.setVisible(toggle);
    this.TeacherHorizontalSeperator.setVisible(toggle);
    this.TeacherNameLabel.setVisible(toggle);
    this.TeacherNameField.setVisible(toggle);
    this.TeacherApplyButton.setVisible(toggle);
    this.EnterTeachIDLabel.setVisible(toggle);
    this.TeacherIDField.setVisible(toggle);
    this.TeacherPhoneLabel.setVisible(toggle);
    this.TeacherPhoneField.setVisible(toggle);
    this.TeacherAddressLabel.setVisible(toggle);
    this.TeacherAddressField.setVisible(toggle);
    this.TeachesAtLabel.setVisible(toggle);
    this.TechRadioButton.setVisible(toggle);
    this.AcaRadioButton.setVisible(toggle);
    this.BothRadioButton.setVisible(toggle);
}
public void TeacherProfessionsTableHide(boolean toggle)
{
    this.TeacherProfessionsScrollPane.setVisible(toggle);
    this.CloseTeacherProfessionsTableButton.setVisible(toggle);
}
public void StudentProfessionTableHide(boolean toggle)
{
    this.ProfessionStudentAdminScrollPane.setVisible(toggle);
    this.CloseStudentProfessionsTableButton.setVisible(toggle);
}
public void TeacherTableHide(boolean toggle)
{
  this.AllTeachersScrollPane.setVisible(toggle);
  this.TeachersTableAllRadioButton.setVisible(toggle);
  this.TeachersTableAcaRadioButton.setVisible(toggle);
  this.TeachersTableTechRadioButton.setVisible(toggle);
}
public void StudentTableHide(boolean toggle)
{
  this.StudentsAdminScrollPane.setVisible(toggle);
  this.AllStudentsRadioButton.setVisible(toggle);
  this.TechnologicStudentsRadioButton.setVisible(toggle);
  this.AcademyStudentsRadioButton.setVisible(toggle);
}
public void TeacherRemoveHide(boolean toggle, String Label)
{
    this.TeacherActionNameLabel.setText(Label);
    this.TeacherActionNameLabel.setVisible(toggle);
    this.EnterTeachIDLabel.setVisible(toggle);
    this.TeacherIDField.setVisible(toggle);
    this.TeacherApplyButton.setVisible(toggle);
    this.TeacherHorizontalSeperator.setVisible(toggle);
    TeacherSearchHide(false);
}
public void TeachesAtHide(boolean toggle)
{
    this.TeachesAtLabel.setVisible(toggle);
    this.TechRadioButton.setVisible(toggle);
    this.AcaRadioButton.setVisible(toggle);
    this.BothRadioButton.setVisible(toggle);
}
    private void ToggleSearch(){       
        this.AnswerSeparator.setVisible(false);
        this.FirstLabel.setVisible(false);
        this.FirstLabelValue.setVisible(false);
        this.SecondLabel.setVisible(false);
        this.SecondLabelValue.setVisible(false);
        this.ThirdLabel.setVisible(false);
        this.ThirdLabelValue.setVisible(false);
        this.ForthLabel.setVisible(false);
        this.ForthLabelValue.setVisible(false);
        this.FifthLabel.setVisible(false);
        this.FifthLabelValue.setVisible(false);
        this.SearchResultLabel.setVisible(false);
    }
    private void ShowProfessionResults(String Id, String Name, String Teacher,String Trend,String StudentNumber,String _Id, String _Name, String _Type)
    {
        ShowTrendResults(Id, Name, Teacher, _Id, _Name, _Type);
        this.ForthLabel.setVisible(true);
        this.ForthLabelValue.setVisible(true);
         this.FifthLabel.setVisible(true);
        this.FifthLabelValue.setVisible(true);
        this.ForthLabelValue.setText(Trend);
        this.FifthLabelValue.setText(StudentNumber);
    }
    private void ShowTrendResults(String Id, String Name, String Type,String _Id, String _Name, String _Type){
        this.FirstLabelValue.setText(Id);
        this.SecondLabelValue.setText(Name);
        this.ThirdLabelValue.setText(Type);
        this.FirstLabel.setText(_Id);
        this.SecondLabel.setText(_Name);
        this.ThirdLabel.setText(_Type);
        this.FirstLabel.setVisible(true);
        this.SecondLabel.setVisible(true);
        this.ThirdLabel.setVisible(true);
        this.FirstLabelValue.setVisible(true);
        this.SecondLabelValue.setVisible(true);
        this.ThirdLabelValue.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FilterbuttonGroup = new javax.swing.ButtonGroup();
        CollegeSelectedButtonGroup = new javax.swing.ButtonGroup();
        TeacherCollegeTypeGroup = new javax.swing.ButtonGroup();
        TeachersTableButtonGroup = new javax.swing.ButtonGroup();
        StudentCollegeRadioButtons = new javax.swing.ButtonGroup();
        StudentYearRadioButtonGroup = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        TrendsPanel = new javax.swing.JPanel();
        TrendsScrollPane = new javax.swing.JScrollPane();
        TrendsTable = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        AddTrendButton = new javax.swing.JToggleButton();
        SearchTrendButton = new javax.swing.JToggleButton();
        RemoveTrendButton = new javax.swing.JToggleButton();
        ShowTrendsButton = new javax.swing.JToggleButton();
        FilterAllButton = new javax.swing.JRadioButton();
        FilterTechnologicButton = new javax.swing.JRadioButton();
        FilterAcademyButton = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        SearchProfessionsButtons = new javax.swing.JToggleButton();
        RemoveProfessionButton = new javax.swing.JToggleButton();
        AddProfessionButton = new javax.swing.JToggleButton();
        ShowProfessionsButton = new javax.swing.JToggleButton();
        jSeparator3 = new javax.swing.JSeparator();
        NameEnterLabel = new javax.swing.JLabel();
        TrendOptionsLabel = new javax.swing.JLabel();
        ProfessionScroll = new javax.swing.JScrollPane();
        ProfessionTable = new javax.swing.JTable();
        InfoField = new javax.swing.JTextField();
        ProfessionsOptionsLabel = new javax.swing.JLabel();
        ApplyButton = new javax.swing.JButton();
        ActionNameLabel = new javax.swing.JLabel();
        AcademySelectedRadioButton = new javax.swing.JRadioButton();
        TechnoligSelectedRadioButton = new javax.swing.JRadioButton();
        SearchResultLabel = new javax.swing.JLabel();
        InfoSeparator = new javax.swing.JSeparator();
        AnswerSeparator = new javax.swing.JSeparator();
        FifthLabel = new javax.swing.JLabel();
        FifthLabelValue = new javax.swing.JLabel();
        SecondLabel = new javax.swing.JLabel();
        ThirdLabel = new javax.swing.JLabel();
        ForthLabel = new javax.swing.JLabel();
        FirstLabel = new javax.swing.JLabel();
        FirstLabelValue = new javax.swing.JLabel();
        SecondLabelValue = new javax.swing.JLabel();
        ThirdLabelValue = new javax.swing.JLabel();
        ForthLabelValue = new javax.swing.JLabel();
        TrendIDLabel = new javax.swing.JLabel();
        TredInfoField = new javax.swing.JTextField();
        TeacherInfoField = new javax.swing.JTextField();
        TeacherIDLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        PictureLabel1 = new javax.swing.JLabel();
        TeachersPanel = new javax.swing.JPanel();
        ShowTeachersButton = new javax.swing.JToggleButton();
        AddTeacherButton = new javax.swing.JToggleButton();
        RemoveTeacherButton = new javax.swing.JToggleButton();
        SearchTeacherButton = new javax.swing.JToggleButton();
        TeacherOptionsLabel = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        TeacherCollegeOptionsButton = new javax.swing.JToggleButton();
        TeacherNameField = new javax.swing.JTextField();
        TeacherIDField = new javax.swing.JTextField();
        TeacherPhoneField = new javax.swing.JTextField();
        EnterTeachIDLabel = new javax.swing.JLabel();
        TeacherPhoneLabel = new javax.swing.JLabel();
        TeacherNameLabel = new javax.swing.JLabel();
        TeacherAddressField = new javax.swing.JTextField();
        TeachesAtLabel = new javax.swing.JLabel();
        AcaRadioButton = new javax.swing.JRadioButton();
        BothRadioButton = new javax.swing.JRadioButton();
        TechRadioButton = new javax.swing.JRadioButton();
        TeacherAddressLabel = new javax.swing.JLabel();
        TeacherApplyButton = new javax.swing.JButton();
        AllTeachersScrollPane = new javax.swing.JScrollPane();
        AllTeachersTable = new javax.swing.JTable();
        TeachersTableAcaRadioButton = new javax.swing.JRadioButton();
        TeachersTableAllRadioButton = new javax.swing.JRadioButton();
        TeachersTableTechRadioButton = new javax.swing.JRadioButton();
        TeacherProfessionsScrollPane = new javax.swing.JScrollPane();
        TeacherProfessionsTable = new javax.swing.JTable();
        CloseTeacherProfessionsTableButton = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        TeacherHorizontalSeperator = new javax.swing.JSeparator();
        TeacherActionNameLabel = new javax.swing.JLabel();
        TeacherVerticalSeperator = new javax.swing.JSeparator();
        TeacherSearchResultLabel = new javax.swing.JLabel();
        TeacherSearchNameLabel = new javax.swing.JLabel();
        TeacherIDSearchLabel = new javax.swing.JLabel();
        TeacherPhoneSearchLabel = new javax.swing.JLabel();
        TeacherAddressSearchLabel = new javax.swing.JLabel();
        TeachesAtSearchLabel = new javax.swing.JLabel();
        TeacherIDSearchValue = new javax.swing.JLabel();
        TeacherPhoneSearchValue = new javax.swing.JLabel();
        TeacherAddressSearchValue = new javax.swing.JLabel();
        TeachesAtSearchValue = new javax.swing.JLabel();
        TeacherNameSearchValue = new javax.swing.JLabel();
        TeacherChangeProfessionButton = new javax.swing.JToggleButton();
        PictureLabel3 = new javax.swing.JLabel();
        StudentsPanel = new javax.swing.JPanel();
        StudentsAdminScrollPane = new javax.swing.JScrollPane();
        StudentAdminTable = new javax.swing.JTable();
        ProfessionStudentAdminScrollPane = new javax.swing.JScrollPane();
        ProfessionStudentAdminTable = new javax.swing.JTable();
        AllStudentsRadioButton = new javax.swing.JRadioButton();
        AcademyStudentsRadioButton = new javax.swing.JRadioButton();
        TechnologicStudentsRadioButton = new javax.swing.JRadioButton();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        StudentTrendLabel = new javax.swing.JLabel();
        StudentAddressLabel = new javax.swing.JLabel();
        StudentPhoneLabel = new javax.swing.JLabel();
        StudentNameLabel = new javax.swing.JLabel();
        EnterStudentIDLabel = new javax.swing.JLabel();
        ShowStudentsButton = new javax.swing.JToggleButton();
        AddStudentsButton = new javax.swing.JToggleButton();
        RemoveStudentsButton = new javax.swing.JToggleButton();
        SearchStudentsButton = new javax.swing.JToggleButton();
        StudentsSetTrendButton = new javax.swing.JToggleButton();
        TeacherOptionsLabel1 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        StudentsActionNameLabel = new javax.swing.JLabel();
        StudentAddressField = new javax.swing.JTextField();
        StudentPhoneField = new javax.swing.JTextField();
        StudentNameField = new javax.swing.JTextField();
        StudentIDField = new javax.swing.JTextField();
        StudentApplyButton = new javax.swing.JButton();
        StudentVerticalSeperator = new javax.swing.JSeparator();
        StudentSearchResultLabel = new javax.swing.JLabel();
        StudentHorizontalSeperator = new javax.swing.JSeparator();
        StudentSearchNameLabel = new javax.swing.JLabel();
        StudentPhoneSearchValue = new javax.swing.JLabel();
        StudentNameSearchValue = new javax.swing.JLabel();
        StudentTrendSearchValue = new javax.swing.JLabel();
        StudentAddressSearchValue = new javax.swing.JLabel();
        StudentIDSearchValue = new javax.swing.JLabel();
        StudentIDSearchLabel = new javax.swing.JLabel();
        StudentPhoneSearchLabel = new javax.swing.JLabel();
        StudentAddressSearchLabel = new javax.swing.JLabel();
        StudentTrendSearchLabel = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        CloseStudentProfessionsTableButton = new javax.swing.JButton();
        StudentsCollegeYearButton = new javax.swing.JToggleButton();
        StudentCollegeSearchValue = new javax.swing.JLabel();
        StudentCollegeSearchLabel = new javax.swing.JLabel();
        StudentYearD = new javax.swing.JRadioButton();
        StudentYearA = new javax.swing.JRadioButton();
        StudentYearB = new javax.swing.JRadioButton();
        StudentYearC = new javax.swing.JRadioButton();
        StudentYearLabel = new javax.swing.JLabel();
        StudentTrendIDField = new javax.swing.JTextField();
        PictureLabel4 = new javax.swing.JLabel();
        PictureLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin WorkStation");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.white);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setName("StudentsFrame"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Change Password", "Log out" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.setToolTipText("Options");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(848, 0, 160, 30);

        jTabbedPane1.setFont(new java.awt.Font("Agency FB", 1, 21)); // NOI18N
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1024, 768));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1024, 768));

        TrendsPanel.setMinimumSize(new java.awt.Dimension(1024, 768));
        TrendsPanel.setLayout(null);

        TrendsScrollPane.setBorder(null);

        TrendsTable.setAutoCreateRowSorter(true);
        TrendsTable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TrendsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Trend", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TrendsTable.setToolTipText("The Profession You Teach In");
        TrendsTable.getTableHeader().setReorderingAllowed(false);
        TrendsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TrendsTableMouseClicked(evt);
            }
        });
        TrendsScrollPane.setViewportView(TrendsTable);
        if (TrendsTable.getColumnModel().getColumnCount() > 0) {
            TrendsTable.getColumnModel().getColumn(0).setResizable(false);
            TrendsTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            TrendsTable.getColumnModel().getColumn(1).setResizable(false);
            TrendsTable.getColumnModel().getColumn(2).setResizable(false);
        }

        TrendsPanel.add(TrendsScrollPane);
        TrendsScrollPane.setBounds(160, 30, 360, 370);
        TrendsPanel.add(jSeparator2);
        jSeparator2.setBounds(0, 400, 150, 10);

        AddTrendButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        AddTrendButton.setText("Add");
        AddTrendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTrendButtonActionPerformed(evt);
            }
        });
        TrendsPanel.add(AddTrendButton);
        AddTrendButton.setBounds(20, 80, 110, 33);

        SearchTrendButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        SearchTrendButton.setText("Search");
        SearchTrendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTrendButtonActionPerformed(evt);
            }
        });
        TrendsPanel.add(SearchTrendButton);
        SearchTrendButton.setBounds(20, 160, 110, 33);

        RemoveTrendButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        RemoveTrendButton.setText("Remove");
        RemoveTrendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveTrendButtonActionPerformed(evt);
            }
        });
        TrendsPanel.add(RemoveTrendButton);
        RemoveTrendButton.setBounds(20, 120, 110, 33);

        ShowTrendsButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        ShowTrendsButton.setText("Trends");
        ShowTrendsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowTrendsButtonActionPerformed(evt);
            }
        });
        TrendsPanel.add(ShowTrendsButton);
        ShowTrendsButton.setBounds(20, 40, 110, 33);

        FilterbuttonGroup.add(FilterAllButton);
        FilterAllButton.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        FilterAllButton.setSelected(true);
        FilterAllButton.setText("All");
        FilterAllButton.setToolTipText("Show All  trends");
        FilterAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterAllButtonActionPerformed(evt);
            }
        });
        TrendsPanel.add(FilterAllButton);
        FilterAllButton.setBounds(410, 0, 70, 28);

        FilterbuttonGroup.add(FilterTechnologicButton);
        FilterTechnologicButton.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        FilterTechnologicButton.setText("Technologic");
        FilterTechnologicButton.setToolTipText("Show Just Technologic Trends");
        FilterTechnologicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterTechnologicButtonActionPerformed(evt);
            }
        });
        TrendsPanel.add(FilterTechnologicButton);
        FilterTechnologicButton.setBounds(620, 0, 120, 28);

        FilterbuttonGroup.add(FilterAcademyButton);
        FilterAcademyButton.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        FilterAcademyButton.setText("Academy");
        FilterAcademyButton.setToolTipText("Show Just Academy Trends");
        FilterAcademyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterAcademyButtonActionPerformed(evt);
            }
        });
        TrendsPanel.add(FilterAcademyButton);
        FilterAcademyButton.setBounds(510, 0, 110, 28);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        TrendsPanel.add(jSeparator1);
        jSeparator1.setBounds(150, 0, 10, 400);

        SearchProfessionsButtons.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        SearchProfessionsButtons.setText("Search");
        SearchProfessionsButtons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchProfessionsButtonsActionPerformed(evt);
            }
        });
        TrendsPanel.add(SearchProfessionsButtons);
        SearchProfessionsButtons.setBounds(20, 360, 110, 33);

        RemoveProfessionButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        RemoveProfessionButton.setText("Remove");
        RemoveProfessionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveProfessionButtonActionPerformed(evt);
            }
        });
        TrendsPanel.add(RemoveProfessionButton);
        RemoveProfessionButton.setBounds(20, 320, 110, 33);

        AddProfessionButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        AddProfessionButton.setText("Add");
        AddProfessionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProfessionButtonActionPerformed(evt);
            }
        });
        TrendsPanel.add(AddProfessionButton);
        AddProfessionButton.setBounds(20, 280, 110, 33);

        ShowProfessionsButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        ShowProfessionsButton.setText("Professions");
        ShowProfessionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowProfessionsButtonActionPerformed(evt);
            }
        });
        TrendsPanel.add(ShowProfessionsButton);
        ShowProfessionsButton.setBounds(20, 240, 110, 33);
        TrendsPanel.add(jSeparator3);
        jSeparator3.setBounds(0, 200, 150, 10);

        NameEnterLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        NameEnterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameEnterLabel.setText("NameEnterLabel");
        TrendsPanel.add(NameEnterLabel);
        NameEnterLabel.setBounds(20, 490, 200, 24);

        TrendOptionsLabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        TrendOptionsLabel.setForeground(new java.awt.Color(255, 0, 0));
        TrendOptionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TrendOptionsLabel.setText("Trends Options");
        TrendsPanel.add(TrendOptionsLabel);
        TrendOptionsLabel.setBounds(0, 10, 140, 20);

        ProfessionScroll.setBorder(null);

        ProfessionTable.setAutoCreateRowSorter(true);
        ProfessionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Teacher", "Trend", "Students"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProfessionTable.getTableHeader().setReorderingAllowed(false);
        ProfessionScroll.setViewportView(ProfessionTable);
        if (ProfessionTable.getColumnModel().getColumnCount() > 0) {
            ProfessionTable.getColumnModel().getColumn(0).setResizable(false);
            ProfessionTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            ProfessionTable.getColumnModel().getColumn(1).setResizable(false);
            ProfessionTable.getColumnModel().getColumn(2).setResizable(false);
            ProfessionTable.getColumnModel().getColumn(3).setResizable(false);
            ProfessionTable.getColumnModel().getColumn(4).setResizable(false);
            ProfessionTable.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        TrendsPanel.add(ProfessionScroll);
        ProfessionScroll.setBounds(540, 30, 470, 370);

        InfoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InfoFieldKeyPressed(evt);
            }
        });
        TrendsPanel.add(InfoField);
        InfoField.setBounds(220, 490, 160, 30);

        ProfessionsOptionsLabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        ProfessionsOptionsLabel.setForeground(new java.awt.Color(255, 0, 0));
        ProfessionsOptionsLabel.setText("Professions Options");
        TrendsPanel.add(ProfessionsOptionsLabel);
        ProfessionsOptionsLabel.setBounds(20, 210, 130, 20);

        ApplyButton.setText("Apply");
        ApplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplyButtonActionPerformed(evt);
            }
        });
        TrendsPanel.add(ApplyButton);
        ApplyButton.setBounds(400, 490, 77, 32);

        ActionNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        ActionNameLabel.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        ActionNameLabel.setForeground(new java.awt.Color(255, 0, 0));
        ActionNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ActionNameLabel.setText("ActionLabel");
        TrendsPanel.add(ActionNameLabel);
        ActionNameLabel.setBounds(40, 420, 430, 40);

        CollegeSelectedButtonGroup.add(AcademySelectedRadioButton);
        AcademySelectedRadioButton.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        AcademySelectedRadioButton.setText("Academy");
        TrendsPanel.add(AcademySelectedRadioButton);
        AcademySelectedRadioButton.setBounds(400, 540, 110, 28);

        CollegeSelectedButtonGroup.add(TechnoligSelectedRadioButton);
        TechnoligSelectedRadioButton.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        TechnoligSelectedRadioButton.setText("Technologic");
        TrendsPanel.add(TechnoligSelectedRadioButton);
        TechnoligSelectedRadioButton.setBounds(400, 520, 110, 28);

        SearchResultLabel.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        SearchResultLabel.setForeground(new java.awt.Color(255, 0, 0));
        SearchResultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SearchResultLabel.setText("Search Result");
        TrendsPanel.add(SearchResultLabel);
        SearchResultLabel.setBounds(610, 410, 290, 60);
        TrendsPanel.add(InfoSeparator);
        InfoSeparator.setBounds(0, 468, 1030, 2);

        AnswerSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        TrendsPanel.add(AnswerSeparator);
        AnswerSeparator.setBounds(510, 470, 10, 250);

        FifthLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        FifthLabel.setForeground(new java.awt.Color(255, 0, 0));
        FifthLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FifthLabel.setText("Students:");
        TrendsPanel.add(FifthLabel);
        FifthLabel.setBounds(580, 630, 200, 24);

        FifthLabelValue.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        FifthLabelValue.setForeground(new java.awt.Color(255, 0, 0));
        FifthLabelValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FifthLabelValue.setText("Value");
        TrendsPanel.add(FifthLabelValue);
        FifthLabelValue.setBounds(760, 630, 200, 24);

        SecondLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        SecondLabel.setForeground(new java.awt.Color(255, 0, 0));
        SecondLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SecondLabel.setText("TrendIDLabel");
        TrendsPanel.add(SecondLabel);
        SecondLabel.setBounds(580, 510, 200, 24);

        ThirdLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ThirdLabel.setForeground(new java.awt.Color(255, 0, 0));
        ThirdLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ThirdLabel.setText("TrendTypeLabel");
        TrendsPanel.add(ThirdLabel);
        ThirdLabel.setBounds(580, 550, 200, 24);

        ForthLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ForthLabel.setForeground(new java.awt.Color(255, 0, 0));
        ForthLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ForthLabel.setText("Trend:");
        TrendsPanel.add(ForthLabel);
        ForthLabel.setBounds(580, 590, 200, 24);

        FirstLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        FirstLabel.setForeground(new java.awt.Color(255, 0, 0));
        FirstLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FirstLabel.setText("TrendNameLabel");
        TrendsPanel.add(FirstLabel);
        FirstLabel.setBounds(580, 470, 200, 24);

        FirstLabelValue.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        FirstLabelValue.setForeground(new java.awt.Color(255, 0, 0));
        FirstLabelValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FirstLabelValue.setText("Value");
        TrendsPanel.add(FirstLabelValue);
        FirstLabelValue.setBounds(760, 470, 200, 24);

        SecondLabelValue.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        SecondLabelValue.setForeground(new java.awt.Color(255, 0, 0));
        SecondLabelValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SecondLabelValue.setText("Value");
        TrendsPanel.add(SecondLabelValue);
        SecondLabelValue.setBounds(760, 510, 200, 24);

        ThirdLabelValue.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ThirdLabelValue.setForeground(new java.awt.Color(255, 0, 0));
        ThirdLabelValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ThirdLabelValue.setText("Value");
        TrendsPanel.add(ThirdLabelValue);
        ThirdLabelValue.setBounds(760, 550, 200, 24);

        ForthLabelValue.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ForthLabelValue.setForeground(new java.awt.Color(255, 0, 0));
        ForthLabelValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ForthLabelValue.setText("Value");
        TrendsPanel.add(ForthLabelValue);
        ForthLabelValue.setBounds(760, 590, 200, 24);

        TrendIDLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        TrendIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TrendIDLabel.setText("TrendID");
        TrendsPanel.add(TrendIDLabel);
        TrendIDLabel.setBounds(20, 530, 200, 24);

        TredInfoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TredInfoFieldKeyPressed(evt);
            }
        });
        TrendsPanel.add(TredInfoField);
        TredInfoField.setBounds(220, 530, 160, 30);

        TeacherInfoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TeacherInfoFieldKeyPressed(evt);
            }
        });
        TrendsPanel.add(TeacherInfoField);
        TeacherInfoField.setBounds(220, 570, 160, 30);

        TeacherIDLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        TeacherIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TeacherIDLabel.setText("TeacherID");
        TrendsPanel.add(TeacherIDLabel);
        TeacherIDLabel.setBounds(20, 570, 200, 24);
        TrendsPanel.add(jSeparator4);
        jSeparator4.setBounds(20, 30, 100, 10);
        TrendsPanel.add(jSeparator5);
        jSeparator5.setBounds(20, 230, 120, 10);

        PictureLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PictureLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin.png"))); // NOI18N
        TrendsPanel.add(PictureLabel1);
        PictureLabel1.setBounds(0, 0, 1024, 768);

        jTabbedPane1.addTab("Trends & Professions", TrendsPanel);

        TeachersPanel.setPreferredSize(new java.awt.Dimension(1024, 768));
        TeachersPanel.setLayout(null);

        ShowTeachersButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        ShowTeachersButton.setText("Teachers");
        ShowTeachersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowTeachersButtonActionPerformed(evt);
            }
        });
        TeachersPanel.add(ShowTeachersButton);
        ShowTeachersButton.setBounds(20, 40, 110, 33);

        AddTeacherButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        AddTeacherButton.setText("Add");
        AddTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTeacherButtonActionPerformed(evt);
            }
        });
        TeachersPanel.add(AddTeacherButton);
        AddTeacherButton.setBounds(20, 80, 110, 33);

        RemoveTeacherButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        RemoveTeacherButton.setText("Remove");
        RemoveTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveTeacherButtonActionPerformed(evt);
            }
        });
        TeachersPanel.add(RemoveTeacherButton);
        RemoveTeacherButton.setBounds(20, 120, 110, 33);

        SearchTeacherButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        SearchTeacherButton.setText("Search");
        SearchTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTeacherButtonActionPerformed(evt);
            }
        });
        TeachersPanel.add(SearchTeacherButton);
        SearchTeacherButton.setBounds(20, 160, 110, 33);

        TeacherOptionsLabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        TeacherOptionsLabel.setForeground(new java.awt.Color(255, 0, 0));
        TeacherOptionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TeacherOptionsLabel.setText("Teachers Options");
        TeachersPanel.add(TeacherOptionsLabel);
        TeacherOptionsLabel.setBounds(-10, 10, 140, 20);
        TeachersPanel.add(jSeparator6);
        jSeparator6.setBounds(10, 30, 100, 10);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        TeachersPanel.add(jSeparator7);
        jSeparator7.setBounds(150, 0, 10, 280);
        TeachersPanel.add(jSeparator8);
        jSeparator8.setBounds(0, 280, 150, 10);

        TeacherCollegeOptionsButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        TeacherCollegeOptionsButton.setText("College Options");
        TeacherCollegeOptionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeacherCollegeOptionsButtonActionPerformed(evt);
            }
        });
        TeachersPanel.add(TeacherCollegeOptionsButton);
        TeacherCollegeOptionsButton.setBounds(20, 200, 110, 33);

        TeacherNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TeacherNameFieldKeyPressed(evt);
            }
        });
        TeachersPanel.add(TeacherNameField);
        TeacherNameField.setBounds(320, 110, 160, 30);

        TeacherIDField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TeacherIDFieldKeyPressed(evt);
            }
        });
        TeachersPanel.add(TeacherIDField);
        TeacherIDField.setBounds(320, 70, 160, 30);

        TeacherPhoneField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TeacherPhoneFieldKeyPressed(evt);
            }
        });
        TeachersPanel.add(TeacherPhoneField);
        TeacherPhoneField.setBounds(320, 150, 160, 30);

        EnterTeachIDLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        EnterTeachIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EnterTeachIDLabel.setText("Teacher ID:");
        TeachersPanel.add(EnterTeachIDLabel);
        EnterTeachIDLabel.setBounds(160, 70, 200, 24);

        TeacherPhoneLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        TeacherPhoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TeacherPhoneLabel.setText("Phone Number:");
        TeachersPanel.add(TeacherPhoneLabel);
        TeacherPhoneLabel.setBounds(160, 150, 200, 24);

        TeacherNameLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        TeacherNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TeacherNameLabel.setText("Teacher Name:");
        TeachersPanel.add(TeacherNameLabel);
        TeacherNameLabel.setBounds(160, 110, 200, 24);

        TeacherAddressField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TeacherAddressFieldKeyPressed(evt);
            }
        });
        TeachersPanel.add(TeacherAddressField);
        TeacherAddressField.setBounds(320, 190, 160, 30);

        TeachesAtLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        TeachesAtLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TeachesAtLabel.setText("Teacher's WorkPlace:");
        TeachersPanel.add(TeachesAtLabel);
        TeachesAtLabel.setBounds(160, 230, 200, 24);

        TeacherCollegeTypeGroup.add(AcaRadioButton);
        AcaRadioButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AcaRadioButton.setText("Academy");
        TeachersPanel.add(AcaRadioButton);
        AcaRadioButton.setBounds(340, 260, 100, 23);

        TeacherCollegeTypeGroup.add(BothRadioButton);
        BothRadioButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BothRadioButton.setText("Both");
        TeachersPanel.add(BothRadioButton);
        BothRadioButton.setBounds(340, 290, 80, 23);

        TeacherCollegeTypeGroup.add(TechRadioButton);
        TechRadioButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TechRadioButton.setText("Technologic");
        TeachersPanel.add(TechRadioButton);
        TechRadioButton.setBounds(340, 230, 110, 28);

        TeacherAddressLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        TeacherAddressLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TeacherAddressLabel.setText("Address:");
        TeachersPanel.add(TeacherAddressLabel);
        TeacherAddressLabel.setBounds(160, 190, 200, 24);

        TeacherApplyButton.setText("Apply");
        TeacherApplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeacherApplyButtonActionPerformed(evt);
            }
        });
        TeachersPanel.add(TeacherApplyButton);
        TeacherApplyButton.setBounds(490, 70, 80, 30);

        AllTeachersTable.setAutoCreateRowSorter(true);
        AllTeachersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Address", "WorkPlace"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AllTeachersTable.getTableHeader().setReorderingAllowed(false);
        AllTeachersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllTeachersTableMouseClicked(evt);
            }
        });
        AllTeachersScrollPane.setViewportView(AllTeachersTable);
        if (AllTeachersTable.getColumnModel().getColumnCount() > 0) {
            AllTeachersTable.getColumnModel().getColumn(0).setResizable(false);
            AllTeachersTable.getColumnModel().getColumn(1).setResizable(false);
            AllTeachersTable.getColumnModel().getColumn(2).setResizable(false);
            AllTeachersTable.getColumnModel().getColumn(3).setResizable(false);
            AllTeachersTable.getColumnModel().getColumn(4).setResizable(false);
        }

        TeachersPanel.add(AllTeachersScrollPane);
        AllTeachersScrollPane.setBounds(10, 360, 550, 330);

        TeachersTableButtonGroup.add(TeachersTableAcaRadioButton);
        TeachersTableAcaRadioButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        TeachersTableAcaRadioButton.setText("Academy");
        TeachersTableAcaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeachersTableAcaRadioButtonActionPerformed(evt);
            }
        });
        TeachersPanel.add(TeachersTableAcaRadioButton);
        TeachersTableAcaRadioButton.setBounds(230, 340, 140, 20);

        TeachersTableButtonGroup.add(TeachersTableAllRadioButton);
        TeachersTableAllRadioButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        TeachersTableAllRadioButton.setSelected(true);
        TeachersTableAllRadioButton.setText("All");
        TeachersTableAllRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeachersTableAllRadioButtonActionPerformed(evt);
            }
        });
        TeachersPanel.add(TeachersTableAllRadioButton);
        TeachersTableAllRadioButton.setBounds(10, 340, 60, 20);

        TeachersTableButtonGroup.add(TeachersTableTechRadioButton);
        TeachersTableTechRadioButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        TeachersTableTechRadioButton.setText("Technology");
        TeachersTableTechRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeachersTableTechRadioButtonActionPerformed(evt);
            }
        });
        TeachersPanel.add(TeachersTableTechRadioButton);
        TeachersTableTechRadioButton.setBounds(110, 340, 110, 20);

        TeacherProfessionsTable.setAutoCreateRowSorter(true);
        TeacherProfessionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Teacher", "Trend", "Students"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TeacherProfessionsTable.getTableHeader().setReorderingAllowed(false);
        TeacherProfessionsScrollPane.setViewportView(TeacherProfessionsTable);
        if (TeacherProfessionsTable.getColumnModel().getColumnCount() > 0) {
            TeacherProfessionsTable.getColumnModel().getColumn(0).setResizable(false);
            TeacherProfessionsTable.getColumnModel().getColumn(0).setPreferredWidth(3);
            TeacherProfessionsTable.getColumnModel().getColumn(1).setResizable(false);
            TeacherProfessionsTable.getColumnModel().getColumn(2).setResizable(false);
            TeacherProfessionsTable.getColumnModel().getColumn(3).setResizable(false);
            TeacherProfessionsTable.getColumnModel().getColumn(4).setResizable(false);
        }

        TeachersPanel.add(TeacherProfessionsScrollPane);
        TeacherProfessionsScrollPane.setBounds(567, 360, 440, 330);

        CloseTeacherProfessionsTableButton.setForeground(new java.awt.Color(255, 0, 0));
        CloseTeacherProfessionsTableButton.setText("Close");
        CloseTeacherProfessionsTableButton.setToolTipText("Close Professions Table");
        CloseTeacherProfessionsTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseTeacherProfessionsTableButtonActionPerformed(evt);
            }
        });
        TeachersPanel.add(CloseTeacherProfessionsTableButton);
        CloseTeacherProfessionsTableButton.setBounds(936, 340, 70, 20);
        TeachersPanel.add(jSeparator9);
        jSeparator9.setBounds(0, 320, 1030, 10);
        TeachersPanel.add(TeacherHorizontalSeperator);
        TeacherHorizontalSeperator.setBounds(150, 60, 870, 2);

        TeacherActionNameLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        TeacherActionNameLabel.setForeground(new java.awt.Color(255, 0, 0));
        TeacherActionNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TeacherActionNameLabel.setText("ActionNameLabel");
        TeachersPanel.add(TeacherActionNameLabel);
        TeacherActionNameLabel.setBounds(150, 10, 430, 40);

        TeacherVerticalSeperator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        TeachersPanel.add(TeacherVerticalSeperator);
        TeacherVerticalSeperator.setBounds(580, 0, 20, 320);

        TeacherSearchResultLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        TeacherSearchResultLabel.setForeground(new java.awt.Color(255, 0, 0));
        TeacherSearchResultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TeacherSearchResultLabel.setText("Search Result");
        TeachersPanel.add(TeacherSearchResultLabel);
        TeacherSearchResultLabel.setBounds(660, 20, 280, 30);

        TeacherSearchNameLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        TeacherSearchNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TeacherSearchNameLabel.setText("TeacherName");
        TeachersPanel.add(TeacherSearchNameLabel);
        TeacherSearchNameLabel.setBounds(610, 80, 200, 24);

        TeacherIDSearchLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        TeacherIDSearchLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TeacherIDSearchLabel.setText("Teacher ID:");
        TeachersPanel.add(TeacherIDSearchLabel);
        TeacherIDSearchLabel.setBounds(610, 120, 200, 24);

        TeacherPhoneSearchLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        TeacherPhoneSearchLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TeacherPhoneSearchLabel.setText("Phone Number:");
        TeachersPanel.add(TeacherPhoneSearchLabel);
        TeacherPhoneSearchLabel.setBounds(610, 160, 200, 24);

        TeacherAddressSearchLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        TeacherAddressSearchLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TeacherAddressSearchLabel.setText("Address:");
        TeachersPanel.add(TeacherAddressSearchLabel);
        TeacherAddressSearchLabel.setBounds(610, 200, 200, 24);

        TeachesAtSearchLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        TeachesAtSearchLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TeachesAtSearchLabel.setText("Teacher's WorkPlace:");
        TeachersPanel.add(TeachesAtSearchLabel);
        TeachesAtSearchLabel.setBounds(610, 240, 200, 24);

        TeacherIDSearchValue.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        TeacherIDSearchValue.setForeground(new java.awt.Color(255, 0, 0));
        TeacherIDSearchValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TeacherIDSearchValue.setText("value");
        TeachersPanel.add(TeacherIDSearchValue);
        TeacherIDSearchValue.setBounds(800, 120, 200, 24);

        TeacherPhoneSearchValue.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        TeacherPhoneSearchValue.setForeground(new java.awt.Color(255, 0, 0));
        TeacherPhoneSearchValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TeacherPhoneSearchValue.setText("value");
        TeachersPanel.add(TeacherPhoneSearchValue);
        TeacherPhoneSearchValue.setBounds(800, 160, 200, 24);

        TeacherAddressSearchValue.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        TeacherAddressSearchValue.setForeground(new java.awt.Color(255, 0, 0));
        TeacherAddressSearchValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TeacherAddressSearchValue.setText("value");
        TeachersPanel.add(TeacherAddressSearchValue);
        TeacherAddressSearchValue.setBounds(800, 200, 200, 24);

        TeachesAtSearchValue.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        TeachesAtSearchValue.setForeground(new java.awt.Color(255, 0, 0));
        TeachesAtSearchValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TeachesAtSearchValue.setText("value");
        TeachersPanel.add(TeachesAtSearchValue);
        TeachesAtSearchValue.setBounds(800, 240, 200, 24);

        TeacherNameSearchValue.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        TeacherNameSearchValue.setForeground(new java.awt.Color(255, 0, 0));
        TeacherNameSearchValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TeacherNameSearchValue.setText("value");
        TeachersPanel.add(TeacherNameSearchValue);
        TeacherNameSearchValue.setBounds(800, 80, 200, 24);

        TeacherChangeProfessionButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        TeacherChangeProfessionButton.setText("Set Profession");
        TeacherChangeProfessionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeacherChangeProfessionButtonActionPerformed(evt);
            }
        });
        TeachersPanel.add(TeacherChangeProfessionButton);
        TeacherChangeProfessionButton.setBounds(20, 240, 110, 33);

        PictureLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PictureLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin.png"))); // NOI18N
        TeachersPanel.add(PictureLabel3);
        PictureLabel3.setBounds(0, 0, 1024, 768);

        jTabbedPane1.addTab("Teachers", TeachersPanel);

        StudentsPanel.setLayout(null);

        StudentsAdminScrollPane.setBorder(null);

        StudentAdminTable.setAutoCreateRowSorter(true);
        StudentAdminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Address", "Trend", "College", "Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentAdminTable.getTableHeader().setReorderingAllowed(false);
        StudentAdminTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentAdminTableMouseClicked(evt);
            }
        });
        StudentsAdminScrollPane.setViewportView(StudentAdminTable);
        if (StudentAdminTable.getColumnModel().getColumnCount() > 0) {
            StudentAdminTable.getColumnModel().getColumn(0).setResizable(false);
            StudentAdminTable.getColumnModel().getColumn(1).setResizable(false);
            StudentAdminTable.getColumnModel().getColumn(2).setResizable(false);
            StudentAdminTable.getColumnModel().getColumn(3).setResizable(false);
            StudentAdminTable.getColumnModel().getColumn(4).setResizable(false);
            StudentAdminTable.getColumnModel().getColumn(5).setResizable(false);
            StudentAdminTable.getColumnModel().getColumn(6).setResizable(false);
            StudentAdminTable.getColumnModel().getColumn(6).setPreferredWidth(30);
        }

        StudentsPanel.add(StudentsAdminScrollPane);
        StudentsAdminScrollPane.setBounds(20, 360, 530, 330);

        ProfessionStudentAdminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Teacher", "Trend", "Students"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProfessionStudentAdminTable.getTableHeader().setReorderingAllowed(false);
        ProfessionStudentAdminScrollPane.setViewportView(ProfessionStudentAdminTable);
        if (ProfessionStudentAdminTable.getColumnModel().getColumnCount() > 0) {
            ProfessionStudentAdminTable.getColumnModel().getColumn(0).setResizable(false);
            ProfessionStudentAdminTable.getColumnModel().getColumn(0).setPreferredWidth(4);
            ProfessionStudentAdminTable.getColumnModel().getColumn(1).setResizable(false);
            ProfessionStudentAdminTable.getColumnModel().getColumn(2).setResizable(false);
            ProfessionStudentAdminTable.getColumnModel().getColumn(3).setResizable(false);
            ProfessionStudentAdminTable.getColumnModel().getColumn(4).setResizable(false);
            ProfessionStudentAdminTable.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        StudentsPanel.add(ProfessionStudentAdminScrollPane);
        ProfessionStudentAdminScrollPane.setBounds(560, 360, 450, 330);

        StudentCollegeRadioButtons.add(AllStudentsRadioButton);
        AllStudentsRadioButton.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        AllStudentsRadioButton.setSelected(true);
        AllStudentsRadioButton.setText("All");
        AllStudentsRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllStudentsRadioButtonActionPerformed(evt);
            }
        });
        StudentsPanel.add(AllStudentsRadioButton);
        AllStudentsRadioButton.setBounds(40, 330, 80, 28);

        StudentCollegeRadioButtons.add(AcademyStudentsRadioButton);
        AcademyStudentsRadioButton.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        AcademyStudentsRadioButton.setText("Academy");
        AcademyStudentsRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcademyStudentsRadioButtonActionPerformed(evt);
            }
        });
        StudentsPanel.add(AcademyStudentsRadioButton);
        AcademyStudentsRadioButton.setBounds(130, 330, 110, 28);

        StudentCollegeRadioButtons.add(TechnologicStudentsRadioButton);
        TechnologicStudentsRadioButton.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        TechnologicStudentsRadioButton.setText("Technologic");
        TechnologicStudentsRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TechnologicStudentsRadioButtonActionPerformed(evt);
            }
        });
        StudentsPanel.add(TechnologicStudentsRadioButton);
        TechnologicStudentsRadioButton.setBounds(240, 330, 110, 28);
        StudentsPanel.add(jSeparator10);
        jSeparator10.setBounds(0, 280, 150, 10);

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        StudentsPanel.add(jSeparator11);
        jSeparator11.setBounds(150, 0, 10, 280);

        StudentTrendLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        StudentTrendLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StudentTrendLabel.setText("Trend ID:");
        StudentsPanel.add(StudentTrendLabel);
        StudentTrendLabel.setBounds(160, 70, 200, 24);

        StudentAddressLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        StudentAddressLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StudentAddressLabel.setText("Address:");
        StudentsPanel.add(StudentAddressLabel);
        StudentAddressLabel.setBounds(160, 230, 200, 24);

        StudentPhoneLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        StudentPhoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StudentPhoneLabel.setText("Phone Number:");
        StudentsPanel.add(StudentPhoneLabel);
        StudentPhoneLabel.setBounds(160, 190, 200, 24);

        StudentNameLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        StudentNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StudentNameLabel.setText("Student Name:");
        StudentsPanel.add(StudentNameLabel);
        StudentNameLabel.setBounds(160, 150, 200, 24);

        EnterStudentIDLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        EnterStudentIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EnterStudentIDLabel.setText("Student ID:");
        StudentsPanel.add(EnterStudentIDLabel);
        EnterStudentIDLabel.setBounds(160, 110, 200, 24);

        ShowStudentsButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        ShowStudentsButton.setText("Students");
        ShowStudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowStudentsButtonActionPerformed(evt);
            }
        });
        StudentsPanel.add(ShowStudentsButton);
        ShowStudentsButton.setBounds(20, 40, 110, 33);

        AddStudentsButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        AddStudentsButton.setText("Add");
        AddStudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentsButtonActionPerformed(evt);
            }
        });
        StudentsPanel.add(AddStudentsButton);
        AddStudentsButton.setBounds(20, 80, 110, 33);

        RemoveStudentsButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        RemoveStudentsButton.setText("Remove");
        RemoveStudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveStudentsButtonActionPerformed(evt);
            }
        });
        StudentsPanel.add(RemoveStudentsButton);
        RemoveStudentsButton.setBounds(20, 120, 110, 33);

        SearchStudentsButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        SearchStudentsButton.setText("Search");
        SearchStudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchStudentsButtonActionPerformed(evt);
            }
        });
        StudentsPanel.add(SearchStudentsButton);
        SearchStudentsButton.setBounds(20, 160, 110, 33);

        StudentsSetTrendButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        StudentsSetTrendButton.setText("Set Trend");
        StudentsSetTrendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentsSetTrendButtonActionPerformed(evt);
            }
        });
        StudentsPanel.add(StudentsSetTrendButton);
        StudentsSetTrendButton.setBounds(20, 200, 110, 33);

        TeacherOptionsLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        TeacherOptionsLabel1.setForeground(new java.awt.Color(255, 0, 0));
        TeacherOptionsLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TeacherOptionsLabel1.setText("Students Options");
        StudentsPanel.add(TeacherOptionsLabel1);
        TeacherOptionsLabel1.setBounds(-10, 10, 140, 20);
        StudentsPanel.add(jSeparator12);
        jSeparator12.setBounds(10, 30, 100, 10);

        StudentsActionNameLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        StudentsActionNameLabel.setForeground(new java.awt.Color(255, 0, 0));
        StudentsActionNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StudentsActionNameLabel.setText("ActionNameLabel");
        StudentsPanel.add(StudentsActionNameLabel);
        StudentsActionNameLabel.setBounds(150, 10, 430, 40);

        StudentAddressField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                StudentAddressFieldKeyPressed(evt);
            }
        });
        StudentsPanel.add(StudentAddressField);
        StudentAddressField.setBounds(320, 230, 160, 30);

        StudentPhoneField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                StudentPhoneFieldKeyPressed(evt);
            }
        });
        StudentsPanel.add(StudentPhoneField);
        StudentPhoneField.setBounds(320, 190, 160, 30);

        StudentNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                StudentNameFieldKeyPressed(evt);
            }
        });
        StudentsPanel.add(StudentNameField);
        StudentNameField.setBounds(320, 150, 160, 30);

        StudentIDField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                StudentIDFieldKeyPressed(evt);
            }
        });
        StudentsPanel.add(StudentIDField);
        StudentIDField.setBounds(320, 110, 160, 30);

        StudentApplyButton.setText("Apply");
        StudentApplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentApplyButtonActionPerformed(evt);
            }
        });
        StudentsPanel.add(StudentApplyButton);
        StudentApplyButton.setBounds(480, 280, 80, 20);

        StudentVerticalSeperator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        StudentsPanel.add(StudentVerticalSeperator);
        StudentVerticalSeperator.setBounds(580, 0, 20, 320);

        StudentSearchResultLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        StudentSearchResultLabel.setForeground(new java.awt.Color(255, 0, 0));
        StudentSearchResultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StudentSearchResultLabel.setText("Search Result");
        StudentsPanel.add(StudentSearchResultLabel);
        StudentSearchResultLabel.setBounds(660, 20, 280, 30);
        StudentsPanel.add(StudentHorizontalSeperator);
        StudentHorizontalSeperator.setBounds(150, 60, 870, 2);

        StudentSearchNameLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        StudentSearchNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StudentSearchNameLabel.setText("Student Name:");
        StudentsPanel.add(StudentSearchNameLabel);
        StudentSearchNameLabel.setBounds(610, 80, 200, 24);

        StudentPhoneSearchValue.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        StudentPhoneSearchValue.setForeground(new java.awt.Color(255, 0, 0));
        StudentPhoneSearchValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StudentPhoneSearchValue.setText("value");
        StudentsPanel.add(StudentPhoneSearchValue);
        StudentPhoneSearchValue.setBounds(800, 160, 200, 24);

        StudentNameSearchValue.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        StudentNameSearchValue.setForeground(new java.awt.Color(255, 0, 0));
        StudentNameSearchValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StudentNameSearchValue.setText("value");
        StudentsPanel.add(StudentNameSearchValue);
        StudentNameSearchValue.setBounds(800, 80, 200, 24);

        StudentTrendSearchValue.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        StudentTrendSearchValue.setForeground(new java.awt.Color(255, 0, 0));
        StudentTrendSearchValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StudentTrendSearchValue.setText("value");
        StudentsPanel.add(StudentTrendSearchValue);
        StudentTrendSearchValue.setBounds(800, 240, 200, 24);

        StudentAddressSearchValue.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        StudentAddressSearchValue.setForeground(new java.awt.Color(255, 0, 0));
        StudentAddressSearchValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StudentAddressSearchValue.setText("value");
        StudentsPanel.add(StudentAddressSearchValue);
        StudentAddressSearchValue.setBounds(800, 200, 200, 24);

        StudentIDSearchValue.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        StudentIDSearchValue.setForeground(new java.awt.Color(255, 0, 0));
        StudentIDSearchValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StudentIDSearchValue.setText("value");
        StudentsPanel.add(StudentIDSearchValue);
        StudentIDSearchValue.setBounds(800, 120, 200, 24);

        StudentIDSearchLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        StudentIDSearchLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StudentIDSearchLabel.setText("Student ID:");
        StudentsPanel.add(StudentIDSearchLabel);
        StudentIDSearchLabel.setBounds(610, 120, 200, 24);

        StudentPhoneSearchLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        StudentPhoneSearchLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StudentPhoneSearchLabel.setText("Phone Number:");
        StudentsPanel.add(StudentPhoneSearchLabel);
        StudentPhoneSearchLabel.setBounds(610, 160, 200, 24);

        StudentAddressSearchLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        StudentAddressSearchLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StudentAddressSearchLabel.setText("Address:");
        StudentsPanel.add(StudentAddressSearchLabel);
        StudentAddressSearchLabel.setBounds(610, 200, 200, 24);

        StudentTrendSearchLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        StudentTrendSearchLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StudentTrendSearchLabel.setText("Student's Trend:");
        StudentsPanel.add(StudentTrendSearchLabel);
        StudentTrendSearchLabel.setBounds(610, 240, 200, 24);
        StudentsPanel.add(jSeparator13);
        jSeparator13.setBounds(0, 320, 1030, 10);

        CloseStudentProfessionsTableButton.setForeground(new java.awt.Color(255, 0, 0));
        CloseStudentProfessionsTableButton.setText("Close");
        CloseStudentProfessionsTableButton.setToolTipText("Close Professions Table");
        CloseStudentProfessionsTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseStudentProfessionsTableButtonActionPerformed(evt);
            }
        });
        StudentsPanel.add(CloseStudentProfessionsTableButton);
        CloseStudentProfessionsTableButton.setBounds(938, 340, 70, 20);

        StudentsCollegeYearButton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        StudentsCollegeYearButton.setText("Set Year");
        StudentsCollegeYearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentsCollegeYearButtonActionPerformed(evt);
            }
        });
        StudentsPanel.add(StudentsCollegeYearButton);
        StudentsCollegeYearButton.setBounds(20, 240, 110, 33);

        StudentCollegeSearchValue.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        StudentCollegeSearchValue.setForeground(new java.awt.Color(255, 0, 0));
        StudentCollegeSearchValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StudentCollegeSearchValue.setText("value");
        StudentsPanel.add(StudentCollegeSearchValue);
        StudentCollegeSearchValue.setBounds(800, 280, 200, 24);

        StudentCollegeSearchLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        StudentCollegeSearchLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StudentCollegeSearchLabel.setText("Student's College:");
        StudentsPanel.add(StudentCollegeSearchLabel);
        StudentCollegeSearchLabel.setBounds(610, 280, 200, 24);

        StudentYearRadioButtonGroup.add(StudentYearD);
        StudentYearD.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        StudentYearD.setText("D");
        StudentYearD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                StudentYearDKeyPressed(evt);
            }
        });
        StudentsPanel.add(StudentYearD);
        StudentYearD.setBounds(490, 190, 80, 28);

        StudentYearRadioButtonGroup.add(StudentYearA);
        StudentYearA.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        StudentYearA.setText("A");
        StudentYearA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                StudentYearAKeyPressed(evt);
            }
        });
        StudentsPanel.add(StudentYearA);
        StudentYearA.setBounds(490, 100, 80, 28);

        StudentYearRadioButtonGroup.add(StudentYearB);
        StudentYearB.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        StudentYearB.setText("B");
        StudentYearB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                StudentYearBKeyPressed(evt);
            }
        });
        StudentsPanel.add(StudentYearB);
        StudentYearB.setBounds(490, 130, 80, 28);

        StudentYearRadioButtonGroup.add(StudentYearC);
        StudentYearC.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        StudentYearC.setText("C");
        StudentYearC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                StudentYearCKeyPressed(evt);
            }
        });
        StudentsPanel.add(StudentYearC);
        StudentYearC.setBounds(490, 160, 80, 28);

        StudentYearLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        StudentYearLabel.setText("Select Year");
        StudentsPanel.add(StudentYearLabel);
        StudentYearLabel.setBounds(490, 70, 90, 30);

        StudentTrendIDField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                StudentTrendIDFieldKeyPressed(evt);
            }
        });
        StudentsPanel.add(StudentTrendIDField);
        StudentTrendIDField.setBounds(320, 70, 160, 30);

        PictureLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PictureLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin.png"))); // NOI18N
        StudentsPanel.add(PictureLabel4);
        PictureLabel4.setBounds(0, 0, 1024, 768);

        jTabbedPane1.addTab("Students", StudentsPanel);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(-6, -2, 1030, 770);

        PictureLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin.png"))); // NOI18N
        getContentPane().add(PictureLabel);
        PictureLabel.setBounds(0, 0, 1024, 770);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void TeacherChangeProfessionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeacherChangeProfessionButtonActionPerformed
        this.TeacherChoice = 5;
        this.TeacherNameLabel.setText("Profession ID: ");
        this.RemoveTeacherButton.setSelected(false);
        this.AddTeacherButton.setSelected(false);
        this.SearchTeacherButton.setSelected(false);
        this.TeacherCollegeOptionsButton.setSelected(false);
        TeacherActionHide(false);
        TeacherRemoveHide(this.TeacherChangeProfessionButton.isSelected(),"Set Profession");
        this.TeacherNameLabel.setVisible(this.TeacherChangeProfessionButton.isSelected());
        this.TeacherNameField.setVisible(this.TeacherChangeProfessionButton.isSelected());
    }//GEN-LAST:event_TeacherChangeProfessionButtonActionPerformed

    private void CloseTeacherProfessionsTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseTeacherProfessionsTableButtonActionPerformed
        TeacherProfessionsTableHide(false);
    }//GEN-LAST:event_CloseTeacherProfessionsTableButtonActionPerformed

    private void TeachersTableTechRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeachersTableTechRadioButtonActionPerformed
        UpdateTeachersTable();
    }//GEN-LAST:event_TeachersTableTechRadioButtonActionPerformed

    private void TeachersTableAllRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeachersTableAllRadioButtonActionPerformed
        UpdateTeachersTable();
    }//GEN-LAST:event_TeachersTableAllRadioButtonActionPerformed

    private void TeachersTableAcaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeachersTableAcaRadioButtonActionPerformed
        UpdateTeachersTable();
    }//GEN-LAST:event_TeachersTableAcaRadioButtonActionPerformed

    private void AllTeachersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllTeachersTableMouseClicked
        DefaultTableModel table= (DefaultTableModel)(this.AllTeachersTable.getRowSorter().getModel());
        Object valuename = table.getValueAt(this.AllTeachersTable.convertRowIndexToModel(this.AllTeachersTable.getSelectedRow()),1);
        Object valueid = table.getValueAt(this.AllTeachersTable.convertRowIndexToModel(this.AllTeachersTable.getSelectedRow()),0);
        if(this.AllTeachersTable.getSelectedColumn()>-1)
        {

            if(new Dialog().AskDialog("Would You Like To See "+valuename.toString()+"'s Professions?", "Attention")==0)
            {
                DefaultTableModel table2 = (DefaultTableModel) this.TeacherProfessionsTable.getModel();
                table2.setRowCount(0);
                this.TeacherProfessionsTable.setModel(table2);
                DefaultTableModel table3 = (DefaultTableModel)(this.TeacherProfessionsTable.getModel()) ;

                for (Profession pro : this.teachers.GetTeacherById(valueid.toString()).GetProfessionsObject().GetProfessionList()) {
                    table3.insertRow(0,new Object[]{pro.GetId(),pro.GetName(),pro.GetTeacher().GetName(),pro.GetMegama().GetName(),pro.GetStudentNum()});
                }

                this.TeacherProfessionsTable.setModel(table3);
                TeacherProfessionsTableHide(true);
            }
        }
    }//GEN-LAST:event_AllTeachersTableMouseClicked

    private void TeacherApplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeacherApplyButtonActionPerformed
        TeacherApply();
    }//GEN-LAST:event_TeacherApplyButtonActionPerformed

    private void TeacherAddressFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TeacherAddressFieldKeyPressed
        if(evt.getKeyCode()==10)
        {
            TeacherApply();
        }
    }//GEN-LAST:event_TeacherAddressFieldKeyPressed

    private void TeacherPhoneFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TeacherPhoneFieldKeyPressed
        if(evt.getKeyCode()==10)
        {
            TeacherApply();
        }
    }//GEN-LAST:event_TeacherPhoneFieldKeyPressed

    private void TeacherIDFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TeacherIDFieldKeyPressed
        if(evt.getKeyCode()==10)
        {
            TeacherApply();
        }
    }//GEN-LAST:event_TeacherIDFieldKeyPressed

    private void TeacherNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TeacherNameFieldKeyPressed
        if(evt.getKeyCode()==10)
        {
            TeacherApply();
        }
    }//GEN-LAST:event_TeacherNameFieldKeyPressed

    private void TeacherCollegeOptionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeacherCollegeOptionsButtonActionPerformed
        TeacherActionHide(false);
        TeachesAtHide(this.TeacherCollegeOptionsButton.isSelected());
        TeacherRemoveHide(this.TeacherCollegeOptionsButton.isSelected(), "Change Teacher's College");
        this.RemoveTeacherButton.setSelected(false);
        this.AddTeacherButton.setSelected(false);
        this.SearchTeacherButton.setSelected(false);
        this.TeacherChangeProfessionButton.setSelected(false);
        this.TeacherChoice=4;
    }//GEN-LAST:event_TeacherCollegeOptionsButtonActionPerformed

    private void SearchTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTeacherButtonActionPerformed
        TeacherActionHide(false);
        TeacherRemoveHide(this.SearchTeacherButton.isSelected(), "Search For A Teacher");
        this.RemoveTeacherButton.setSelected(false);
        this.AddTeacherButton.setSelected(false);
        this.TeacherCollegeOptionsButton.setSelected(false);
        this.TeacherChangeProfessionButton.setSelected(false);
        this.TeacherChoice=3;
    }//GEN-LAST:event_SearchTeacherButtonActionPerformed

    private void RemoveTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveTeacherButtonActionPerformed
        TeacherActionHide(false);
        TeacherRemoveHide(this.RemoveTeacherButton.isSelected(),"Remove Teacher");
        this.AddTeacherButton.setSelected(false);
        this.SearchTeacherButton.setSelected(false);
        this.TeacherCollegeOptionsButton.setSelected(false);
        this.TeacherChangeProfessionButton.setSelected(false);
        this.TeacherChoice=2;
    }//GEN-LAST:event_RemoveTeacherButtonActionPerformed

    private void AddTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTeacherButtonActionPerformed
        TeacherSearchHide(false);
        this.TeacherNameLabel.setText("Teacher Name: ");
        this.RemoveTeacherButton.setSelected(false);
        this.SearchTeacherButton.setSelected(false);
        this.TeacherCollegeOptionsButton.setSelected(false);
        this.TeacherChangeProfessionButton.setSelected(false);
        this.TeacherActionNameLabel.setText("Add Teacher");
        TeacherActionHide(this.AddTeacherButton.isSelected());
        this.TeacherChoice=1;
    }//GEN-LAST:event_AddTeacherButtonActionPerformed

    private void ShowTeachersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowTeachersButtonActionPerformed
        TeacherTableHide(this.ShowTeachersButton.isSelected());
        UpdateTeachersTable();
        TeacherProfessionsTableHide(this.ShowTeachersButton.isSelected() && this.TeacherProfessionsScrollPane.isVisible());
    }//GEN-LAST:event_ShowTeachersButtonActionPerformed

    private void TeacherInfoFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TeacherInfoFieldKeyPressed
        if(evt.getKeyCode()==10)
        {
            Apply();
        }
    }//GEN-LAST:event_TeacherInfoFieldKeyPressed

    private void TredInfoFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TredInfoFieldKeyPressed
        if(evt.getKeyCode()==10)
        {
            Apply();
        }
    }//GEN-LAST:event_TredInfoFieldKeyPressed

    private void ApplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplyButtonActionPerformed
        Apply();
    }//GEN-LAST:event_ApplyButtonActionPerformed

    private void InfoFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InfoFieldKeyPressed
        if(evt.getKeyCode()==10)
        {
            Apply();
        }
    }//GEN-LAST:event_InfoFieldKeyPressed

    private void ShowProfessionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowProfessionsButtonActionPerformed
        if(this.ShowProfessionsButton.isSelected())
        {
            this.FilterAllButton.setVisible(true);
            this.FilterAcademyButton.setVisible(true);
            this.FilterTechnologicButton.setVisible(true);
            UpdateProfessionTable();
            this.ProfessionScroll.setVisible(true);
        }
        else{

            if(!this.ShowTrendsButton.isSelected())
            {
                this.FilterAllButton.setVisible(false);
                this.FilterAcademyButton.setVisible(false);
                this.FilterTechnologicButton.setVisible(false);
            }
            this.ProfessionScroll.setVisible(false);
        }

    }//GEN-LAST:event_ShowProfessionsButtonActionPerformed

    private void AddProfessionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProfessionButtonActionPerformed
        ToggleSearch();
        this.choice = 4;
        GetInfo("Enter Profession Name","Add A New Profession", this.AddProfessionButton.isSelected());
        this.RemoveTrendButton.setSelected(false);
        this.AddTrendButton.setSelected(false);
        this.SearchTrendButton.setSelected(false);
        this.RemoveProfessionButton.setSelected(false);
        this.SearchProfessionsButtons.setSelected(false);
        CollegeSelectedVisible(false);
        AddProfessionObjects(this.AddProfessionButton.isSelected());
    }//GEN-LAST:event_AddProfessionButtonActionPerformed

    private void RemoveProfessionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveProfessionButtonActionPerformed
        this.choice = 5;
        ToggleSearch();
        GetInfo("Enter Profession ID","Remove A Profession", this.RemoveProfessionButton.isSelected());
        this.RemoveTrendButton.setSelected(false);
        this.AddTrendButton.setSelected(false);
        this.AddProfessionButton.setSelected(false);
        this.SearchTrendButton.setSelected(false);
        this.SearchProfessionsButtons.setSelected(false);
        CollegeSelectedVisible(false);
    }//GEN-LAST:event_RemoveProfessionButtonActionPerformed

    private void SearchProfessionsButtonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchProfessionsButtonsActionPerformed
        ToggleSearch();
        this.choice = 6;
        GetInfo("Enter Profession ID","Search For A Profession", this.SearchProfessionsButtons.isSelected());
        this.RemoveTrendButton.setSelected(false);
        this.AddTrendButton.setSelected(false);
        this.AddProfessionButton.setSelected(false);
        this.RemoveProfessionButton.setSelected(false);
        this.SearchTrendButton.setSelected(false);
        CollegeSelectedVisible(false);
    }//GEN-LAST:event_SearchProfessionsButtonsActionPerformed

    private void FilterAcademyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterAcademyButtonActionPerformed
        if(this.ShowTrendsButton.isSelected())
        UpdateTrendsTable();
        if(this.ShowProfessionsButton.isSelected())
        UpdateProfessionTable();

    }//GEN-LAST:event_FilterAcademyButtonActionPerformed

    private void FilterTechnologicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterTechnologicButtonActionPerformed
        if(this.ShowTrendsButton.isSelected())
        UpdateTrendsTable();
        if(this.ShowProfessionsButton.isSelected())
        UpdateProfessionTable();
    }//GEN-LAST:event_FilterTechnologicButtonActionPerformed

    private void FilterAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterAllButtonActionPerformed
        if(this.ShowTrendsButton.isSelected())
        UpdateTrendsTable();
        if(this.ShowProfessionsButton.isSelected())
        UpdateProfessionTable();
    }//GEN-LAST:event_FilterAllButtonActionPerformed

    private void ShowTrendsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowTrendsButtonActionPerformed
        if(this.ShowTrendsButton.isSelected())
        {
            UpdateTrendsTable();
            this.FilterAllButton.setVisible(true);
            this.FilterAcademyButton.setVisible(true);
            this.FilterTechnologicButton.setVisible(true);
            this.TrendsScrollPane.setVisible(true);
        }else{
            this.TrendsScrollPane.setVisible(false);
            if(!this.ShowProfessionsButton.isSelected())
            {
                this.FilterAllButton.setVisible(false);
                this.FilterAcademyButton.setVisible(false);
                this.FilterTechnologicButton.setVisible(false);
            }
        }
    }//GEN-LAST:event_ShowTrendsButtonActionPerformed

    private void RemoveTrendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveTrendButtonActionPerformed
        ToggleSearch();
        this.choice = 2;
        GetInfo("Enter Trend ID","Remove A Trend", this.RemoveTrendButton.isSelected());
        this.AddTrendButton.setSelected(false);
        this.SearchTrendButton.setSelected(false);
        this.AddProfessionButton.setSelected(false);
        this.RemoveProfessionButton.setSelected(false);
        this.SearchProfessionsButtons.setSelected(false);
        CollegeSelectedVisible(false);
    }//GEN-LAST:event_RemoveTrendButtonActionPerformed

    private void SearchTrendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTrendButtonActionPerformed
        ToggleSearch();
        this.choice = 3;
        GetInfo("Enter Trend Name","Search For A Trend", this.SearchTrendButton.isSelected());
        this.RemoveTrendButton.setSelected(false);
        this.AddTrendButton.setSelected(false);
        this.AddProfessionButton.setSelected(false);
        this.RemoveProfessionButton.setSelected(false);
        this.SearchProfessionsButtons.setSelected(false);
        CollegeSelectedVisible(false);
    }//GEN-LAST:event_SearchTrendButtonActionPerformed

    private void AddTrendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTrendButtonActionPerformed
        this.choice = 1;
        ToggleSearch();
        GetInfo("Enter Trend Name","Add A New Trend", this.AddTrendButton.isSelected());
        this.RemoveTrendButton.setSelected(false);
        this.SearchTrendButton.setSelected(false);
        this.AddProfessionButton.setSelected(false);
        this.RemoveProfessionButton.setSelected(false);
        this.SearchProfessionsButtons.setSelected(false);
        CollegeSelectedVisible(this.AddTrendButton.isSelected());
    }//GEN-LAST:event_AddTrendButtonActionPerformed

    private void TrendsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrendsTableMouseClicked

        DefaultTableModel table= (DefaultTableModel)(this.TrendsTable.getRowSorter().getModel());
        Object valuename = table.getValueAt(this.TrendsTable.convertRowIndexToModel(this.TrendsTable.getSelectedRow()),1);
        Object valueid = table.getValueAt(this.TrendsTable.convertRowIndexToModel(this.TrendsTable.getSelectedRow()),0);
        Object valueType=table.getValueAt(this.TrendsTable.convertRowIndexToModel(this.TrendsTable.getSelectedRow()),2);
        if(this.TrendsTable.getSelectedColumn()>-1)
        {

            if(new Dialog().AskDialog("Do You Want to See "+valuename.toString()+"\'s Professions?", "Attention")==0)
            {
                DefaultTableModel table2 = (DefaultTableModel) this.ProfessionTable.getModel();
                table2.setRowCount(0);
                this.ProfessionTable.setModel(table2);
                DefaultTableModel tableProfession = (DefaultTableModel)(this.ProfessionTable.getModel()) ;

                if(valueType.toString().equals("Technologic")){
                    for (Profession pro :this.TechnologiMegamot.GetMegamaToFile(valueid.toString()).GetProfessionList() ) {
                        tableProfession.insertRow(0,new Object[]{pro.GetId(),pro.GetName(),pro.GetTeacher().GetName(),valuename.toString(),String.valueOf(pro.GetStudentNum())});
                    }
                }else{
                    for (Profession pro :this.AcademicMegamot.GetMegamaToFile(valueid.toString()).GetProfessionList() ) {
                        tableProfession.insertRow(0,new Object[]{pro.GetId(),pro.GetName(),pro.GetTeacher().GetName(),valuename.toString(),String.valueOf(pro.GetStudentNum())});

                    }
                }
                this.ProfessionTable.setModel(tableProfession);

                this.ProfessionScroll.setVisible(true);
                this.ShowProfessionsButton.setSelected(true);
            }
        }
    }//GEN-LAST:event_TrendsTableMouseClicked

    private void ShowStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowStudentsButtonActionPerformed
         StudentTableHide(this.ShowStudentsButton.isSelected());
        UpdateStudentsTable();
        
    }//GEN-LAST:event_ShowStudentsButtonActionPerformed
private void SetActionStudent(String NameLabel,boolean toggle)
{
    this.StudentsActionNameLabel.setText(NameLabel);
    this.StudentsActionNameLabel.setVisible(toggle);
    this.StudentHorizontalSeperator.setVisible(toggle);
    this.EnterStudentIDLabel.setVisible(toggle);
    this.StudentIDField.setVisible(toggle);
    this.StudentApplyButton.setVisible(toggle);
}
private void StudentButton(int ind)
{
    switch(ind){
        case 1:
               this.AddStudentsButton.setSelected(this.AddStudentsButton.isSelected());
               this.RemoveStudentsButton.setSelected(false);
               this.SearchStudentsButton.setSelected(false);
               this.StudentsSetTrendButton.setSelected(false);
               this.StudentsCollegeYearButton.setSelected(false);
               this.StudentChoice=1;
               StudentSearchHide(false);
               StudentActionHide(this.AddStudentsButton.isSelected());
               this.StudentsActionNameLabel.setText("Add Student");
               break;
        case 2:
               this.AddStudentsButton.setSelected(false);
               this.RemoveStudentsButton.setSelected(this.RemoveStudentsButton.isSelected());
               this.SearchStudentsButton.setSelected(false);
               this.StudentsSetTrendButton.setSelected(false);
               this.StudentsCollegeYearButton.setSelected(false);
               this.StudentChoice=2;
               StudentSearchHide(false);
               StudentActionHide(false);
               SetActionStudent("Remove Student",this.RemoveStudentsButton.isSelected());
               break;
        case 3:
               this.AddStudentsButton.setSelected(false);
               this.RemoveStudentsButton.setSelected(false);
               this.SearchStudentsButton.setSelected(this.SearchStudentsButton.isSelected());
               this.StudentsSetTrendButton.setSelected(false);
               this.StudentsCollegeYearButton.setSelected(false);
               this.StudentChoice=3;               
               StudentSearchHide(false);
               StudentActionHide(false);
               SetActionStudent("Search For A Student",this.SearchStudentsButton.isSelected());
               break;
        case 4:
               this.AddStudentsButton.setSelected(false);
               this.RemoveStudentsButton.setSelected(false);
               this.SearchStudentsButton.setSelected(false);
               this.StudentsSetTrendButton.setSelected(this.StudentsSetTrendButton.isSelected());
               this.StudentsCollegeYearButton.setSelected(false);
               this.StudentChoice=4;
               StudentSearchHide(false);
               StudentActionHide(false);
               this.StudentTrendLabel.setVisible(true);
               this.StudentTrendIDField.setVisible(true);
               SetActionStudent("Set Student College",this.StudentsSetTrendButton.isSelected());
               break;
        case 5:
               this.AddStudentsButton.setSelected(false);
               this.RemoveStudentsButton.setSelected(false);
               this.SearchStudentsButton.setSelected(false);
               this.StudentsSetTrendButton.setSelected(false);
               this.StudentsCollegeYearButton.setSelected(this.StudentsCollegeYearButton.isSelected());
               this.StudentChoice=5;
               StudentSearchHide(false);
               StudentActionHide(false);
               SetActionStudent("Set Student Year",this.StudentsCollegeYearButton.isSelected());
               this.StudentYearHide(this.StudentsCollegeYearButton.isSelected());
               break;
    }
    
}
    private void AddStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentsButtonActionPerformed
        StudentButton(1);
       
    }//GEN-LAST:event_AddStudentsButtonActionPerformed

    private void RemoveStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveStudentsButtonActionPerformed
        StudentButton(2);
        
    }//GEN-LAST:event_RemoveStudentsButtonActionPerformed

    private void SearchStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchStudentsButtonActionPerformed
        StudentButton(3);
    }//GEN-LAST:event_SearchStudentsButtonActionPerformed

    private void StudentsSetTrendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentsSetTrendButtonActionPerformed
        StudentButton(4);
    }//GEN-LAST:event_StudentsSetTrendButtonActionPerformed

    private void StudentAddressFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StudentAddressFieldKeyPressed
        if(evt.getKeyCode()==10)
        {
            StudentApply();
        }
    }//GEN-LAST:event_StudentAddressFieldKeyPressed

    private void StudentPhoneFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StudentPhoneFieldKeyPressed
        if(evt.getKeyCode()==10)
        {
            StudentApply();
        }
    }//GEN-LAST:event_StudentPhoneFieldKeyPressed

    private void StudentNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StudentNameFieldKeyPressed
        if(evt.getKeyCode()==10)
        {
            StudentApply();
        }
    }//GEN-LAST:event_StudentNameFieldKeyPressed

    private void StudentIDFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StudentIDFieldKeyPressed
        if(evt.getKeyCode()==10)
        {
            StudentApply();
        }
    }//GEN-LAST:event_StudentIDFieldKeyPressed
    private void StudentApply()
    {
        switch(this.StudentChoice){
            case 1:if(this.StudentIDField.getText().length()>0&&this.StudentNameField.getText().length()>0&&this.StudentPhoneField.getText().length()>0&&this.StudentAddressField.getText().length()>0 && this.StudentTrendIDField.getText().length() > 0)
                {
                    Megama meg=this.AcademicMegamot.GetMegamaToFile(this.StudentTrendIDField.getText());
                    if(meg==null)
                      meg=this.TechnologiMegamot.GetMegamaToFile(this.StudentTrendIDField.getText());
                    if(meg!=null)
                    {
                      if(meg.GetType().equals("Technologic"))
                      {
                          this.TechnologitStudents.AddStudent(this.StudentIDField.getText(), this.StudentNameField.getText(), this.StudentPhoneField.getText(), this.StudentAddressField.getText(), this.StudentTrendIDField.getText(), this.TechnologiMegamot, this.teachers, this.AcademicStudents, this.Connect,this.TechnologitStudents, this.AcademicStudents,this.TechnologiMegamot,this.AcademicMegamot);
                          UpdateStudentsTable();
                      }else{
                          this.AcademicStudents.AddStudent(this.StudentIDField.getText(), this.StudentNameField.getText(), this.StudentPhoneField.getText(), this.StudentAddressField.getText(), this.StudentTrendIDField.getText(), this.AcademicMegamot, this.teachers, this.TechnologitStudents, this.Connect,this.TechnologitStudents, this.AcademicStudents,this.TechnologiMegamot,this.AcademicMegamot);
                          UpdateStudentsTable();
                      }
                    }else{
                        new ErrorDialog("Trend Was Not Found!");
                    }
                    
                }else
                new ErrorDialog("Empty Field!");
                   break;
            case 2:if(this.StudentIDField.getText().length()>0)
                    {                     
                        Student stu=this.AcademicStudents.GetStudent(this.StudentIDField.getText());
                    if(stu==null)
                      stu=this.TechnologitStudents.GetStudent(this.StudentIDField.getText());
                    if(stu!=null)
                    {
                        if(stu.GetMegama().GetType().equals("Technologic"))
                        {
                           this.TechnologitStudents.RemoveStudent(this.StudentIDField.getText(), this.TechnologiMegamot, this.Connect,this.TechnologitStudents, this.AcademicStudents,this.TechnologiMegamot,this.AcademicMegamot);
                           UpdateStudentsTable();
                        }else{
                            this.AcademicStudents.RemoveStudent(this.StudentIDField.getText(), this.AcademicMegamot, this.Connect,this.TechnologitStudents, this.AcademicStudents,this.TechnologiMegamot,this.AcademicMegamot);
                            UpdateStudentsTable();
                        }                      
                    }else{
                       new ErrorDialog("Student Was Not Found!"); 
                    }
                    }else 
                    new ErrorDialog("Trend Was Not Found!");
                   break;
            case 3:
                   if(this.StudentIDField.getText().length() > 0)
                   {
                    Student stu=this.AcademicStudents.GetStudent(this.StudentIDField.getText());
                    if(stu==null)
                      stu=this.TechnologitStudents.GetStudent(this.StudentIDField.getText());
                    if(stu!=null)
                    {
                        this.StudentNameSearchValue.setText(stu.GetName());
                        this.StudentIDSearchValue.setText(stu.GetId());
                        this.StudentPhoneSearchValue.setText(stu.GetPhone());
                        this.StudentAddressSearchValue.setText(stu.GetAddress());
                        this.StudentTrendSearchValue.setText(stu.GetMegama().GetName());
                        this.StudentCollegeSearchValue.setText(stu.GetMegama().GetType());
                        StudentSearchHide(true);
                    }
                    else
                    {
                        StudentSearchHide(false);
                        this.StudentVerticalSeperator.setVisible(true);
                       this.StudentSearchResultLabel.setVisible(true);
                        this.StudentNameSearchValue.setText("Not Found");
                        this.StudentNameSearchValue.setVisible(true);
                    }
                   }
                   else
                   {
                       new ErrorDialog("Empty Field!");
                   }
                   break;
            case 4:     
                if(this.StudentIDField.getText().length() > 0 || this.StudentTrendIDField.getText().length() > 0 )
                   {
                    Student stu=this.AcademicStudents.GetStudent(this.StudentIDField.getText());
                    if(stu==null)
                        stu=this.TechnologitStudents.GetStudent(this.StudentIDField.getText());
                    if(stu!=null)
                    {
                        String type = stu.GetMegama().GetType();
                        if(type.equals("Technologic"))
                        {
                            Megama meg = this.TechnologiMegamot.GetMegamaToFile(this.StudentTrendIDField.getText());
                            if(meg != null)
                            {
                                this.TechnologiMegamot.ChangeStudentsInProfessions(stu.GetMegama().GetId(), -1);
                                stu.GetMegama().RemoveStudentFromMegama(stu);
                                meg.AddStudentToMegama(stu);
                                this.TechnologiMegamot.ChangeStudentsInProfessions(meg.GetId(), 1);
                                stu.SetMegama(meg);
                                UpdateStudentsTable();
                                StudentProfessionTableHide(false);
                                this.UpdateProfessionTable();
                                new FileManeger().UpdateMegamot(this.TechnologiMegamot,"TechnologiMegamot");
                                new FileManeger().UpdateProfession("TechnologiMegamot", this.TechnologiMegamot);      
                                new FileManeger().UpdateStudents(this.TechnologitStudents, "TechnologitStudents");
                                new Dialog("Success!");    
                            }
                            else{
                                new ErrorDialog("The ID Of The Trend Does Not Exist In The Technologic");
                            }
                        }
                        else{
                            Megama meg = this.AcademicMegamot.GetMegamaToFile(this.StudentTrendIDField.getText());
                            if(meg != null)
                            {
                                this.AcademicMegamot.ChangeStudentsInProfessions(stu.GetMegama().GetId(), -1);
                                stu.GetMegama().RemoveStudentFromMegama(stu);
                                meg.AddStudentToMegama(stu);
                                this.AcademicMegamot.ChangeStudentsInProfessions(meg.GetId(), 1);
                                stu.SetMegama(meg);
                                UpdateStudentsTable();
                                StudentProfessionTableHide(false);
                                this.UpdateProfessionTable();
                                new FileManeger().UpdateMegamot(this.AcademicMegamot,"AcademicMegamot");
                                new FileManeger().UpdateProfession("AcademicMegamot", this.AcademicMegamot);
                                new FileManeger().UpdateStudents(this.AcademicStudents, "AcademicStudents");
                                new Dialog("Success!");
                            }
                            else{
                                new ErrorDialog("The ID Of The Trend Does Not Exist In The Academy");
                            }
                        }
                    }
                    else{
                       new ErrorDialog("Student ID Was Not Found!");
                    }
                    }
                else{
                    new ErrorDialog("Empty Field!");
                }
                   break;
            case 5:
                   if(this.StudentIDField.getText().length()>0)
                   {
                       if(this.StudentYearA.isSelected()||this.StudentYearB.isSelected()||this.StudentYearC.isSelected()||this.StudentYearD.isSelected())
                       {
                           Student stu=this.AcademicStudents.GetStudent(this.StudentIDField.getText());
                            if(stu==null)
                                stu=this.TechnologitStudents.GetStudent(this.StudentIDField.getText());
                            if(stu!=null){
                                char Year=this.StudentYearA.isSelected()?'A':this.StudentYearB.isSelected()?'B':this.StudentYearC.isSelected()?'C':'D';
                                stu.SetSchoolYear(Year);
                                UpdateStudentsTable();
                                new FileManeger().UpdateStudents(this.AcademicStudents, "AcademicStudents");
                                new FileManeger().UpdateStudents(this.TechnologitStudents, "TechnologitStudents");
                            }else
                                new ErrorDialog("Student ID Was Not Found!");
                       }else
                         new ErrorDialog("Please Select Year");  
                    }else
                      new ErrorDialog("Empty Field!");
                   break;
        }
    }  
    private void StudentApplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentApplyButtonActionPerformed
        StudentApply();
    }//GEN-LAST:event_StudentApplyButtonActionPerformed

    private void CloseStudentProfessionsTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseStudentProfessionsTableButtonActionPerformed
        StudentProfessionTableHide(false);
    }//GEN-LAST:event_CloseStudentProfessionsTableButtonActionPerformed

    private void StudentsCollegeYearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentsCollegeYearButtonActionPerformed
        StudentButton(5);
    }//GEN-LAST:event_StudentsCollegeYearButtonActionPerformed

    private void AllStudentsRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllStudentsRadioButtonActionPerformed
        UpdateStudentsTable();
    }//GEN-LAST:event_AllStudentsRadioButtonActionPerformed

    private void AcademyStudentsRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcademyStudentsRadioButtonActionPerformed
        UpdateStudentsTable();
    }//GEN-LAST:event_AcademyStudentsRadioButtonActionPerformed

    private void TechnologicStudentsRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TechnologicStudentsRadioButtonActionPerformed
        UpdateStudentsTable();
    }//GEN-LAST:event_TechnologicStudentsRadioButtonActionPerformed

    private void StudentAdminTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentAdminTableMouseClicked
         DefaultTableModel table= (DefaultTableModel)(this.StudentAdminTable.getRowSorter().getModel());
        Object valuename = table.getValueAt(this.StudentAdminTable.convertRowIndexToModel(this.StudentAdminTable.getSelectedRow()),1);
        if(new Dialog().AskDialog("Would You Like To See "+valuename.toString()+"'s Professions?", "Attention")==0)
        {
            UpdateStudentProfessionTable();              
            StudentProfessionTableHide(true);
        }
    }//GEN-LAST:event_StudentAdminTableMouseClicked
    private void UpdateStudentProfessionTable()
    {
      DefaultTableModel table= (DefaultTableModel)(this.StudentAdminTable.getRowSorter().getModel());
        Object valuename = table.getValueAt(this.StudentAdminTable.convertRowIndexToModel(this.StudentAdminTable.getSelectedRow()),1);
        Object valueid = table.getValueAt(this.StudentAdminTable.convertRowIndexToModel(this.StudentAdminTable.getSelectedRow()),0);
        if(this.StudentAdminTable.getSelectedColumn()>-1)
        {            
            
                Student stu=this.AcademicStudents.GetStudent(valueid.toString());
                if(stu == null)
                {
                   stu = this.TechnologitStudents.GetStudent(valueid.toString());  
                }
                
               
                DefaultTableModel table2 = (DefaultTableModel) this.ProfessionStudentAdminTable.getModel();
                table2.setRowCount(0);
                this.ProfessionStudentAdminTable.setModel(table2);
                DefaultTableModel table3 = (DefaultTableModel)(this.ProfessionStudentAdminTable.getModel()) ;

                for (Profession pro : stu.GetMegama().GetProfessionsObject().GetProfessionList()) {
                    table3.insertRow(0,new Object[]{pro.GetId(),pro.GetName(),pro.GetTeacher().GetName(),pro.GetMegama().GetName(),pro.GetStudentNum()});
                }

                this.ProfessionStudentAdminTable.setModel(table3);

            
        }  
    }
    
    
    private void StudentTrendIDFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StudentTrendIDFieldKeyPressed
        if(evt.getKeyCode()==10)
        {
            StudentApply();
        }
    }//GEN-LAST:event_StudentTrendIDFieldKeyPressed

    private void StudentYearAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StudentYearAKeyPressed
        if(evt.getKeyCode()==10)
        {
            StudentApply();
        }
    }//GEN-LAST:event_StudentYearAKeyPressed

    private void StudentYearBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StudentYearBKeyPressed
        if(evt.getKeyCode()==10)
        {
            StudentApply();
        }
    }//GEN-LAST:event_StudentYearBKeyPressed

    private void StudentYearCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StudentYearCKeyPressed
        if(evt.getKeyCode()==10)
        {
            StudentApply();
        }
    }//GEN-LAST:event_StudentYearCKeyPressed

    private void StudentYearDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StudentYearDKeyPressed
        if(evt.getKeyCode()==10)
        {
            StudentApply();
        }
    }//GEN-LAST:event_StudentYearDKeyPressed
    private void UpdateTrendsTable()
    {
        DefaultTableModel table2 = (DefaultTableModel) this.TrendsTable.getModel();
        table2.setRowCount(0);
        this.TrendsTable.setModel(table2);
        DefaultTableModel table = (DefaultTableModel) this.TrendsTable.getModel();
       if(this.FilterAllButton.isSelected())
       {
           for (Megama meg : this.TechnologiMegamot.GetListMegamot()) {
                  table.insertRow(0,new Object[]{meg.GetId(),meg.GetName(),meg.GetType()});  
                }
            for (Megama meg : this.AcademicMegamot.GetListMegamot()) {
                  table.insertRow(0,new Object[]{meg.GetId(),meg.GetName(),meg.GetType()});  
                }            
       }else if(this.FilterAcademyButton.isSelected())
       {
            for (Megama meg : this.AcademicMegamot.GetListMegamot()) {
                  table.insertRow(0,new Object[]{meg.GetId(),meg.GetName(),meg.GetType()});  
                }  
       }else{
            for (Megama meg : this.TechnologiMegamot.GetListMegamot()) {
                  table.insertRow(0,new Object[]{meg.GetId(),meg.GetName(),meg.GetType()});  
                }
       }
       this.TrendsTable.setModel(table);
    }    private void UpdateProfessionTable(){
        DefaultTableModel table = (DefaultTableModel) this.ProfessionTable.getModel();
        table.setRowCount(0);
        this.ProfessionTable.setModel(table);
        if(FilterAllButton.isSelected())
        {
        for(Megama m: this.TechnologiMegamot.GetListMegamot())
        {
            for(Profession pro: m.GetProfessionsObject().GetProfessionList())
            {
                table.insertRow(0,new Object[]{pro.GetId(),pro.GetName(),pro.GetTeacher().GetName(),pro.GetMegama().GetName(),pro.GetStudentNum()}); 
            }
        }      
        for(Megama m: this.AcademicMegamot.GetListMegamot())
        {
            for(Profession pro: m.GetProfessionsObject().GetProfessionList())
            {
                table.insertRow(0,new Object[]{pro.GetId(),pro.GetName(),pro.GetTeacher().GetName(),pro.GetMegama().GetName(),pro.GetStudentNum()}); 
            }
        }
        }
        else if(FilterTechnologicButton.isSelected()){
           for(Megama m: this.TechnologiMegamot.GetListMegamot())
        {
            for(Profession pro: m.GetProfessionsObject().GetProfessionList())
            {
                table.insertRow(0,new Object[]{pro.GetId(),pro.GetName(),pro.GetTeacher().GetName(),pro.GetMegama().GetName(),pro.GetStudentNum()}); 
            }
        }    
        }
        else
        {
           for(Megama m: this.AcademicMegamot.GetListMegamot())
        {
            for(Profession pro: m.GetProfessionsObject().GetProfessionList())
            {
                table.insertRow(0,new Object[]{pro.GetId(),pro.GetName(),pro.GetTeacher().GetName(),pro.GetMegama().GetName(),pro.GetStudentNum()}); 
            }
        } 
        }
        this.ProfessionTable.setModel(table);
    }   
  private void AddProfessionObjects(boolean bool)
{
       this.TeacherIDLabel.setVisible(bool);
        this.TrendIDLabel.setVisible(bool);
        this.TeacherInfoField.setVisible(bool);
        this.TredInfoField.setVisible(bool);
}    private void Apply()
    {
        String info = this.InfoField.getText();
        if(info.length() < 1)
        {
           new ErrorDialog("Empty Field!");
           return;
        }
        ToggleSearch();
        switch(this.choice){
            case 1:                   
                    if(this.TechnoligSelectedRadioButton.isSelected())
                    {
                        this.TechnologiMegamot.CreateMegama(info, AcademicMegamot);
                        UpdateTrendsTable();
                        new FileManeger().UpdateMegamot(TechnologiMegamot,"TechnologiMegamot");
                    }
                    else if(this.AcademySelectedRadioButton.isSelected())
                    {
                        this.AcademicMegamot.CreateMegama(info, TechnologiMegamot);
                        UpdateTrendsTable();
                        new FileManeger().UpdateMegamot(AcademicMegamot,"AcademicMegamot");
                    }
                    else{
                        new ErrorDialog("You Have Not Chosen Any College!");
                    }
                    break;
            case 2:
                    if(this.AcademicMegamot.CheckIfExistsById(info))
                    {
                        this.AcademicMegamot.DelMegama(info);
                        UpdateTrendsTable();
                        new FileManeger().UpdateMegamot(AcademicMegamot,"AcademicMegamot");
                    }
                    else if(this.TechnologiMegamot.CheckIfExistsById(info))
                    {
                        this.TechnologiMegamot.DelMegama(info);
                        UpdateTrendsTable();
                        new FileManeger().UpdateMegamot(TechnologiMegamot,"TechnologiMegamot");
                    }
                    else
                        new ErrorDialog("The Id Of This Trend Does Not Exist");
                    break;
            case 3:
                    this.AnswerSeparator.setVisible(true);
                    this.SearchResultLabel.setVisible(true);
                    if(this.AcademicMegamot.CheckIfExistsById(info))
                    {
                        Megama meg = AcademicMegamot.GetMegamaToFile(info);
                        ShowTrendResults(meg.GetId(), meg.GetName(), meg.GetType(), "Trend ID:", "Trend Name:", "Trend Type:"); 
                        
                    }
                    else if(this.TechnologiMegamot.CheckIfExistsById(info))
                    {
                        Megama meg = TechnologiMegamot.GetMegamaToFile(info);
                        ShowTrendResults(meg.GetId(), meg.GetName(), meg.GetType(), "Trend ID:", "Trend Name:", "Trend Type:");    
                        
                    }
                    else
                    {                        
                        this.FirstLabelValue.setVisible(true);                        
                        this.FirstLabelValue.setText("Not found");
                        
                    }
                    break;
            case 4:
                   if(this.TredInfoField.getText().length()<1||this.TeacherInfoField.getText().length()<1)
                   {
                       new ErrorDialog("Empty Field!");
                   }else{
                       
                      if(this.teachers.CheckId(this.TeacherInfoField.getText())){
                        if(this.AcademicMegamot.CheckIfExistsById(this.TredInfoField.getText()))
                        {
                                if(this.teachers.GetTeacherById(this.TeacherInfoField.getText()).GetTeachesAtToFile()>1){
                                    this.AcademicMegamot.CreateProfessionByMegamaId(this.TredInfoField.getText(), info, this.TeacherInfoField.getText(), this.TechnologiMegamot, this.teachers);
                                    UpdateProfessionTable();                          
                                     new FileManeger().UpdateProfession("AcademicMegamot", this.AcademicMegamot);
                                }else{
                                   new ErrorDialog("This Teacher Does Not Work At The Academy!");
                                }
                        }else if(this.TechnologiMegamot.CheckIfExistsById(this.TredInfoField.getText())){ 
                                    if(this.teachers.GetTeacherById(this.TeacherInfoField.getText()).GetTeachesAtToFile()!=2){
                                        this.TechnologiMegamot.CreateProfessionByMegamaId(this.TredInfoField.getText(), info, this.TeacherInfoField.getText(), this.AcademicMegamot, this.teachers);
                                        UpdateProfessionTable();
                                        new FileManeger().UpdateProfession("TechnologiMegamot", this.TechnologiMegamot);
                                    }else{
                                      new ErrorDialog("This Teacher Does Not Work At The Technologic!");  
                                    }
                        }else{
                          new ErrorDialog("The Trend Id Was Not Found");
                        }
                      }else
                          new ErrorDialog("Teacher Id Was Not Found!");
                   }                    
                    break;
            case 5:
                    Megama meg=this.AcademicMegamot.GetMegamaByProfessionId(info);                    
                    if(meg!=null)
                       {
                        this.AcademicMegamot.DelProfessionById(info, this.teachers);
                        UpdateProfessionTable();                          
                        new FileManeger().UpdateProfession("AcademicMegamot", this.AcademicMegamot);                        
                    }else{
                        meg=this.TechnologiMegamot.GetMegamaByProfessionId(info);
                         
                        if(meg!=null){                            
                        this.TechnologiMegamot.DelProfessionById(info, this.teachers);
                        UpdateProfessionTable();
                        new FileManeger().UpdateProfession("TechnologiMegamot", this.TechnologiMegamot);
                        
                        } else{
                             new ErrorDialog("The Profession Id Was Not Found");
                        } 
                    }
                                      
                    break;
            case 6: 
                    this.AnswerSeparator.setVisible(true);
                    this.SearchResultLabel.setVisible(true);
                    Megama meg1=this.AcademicMegamot.GetMegamaByProfessionId(info); 
                    Profession p1=null;
                    if(meg1!=null)
                       {                     
                        p1=meg1.GetProfessionsObject().GetProfessionById(info);
                        ShowProfessionResults(info, p1.GetName(),p1.GetTeacher().GetName(),meg1.GetName(),String.valueOf(p1.GetStudentNum()),"Profession ID:", "Profession Name:", "Teacher Name: ");
                                             
                    }else{
                        meg1=this.TechnologiMegamot.GetMegamaByProfessionId(info);                         
                        if(meg1!=null){                            
                        p1=meg1.GetProfessionsObject().GetProfessionById(info);
                        ShowProfessionResults(info, p1.GetName(),p1.GetTeacher().GetName(),meg1.GetName(),String.valueOf(p1.GetStudentNum()),"Profession ID:", "Profession Name:", "Teacher Name: ");
                        
                        } else{
                        this.FirstLabelValue.setVisible(true);                        
                        this.FirstLabelValue.setText("Not found");
                        } 
                    }
                
                   break;
            default:
                    break;
                            
        }
    }    
    private void UpdateTeachersTable()
    {
        DefaultTableModel table = (DefaultTableModel) this.AllTeachersTable.getModel();
        table.setRowCount(0);
        this.AllTeachersTable.setModel(table);
        DefaultTableModel table2 = (DefaultTableModel) this.AllTeachersTable.getModel();
       if(this.TeachersTableAllRadioButton.isSelected())
       {
          for (Teacher t: this.teachers.GetTeachersList())
          {
              table2.insertRow(0,new Object[]{t.GetId(),t.GetName(),t.GetPhone(),t.GetAddress(),t.GetTeachesAt()});  
          }
       }            
       else if(this.TeachersTableTechRadioButton.isSelected())
       {
          for (Teacher t: this.teachers.GetTeachersList())
          {
              if(t.GetTeachesAtToFile() != 2)
              table2.insertRow(0,new Object[]{t.GetId(),t.GetName(),t.GetPhone(),t.GetAddress(),t.GetTeachesAt()});  
          }
       }
       else{
            for (Teacher t: this.teachers.GetTeachersList())
          {
              if(t.GetTeachesAtToFile() > 1)
              table2.insertRow(0,new Object[]{t.GetId(),t.GetName(),t.GetPhone(),t.GetAddress(),t.GetTeachesAt()});  
          }
       }
       this.AllTeachersTable.setModel(table2);
    }
private void UpdateStudentsTable(){
    DefaultTableModel table = (DefaultTableModel) this.StudentAdminTable.getModel();
        table.setRowCount(0);
        this.StudentAdminTable.setModel(table);
        DefaultTableModel table2 = (DefaultTableModel) this.StudentAdminTable.getModel();
       if(this.AllStudentsRadioButton.isSelected())
       {
          for (Student stu: this.AcademicStudents.GetListStudent())
          {
              table2.insertRow(0,new Object[]{stu.GetId(),stu.GetName(),stu.GetPhone(),stu.GetAddress(),stu.GetMegama().GetName(),stu.GetMegama().GetType(),stu.GetSchoolYear()});  
          }
          for (Student stu: this.TechnologitStudents.GetListStudent())
          {
              table2.insertRow(0,new Object[]{stu.GetId(),stu.GetName(),stu.GetPhone(),stu.GetAddress(),stu.GetMegama().GetName(),stu.GetMegama().GetType(),stu.GetSchoolYear()});  
          }
       }            
       else if(this.TechnologicStudentsRadioButton.isSelected())
       {
           for (Student stu: this.TechnologitStudents.GetListStudent())
          {
              table2.insertRow(0,new Object[]{stu.GetId(),stu.GetName(),stu.GetPhone(),stu.GetAddress(),stu.GetMegama().GetName(),stu.GetMegama().GetType(),stu.GetSchoolYear()});  
          }
       }
       else{
           for (Student stu: this.AcademicStudents.GetListStudent())
          {
              table2.insertRow(0,new Object[]{stu.GetId(),stu.GetName(),stu.GetPhone(),stu.GetAddress(),stu.GetMegama().GetName(),stu.GetMegama().GetType(),stu.GetSchoolYear()});  
          }
       }
       this.StudentAdminTable.setModel(table2);
}
        private void TeacherApply()
    {
        TeacherSearchHide(false);
        int CollegeSelected=0;
        switch(this.TeacherChoice)
        {
            
            case 1:
                   if(this.TeacherNameField.getText().length()>0&&this.TeacherIDField.getText().length()>0&&this.TeacherPhoneField.getText().length()>0&&this.TeacherAddressField.getText().length()>0)
                   {
                       if(this.TechRadioButton.isSelected()||this.AcaRadioButton.isSelected()||this.BothRadioButton.isSelected())
                       {
                          
                         CollegeSelected=this.BothRadioButton.isSelected()?3:this.AcaRadioButton.isSelected()?2:1;
                         this.teachers.AddTeacher(this.TeacherIDField.getText(), this.TeacherNameField.getText(), this.TeacherPhoneField.getText(), this.TeacherAddressField.getText(),CollegeSelected, this.TechnologitStudents, this.AcademicStudents,this.teachers,this.Connect);
                         UpdateTeachersTable();                 
                         
                         
                       }else
                       new ErrorDialog("No College Type Selected!");
                   }else
                   new ErrorDialog("Empty Field!");
                   break;
            case 2:
                   if(this.TeacherIDField.getText().length()>0)
                   {
                    if(this.teachers.CheckId(this.TeacherIDField.getText()))
                    {
                        this.teachers.RemoveTeacher(this.TeacherIDField.getText());
                        this.Connect.DelUserName(this.TeacherIDField.getText());
                        UpdateTeachersTable();
                        new FileManeger().UpdateUserNameKeys("Connect", this.Connect);
                        new FileManeger().UpdateTeachers("Teachers",this.teachers);
                        new FileManeger().UpdateProfession("TechnologiMegamot", this.TechnologiMegamot); 
                        new FileManeger().UpdateProfession("AcademicMegamot", this.AcademicMegamot);
                    }else{
                        new ErrorDialog("This Id Does Not Exist");
                    }
                   }else{
                       new ErrorDialog("Empty Field!");
                   }
                   break;
            case 3:
                   this.TeacherSearchResultLabel.setVisible(true);
                   this.TeacherVerticalSeperator.setVisible(true);
                   if(this.TeacherIDField.getText().length()>0)
                   {
                       Teacher t=this.teachers.GetTeacherById(this.TeacherIDField.getText());
                        if(t!=null)
                        {
                         TeacherSearchHide(true);
                         this.TeacherNameSearchValue.setText(t.GetName());
                         this.TeacherIDSearchValue.setText(t.GetId());
                         this.TeacherPhoneSearchValue.setText(t.GetPhone());
                         this.TeacherAddressSearchValue.setText(t.GetAddress());
                         this.TeachesAtSearchValue.setText(t.GetTeachesAt());
                        }else{
                         this.TeacherNameSearchValue.setVisible(true);
                         this.TeacherNameSearchValue.setText("Not found");
                        }
                   }else{
                    new ErrorDialog("Empty Field!");   
                   }
                   break;
            case 4:
                
                    if(this.TeacherIDField.getText().length()>0){
                        if(this.TechRadioButton.isSelected()||this.AcaRadioButton.isSelected()||this.BothRadioButton.isSelected())
                        {
                          CollegeSelected=this.BothRadioButton.isSelected()?3:this.AcaRadioButton.isSelected()?2:1;
                          Teacher t=this.teachers.GetTeacherById(this.TeacherIDField.getText());
                          if(t!=null)
                          {
                           t.SetTeachesAt(CollegeSelected);
                           UpdateTeachersTable();
                           new FileManeger().UpdateTeachers("Teachers",this.teachers);
                          }else
                              new ErrorDialog("Teacher Was Not Found!");
                        }else
                         new ErrorDialog("No College Type Selected!");   
                    }else
                      new ErrorDialog("Empty Field!");  
                   break;
            case 5:
                if(this.TeacherNameField.getText().length() > 0 && this.TeacherIDField.getText().length() > 0)
                {
                   Teacher t=this.teachers.GetTeacherById(this.TeacherIDField.getText());
                   Profession p;
                   if(t != null)
                   {
                       p = this.AcademicMegamot.GetProfessionById(this.TeacherNameField.getText());
                       if(p == null)
                       {
                            p = this.TechnologiMegamot.GetProfessionById(this.TeacherNameField.getText());
                            if(p == null)
                            {
                                new ErrorDialog("This Profession Does Not Exist!");
                            }
                            else{
                               p.GetTeacher().GetProfessionsObject().DelProfessionByIdFromTeacher(p.GetId());
                               p.SetTeacher(t);
                               t.GetProfessionsObject().AddProfession(p);
                               UpdateProfessionTable();
                               new FileManeger().UpdateTeachers("Teachers",this.teachers); 
                               new FileManeger().UpdateProfession("TechnologiMegamot", this.TechnologiMegamot); 
                            }
                        }
                       else
                       {
                           p.GetTeacher().GetProfessionsObject().DelProfessionByIdFromTeacher(p.GetId());
                           p.SetTeacher(t);
                           t.GetProfessionsObject().AddProfession(p);
                           UpdateProfessionTable();
                           new FileManeger().UpdateProfession("AcademicMegamot", this.AcademicMegamot);
                           new FileManeger().UpdateTeachers("Teachers",this.teachers); 
                       }
                   }
                   else
                   {
                       new ErrorDialog("Teacher Was Not Found!");
                   }
                }
                else
                {
                   new ErrorDialog("Empty Field!");
                }
                   break;
            default:
                   break;
        }
    }    private void GetInfo(String Label,String Action, boolean Toggle){
       this.InfoField.setText("");
       this.NameEnterLabel.setText(Label);
       this.ActionNameLabel.setText(Action);
       this.NameEnterLabel.setVisible(Toggle);
       this.InfoField.setVisible(Toggle);
       this.ApplyButton.setVisible(Toggle); 
       this.ActionNameLabel.setVisible(Toggle);
       this.InfoSeparator.setVisible(Toggle);
       AddProfessionObjects(false);
    }
    private void CollegeSelectedVisible(boolean Toggle)
    {
      this.AcademySelectedRadioButton.setVisible(Toggle);
      this.TechnoligSelectedRadioButton.setVisible(Toggle);
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AcaRadioButton;
    private javax.swing.JRadioButton AcademySelectedRadioButton;
    private javax.swing.JRadioButton AcademyStudentsRadioButton;
    private javax.swing.JLabel ActionNameLabel;
    private javax.swing.JToggleButton AddProfessionButton;
    private javax.swing.JToggleButton AddStudentsButton;
    private javax.swing.JToggleButton AddTeacherButton;
    private javax.swing.JToggleButton AddTrendButton;
    private javax.swing.JRadioButton AllStudentsRadioButton;
    private javax.swing.JScrollPane AllTeachersScrollPane;
    private javax.swing.JTable AllTeachersTable;
    private javax.swing.JSeparator AnswerSeparator;
    private javax.swing.JButton ApplyButton;
    private javax.swing.JRadioButton BothRadioButton;
    private javax.swing.JButton CloseStudentProfessionsTableButton;
    private javax.swing.JButton CloseTeacherProfessionsTableButton;
    private javax.swing.ButtonGroup CollegeSelectedButtonGroup;
    private javax.swing.JLabel EnterStudentIDLabel;
    private javax.swing.JLabel EnterTeachIDLabel;
    private javax.swing.JLabel FifthLabel;
    private javax.swing.JLabel FifthLabelValue;
    private javax.swing.JRadioButton FilterAcademyButton;
    private javax.swing.JRadioButton FilterAllButton;
    private javax.swing.JRadioButton FilterTechnologicButton;
    private javax.swing.ButtonGroup FilterbuttonGroup;
    private javax.swing.JLabel FirstLabel;
    private javax.swing.JLabel FirstLabelValue;
    private javax.swing.JLabel ForthLabel;
    private javax.swing.JLabel ForthLabelValue;
    private javax.swing.JTextField InfoField;
    private javax.swing.JSeparator InfoSeparator;
    private javax.swing.JLabel NameEnterLabel;
    private javax.swing.JLabel PictureLabel;
    private javax.swing.JLabel PictureLabel1;
    private javax.swing.JLabel PictureLabel3;
    private javax.swing.JLabel PictureLabel4;
    private javax.swing.JScrollPane ProfessionScroll;
    private javax.swing.JScrollPane ProfessionStudentAdminScrollPane;
    private javax.swing.JTable ProfessionStudentAdminTable;
    private javax.swing.JTable ProfessionTable;
    private javax.swing.JLabel ProfessionsOptionsLabel;
    private javax.swing.JToggleButton RemoveProfessionButton;
    private javax.swing.JToggleButton RemoveStudentsButton;
    private javax.swing.JToggleButton RemoveTeacherButton;
    private javax.swing.JToggleButton RemoveTrendButton;
    private javax.swing.JToggleButton SearchProfessionsButtons;
    private javax.swing.JLabel SearchResultLabel;
    private javax.swing.JToggleButton SearchStudentsButton;
    private javax.swing.JToggleButton SearchTeacherButton;
    private javax.swing.JToggleButton SearchTrendButton;
    private javax.swing.JLabel SecondLabel;
    private javax.swing.JLabel SecondLabelValue;
    private javax.swing.JToggleButton ShowProfessionsButton;
    private javax.swing.JToggleButton ShowStudentsButton;
    private javax.swing.JToggleButton ShowTeachersButton;
    private javax.swing.JToggleButton ShowTrendsButton;
    private javax.swing.JTextField StudentAddressField;
    private javax.swing.JLabel StudentAddressLabel;
    private javax.swing.JLabel StudentAddressSearchLabel;
    private javax.swing.JLabel StudentAddressSearchValue;
    private javax.swing.JTable StudentAdminTable;
    private javax.swing.JButton StudentApplyButton;
    private javax.swing.ButtonGroup StudentCollegeRadioButtons;
    private javax.swing.JLabel StudentCollegeSearchLabel;
    private javax.swing.JLabel StudentCollegeSearchValue;
    private javax.swing.JSeparator StudentHorizontalSeperator;
    private javax.swing.JTextField StudentIDField;
    private javax.swing.JLabel StudentIDSearchLabel;
    private javax.swing.JLabel StudentIDSearchValue;
    private javax.swing.JTextField StudentNameField;
    private javax.swing.JLabel StudentNameLabel;
    private javax.swing.JLabel StudentNameSearchValue;
    private javax.swing.JTextField StudentPhoneField;
    private javax.swing.JLabel StudentPhoneLabel;
    private javax.swing.JLabel StudentPhoneSearchLabel;
    private javax.swing.JLabel StudentPhoneSearchValue;
    private javax.swing.JLabel StudentSearchNameLabel;
    private javax.swing.JLabel StudentSearchResultLabel;
    private javax.swing.JTextField StudentTrendIDField;
    private javax.swing.JLabel StudentTrendLabel;
    private javax.swing.JLabel StudentTrendSearchLabel;
    private javax.swing.JLabel StudentTrendSearchValue;
    private javax.swing.JSeparator StudentVerticalSeperator;
    private javax.swing.JRadioButton StudentYearA;
    private javax.swing.JRadioButton StudentYearB;
    private javax.swing.JRadioButton StudentYearC;
    private javax.swing.JRadioButton StudentYearD;
    private javax.swing.JLabel StudentYearLabel;
    private javax.swing.ButtonGroup StudentYearRadioButtonGroup;
    private javax.swing.JLabel StudentsActionNameLabel;
    private javax.swing.JScrollPane StudentsAdminScrollPane;
    private javax.swing.JToggleButton StudentsCollegeYearButton;
    private javax.swing.JPanel StudentsPanel;
    private javax.swing.JToggleButton StudentsSetTrendButton;
    private javax.swing.JLabel TeacherActionNameLabel;
    private javax.swing.JTextField TeacherAddressField;
    private javax.swing.JLabel TeacherAddressLabel;
    private javax.swing.JLabel TeacherAddressSearchLabel;
    private javax.swing.JLabel TeacherAddressSearchValue;
    private javax.swing.JButton TeacherApplyButton;
    private javax.swing.JToggleButton TeacherChangeProfessionButton;
    private javax.swing.JToggleButton TeacherCollegeOptionsButton;
    private javax.swing.ButtonGroup TeacherCollegeTypeGroup;
    private javax.swing.JSeparator TeacherHorizontalSeperator;
    private javax.swing.JTextField TeacherIDField;
    private javax.swing.JLabel TeacherIDLabel;
    private javax.swing.JLabel TeacherIDSearchLabel;
    private javax.swing.JLabel TeacherIDSearchValue;
    private javax.swing.JTextField TeacherInfoField;
    private javax.swing.JTextField TeacherNameField;
    private javax.swing.JLabel TeacherNameLabel;
    private javax.swing.JLabel TeacherNameSearchValue;
    private javax.swing.JLabel TeacherOptionsLabel;
    private javax.swing.JLabel TeacherOptionsLabel1;
    private javax.swing.JTextField TeacherPhoneField;
    private javax.swing.JLabel TeacherPhoneLabel;
    private javax.swing.JLabel TeacherPhoneSearchLabel;
    private javax.swing.JLabel TeacherPhoneSearchValue;
    private javax.swing.JScrollPane TeacherProfessionsScrollPane;
    private javax.swing.JTable TeacherProfessionsTable;
    private javax.swing.JLabel TeacherSearchNameLabel;
    private javax.swing.JLabel TeacherSearchResultLabel;
    private javax.swing.JSeparator TeacherVerticalSeperator;
    private javax.swing.JPanel TeachersPanel;
    private javax.swing.JRadioButton TeachersTableAcaRadioButton;
    private javax.swing.JRadioButton TeachersTableAllRadioButton;
    private javax.swing.ButtonGroup TeachersTableButtonGroup;
    private javax.swing.JRadioButton TeachersTableTechRadioButton;
    private javax.swing.JLabel TeachesAtLabel;
    private javax.swing.JLabel TeachesAtSearchLabel;
    private javax.swing.JLabel TeachesAtSearchValue;
    private javax.swing.JRadioButton TechRadioButton;
    private javax.swing.JRadioButton TechnoligSelectedRadioButton;
    private javax.swing.JRadioButton TechnologicStudentsRadioButton;
    private javax.swing.JLabel ThirdLabel;
    private javax.swing.JLabel ThirdLabelValue;
    private javax.swing.JTextField TredInfoField;
    private javax.swing.JLabel TrendIDLabel;
    private javax.swing.JLabel TrendOptionsLabel;
    private javax.swing.JPanel TrendsPanel;
    private javax.swing.JScrollPane TrendsScrollPane;
    private javax.swing.JTable TrendsTable;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
