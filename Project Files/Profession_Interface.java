import java.util.List;
public interface Profession_Interface { 
    
  public boolean CheckIfExists(String _Id);
  public void AddProfession(Profession p);
  public void DelProfessionbyId(String _Id);
  public Profession GetProfessionById(String Id);
  public List<Profession> GetProfessionList();
   @Override
   public String toString();                            
    
}
