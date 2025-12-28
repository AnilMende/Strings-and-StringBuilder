public class SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //with string builder we can directly make changes to original string
        //rather than creating a new string every time
        for(int i=0;i < 26;i++){
            char ch = (char) ('a' + i);
            sb.append(ch);
        }
        System.out.println(sb.toString());
        System.out.println(sb.indexOf("c"));
        System.out.println(sb.length());
        System.out.println(sb.reverse());
    }
}
