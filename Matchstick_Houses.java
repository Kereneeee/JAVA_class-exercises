import java.util.Scanner;

public class Matchstick_Houses {
    public static void main(String[]srgs){
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();

        int ans = Coun(a);
        System.out.println(ans);
    }
    public static int Coun(int a){
        return 6 + 5*(a-1);
    }
}
