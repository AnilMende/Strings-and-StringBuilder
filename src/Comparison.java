public class Comparison {
    public static void main(String[] args) {

        String a = "Anil";
        String b = "Anil";
        //System.out.println(a == b);
        System.out.println(a.equals(b));

        String  name1  = new String("Anil Kumar");
        String name2 = new String("Anil Kumar");
        //name1 == name2 gives false because in the string pool they are two different objects
        //System.out.println(name1 == name2);

        //This gives true because it compares the values
        System.out.println(name1.equals(name2));

        //charAt(index) => to find char at particular index of a string
        System.out.println(name1.charAt(6));
    }


}
