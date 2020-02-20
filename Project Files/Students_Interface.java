public interface Students_Interface {
    public void AddStudent(String Id, String Name, String Phone, String Address,String _MegamaId, Megamot _Megamot,Teachers _teacher,Students _students,UserNameKeys _Connect,Students _tech,Students _aca,Megamot _techmeg,Megamot _acameg); 
    public void RemoveStudent(String Id, Megamot _Megamot,UserNameKeys _Connect,Students _tech,Students _aca,Megamot _techmeg,Megamot _acameg);
    public Student GetStudent(String Id);
    public boolean CheckId(String Id);
}