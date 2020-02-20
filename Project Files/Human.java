abstract public class Human {    
    private String Id;          
    private String Name;         
    private String Phone;        
    private String Address;      
    
    public Human(String _Id,String _name,String _Phone,String _Address)      
    {  
        this.Id=_Id;
        this.Name=_name;
        this.Phone=_Phone;
        this.Address=_Address;
    }
   
     /*-סטרים-*/
    public void SetId(String _Id)              
    {
        this.Id=_Id;
    }
    public void SetName(String _Name)          
    {
        this.Name=_Name;
    }
    public void SetPhone(String _Phone)        
    {
        this.Phone=_Phone;
    }
    public void SetAddress(String _Address)   
    {
        this.Address=_Address;
    }
         /*-גטרים-*/
    public String GetId()                      
    {
        return this.Id;
    }
    public String GetName()                     
    {
        return this.Name;
    }
    public String GetPhone()                    
    {
        return this.Phone;
    }
    public String GetAddress()                  
    {
        return this.Address;
    }
}
