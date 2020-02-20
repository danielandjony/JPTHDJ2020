
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.*;
import java.util.List;
public class FileManeger {
    

public Megamot StartMegamot(String _Name,String _Type)
{
    Megamot NewMegamot=new Megamot(_Type);
   try {
           if(new File("./"+_Name+"/").exists())
           {
                    if(new File("./"+_Name+"/"+_Name+".csv").exists())
                    {                
                         FileReader fr=new FileReader("./"+_Name+"/"+_Name+".csv");
                         BufferedReader br=new BufferedReader(fr);

                         List<Megama> m=NewMegamot.GetListMegamot();
                         String[] converter;
                         String s1=br.readLine();

                          while (s1!=null) {                
                              converter=s1.split(",,");
                              m.add(new Megama(converter[0],converter[1],_Type));
                              s1=br.readLine();
                          }           
                          fr.close();
                          br.close();
                    }else{
                        FileWriter fw=new FileWriter("./"+_Name+"/"+_Name+".csv");
                        PrintWriter pw=new PrintWriter(fw);
                        pw.close();
                        fw.close();  
                    }
          }else{               
                 new File("./"+_Name+"/").mkdir();
                 FileWriter fw=new FileWriter("./"+_Name+"/"+_Name+".csv");
                 PrintWriter pw=new PrintWriter(fw);
                 pw.close();
                 fw.close();
               }
        } catch (Exception e) {
            new ErrorDialog("Could not Start "+_Name);
        }
   return NewMegamot;
}
public void UpdateMegamot(Megamot _M,String _Name)
{
    try {            
            FileWriter fw=new FileWriter("./"+_Name+"/"+_Name+".csv");
            PrintWriter pw=new PrintWriter(fw);
            for (Megama megama : _M.GetListMegamot()) {
            pw.println(megama.GetId()+",,"+megama.GetName());
        }            
            pw.close();
            fw.close();
        } catch (Exception e) {
            new ErrorDialog("Could not update "+_Name);
        }
}
public Students StartStudents(String _Name,Megamot _Megamot)
{
    Students NewStudents=new Students();
    try {
           if(new File("./"+_Name+"/").exists())
           {
               if(new File("./"+_Name+"/"+_Name+".csv").exists()){                   
                    FileReader fr=new FileReader("./"+_Name+"/"+_Name+".csv");
                    BufferedReader br=new BufferedReader(fr);

                    List<Student> Stulist=NewStudents.GetListStudent();
                    String[] converter;
                    String s1=br.readLine();
                    Student StudentPointer;
                    Megama MegamaPointer;                    
                     while (s1!=null) {                
                         converter=s1.split(",,");
                         StudentPointer=new Student(converter[0], converter[1], converter[2], converter[3]);                
                         StudentPointer.SetSchoolYear(converter[4].charAt(0));
                         MegamaPointer=_Megamot.GetMegamaToFile(converter[5]);
                         StudentPointer.SetMegama(MegamaPointer);
                         MegamaPointer.AddStudentToMegama(StudentPointer);
                         Stulist.add(StudentPointer);
                         s1=br.readLine();
                     }           
                     fr.close();
                     br.close();
               }else{
                  FileWriter fw=new FileWriter("./"+_Name+"/"+_Name+".csv");
                  PrintWriter pw=new PrintWriter(fw);
                  pw.close();
                  fw.close(); 
               } 
           }else{
               new File("./"+_Name+"/").mkdir();
            FileWriter fw=new FileWriter("./"+_Name+"/"+_Name+".csv");
            PrintWriter pw=new PrintWriter(fw);
            pw.close();
            fw.close();
           } 
        } catch (Exception e) {
           new ErrorDialog("Could not Start "+_Name);
        }
   return NewStudents;
}
public void UpdateStudents(Students _S,String _Name)
{
   try {            
            FileWriter fw=new FileWriter("./"+_Name+"/"+_Name+".csv");
            PrintWriter pw=new PrintWriter(fw);
            for (Student student : _S.GetListStudent()) {
            pw.println(student.GetId()+",,"+student.GetName()+",,"+student.GetPhone()+",,"+student.GetAddress()+",,"+student.GetSchoolYear()+",,"+student.GetMegama().GetId());
        }            
            pw.close();
            fw.close();
        } catch (Exception e) {
            new ErrorDialog("Could not update "+_Name);
        } 
}
public Teachers StartTeachers(String _Name){
     Teachers teacherlist = new Teachers();
    try{
        if(new File("./"+_Name+"/").exists())
           {
               if(new File("./"+_Name+"/"+_Name+".csv").exists()){
                    FileReader fr = new FileReader("./"+_Name+"/"+_Name+".csv");
                    BufferedReader br=new BufferedReader(fr);
                    String[] converter;
                    String s1=br.readLine();
                    List<Teacher> tlist = teacherlist.GetTeachersList();
                    while (s1!=null) {                
                            converter=s1.split(",,");
                            tlist.add(new Teacher(converter[0], converter[1], converter[2], converter[3], Integer.parseInt(converter[4])));
                            s1=br.readLine();
                        }
               }else{
                  new File("./"+_Name+"/"+_Name+".csv");
                  FileWriter fw=new FileWriter("./Teachers/"+_Name+".csv");
                  PrintWriter pw=new PrintWriter(fw);
                  pw.close();
                  fw.close(); 
                  teacherlist.GetTeachersList().add(new Teacher("No Teacher","No Teacher","No Teacher","No Teacher",3));
                   UpdateTeachers("Teachers", teacherlist);
               }
        }else{
            new File("./"+_Name+"/").mkdir();
            new File("./"+_Name+"/"+_Name+".csv");
            FileWriter fw=new FileWriter("./Teachers/"+_Name+".csv");
            PrintWriter pw=new PrintWriter(fw);
            pw.close();
            fw.close();
            teacherlist.GetTeachersList().add(new Teacher("No Teacher","No Teacher","No Teacher","No Teacher",3));
            UpdateTeachers("Teachers", teacherlist);
        }
    }catch(Exception e){
        new ErrorDialog("Could not Start "+_Name);
    }
    return teacherlist;
}
public void UpdateTeachers(String _Name, Teachers _teachers){
    try {
        FileWriter fw=new FileWriter("./"+_Name+"/"+_Name+".csv");
            PrintWriter pw=new PrintWriter(fw);
            for (Teacher t : _teachers.GetTeachersList()) {            
            pw.println(t.GetId()+",,"+t.GetName()+",,"+t.GetPhone()+",,"+t.GetAddress()+",,"+t.GetTeachesAtToFile());
        }            
            pw.close();
            fw.close();
    } catch (Exception e) {
        new ErrorDialog("Could not update "+_Name);
    }
       
        
}

public void StartProfessions(String _Name,Megamot _Megamot, Teachers _teachers){
    
     ProfessionListFuncs FileProfessionList = new ProfessionListFuncs();
    try{
       for (Megama megama : _Megamot.GetListMegamot()) { 
           
            if(new File("./"+_Name+"/"+megama.GetName()+".csv").exists())
               {                   
                    FileReader fr = new FileReader("./"+_Name+"/"+megama.GetName()+".csv");
                    BufferedReader br=new BufferedReader(fr);
                    String[] converter;
                    String s1=br.readLine();
                    Profession NewProfession;
                    List<Profession> LP=megama.GetProfessionList();
                    while (s1!=null) {                
                            converter=s1.split(",,");
                           
                            NewProfession=new Profession(converter[0], converter[1], _teachers.GetTeacherById(converter[2]));
                            NewProfession.SetStudentNum(Integer.parseInt(converter[3]));
                            NewProfession.SetMegama(megama);
                            _teachers.GetTeacherById(converter[2]).GetProfessionsObject().GetProfessionList().add(NewProfession);
                            LP.add(NewProfession);
                            s1=br.readLine();
                    }
                    
            }else{                
                FileWriter fw=new FileWriter(_Name+".csv");
                PrintWriter pw=new PrintWriter(fw);
                pw.close();
                fw.close();
            }
      }
    }catch(Exception e){
        new ErrorDialog("Could not Start "+_Name);
    }
    
}
public void UpdateProfession(String _Name,Megamot _megamot){
    try {
        for (Megama megama : _megamot.GetListMegamot()) {        
        
            FileWriter fw=new FileWriter("./"+_Name+"/"+megama.GetName()+".csv");
                PrintWriter pw=new PrintWriter(fw);
                for (Profession p : megama.GetProfessionList()) {            
                pw.println(p.GetId()+",,"+p.GetName()+",,"+p.GetTeacher().GetId()+",,"+p.GetStudentNum());
            }            
                pw.close();
                fw.close();
        }
    } catch (Exception e) {
        new ErrorDialog("Could not update "+_Name);
    }
}
public UserNameKeys StartUserNameKey(String _Name)
{
 UserNameKeys New_UserNameKeys = new UserNameKeys();
    try {
           if(new File("./"+_Name+"/").exists())
           {
                    if(new File("./"+_Name+"/"+_Name+".csv").exists())
                    {                
                         FileReader fr=new FileReader("./"+_Name+"/"+_Name+".csv");
                         BufferedReader br=new BufferedReader(fr);

                         List<UserNameKey> u=New_UserNameKeys.GetUserNameKeysList();
                         String[] converter;
                         String s1=br.readLine();

                          while (s1!=null) {                
                              converter=s1.split(",,");
                              u.add(new UserNameKey(converter[0],converter[1],converter[2],converter[3]));
                              s1=br.readLine();
                          }           
                          fr.close();
                          br.close();
                    }else{
                        FileWriter fw=new FileWriter("./"+_Name+"/"+_Name+".csv");
                        PrintWriter pw=new PrintWriter(fw);
                        pw.close();
                        fw.close(); 
                         New_UserNameKeys.CreatUserName("admin", "admin", "Admin", "Admin");
                         UpdateUserNameKeys("Connect", New_UserNameKeys);
                    }
          }else{               
                 new File("./"+_Name+"/").mkdir();
                 FileWriter fw=new FileWriter("./"+_Name+"/"+_Name+".csv");
                 PrintWriter pw=new PrintWriter(fw);
                 pw.close();
                 fw.close();
                 New_UserNameKeys.CreatUserName("admin", "admin", "Admin", "Admin");
                 UpdateUserNameKeys("Connect", New_UserNameKeys);
               }
        } catch (Exception e) {
            new ErrorDialog("Could not Start "+_Name);
        }
 
 return New_UserNameKeys;
}
public void UpdateUserNameKeys(String _Name,UserNameKeys _UserNameKeys)
{
     try {            
                FileWriter fw=new FileWriter("./"+_Name+"/"+_Name+".csv");
                PrintWriter pw=new PrintWriter(fw);
                for (UserNameKey usernamekey : _UserNameKeys.GetUserNameKeysList()) {            
                pw.println(usernamekey.GetUserName()+",,"+usernamekey.GetPass()+",,"+usernamekey.GetId()+",,"+usernamekey.GetType());
            }            
                pw.close();
                fw.close();
        
    } catch (Exception e) {
        new ErrorDialog("Could not update "+_Name);
    } 
}
}
