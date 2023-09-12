package TDIT_String;

public class Splitmethod {

    public static void main(String[] args) {
        String Lines = " I have meeting at 6pm";

        // split string from space
        String[] result = Lines.split(" ");

        System.out.print("result = ");
        for (String str : result) {
            System.out.print(str + ", ");
        }
    }
}