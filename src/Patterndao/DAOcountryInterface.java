package Patterndao;


import ca1.country;
import java.util.ArrayList;
/**
 *
 * @author eduar
 */
public interface DAOcountryInterface {
    
    public ArrayList<country> getCountry();
    public country findCountry(String Code);
    public ArrayList<country> getName(String name);
    public boolean saveCountry(country c);
    
}
