import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String myname = "AnilKumar";
        System.out.println(Arrays.toString(myname.toCharArray()));
        System.out.println(myname);
        System.out.println(myname.toLowerCase());
        System.out.println(myname.toUpperCase());
        System.out.println(myname);
        //to check the index of a character in a particular string
        System.out.println(myname.indexOf("K"));
        //to check the character at particular index in a string
        System.out.println(myname.charAt(4));

        String newname = "Hello I am Anil";
        System.out.println(Arrays.toString(newname.split(" ")));

        System.out.println("    STRIP    ".strip());
    }
}
