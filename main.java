import java.util.Scanner;
public class main
{
    public static void main()
    {
       Scanner in=new Scanner(System.in); 
        
    //sposób 1
    int[] tab={0,3,3,4,5};
    
    //sposób 2
    int[] tab2=new int[3];
    tab2[0]=0;
    tab2[1]=3;
    tab2[2]=3;
    
    
    System.out.println(""+tab[3]);
    
    
    for(int i=0;i<5;i++)
    {
    System.out.println("Element tablicy o indeksie ["+i+"] = "+tab[i]);
    }
    System.out.println("--------------------------");
    
    
    
    String[] imiona=new String[3];
    int[] rok_urodzenia=new int[3];
     for(int i=0;i<imiona.length;i++)
    {
    System.out.println("Podaj imie nr ["+i+"]");
    imiona[i]=in.next();
    System.out.println("Podaj rok urodzenia nr ["+i+"]");
     rok_urodzenia[i]=in.nextInt();
    }
    
       for(int i=0;i<imiona.length;i++)
    {
        System.out.println("Element tablicy imiona o indeksie ["+i+"] = "+imiona[i]+"Rok urodzenia : "+rok_urodzenia[i]);
    }
    
    }
}
