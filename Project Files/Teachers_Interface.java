
import java.util.List;
public interface Teachers_Interface {
    public boolean CheckId(String _Id);
    public void AddTeacher(String _Id,String _name,String _Phone,String _Address,int _TeachesAt,Students _Aca,Students _Tec,Teachers _teachers,UserNameKeys _Connect);
    public void RemoveTeacher(String _Id);
    public Teacher GetTeacherById(String _Id);
    public String GetProfessionByTeacher(String _Id);
    public List<Teacher> GetTeachersList();
}
