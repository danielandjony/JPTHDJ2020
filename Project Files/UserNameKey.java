public class UserNameKey {
    private String UserName;
    private String Password;
    private String Id;
    private String Type;
    public UserNameKey(String _UserName,String _Password,String _Id, String _Type)
    {
        this.UserName=_UserName;
        this.Password=_Password;
        this.Id=_Id;
        this.Type=_Type;
    }
    
    /*Setters*/
    public void SetUserName(String _UserName)
    {
       this.UserName=_UserName; 
    }
     public void SetPass(String _Password)
    {
        this.Password=_Password;
    }
      public void SetId(String _Id)
    {
       this.Id=_Id; 
    }
       public void SetType(String _Type)
    {
       this.Type=_Type; 
    }
       
       /*Getters*/
      public String GetUserName()
    {
       return this.UserName; 
    }
     public String GetPass()
    {
        return this.Password;
    }
      public String GetId()
    {
       return this.Id; 
    }
       public String GetType()
    {
       return this.Type; 
    }
       public String toString()
       {
           return "UserName: "+this.UserName+"\t\tPass: "+this.Password+"\t\t Id: "+this.Id+"\t\t Type:"+this.Type+"\n";
       }
}
