import java.util.*;
public class Student extends Human{
    private Megama megama; 
    private char SchoolYear; 
    private int CollegeType; 
    public Student(String _Id, String _Name, String _Phone, String _Address){ 
        super(_Id,_Name,_Phone,_Address);
        this.SchoolYear = 'A';
    }
    
     
    public void SetMegama(Megama _Megama){ 
        this.megama = _Megama;
    }
    public void SetSchoolYear(char _SchoolYear){ 
        this.SchoolYear = _SchoolYear;
    }

    public Megama GetMegama(){ 
        return this.megama;
    }
    public char GetSchoolYear(){ 
        return this.SchoolYear;
    }

    public String toString(){
        return "Id:"+this.GetId()+"\t\tName:"+this.GetName()+"\t\tPhone:"+this.GetPhone()+"\t\tAddress: "+this.GetAddress()+"\t\tMegama: "+this.megama.GetName()+"\t\tYear: "+this.GetSchoolYear()+"\n";
    }
}
