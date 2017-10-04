
public class Main
{
    
    public Main()
    {
       
        ChaineCryptée a=  ChaineCryptée.FromCrypted("HIJK",6);
        System.out.println(a.Crypte());
        System.out.println(a.Decrypte());
        ChaineCryptée b=  ChaineCryptée.FromDecrypted("HIJK",6);
        System.out.println(b.Crypte());
        System.out.println(b.Decrypte());
        
    }

    
}