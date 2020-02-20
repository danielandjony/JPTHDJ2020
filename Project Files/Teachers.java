
import java.util.ArrayList;
import java.util.List;


public class Teachers implements Teachers_Interface{
   private List<Teacher> TeacherList;
   public Teachers()
   {
       this.TeacherList=new ArrayList<Teacher>();
   }
   public boolean CheckId(String _Id)
   {
       for (Teacher teacher : TeacherList) {
           if(teacher.GetId().equals(_Id))
               return true;
       }
       return false;
   }
   public void AddTeacher(String _Id,String _name,String _Phone,String _Address,int _TeachesAt,Students _Aca,Students _Tec,Teachers _teachers,UserNameKeys _Connect)
   {
       if(!(this.CheckId(_Id))&&!(_Aca.CheckId(_Id))&&!(_Tec.CheckId(_Id)))
       {
           this.TeacherList.add(new Teacher(_Id, _name, _Phone, _Address, _TeachesAt));
           String name=_name;
          
           _Connect.CreatUserName(_Id, "123", _Id, "Teachers");
           
             new FileManeger().UpdateTeachers("Teachers",_teachers);
             new FileManeger().UpdateUserNameKeys("Connect", _Connect);  
             new Dialog("Teacher Added Successfully!\nUsername: "+_Id+"\nPassword: 123");
       }else{
           new ErrorDialog("The Id You Entered Is Already In The System");
       }
   }
   private int GetIndexOfTeacher(String _Id)
   {
       int pos=0;
           for (Teacher teacher : this.TeacherList) {
               if(teacher.GetId().equals(_Id))
                   break;
               pos++;
           }
           return pos;
   }
   public void RemoveTeacher(String _Id)
   {
       try {
         if(!_Id.equals("No Teacher")){
                Teacher thisteacher=this.GetTeacherById(_Id);
                Teacher NoTeacher=this.GetTeacherById("No Teacher");
                
                this.TeacherList.remove(this.GetIndexOfTeacher(_Id));
                for (Profession profession : thisteacher.GetProfessionsObject().GetProfessionList()) {
                    profession.SetTeacher(NoTeacher);
                }
                new Dialog("Successfully Removed Teacher!");
         }else
            new ErrorDialog("This Object Is Part Of The System And Cannot Be Removed!");    
       } catch (Exception e) {
           new ErrorDialog("The Teacher Was Not Found In the System!");
       }
   }
   public Teacher GetTeacherById(String _Id){
       try {
           return this.TeacherList.get(this.GetIndexOfTeacher(_Id));
       } catch (Exception e) {
            return null;
       }      
   }
   public String GetProfessionByTeacher(String _Id)
   {
       try {
          String NewString=this.TeacherList.get(this.GetIndexOfTeacher(_Id)).GetProfessionsObject().toString()+"\n";
          return NewString;
       } catch (Exception e) {
           new ErrorDialog("The Teacher Was Not Found In The System!");
           return "";
       }
   }
   public List<Teacher> GetTeachersList()
   {
       return this.TeacherList;
   }
   public String toString(){
       String NewString="";
       for (Teacher teacher : this.TeacherList) {
           NewString+=teacher+"\n"+this.GetProfessionByTeacher(teacher.GetId());
       }
       return NewString;
   }
}
