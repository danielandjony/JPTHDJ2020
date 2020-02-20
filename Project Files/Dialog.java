import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Dialog {                                          
    public Dialog(String message)
    {
        JFrame f = new JFrame();                                    
                f.setAlwaysOnTop(true);                             
                JOptionPane.showMessageDialog(f, message);            
                f.dispose();                                        
    }
    public Dialog()
    {
        
    }
    public int AskDialog(String Messege,String Title)
    {
        JFrame f = new JFrame();                                    
                f.setAlwaysOnTop(true);                             
                int dialogResult=JOptionPane.showConfirmDialog(f, Messege,Title,JOptionPane.YES_NO_OPTION);            
                f.dispose();      
        return dialogResult;
    }
    
}
