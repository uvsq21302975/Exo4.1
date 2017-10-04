import java.*;


public class ChaineCryptée
{
    
    private int decalage;
    private String chaine;

   
    
    
    private ChaineCryptée(int decalage, String ch)
    {
        if(ch==null) {chaine="VIDE";}   
       
        this.decalage=decalage;
        
        int i;
        char a;
        String decryptee="";
        
        for(i=0;i<ch.length();i++)
        {
            a=decaleCaractere(ch.charAt(i),decalage);
            decryptee+=a;
        }
        this.chaine=decryptee;

      
    }
    
    
    private static char decaleCaractere (char c, int decalage)
    {
        return ( c < 'A' || c > 'Z') ? c : (char)(( (c - 'A' + decalage) % 26) + 'A');
    }

     public static ChaineCryptée FromCrypted(String incrypted, int decalage)
    {
         int i;
        char a;
        String tmp="";
        
            
        
        for(i=0;i<incrypted.length();i++)
        {
            a=decaleCaractere(incrypted.charAt(i),(26-decalage));
            tmp+=a;
        }
        
        
        return new ChaineCryptée(decalage,tmp);
    }
    
    public static ChaineCryptée FromDecrypted( String indecrypted, int decalage)
    {
        return new ChaineCryptée (decalage,indecrypted);
    }

    
    
    

    public String Decrypte()
    {
        int i;
        char c;
        String decryptee="";
        
            
        
        for(i=0;i<chaine.length();i++)
        {
            c=decaleCaractere(chaine.charAt(i),(26-decalage));
            decryptee+=c;
        }
        return decryptee;
    }
    

    public String Crypte()
    {
        return chaine;
    }
    
}