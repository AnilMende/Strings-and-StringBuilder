public class defangIpAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(ChangeAddress(address));
    }

    static String ChangeAddress(String address){
        //Approach 1
        //By this approach everytime it will create a new string
        //and adds the ch to the new string, more space is required
        String res = "";
        for(char ch : address.toCharArray()){
            if(ch == '.'){
                res += "[.]";
            }
            else{
                res += ch;
            }
        }
        //return res;

        //Approach 2 Using StringBuilder
        //it is mutable so we can add to the same string
        //without creating any new string
        StringBuilder sb = new StringBuilder();
        for(char ch : address.toCharArray()){
            if(ch == '.'){
                sb.append("[.]");
            }
            else{
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
