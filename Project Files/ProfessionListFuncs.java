
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProfessionListFuncs implements Profession_Interface{
    private List<Profession> profession; 
    public ProfessionListFuncs()
    {
        profession=new ArrayList<Profession>();
    }
       
    @Override
      public boolean CheckIfExists(String _Id)                                              
    {
        for (Profession profession1 : this.profession) {                                            
            if(profession1.GetId().equals(_Id))
                return true;
        }
        return false;
    }
    @Override
    public void AddProfession(Profession p){                                                        
        if(!this.CheckIfExists(p.GetId()))
        {                                                                                           
            try {
                this.profession.add(p);
            } catch (Exception e) {
                 new ErrorDialog("Encountered a problem while trying to add this profession");
            }
        }else{
             new ErrorDialog("This profession is already in the list!");
        }
    }
  

    
    public void DelProfessionByIdFromTeacher(String _Id)
    {
        if(!this.profession.isEmpty())                                                              
        {
            try {
                int pos=0;   
            for (Profession profession1 : this.profession) {
                if(profession1.GetId().equals(_Id))
                {
                    break;
                }
                pos++;     
            }            
                this.profession.remove(pos);          
            } catch (Exception e) {
                new ErrorDialog("The Profession Id Was Not Found!");
            }
                                                                                         
        }else{
             new ErrorDialog("List is Empty!");
        }  
    }
  
    @Override
    public void DelProfessionbyId(String _Id)                                       
    {        
        if(!this.profession.isEmpty())                                                              
        {
            try {
                int pos=0;   
            for (Profession profession1 : this.profession) {
                if(profession1.GetId().equals(_Id))
                {
                    break;
                }
                pos++;     
            }
                this.profession.get(pos).GetTeacher().GetProfessionsObject().DelProfessionByIdFromTeacher(_Id);
                this.profession.remove(pos); 
            } catch (Exception e) {
             new ErrorDialog("The Profession Id Was Not Found!");
            }                                                                                  
        }else{
             new ErrorDialog("List is Empty!");
        }  
    }
        public Profession GetProfessionById(String Id){ 
        if(this.profession.isEmpty()){ 
             new ErrorDialog("No professions found in this trend");
            return null;
        }
        for (Profession p1 : this.profession) { 
            if(p1.GetId().equals(Id)) 
              return p1;   
        }
             new ErrorDialog("Encountered a problem. Check the Id you entered!");
            return null; 
    }
    public List<Profession> GetProfessionList(){
        return this.profession;
    }
    
    @Override
    public String toString(){                                                            
        
        String NewString="";
        for (Profession profession1 : this.profession) {
            NewString+=profession1;
        }
        return NewString;
    }
}
