public class Palindrome
{
     public static void main(String []args)
     {
        String str1 ="naman";
        String str =new StringBuffer(str1).reverse().toString();
        System.out.println(str);
        if(str.equals(str1))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
     }
}