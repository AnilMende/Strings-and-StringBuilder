import java.util.ArrayList;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 234.567898f;
        //System.out.printf("Formated Number %.2f", a);

        //Operators
        //inside single quote so they are characters
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println("a"+ 1);

        //If there is an object it will directly calls the toString method
        System.out.println("Anil" + new ArrayList<>());
        System.out.println("Kumar" + new Integer(50));
        //if you try to concatenate two objects with + operator it will give an error
        //definitely there should be an string to use the + with the object
        System.out.println(new Integer(67) + " " + new ArrayList<>());
    }
}
