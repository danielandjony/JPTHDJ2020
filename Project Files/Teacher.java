
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Teacher extends Human {                
    private int TeachesAt;                                                                         
    private ProfessionListFuncs ListProfession;                             
    
    public Teacher(String _Id,String _name,String _Phone,String _Address,int _TeachesAt)          
    {
        super(_Id,_name,_Phone,_Address);
        this.TeachesAt=_TeachesAt;
        this.ListProfession=new ProfessionListFuncs();
    }
    /*-סטרים-*/
    public void SetTeachesAt(int _TeachesAt)                                                        
    {
        this.TeachesAt=_TeachesAt;
    }
    /*-גטרים-*/
    public int GetTeachesAtToFile()
    {
        return this.TeachesAt;
    }
    public String GetTeachesAt()                                                                  
    {
        String NewString="";                                                                       
        if(this.TeachesAt==1)
            NewString+="Technologic";                                                              
        else if(this.TeachesAt==2)                                                                 
            NewString+="Academy";
        else
            NewString+="Both";
        return NewString;
    }
 public ProfessionListFuncs GetProfessionsObject(){ 
        return this.ListProfession;
    }

    public String toString(){                                                                      
        return "Id:"+this.GetId()+"\t\tName:"+this.GetName()+"\t\tPhone:"+this.GetPhone()+"\t\tAddress: "+this.GetAddress()+"\t\tTeachesAt:"+this.GetTeachesAt();
    }
    
}
