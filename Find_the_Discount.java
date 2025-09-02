public class Find_the_Discount {
    public static void main(String[]args){
        System.out.println(count(89, 20));
    }

    public static double count(int a, int b){
        double ans = ((100-b)/100f)*a;
        ans = Math.round(ans*100)/100.0;
        return ans;
    }
}
