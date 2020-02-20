import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ErrorDialog {                                          
    public ErrorDialog(String error)
    {
        JFrame f = new JFrame();                                    
                f.setAlwaysOnTop(true);                             
               
                JOptionPane.showMessageDialog(f, error,"ERROR",JOptionPane.INFORMATION_MESSAGE);            
                f.dispose();                                        
    }
    
}
