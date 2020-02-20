public class Profession {
    private String Id; 
    private String Name; 
    private Teacher teacher; 
    private int StudentNumber; 
    private Megama megama;
        public Profession(String _Id, String _Name, Teacher _Teacher){ 
        this.Id = _Id;
        this.Name = _Name;
        this.teacher = _Teacher;
        this.StudentNumber = 0; 
    }
    
    public void SetId(String _id){
        this.Id = _id; 
    }
    public void SetName(String _Name){
        this.Name = _Name; 
    }
    public void SetTeacher(Teacher _Teacher){
        this.teacher = _Teacher; 
    }
    public void SetStudentNum(int _Num){
        this.StudentNumber = _Num;
    }
    public void SetMegama(Megama _Megama)
    {
        this.megama=_Megama;
    }
  
    public String GetId(){
        return this.Id; 
    }
    public String GetName(){
        return this.Name; 
    }
    public Teacher GetTeacher(){
        return this.teacher; 
    }
    public int GetStudentNum(){
        return this.StudentNumber;
    }
    public Megama GetMegama()
    {
        return this.megama;
    }
    public String toString(){
        return "Profession Id: "+this.Id+"\t,Profession Name: "+this.Name+"\t,Taught by: "+this.teacher.GetName()+"\t,Number of students:"+this.StudentNumber+"\tTrendName: "+this.megama.GetName()+"\n";
    }

}
