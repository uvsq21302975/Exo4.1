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
     *@return Si la chaine passée en clair est null alors j'initialise a "vide".
     */
    private ChaineCryptee(String enclair,int decalage)
    {
        
        if(enclair==null) {enclair="VIDE";}
      
        this.decalage=decalage;
      
        char a;
        String chiffrée="";
        int i;
        for(i=0;i<enclair.length();i++)
        {
            a=decaleCaractere(enclair.toUpperCase().charAt(i),decalage);
            chiffrée+=a;
        }
        enclair=chiffrée;
        
    }
    
   
        private static char decaleCaractere (char c, int decalage)
    {
        return ( c < 'A' || c > 'Z') ? c : (char)(( (c - 'A' + decalage) % 26) + 'A');
    }
    
    
    public String decrypte()
    {
        String chaine = "";
        char a;
         
        int i;
        
                for(i=0;i<enclair.length();i++)
           { a=decaleCaractere(enclair.toUpperCase().charAt(i),-decalage); 
             chaine += a;
           }
             
        return chaine;
        
    }
    
    
    public String crypte()
    {
        return enclair;
        
    }
   
     public static ChaineCryptee FromCrypted(String incrypted, int decalage) { 

        int i;
        char a;
        String chaine_pour_decrypter = "";
        
        for(i=0;i<incrypted.length();i++)
           { a=decaleCaractere(incrypted.toUpperCase().charAt(i),-decalage ); 
             chaine_pour_decrypter += a;
            }
            
        ChaineCryptee chaine_a_crypter = new ChaineCryptee(chaine_pour_decrypter, decalage);
        return chaine_a_crypter;
    }
    
        public static ChaineCryptee FromDecrypted(String indecrypted, int decalage) {
        ChaineCryptee chaine_a_crypter = new ChaineCryptee(indecrypted,decalage);
        return chaine_a_crypter;
    }
   
}