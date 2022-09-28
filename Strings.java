public class Strings
{
    public static void main(String[] args) 
    {
        System.out.println("Hello World!");
        String string1 = "I am a string";
        String string2 = string1;
        string1 = string2;
        String string3 = "I am also a string";
        boolean stringsEqual = string1.equals(string2);
    }
}
