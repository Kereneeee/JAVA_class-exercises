public class Check_if_String_Ending_Matches_Second_String {
    public static void main(String[]args){
        System.out.println(jude("abc", "bc"));
    }

    public static boolean jude(String str, String end){
        return str.endsWith(end);
    }
}
