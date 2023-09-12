package TDIT_String;

public class Countchar {
    public static void main(String[] args) {
       String s= "count of all characters except space";
       int count=0;

        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)!= ' ')
                count++;
        }
        System.out.println("total characters are " + count);
    }

}
