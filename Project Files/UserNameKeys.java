
import java.util.ArrayList;
import java.util.List;

public class UserNameKeys {
List<UserNameKey> usernamekeys;
public UserNameKeys()
{
    this.usernamekeys=new ArrayList<UserNameKey>();
}
public Boolean IsExist(String _Id,String _UserName)
{
    for (UserNameKey usernamekey : this.usernamekeys) {
        if(usernamekey.GetId().equals(_Id))
        {
            
            return false;
        }
        if(usernamekey.GetUserName().equals(_UserName))
        {
           
            return false; 
        }
            
    }
    return true;
}
public void CreatUserName(String _UserName,String _Pass,String _Id, String _Type)
{
    try {
        if(this.IsExist(_Id, _UserName))
        {
            this.usernamekeys.add(new UserNameKey(_UserName, _Pass, _Id, _Type));
        }
    } catch (Exception e) {
        new ErrorDialog("Encountered A Problem While Creating Username");
    }
}
public void DelUserName(String _Id)
{
    try {
        int pos=0;
        for (UserNameKey usernamekey : this.usernamekeys) {
            if(usernamekey.GetId().equals(_Id))
                break;
            pos++;
        }
        this.usernamekeys.remove(pos);
    } catch (Exception e) {
        new ErrorDialog("The Username Was Not Found In The System!");
    }
}
public UserNameKey TryConnection(String _UserName,String _Password)
{
    for (UserNameKey usernamekey : this.usernamekeys) {
        if(usernamekey.GetUserName().equals(_UserName))
        {
            if(!usernamekey.GetPass().equals(_Password))
            {    
                break;
            }
            return usernamekey; 
        }
    }
    new ErrorDialog("Wrong Username Or Password!");
    return null;
}
public List<UserNameKey> GetUserNameKeysList()
{
    return this.usernamekeys;
}
public String toString()
{
    String NewString="";
    for (UserNameKey usernamekey : this.usernamekeys) {
      NewString+=usernamekey;
    }
    return NewString;
}
}
