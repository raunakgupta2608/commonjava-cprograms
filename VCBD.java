import java.util.*;
public class VCBD 
{
    public static void main(String args[])
    {
	    Scanner sc = new Scanner(System.in);
        String str = "HELLO world i124 aLL";
	    int vowels =0, con=0, digit=0, bs=0;
	    
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c =='a' || c =='e' || c =='i' || c =='o' || c =='u')
            {
                ++vowels;
            }
            else if(c >= 'a' && c<='z')
            {
                ++con;
            }
            else if(c > '0' && c<='9')
            {
                ++digit;
            }
            else if(c == ' ')
            {
                ++bs;
            }
        }
        System.out.println("Vowels :"+vowels);
        System.out.println("Vowels :"+con);
        System.out.println("Vowels :"+digit);
        System.out.println("Vowels :"+bs);
    }    
}