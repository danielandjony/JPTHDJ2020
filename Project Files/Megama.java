import java.util.*; 
import java.util.Iterator; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Megama {
    private String Id;                                              
    private String Name;                                            
    private String Type;
    private ProfessionListFuncs ListProfession;                     
    private List<Student> StudentList;
    
    
    public Megama(String _Id, String _Name,String _Type){                            
        this.Id = _Id;
        this.Name = _Name;
        this.ListProfession=new ProfessionListFuncs();
        this.StudentList = new ArrayList<Student>();
        this.Type=_Type;
    }
    /*סטרים*/
    public void SetId(String _Id){                                  
        this.Id = _Id;
    }
    public void SetName(String _Name){                               
        this.Name = _Name;
    }
    public void AddStudentToMegama(Student st){                            
        for(Student stu:this.StudentList){                        
            if(stu.GetId().equals(st.GetId()))                       
            {
                new ErrorDialog("The student is already in this trend!");
                return;                                                  
            }
        }
        this.StudentList.add(st);                                       
    }
    public void RemoveStudentFromMegama(Student st){
        int pos = 0;
        for(Student stu:this.StudentList){                                  
            if(stu.GetId().equals(st.GetId()))                   
            {
               this.StudentList.remove(pos);                        
                return;                                             
            }
            pos++;                                                   
        }
        new ErrorDialog("The Id"+st.GetId()+" does not exist.");        
    }
    
    /*גטרים*/
    public String GetId(){                                      
        return this.Id;
    }
    public String GetName(){                                    
        return this.Name;
    }
    public ProfessionListFuncs GetProfessionsObject(){                           
        return this.ListProfession;
    }
    public List<Student> GetStudents(){                                     
        return this.StudentList;
    }
    public String GetType()
    {
        return this.Type;
    }
                                                                       
 
public List<Profession> GetProfessionList(){                                
    return this.GetProfessionsObject().GetProfessionList();
}
public String toString(){                                                       
        String result="Id: "+this.Id+"\tName: "+this.Name+"\n"+this.ListProfession;         
        return result+"\n\n"+this.StudentList;
}


}

