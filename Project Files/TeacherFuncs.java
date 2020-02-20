public interface TeacherFuncs {
    public void AddTeacher(String _Id,String _name,String _Phone,String _Address,int _TeachesAt,Students _Aca,Students _Tec);
    public void RemoveTeacher(String _Id);
    public Teacher GetTeacherById();       
    
    @Override
    public String toString();
}
