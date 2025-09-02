public class Shuffle_the_Name {
    public static void main(String[]args){
        System.out.println(count("Donald Trump"));
    }

    public static String count(String s){
        String[] S = s.split("\\s+");
        return S[1] + " " + S[0];
    }
}
