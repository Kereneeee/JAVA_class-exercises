public class Exists_a_Number_Higher {
    public static void main(String[]args){
        System.out.println(juge(new int[]{5, 3, 15, 22, 4}, 10));
    }

    public static boolean juge(int[] Li , int n){
        for(int i : Li){
            if (i>n) {
                return true;
            }
        }
        return false;
    }
}
