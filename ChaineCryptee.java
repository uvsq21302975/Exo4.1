import java.*;
/**
 *
 * @author
 * @version 4.1
 */
public class ChaineCryptee
{
    
    private int decalage;
    private String enclair;
    
    
    
    
    /**
     * 
     *@param Si la chaine passée en clair est null alors j'initialise a "vide".
     */
    private ChaineCryptee(String enclair,int decalage)
    {
        
        if(enclair==null) {enclair="VIDE";}
        
        this.decalage=decalage;
        this.enclair=enclair;
        
    }
    
         private static char decaleCaractere (char c, int decalage)
    {
        return ( c < 'A' || c > 'Z') ? c : (char)(( (c - 'A' + decalage) % 26) + 'A');
    }

    
    
    public String decrypte()
    {
        return enclair;
    }
    
    
    public String crypte()
    {
        
        char a;
        String chiffrée="";
        int i;
        for(i=0;i<enclair.length();i++)
        {
            a=decaleCaractere(enclair.charAt(i),decalage);
            chiffrée+=a;
        }
        return chiffrée;
    }
   
    
   
}