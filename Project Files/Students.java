import java.util.*;
import java.util.Scanner;
public class Students implements Students_Interface{
    private List<Student> StudentList;
    
    public Students(){
        this.StudentList = new ArrayList<Student>();                             
    }
    
    public boolean CheckId(String Id){                                          
        for (Student student : this.StudentList) {                              
            if(student.GetId().equals(Id))                                          
                return true;
        }
        return false;                                                            
    }
    public void AddStudent(String Id, String Name, String Phone, String Address,String _MegamaId, Megamot _Megamot,Teachers _teacher,Students _students,UserNameKeys _Connect,Students _tech,Students _aca,Megamot _techmeg,Megamot _acameg){
       if(!(_teacher.CheckId(Id))&&!(_students.CheckId(Id))&&!(this.CheckId(Id))) 
       {
           if(_Megamot.CheckIfExistsById(_MegamaId))                             
           {
              Student newstud = new Student(Id, Name, Phone, Address);           
              for(Megama m: _Megamot.GetListMegamot())                           
                {
                    if(m.GetId().equals(_MegamaId))                              
                        newstud.SetMegama(m);                                   
                    m.AddStudentToMegama(newstud);                                     
                }
                this.StudentList.add(newstud);                                  
                _Megamot.ChangeStudentsInProfessions(_MegamaId, 1);              
               
                
               

                if(_Megamot.GetType().equals("Technologic"))
               {
                  _Connect.CreatUserName(Id, "123", Id,"TechnologitStudents");
                  new FileManeger().UpdateProfession("TechnologiMegamot", _techmeg);
                  new FileManeger().UpdateStudents(_tech, "TechnologitStudents");
               }else{               
                new FileManeger().UpdateProfession("AcademicMegamot", _acameg);
                new FileManeger().UpdateStudents(_aca, "AcademicStudents");
                _Connect.CreatUserName(Id, "123", Id,"AcademicStudents");
               }
                new FileManeger().UpdateUserNameKeys("Connect", _Connect);  
                new Dialog("Student Added Successfully!\nUsername: "+Id+"\nPassword: 123"); 
           
           }else{
                new ErrorDialog("The Id Of the Trend Not Found!");             
           }
          
       }else{
           new ErrorDialog("The Id of the student already In the System!");     
       }
           
    }
    public void RemoveStudent(String Id, Megamot _Megamot,UserNameKeys _Connect,Students _tech,Students _aca,Megamot _techmeg,Megamot _acameg){                   
          try{
                int pos = 0;                                                            
                for(Student s:this.StudentList)
                {
                    if(s.GetId().equals(Id)){                        
                        break;           
                    }
                    pos++;
                }
                Student s=this.StudentList.get(pos);
                this.StudentList.remove(pos);
                    s.GetMegama().RemoveStudentFromMegama(s);
                    _Megamot.ChangeStudentsInProfessions(s.GetMegama().GetId(),-1);
                    
                    if(_Megamot.GetType().equals("Technologic"))
               {
                  _Connect.DelUserName(Id);
                  new FileManeger().UpdateProfession("TechnologiMegamot", _techmeg);
                  new FileManeger().UpdateStudents(_tech, "TechnologitStudents");
               }else{               
                new FileManeger().UpdateProfession("AcademicMegamot", _acameg);
                new FileManeger().UpdateStudents(_aca, "AcademicStudents");
                _Connect.DelUserName(Id);
               }
                new FileManeger().UpdateUserNameKeys("Connect", _Connect);  
               
                    
                    new Dialog("Successfully removed student");
            }catch(Exception e){
                new ErrorDialog("The Id you entered does not exist!");  
            }
    }
  public List<Student> GetListStudent()/////////////////////////
    {
        return this.StudentList;
    }
    public Student GetStudent(String Id){                                       
        
            for(Student s: this.StudentList)
                if(s.GetId().equals(Id))
                    return s;
            
        return null;

}
    public String toString(){
        String result = "";
        for(Student s:this.StudentList)
        {
            result+=s;
        }
        return result;
    }
}
