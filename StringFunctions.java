public class StringFunctions
{
    public static void main(String[] args) 
    {
        int begin=2;
        String str="StudyTonight";
        System.out.println(str.indexOf('u'));   //3rd form
        System.out.println(str.indexOf('t', 5));    //2nd form
        String subString="Ton";
        System.out.println(str.indexOf(subString)); //1st form
        System.out.println(str.indexOf(subString,4));   //4th form
        System.out.println(str.substring(4,7));
        String str1 = "ABCD";
        System.out.println(str.toUpperCase());
        System.out.println(str1.toLowerCase());
    }
}