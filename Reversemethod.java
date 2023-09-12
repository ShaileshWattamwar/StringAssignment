package TDIT_String;
import java.util.Scanner;

public class Reversemethod {
    public static void main(String[] args) {
        String S="DIZO";
        String S2="";

        for (int i =S.length() -1; i>=0 ; i--) {
            S2+= S.charAt(i);
        }
        System.out.println(S2);
    }
}


// using char array to reverse a string is easy than creating a new string and storing.
class Reversestringass{
    public static void main(String[] args) {
        String S="Java is a programming language";
        char[] charArray = S.toCharArray();
        for (int i = charArray.length-1; i>=0 ; i--) {
            System.out.print(S.charAt(i));
        }


    }
}

class ReverseofaString
{
    public static void main(String[] arg)
    {
        ReverseofaString rev=new ReverseofaString();
                  Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String  str=sc.nextLine();
        System.out.println("Reverse of a String  is : "+rev.reverse(str));
    }
    static String reverse(String s)
    {
        String rev="";
        for(int j=s.length();j>0;--j)
        {
            rev=rev+(s.charAt(j-1));
        }
        return rev;
    }
}
