import java.util.Scanner;

public class Left_Shift_by_Powers_of_Two {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int ans = Coun(a, b);
        System.out.println(ans);
    }
    public static int Coun(int a,int b){
        return a << b;
    }
}
