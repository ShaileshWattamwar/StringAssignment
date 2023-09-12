package TDIT_String;

final class Immute {


    private String Name;


    public Immute( String Name){
        this.Name=Name;
    }

    public String Namemethod() {

        return Name;
    }
}
class Demo1
{
    public static void main(String ar[])
    {
        Immute e = new Immute("Zei");
        String s1 = e.Namemethod();
        System.out.println("vish name is  " + s1);
    }
}

