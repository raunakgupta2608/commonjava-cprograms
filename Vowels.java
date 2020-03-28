import java.*;
public class Vowels
{
    public static void main(String []args)
    {
       int count =0;
       String str1, str2, str3;
       str1 = "helloworld";
       System.out.println("String entered is: "+str1);
       char[] gfg = str1.toCharArray();
       String a_letter = Character.toString(str1.charAt(0));
       System.out.println( a_letter );
       for(int i=0;i<str1.length(); i++)
       {
           char c = str1.charAt(i);
           if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
              c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' )
            {
                gfg = Character.toString("$");
            }  
       }
       System.out.println(count);
    }
}