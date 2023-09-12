package TDIT_String;

class Replacemethod {
    public static void main(String[] args) {

        String str1 = "bat ball";

        // replace b with c
        System.out.println(str1.replace('b', 'c'));

    }
}
class Stringtosubstring {
    public static void main(String[] args) {

        String str1 = "C++ Programming";

        // all occurrences of "C++" is replaced with "Java"
        System.out.println(str1.replace("C++", "Java"));  // Java Programming


        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz")); // zz bb zz zz

        // substring not in the string
        System.out.println("Java".replace("C++", "C")); // Java
    }
}

class StringreplaceCharacters {

    public static void main(String[] args) {
        String str1 = "abc cba";

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(str1.replace('a', 'z'));  

        // all occurences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));  // Java

        // character not in the string
        System.out.println("Hello".replace('4', 'J'));  // Hello

    }
}
