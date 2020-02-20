
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Megamot {                              
    
    private String Type;
    private List<Megama> MegamotList;                       
    public Megamot(String _type)                                        
    {
        this.Type=_type;
        MegamotList=new ArrayList<Megama>();        
    }

   private String RandomIdMegama(Megamot _M)                
   {
         Random r = new Random();                           
         boolean flag=false;                                
         String id;
         do{
         id = String.valueOf(r.nextInt(998)+1);
             for (Megama megama : MegamotList) {
                 if(megama.GetId().equals(id))
                 {
                     flag=true;
                     break;
                 }
                 for (Megama megama1 : _M.GetListMegamot()) {
                     if(megama1.GetId().equals(id))
                    {
                     flag=true;
                     break;
                    }  
                 }
             }
             
         }while(flag);
            return id;
   }
   private String RandomIdProfession(Megamot _M)                 
   {
       Random r = new Random();                                 
         boolean flag=false;                                   
         String id;
         do{
         id = String.valueOf(r.nextInt(8999)+1000);
             for (Megama megama : this.MegamotList) {
                 
                 for (Profession  pro: megama.GetProfessionList()) {
                     if(pro.GetId().equals(id))
                     {
                         flag=true;
                         break;
                     }                     
                 }
                 if(flag)
                         break;
             }
             if(!flag){
                for (Megama megama1 : _M.GetListMegamot()) {
                    for (Profession  pro: megama1.GetProfessionList()) {
                       if(pro.GetId().equals(id))
                        {
                            flag=true;
                            break;
                        }                     
                    }
                    if(flag)
                       break;
             }
            }
         }while(flag);
            return id;
   }
   public boolean CheckIfExistsByName(String _Name)            
   {
       if(!this.MegamotList.isEmpty())                          
       {
           for (Megama megama : MegamotList) {
               if(megama.GetName().equals(_Name))
                   return true;
           }
       }
       return false;
   }
      public boolean CheckIfExistsById(String _Id)            
   {
          
       if(!this.MegamotList.isEmpty())                          
       {
           for (Megama megama : MegamotList) {
               if(megama.GetId().equals(_Id))
                   return true;
           }
       }
       return false;
   }
    public Megama GetMegamaToFile(String _Id)
    {
        for (Megama megama : this.MegamotList) {
            if(megama.GetId().equals(_Id))
                return megama;
        }
        return null;
    } 
     public List<Megama> GetListMegamot(){                      
         return this.MegamotList;
     }
     public void CreateMegama(String _name,Megamot _M)                              
     {
         if(!this.CheckIfExistsByName(_name)&&!_M.CheckIfExistsByName(_name))       
         {
             this.MegamotList.add(new Megama(this.RandomIdMegama(_M), _name,this.Type));
         }else{
             new ErrorDialog("The name of this trend already exists!");       
         }
     }
     public void DelMegama(String _Id)                                                                  
     {
          int pos=0;                                                                                  
          if(!this.MegamotList.isEmpty())                                                                                        
        {                                                                                               
             boolean Flag=false; 
            for (Megama megama : this.MegamotList) {                                                
                if(megama.GetId().equals(_Id))
                {
                    for(Profession p:megama.GetProfessionsObject().GetProfessionList())
                    {
                        p.GetTeacher().GetProfessionsObject().DelProfessionByIdFromTeacher(p.GetId());
                    }
                   this.MegamotList.remove(pos);
                   Flag=true;
                   break;
                }
                pos++;     
            }          
               if(!Flag)                                                           
                new ErrorDialog("Trend Id was not found. Check the Id you entered again!");
            
        }else{
            new ErrorDialog("List is Empty!");
        }  
     }
     
     public void CreateProfessionByMegamaId(String _MegamaId,String _ProfessionName,String _TeacherId,Megamot _M,Teachers _Teachers){            
         if(_Teachers.CheckId(_TeacherId))
         {
            try {
                boolean Flag=false;                                                                                                
                for (Megama megama : this.MegamotList) {                                
                    if(megama.GetId().equals(_MegamaId))
                    {
                        Profession NewProfession=new Profession(this.RandomIdProfession(_M), _ProfessionName,  _Teachers.GetTeacherById(_TeacherId));
                        NewProfession.SetMegama(megama);
                       NewProfession.SetStudentNum(megama.GetStudents().size());
                        megama.GetProfessionsObject().AddProfession(NewProfession);                 
                        _Teachers.GetTeacherById(_TeacherId).GetProfessionsObject().AddProfession(NewProfession);
                        Flag=true;
                        break;
                    }
                }
                if(!Flag)
                    throw (new Exception());
            } catch (Exception e) {
                 new ErrorDialog("The Id Of The Trend Was Not Found!");                                   
            }
         }else{
             new ErrorDialog("The Teacher Was Not Found In The System, Profession Could Not Be Added!");
         }
     
     }
     public void DelProfessionById(String _ProfessionId,Teachers _Teachers)                                                    
     {
         boolean Flag=false;                                                                                
         try {
              for (Megama megama : MegamotList) {                                                            
             if(megama.GetProfessionsObject().CheckIfExists(_ProfessionId))
             {
                 megama.GetProfessionsObject().DelProfessionbyId(_ProfessionId);
                 
                 Flag=true;
                 break;
             }             
         }
              if(!Flag)
                  throw (new Exception());
         } catch (Exception e) {
              new ErrorDialog("Profession ID Was not found. Check the Id you entered again!");
         }        
     }
     public List<Profession> GetProfessionListByMegamaId(String _Id){                                       
         for (Megama megama : MegamotList) {                                                                
             if(megama.GetId().equals(_Id)) 
             {
                 return megama.GetProfessionList();
             }
         }
         new ErrorDialog("The Id Of The Trend Was Not Found!");
         return null;         
     }
     public void ChangeStudentsInProfessions(String _Id,int _Num)    
     {
         for (Megama megama : this.MegamotList) {
             if(megama.GetId().equals(_Id))
             {
                 for (Profession pro : megama.GetProfessionsObject().GetProfessionList()) {
                     pro.SetStudentNum(pro.GetStudentNum()+_Num);
                 }
                 break;
             }
         }
     }
      public Megama GetMegamaByProfessionId(String _Id)
     {
         for (Megama meg :this.MegamotList ) {
            if(meg.GetProfessionsObject().CheckIfExists(_Id))
                return meg;
         }
         return null;
     }
      public Profession GetProfessionById(String _Id)
      {
          for (Megama megama : this.MegamotList) {
              for (Profession pro :megama.GetProfessionsObject().GetProfessionList()) {
                  if(pro.GetId().equals(_Id))
                      return pro;
              }
          }
          return null;
      }
     public String GetType(){
         return this.Type;
     }
     public String toString()
     {
         String NewString="";
         for (Megama megama : MegamotList) {
             NewString+="MegamaId: "+megama.GetId()+"\tMegamaName:"+megama.GetName()+"\n"+megama.GetProfessionList()+"\n";             
         }
         return NewString;
     }
}    
