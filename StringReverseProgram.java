package TDIT_String;

public class StringReverseProgram {
    public static void main(String[] args) {
        String s = "987654321";
        System.out.println(s.length()); 
        char[] charArray = s.toCharArray();
        System.out.println(s.charAt(2));  
       
        for(int i = charArray.length-1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
        
        int[] intArray = new int[10];
    
    }
}
