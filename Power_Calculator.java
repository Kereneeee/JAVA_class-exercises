import java.util.Scanner;

public class Power_Calculator {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int ans = Count(a, b);
        System.out.println(ans);
    }
    public static int Count(int a,int b){
        return a*b;
    }
}
