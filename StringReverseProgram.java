package TDIT_String;

public class StringReverseProgram {
    public static void main(String[] args) {
        String s = "987654321";
        System.out.println(s.length());  // 4    9  0 - 8
        char[] charArray = s.toCharArray();
        System.out.println(s.charAt(2));   //c
        //charArray.length => 4     0 1 2 3
        // a  b   c   d
        // 0  1   2   3
        // i = 3  2  1  0  -1
        // d c b  a
        // 9  8  7  6  5  4  3  2  1
        // 0  1  2  3  4  5  6  7  8

        // 8  7  6  5  4  3  2  1  0
        for(int i = charArray.length-1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }

        // a b c d
        // 0 1 2 3
        //d c b a
        //length
        //charAt(index);
        //dcba
        //index -> Used in Array -> starts with 0
        //String is nothing sequence of characters
        //s  = a b c d
        //Array
        //datatype[] variableName = new datatype[size];
        int[] intArray = new int[10];
        //String[] stringArray = new String[100];
        // 10  1 - 10
        //
        // consecutive memory blocks reserved for this array
    }
}
