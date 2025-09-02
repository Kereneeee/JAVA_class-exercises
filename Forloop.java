
//練習for迴圈
public class Forloop{
    public static void main(String[]args){
        int ans = calcAge(4);
        System.out.println(ans);
    }
    public static int calcAge(int n){
        int ans = 0;
        for (int i=1;i<= n; i++){
            ans += i;
        }
        return ans;
    }
}

