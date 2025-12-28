public class Performance {
    public static void main(String[] args) {
        String series = "";

        for(int i=0;i < 26;i++){
            char ch = (char) ('a' + i);
            //(char) 97 => 'a'
            //"" + 'a' => a
            //this results in creating a new string every time
            series += ch;
        }
        System.out.println(series);
    }
}
