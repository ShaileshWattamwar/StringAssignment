package TDIT_String;

class Replacemethod {
    public static void main(String[] args) {

        String str1 = "bat ball";

      
        System.out.println(str1.replace('b', 'c'));

    }
}
class Stringtosubstring {
    public static void main(String[] args) {

        String str1 = "C++ Programming";

       
        System.out.println(str1.replace("C++", "Java"));  // Java Programming


        
        System.out.println("aa bb aa zz".replace("aa", "zz")); // zz bb zz zz

       
        System.out.println("Java".replace("C++", "C")); // Java
    }
}

class StringreplaceCharacters {

    public static void main(String[] args) {
        String str1 = "abc cba";

        
        System.out.println(str1.replace('a', 'z'));  

        
        System.out.println("Lava".replace('L', 'J'));  // Java

        
        System.out.println("Hello".replace('4', 'J'));  // Hello

    }
}
